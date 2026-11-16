package com.github.tonymoddinglab.replayfix.core;

import net.minecraft.launchwrapper.IClassTransformer;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.*;

public class ReplayFixTransformer implements IClassTransformer {

    @Override
    public byte[] transform(String name, String transformedName, byte[] basicClass) {
        // 攔截 ReplayMod 中涉及舊版 Display 呼叫的類別
        if (transformedName.startsWith("com.replaymod")) {
            return patchDisplayCalls(basicClass);
        }
        return basicClass;
    }

    private byte[] patchDisplayCalls(byte[] basicClass) {
        ClassReader classReader = new ClassReader(basicClass);
        ClassNode classNode = new ClassNode();
        classReader.accept(classNode, 0);

        for (MethodNode method : classNode.methods) {
            for (AbstractInsnNode insn : method.instructions.toArray()) {
                if (insn.getOpcode() == Opcodes.INVOKESTATIC) {
                    MethodInsnNode mInsn = (MethodInsnNode) insn;
                    // 將舊版 LWJGL Display 靜態呼叫重新導向至我們的 DisplayShim

                    if (mInsn.owner.equals("org/lwjgl/opengl/Display")) {
                        mInsn.owner = "com/github/tonymoddinglab/replayfix/core/DisplayShim";
                    } else if (mInsn.owner.equals("org/lwjgl/Sys")) {
                        mInsn.owner = "com/github/tonymoddinglab/replayfix/core/SysShim";
                    } else if (mInsn.owner.equals("org/lwjgl/input/Mouse")) {
                        mInsn.owner = "com/github/tonymoddinglab/replayfix/core/MouseShim";
                    }

                }
            }
        }

        ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
        classNode.accept(classWriter);
        return classWriter.toByteArray();
    }
}