package com.github.crafttogether.rinku;

import com.github.crafttogether.rinku.discord.DiscordListeners;
import com.github.crafttogether.rinku.minecraft.VerifyCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    private static Plugin plugin;

    public static Plugin getInstance() {
        return plugin;
    }

    @Override
    public void onEnable() {
        plugin = this;

        Connections.loadFile();
        DiscordListeners.register();
        getCommand("verify").setExecutor(new VerifyCommand());

        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Rinku loaded");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Rinku disabled");
    }
}
