# WorldEditHotKey

A simple Minecraft Bukkit/Spigot plugin that adds hotkey support for WorldEdit undo/redo actions using the wooden axe.

## Features

- When a player with the `worldedit.wand` permission holds a wooden axe and drops it (presses Q), the plugin automatically executes the `//undo` command for them.
- When a player with the `worldedit.wand` permission holds a wooden axe and swaps items between hands (presses F), the plugin automatically executes the `//redo` command for them.

## Requirements

- Minecraft server with Bukkit or Spigot API
- WorldEdit/FastAsyncWorldEdit plugin installed
- Java 21 or above

## Installation

1. Download the plugin JAR file.
2. Place it in your server's `plugins` folder.
3. Restart or reload your server.

## Usage

- Make sure you have the `worldedit.wand` permission.
- Hold a wooden axe in your main hand.
- Press Q to trigger .
- Press F to trigger .

## License

[LICENSE](LICENSE)