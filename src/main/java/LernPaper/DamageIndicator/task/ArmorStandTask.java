package LernPaper.DamageIndicator.task;

import LernPaper.Main;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.scheduler.BukkitScheduler;

import java.util.ArrayList;
import java.util.List;

public class ArmorStandTask {
    private static Main plugin;
    public static List<ArmorStand> standManager = new ArrayList<>();

    public ArmorStandTask(Main plugin) {
        this.plugin = plugin;

    }

    public static boolean Type(Entity e) {
        boolean b = false;
        switch(e.getType()) {
            case DROPPED_ITEM:
            case ITEM_FRAME:
            case MINECART_COMMAND:
            case MINECART_TNT:
            case MINECART_MOB_SPAWNER:
            case MINECART_HOPPER:
            case MINECART_FURNACE:
            case MINECART_CHEST:
            case MINECART:
            case ARMOR_STAND:
            case PLAYER:
            case FIREWORK:
            case FIREBALL:
            case SMALL_FIREBALL:
            case DRAGON_FIREBALL:
            case SPLASH_POTION:
            case THROWN_EXP_BOTTLE:
            case EXPERIENCE_ORB:
            case EGG:
            case ENDER_PEARL:
            case ENDER_CRYSTAL:
            case ENDER_SIGNAL:
            case BOAT:
            case AREA_EFFECT_CLOUD:
            case SPECTRAL_ARROW:
            case ARROW:
            case FALLING_BLOCK:
            case SHULKER_BULLET:
            case FISHING_HOOK:
            case PRIMED_TNT:
            case LIGHTNING:
            case TRIDENT:
            case UNKNOWN:
                b = true;
            default:
                return b;
        }
    }

    public static ArmorStand SpawnArmorStand(Location loc, String name) {

        ArmorStand stand = (ArmorStand) loc.getWorld().spawn(loc, ArmorStand.class, armorStand -> {
            armorStand.setCustomName(name);
            armorStand.setVisible(false);
            armorStand.setSmall(false);
            armorStand.setCanPickupItems(false);
            armorStand.setDisabledSlots(EquipmentSlot.CHEST, EquipmentSlot.FEET, EquipmentSlot.HAND, EquipmentSlot.HEAD, EquipmentSlot.LEGS, EquipmentSlot.OFF_HAND);
            armorStand.setCustomNameVisible(true);
            armorStand.setSmall(true);
            armorStand.setBasePlate(false);
            armorStand.setInvulnerable(true);
            armorStand.setGravity(false);
            armorStand.setMarker(true);
            armorStand.setSilent(true);
        });
        return stand;

    }
    public static void KillArmorStand(ArmorStand armorStand) {
        BukkitScheduler sh = plugin.getServer().getScheduler();
        sh.runTaskLater(plugin, new Runnable() {
            @Override
            public void run() {
                armorStand.remove();
            }
        },  7);

    }
    public static String standDmgTitle(Double FinalDmg,double now, Double max) {
        String DmgFormat = String.format("%.1f", FinalDmg);
        String HealthFormat = String.format("%.1f", max);
        String Dmg = "-" + DmgFormat;
        String nowFotmat = String.format("%.1f", now);

        String name = ChatColor.RED + Dmg + ChatColor.GREEN + " [" + nowFotmat + "/" + HealthFormat + "❤]";
        return name;
    }
    public static String standHealthTitle(double Health, double now, double MaxHealth) {
        String HealthFormat = String.format("%.1f", Health);
        String MaxHealthFormat = String.format("%.1f", MaxHealth);
        String nowFotmat = String.format("%.1f", now);

        String name = ChatColor.AQUA + ChatColor.BOLD.toString() + "+" + HealthFormat + ChatColor.GREEN + " [" + nowFotmat + "/" + MaxHealthFormat + "❤]";

        return name;

    }
    public static void removeAll() {
        for(int i = 0; i < standManager.size(); i++) {
            ArmorStand stand = standManager.get(i);
            stand.remove();

        }
    }
}
