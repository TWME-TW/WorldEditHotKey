package dev.twme.worldEditHotKey;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class WorldEditHotKey extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onPlayerDropItem(PlayerDropItemEvent event) {
        Player player = event.getPlayer();
        if (player.hasPermission("worldedit.wand") &&
            player.getInventory().getItemInMainHand().getType() == Material.WOODEN_AXE) {
            player.performCommand("//undo");
        }
    }

    @EventHandler
    public void onPlayerSwapHandItems(PlayerSwapHandItemsEvent event) {
        Player player = event.getPlayer();
        if (player.hasPermission("worldedit.wand") &&
            event.getMainHandItem() != null &&
            event.getMainHandItem().getType() == Material.WOODEN_AXE) {
            player.performCommand("//redo");
        }
    }
}
