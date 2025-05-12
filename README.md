# Better Crafter (for Fabric)

![Crafter block](src/main/resources/assets/bettercrafter/icon.png)

[![Static Badge](https://img.shields.io/badge/Version-1.0.0--1.21.4-green)](CHANGELOG.md)

**Take full control of your automatic crafting!**

Better Crafter is a small but powerful mod that improves the usability of the Crafter block by making its behavior more predictable and automation-friendly.

This project is a **fork of the original [BetterCrafter](https://github.com/Fern-Aerell/BetterCrafter)** mod, which has been inactive and unmaintained for over 7 months and has not been updated for the latest Minecraft versions.

---

## Features  

### Reserved Crafting Slots   

- The Crafter will **not consume the last item** in each slot—these are treated as "reserved."
- You can place a **single instance of each item** in the desired slots to define a crafting pattern.
- Hoppers will automatically **stack matching items** into those reserved positions.

### Consistent Automation  

- Prevents random item placement when using hoppers.
- Makes automated crafting machines much more reliable.

### Simple and Vanilla-Friendly  

- No new blocks, GUIs, or configs.
- Works out-of-the-box with vanilla redstone and hoppers.

---

## Important  

To ensure the mod functions correctly, **all unused slots must be disabled** using the Crafter's interface. If free slots remain open, inserted items may still be placed randomly.

---

## Requirements  

- Fabric Loader  
- Fabric API ([Modrinth](https://modrinth.com/mod/fabric-api) / [CurseForge](https://www.curseforge.com/minecraft/mc-mods/fabric-api))

---

## Installation  

1. Install Fabric Loader and Fabric API.  
2. Drop the mod `.jar` into your `mods` folder.  
3. Launch the game and enjoy smarter crafting!

---

## License  

This project is based on the original [BetterCrafter](https://github.com/Fern-Aerell/BetterCrafter), which was released under the [CC0 1.0 Universal](https://creativecommons.org/publicdomain/zero/1.0/) license.  
As such, all original code has been placed into the public domain by its author.

This fork continues under the same license — **CC0 1.0** — meaning you are free to use, modify, distribute, or incorporate the code into your own projects, even for commercial purposes, without any restrictions or attribution requirements.

However, attribution to the original author is appreciated as a courtesy to their work.