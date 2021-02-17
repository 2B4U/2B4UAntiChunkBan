package me.lmpedro.antichunkban;

import me.lmpedro.antichunkban.command.ReloadConfig;
import me.lmpedro.antichunkban.listener.AntiChunkBan;
import me.lmpedro.antichunkban.utils.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class Main
        extends JavaPlugin {
    public void onEnable() {

        //bstats
        int pluginId = 10308;
        new Metrics(this, pluginId);
        //Logic
        new AntiChunkBan(this);

        if (!this.getDataFolder().exists() || !(new File(this.getDataFolder(), "config.yml")).exists())
            saveDefaultConfig();

        getCommand("2b4uAntiChunkBan").setExecutor(new ReloadConfig(this));
    }
}
