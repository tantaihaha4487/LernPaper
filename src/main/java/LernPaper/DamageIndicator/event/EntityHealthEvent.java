package LernPaper.DamageIndicator.event;

import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityRegainHealthEvent;

public class EntityHealthEvent implements Listener {
    @EventHandler
    public void onHealth(EntityRegainHealthEvent e) {
        Entity entity = e.getEntity();
        Damageable damageable = (Damageable) entity;
        double max = damageable.getMaxHealth();
        double now = damageable.getHealth();
        double regen = e.getAmount();

    }
}
