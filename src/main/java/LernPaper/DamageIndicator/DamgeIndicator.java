package LernPaper.DamageIndicator;

import LernPaper.DamageIndicator.event.EntityDmg;
import LernPaper.DamageIndicator.event.EntityHealthEvent;
import LernPaper.DamageIndicator.task.ArmorStandTask;
import LernPaper.Main;

public class DamgeIndicator {
    private Main plugin;
    public DamgeIndicator(Main plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(new EntityDmg(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new EntityHealthEvent(), plugin);
        new ArmorStandTask(plugin);
    }
}
