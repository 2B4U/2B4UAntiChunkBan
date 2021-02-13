package me.lmpedro.antichunkban.utils;

import me.lmpedro.antichunkban.Main;
import org.bukkit.ChatColor;
import org.bukkit.Chunk;
import org.bukkit.Material;

public class Utils {
    public static final String prefix = "&l&9[2B4U AntiChunkBan] ";
    private final Main plugin;

    public Utils(Main plugin) {
        this.plugin = plugin;
    }

    public static String chat(String s) {
        s = ChatColor.translateAlternateColorCodes('&', prefix + s);
        return s;
    }

    public static int countBlockPerChunk(Chunk chunk, Material lookingFor) {
        int count = 0;
        for (int x = 0; x < 16; ++x) {
            for (int z = 0; z < 16; ++z) {
                for (int y = 0; y < 256; ++y) {
                    if (chunk.getBlock(x, y, z).getType() != lookingFor) continue;
                    ++count;
                }
            }
        }
        return count;
    }
}
