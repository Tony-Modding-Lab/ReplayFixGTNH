# ReplayFixGTNH

A Java-based CoreMod designed for GTNH (GregTech: New Horizons) 2.9 to resolve LWJGL Display compatibility issues with modern environments.

## Features
- ASM-based transformer targeting `org/lwjgl/opengl/Display` calls.
- Redirects calls to `DisplayShim` compatible with LWJGL 3 / modern launchers.
- Licensed under GNU General Public License v3.0.
