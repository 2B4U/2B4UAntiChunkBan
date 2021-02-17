package me.lmpedro.antichunkban.listener;

import me.lmpedro.antichunkban.Main;
import me.lmpedro.antichunkban.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import java.io.File;
import java.sql.ResultSet;


public class AntiChunkBan implements Listener {

    private final Main plugin;

    public AntiChunkBan(Main plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void chunkBanPlace(BlockPlaceEvent event) {
        Chunk chunk = event.getBlock().getChunk();
        Material material = event.getBlock().getType();

        switch (material) {
            case STANDING_BANNER:
                if (Utils.countBlockPerChunk(chunk, Material.STANDING_BANNER) > plugin.getConfig().getInt("Amount.BannerAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Amount.BannerAmountPerChunk") + " Banners In A Chunk."));
                }
                break;
            case FURNACE:
                if (Utils.countBlockPerChunk(chunk, Material.FURNACE) > plugin.getConfig().getInt("Amount.FurnaceAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Amount.FurnaceAmountPerChunk") + " Furnaces In A Chunk."));
                }
                break;
            case ENCHANTMENT_TABLE:
                if (Utils.countBlockPerChunk(chunk, Material.ENCHANTMENT_TABLE) > plugin.getConfig().getInt("Amount.EnchantmentTableAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Amount.EnchantmentTableAmountPerChunk") + " Enchantment Tables In A Chunk."));
                }
                break;
            case WALL_BANNER:
                if (Utils.countBlockPerChunk(chunk, Material.WALL_BANNER) > plugin.getConfig().getInt("Amount.WallBannerAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Amount.WallBannerAmountPerChunk") + " WallBanners In A Chunk."));
                }
                break;
            case WALL_SIGN:
                if (Utils.countBlockPerChunk(chunk, Material.WALL_SIGN) > plugin.getConfig().getInt("Amount.WallSignAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Amount.WallSignAmountPerChunk") + " WallSigns In A Chunk."));
                }
                break;
            case HOPPER:
                if (Utils.countBlockPerChunk(chunk, Material.HOPPER) > plugin.getConfig().getInt("Amount.HopperAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Amount.HopperAmountPerChunk") + " Hoppers In A Chunk."));
                }
                break;
            case DROPPER:
                if (Utils.countBlockPerChunk(chunk, Material.DROPPER) > plugin.getConfig().getInt("Amount.DropperAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Amount.DropperAmountPerChunk") + " Dropper In A Chunk."));
                }
                break;
            case DISPENSER:
                if (Utils.countBlockPerChunk(chunk, Material.DISPENSER) > plugin.getConfig().getInt("Amount.DispenserAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Amount.DispenserAmountPerChunk") + " Dispensers In A Chunk."));
                }
                break;
            case BREWING_STAND:
                if (Utils.countBlockPerChunk(chunk, Material.BREWING_STAND) > plugin.getConfig().getInt("Amount.BrewingStandAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Amount.BrewingStandAmountPerChunk") + " Brewing Stands In A Chunk."));
                }
                break;
            case BEACON:
                if (Utils.countBlockPerChunk(chunk, Material.BEACON) > plugin.getConfig().getInt("Amount.BeaconAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Amount.BeaconAmountPerChunk") + " Beacons In A Chunk."));
                }
                break;
            case SIGN_POST:
                if (Utils.countBlockPerChunk(chunk, Material.SIGN_POST) > plugin.getConfig().getInt("Amount.SignPostAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Amount.SignPostAmountPerChunk") + " Sign Posts In A Chunk."));
                }
                break;
            case ENDER_CHEST:
                if (Utils.countBlockPerChunk(chunk, Material.ENDER_CHEST) > plugin.getConfig().getInt("Amount.EnderChestAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Amount.EnderChestAmountPerChunk") + " Ender Chests In A Chunk."));
                }
                break;
            case FLOWER_POT:
                if (Utils.countBlockPerChunk(chunk, Material.FLOWER_POT) > plugin.getConfig().getInt("Amount.FlowerPotAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Amount.FlowerPotAmountPerChunk") + " Flower Pots In A Chunk."));
                }
                break;
            case SKULL:
                if (Utils.countBlockPerChunk(chunk, Material.SKULL) > plugin.getConfig().getInt("Amount.SkullAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Amount.SkullAmountPerChunk") + " Skulls In A Chunk."));
                }
                break;
        }
    }
}