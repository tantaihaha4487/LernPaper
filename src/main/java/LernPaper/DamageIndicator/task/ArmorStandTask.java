package LernPaper.DamageIndicator.task;

import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;

public class ArmorStandTask {

    public static ArmorStand SpawnArmorStand(Location loc) {

        ArmorStand stand = (ArmorStand) loc.getWorld().spawn(loc, ArmorStand.class,armorStand -> {
            armorStand.setVisible(true);
        });
        return stand;

    }
}
