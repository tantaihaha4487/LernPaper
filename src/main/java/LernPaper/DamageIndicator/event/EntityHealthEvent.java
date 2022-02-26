package LernPaper.DamageIndicator.event;

import LernPaper.DamageIndicator.task.ArmorStandTask;
import LernPaper.tantaihaha.engine.RandomLocation;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityRegainHealthEvent;

public class EntityHealthEvent implements Listener {
    @EventHandler
    public void onHealth(EntityRegainHealthEvent e) {
        Entity entity = e.getEntity();
       if (!ArmorStandTask.Type(entity)) {
           Damageable damageable = (Damageable) entity;
           double max = damageable.getMaxHealth();
           double now = damageable.getHealth();
           double regen = e.getAmount();
           Location loc = entity.getLocation().add(RandomLocation.RandomDouble(), entity.getHeight() + 0.3D, RandomLocation.RandomDouble());
           ArmorStand stand = ArmorStandTask.SpawnArmorStand(loc, ArmorStandTask.standHealthTitle(regen, now, max));
           ArmorStandTask.standManager.add(stand);
           ArmorStandTask.KillArmorStand(stand);

       }

    }
}
