# ReplayFixGTNH

[![Java Version](https://img.shields.io/badge/Java-8-blue.svg)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-GPL%20v3.0-blue.svg)](LICENSE)
[![GTNH](https://img.shields.io/badge/GTNH-2.9-orange.svg)](https://github.com/GTNewHorizons/GT-New-Horizons-Modpack)

**English** | [繁體中文](docs/README_zh-TW.md) | [简体中文](README_zh-CN.md)

**ReplayFixGTNH** is a lightweight Java CoreMod designed for **GTNH (GregTech: New Horizons) 2.9** to resolve LWJGL Display compatibility issues with modern launchers and LWJGL 3.

---

## Features

- **ASM Bytecode Transformer**: Dynamically intercepts and redirects `org/lwjgl/opengl/Display` calls.
- **LWJGL 3 Compatibility**: Fixes rendering and window crashes in modern environments.
- **Optimized Performance**: Uses a static `IntBuffer` to prevent GC overhead during viewport queries.

---

## Installation

1. Download the latest `.jar` file from the [Releases](../../releases) page.
2. Place the file into your GTNH instance `mods/` directory.
3. Launch the game.

---

## Building from Source

```bash
git clone [https://github.com/Tony-Modding-Lab/ReplayFixGTNH.git](https://github.com/Tony-Modding-Lab/ReplayFixGTNH.git)
cd ReplayFixGTNH
gradle build
