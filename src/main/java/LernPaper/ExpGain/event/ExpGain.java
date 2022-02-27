package LernPaper.ExpGain.event;

import LernPaper.Main;

public class ExpGain {
    private Main plugin;
    public ExpGain(Main plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(new onPlayerExp(), plugin);
    }
}
