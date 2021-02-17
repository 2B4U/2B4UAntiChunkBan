package me.lmpedro.antichunkban.listener;

import me.lmpedro.antichunkban.Main;
import me.lmpedro.antichunkban.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;


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
                if (Utils.countBlockPerChunk(chunk, Material.STANDING_BANNER) > plugin.getConfig().getInt("Patches.BannerAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Patches.BannerAmountPerChunk") + " Banners In A Chunk."));
                }
                break;
            case FURNACE:
                if (Utils.countBlockPerChunk(chunk, Material.FURNACE) > plugin.getConfig().getInt("Patches.FurnaceAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Patches.FurnaceAmountPerChunk") + " Furnaces In A Chunk."));
                }
                break;
            case ENCHANTMENT_TABLE:
                if (Utils.countBlockPerChunk(chunk, Material.ENCHANTMENT_TABLE) > plugin.getConfig().getInt("Patches.EnchantmentTableAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Patches.EnchantmentTableAmountPerChunk") + " Enchantment Tables In A Chunk."));
                }
                break;
            case WALL_BANNER:
                if (Utils.countBlockPerChunk(chunk, Material.WALL_BANNER) > plugin.getConfig().getInt("Patches.WallBannerAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Patches.WallBannerAmountPerChunk") + " WallBanners In A Chunk."));
                }
                break;
            case WALL_SIGN:
                if (Utils.countBlockPerChunk(chunk, Material.WALL_SIGN) > plugin.getConfig().getInt("Patches.WallSignAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Patches.WallSignAmountPerChunk") + " WallSigns In A Chunk."));
                }
                break;
            case HOPPER:
                if (Utils.countBlockPerChunk(chunk, Material.HOPPER) > plugin.getConfig().getInt("Patches.HopperAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Patches.HopperAmountPerChunk") + " Hoppers In A Chunk."));
                }
                break;
            case DROPPER:
                if (Utils.countBlockPerChunk(chunk, Material.DROPPER) > plugin.getConfig().getInt("Patches.DropperAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Patches.DropperAmountPerChunk") + " Dropper In A Chunk."));
                }
                break;
            case DISPENSER:
                if (Utils.countBlockPerChunk(chunk, Material.DISPENSER) > plugin.getConfig().getInt("Patches.DispenserAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Patches.DispenserAmountPerChunk") + " Dispensers In A Chunk."));
                }
                break;
            case BREWING_STAND:
                if (Utils.countBlockPerChunk(chunk, Material.BREWING_STAND) > plugin.getConfig().getInt("Patches.BrewingStandAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Patches.BrewingStandAmountPerChunk") + " Brewing Stands In A Chunk."));
                }
                break;
            case BEACON:
                if (Utils.countBlockPerChunk(chunk, Material.BEACON) > plugin.getConfig().getInt("Patches.BeaconAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Patches.BeaconAmountPerChunk") + " Beacons In A Chunk."));
                }
                break;
            case SIGN_POST:
                if (Utils.countBlockPerChunk(chunk, Material.SIGN_POST) > plugin.getConfig().getInt("Patches.SignPostAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Patches.SignPostAmountPerChunk") + " Sign Posts In A Chunk."));
                }
                break;
            case ENDER_CHEST:
                if (Utils.countBlockPerChunk(chunk, Material.ENDER_CHEST) > plugin.getConfig().getInt("Patches.EnderChestAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Patches.EnderChestAmountPerChunk") + " Ender Chests In A Chunk."));
                }
                break;
            case FLOWER_POT:
                if (Utils.countBlockPerChunk(chunk, Material.FLOWER_POT) > plugin.getConfig().getInt("Patches.FlowerPotAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Patches.FlowerPotAmountPerChunk") + " Flower Pots In A Chunk."));
                }
                break;
            case SKULL:
                if (Utils.countBlockPerChunk(chunk, Material.SKULL) > plugin.getConfig().getInt("Patches.SkullAmountPerChunk")) {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(Utils.chat("&4You can only place " + plugin.getConfig().getInt("Patches.SkullAmountPerChunk") + " Skulls In A Chunk."));
                }
                break;
        }
    }
}