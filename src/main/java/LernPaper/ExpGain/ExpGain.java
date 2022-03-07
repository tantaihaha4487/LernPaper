package LernPaper.ExpGain;

import LernPaper.Main;
import LernPaper.ExpGain.event.onPlayerExp;

public class ExpGain {
    private Main plugin;
    public ExpGain(Main plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(new onPlayerExp(), plugin);
    }
}
