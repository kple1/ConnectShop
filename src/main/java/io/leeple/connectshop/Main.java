package io.leeple.connectshop;

import io.leeple.connectshop.Listener.OnClickNPC;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.io.File;

public final class Main extends JavaPlugin implements @NotNull Listener {

    private Plugin citizensPlugin;
    public static Main plugin;
    private File uuidFolder;

    public File getUuidFolder() {
        return uuidFolder;
    }

    @Override
    public void onEnable() {
        plugin = this;
        if (Bukkit.getPluginManager().isPluginEnabled("Citizens")) {
            citizensPlugin = Bukkit.getPluginManager().getPlugin("Citizens");
            getServer().getPluginManager().registerEvents(this, this);
        } else {
            getLogger().severe("Citizens 플러그인을 찾을 수 없습니다. 플러그인이 설치되어 있는지 확인해주세요.");
            getServer().getPluginManager().disablePlugin(this);
        }
        Bukkit.getPluginManager().registerEvents(new OnClickNPC(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Main getPlugin() {
        return plugin;
    }
}
