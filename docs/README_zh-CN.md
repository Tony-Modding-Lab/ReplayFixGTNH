# ReplayFixGTNH

[![Java Version](https://img.shields.io/badge/Java-8-blue.svg)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-GPL%20v3.0-blue.svg)](../LICENSE)
[![GTNH](https://img.shields.io/badge/GTNH-2.9-orange.svg)](https://github.com/GTNewHorizons/GT-New-Horizons-Modpack)

[English](../README.md) | [繁體中文](README_zh-TW.md) | **简体中文**

**ReplayFixGTNH** 是一个专为 **GTNH (GregTech: New Horizons) 2.9** 整合包设计的轻量级 Java CoreMod。主要用于解决现代化启动器或 LWJGL 3 环境下，因传统显示调用不兼容导致的闪退与渲染问题。

---

## 主要特性

- **ASM 字节码转换**：动态拦截并安全转接 `org/lwjgl/opengl/Display` 相关调用。
- **LWJGL 3 兼容**：完美适配现代化客户端与启动环境。
- **性能优化**：采用静态 `IntBuffer`，有效避免视口查询时产生的垃圾回收（GC）开销。

---

## 安装与使用

1. 前往 [Releases](../../../releases) 页面下载最新的 `.jar` 文件。
2. 将文件放入 GTNH 整合包的 `mods/` 文件夹中。
3. 正常启动游戏即可。

---

## 自行编译

```bash
git clone [https://github.com/Tony-Modding-Lab/ReplayFixGTNH.git](https://github.com/Tony-Modding-Lab/ReplayFixGTNH.git)
cd ReplayFixGTNH
gradle build
```
编译完成后的 .jar 文件会存放在 build/libs/ 文件夹中。

开源协议
本项目采用 GNU General Public License v3.0 协议发布。详情请参阅 LICENSE 文件。
