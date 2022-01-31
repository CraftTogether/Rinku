package xyz.crafttogether.rinku;

import xyz.crafttogether.rinku.discord.DiscordListeners;
import xyz.crafttogether.rinku.minecraft.VerifyCommand;
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

        getConfig().options().copyDefaults();
        saveConfig();

        DiscordListeners.register();
        getCommand("verify").setExecutor(new VerifyCommand());

        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Rinku loaded");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Rinku disabled");
    }
}
