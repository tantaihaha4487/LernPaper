package LernPaper.DamageIndicator.event;

import LernPaper.DamageIndicator.task.ArmorStandTask;
import LernPaper.tantaihaha.engine.RandomLocation;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class EntityDmg implements Listener {

    @EventHandler
    public void onDmg(EntityDamageEvent e) {
        Entity entity = e.getEntity();
        if(!(entity instanceof Player)) return;
        double FinalDmg = e.getFinalDamage();
        Damageable damageable = (Damageable) entity;
        double max = damageable.getHealth();
        Location location = entity.getLocation().add(RandomLocation.RandomDouble(), entity.getHeight()+ 0.03D, RandomLocation.RandomDouble());
        ArmorStand stand = ArmorStandTask.SpawnArmorStand(location, ArmorStandTask.standTitle(FinalDmg, max));
        ArmorStandTask.KillArmorStand(stand);
    }
    @EventHandler
    public void onEntityDmgByEntity(EntityDamageByEntityEvent e) {
        if(!(e.getDamager() instanceof Player)) return;
        Entity entity = e.getEntity();
        double FinalDmg = e.getFinalDamage();
        Damageable damageable = (Damageable) entity;
        double max = damageable.getHealth();
        Location location = entity.getLocation().add(RandomLocation.RandomDouble(), entity.getHeight()+ 0.03D, RandomLocation.RandomDouble());

        if(e.isCritical()) {
            ArmorStand stand = ArmorStandTask.SpawnArmorStand(location, ArmorStandTask.standTitle(FinalDmg, max) + ChatColor.GOLD + ChatColor.BOLD + " Critical");
            ArmorStandTask.KillArmorStand(stand);
        }
        else {
            ArmorStand stand = ArmorStandTask.SpawnArmorStand(location, ArmorStandTask.standTitle(FinalDmg, max));
            ArmorStandTask.KillArmorStand(stand);
        }
    }
}
