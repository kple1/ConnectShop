package io.leeple.connectshop.data;

import io.leeple.connectshop.Main;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class Data {

    public static YamlConfiguration config = new YamlConfiguration();
    public static File playerFile = new File(Main.getPlugin().getUuidFolder(), "plugins/SuiCash/shop/" + "캐시상점.yml");

    public static YamlConfiguration getConfig() {
        playerFile = new File(Main.getPlugin().getUuidFolder(), "plugins/SuiCash/shop/" + "캐시상점.yml");
        config = YamlConfiguration.loadConfiguration(playerFile);
        return config;
    }
}
