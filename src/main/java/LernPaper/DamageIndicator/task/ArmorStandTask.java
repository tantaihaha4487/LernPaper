package LernPaper.DamageIndicator.task;

import LernPaper.Main;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.scheduler.BukkitScheduler;

public class ArmorStandTask {
    private static Main plugin;
    private static EntityDamageEvent event;
    public ArmorStandTask(Main plugin) {
        this.plugin = plugin;

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
    public static String standTitle(Double FinalDmg, Double max) {
        String DmgFormat = String.format("%.1f", FinalDmg);
        String HealthFormat = String.format("%.1f", max);

        String name = ChatColor.RED + DmgFormat + ChatColor.GREEN + " ["  + HealthFormat + "❤" + "]";
        return name;
    }
}
