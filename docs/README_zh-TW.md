
# ReplayFixGTNH

[![Java Version](https://img.shields.io/badge/Java-8-blue.svg)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-GPL%20v3.0-blue.svg)](../LICENSE)
[![GTNH](https://img.shields.io/badge/GTNH-2.9-orange.svg)](https://github.com/GTNewHorizons/GT-New-Horizons-Modpack)

[English](../README.md) | **繁體中文** | [简体中文](README_zh-CN.md)

**ReplayFixGTNH** 是一個專為 **GTNH (GregTech: New Horizons) 2.9** 整合包設計的輕量級 Java CoreMod。主要用來解決現代化啟動器或 LWJGL 3 環境下，因傳統顯示呼叫不相容導致的閃退與渲染問題。

---

## 主要特色

- **ASM 字節碼轉換**：動態攔截並安全轉接 `org/lwjgl/opengl/Display` 相關呼叫。
- **LWJGL 3 相容**：完美對應現代化客戶端與啟動環境。
- **效能優化**：採用靜態 `IntBuffer`，有效避免視圖查詢時產生的垃圾回收（GC）開銷。

---

## 安裝與使用

1. 前往 [Releases](../../../releases) 頁面下載最新的 `.jar` 檔案。
2. 將檔案放入 GTNH 整合包的 `mods/` 資料夾中。
3. 正常啟動遊戲即可。

---

## 自行編譯

```bash
git clone [https://github.com/Tony-Modding-Lab/ReplayFixGTNH.git](https://github.com/Tony-Modding-Lab/ReplayFixGTNH.git)
cd ReplayFixGTNH
gradle build
```
編譯完成後的 .jar 檔案會存放在 build/libs/ 資料夾中。

授權條款
本專案採用 GNU General Public License v3.0 授權條款發布。詳情請參閱 LICENSE 檔案。
