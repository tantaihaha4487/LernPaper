package LernPaper.DamageIndicator.event;

import LernPaper.DamageIndicator.task.ArmorStandTask;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class EntityDmg implements Listener {

    @EventHandler
    public void onDmg(EntityDamageEvent e) {
        ArmorStandTask.SpawnArmorStand(e.getEntity().getLocation());
    }
}
