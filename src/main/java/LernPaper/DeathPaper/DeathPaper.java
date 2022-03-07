package LernPaper.DeathPaper;

import LernPaper.DeathPaper.event.onplayerDeath;
import LernPaper.Main;

public class DeathPaper {

    public DeathPaper(Main plugin) {
        plugin.getServer().getPluginManager().registerEvents(new onplayerDeath(), plugin);
    }

}
