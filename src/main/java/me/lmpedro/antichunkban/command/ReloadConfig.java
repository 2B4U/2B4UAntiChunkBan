package me.lmpedro.antichunkban.command;

import me.lmpedro.antichunkban.Main;
import me.lmpedro.antichunkban.utils.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ReloadConfig implements CommandExecutor {
    private final Main plugin;

    public ReloadConfig(Main plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender.isOp() && command.getName().equalsIgnoreCase("2B4UAntiChunkBan")) {
            if (strings.length == 0) {
                return false;
            }
            if (strings.length == 1) {
                if (strings[0].equalsIgnoreCase("Reload") || strings[0].equalsIgnoreCase("ReloadConfig")) {
                    this.plugin.reloadConfig();
                }
                commandSender.sendMessage(Utils.chat("&4Reloaded config."));
            }
        }
        return true;
    }
}