package LernPaper.CreativeWorld;

import LernPaper.CreativeWorld.Commands.cCommand;
import LernPaper.CreativeWorld.Task.WorldTask;
import LernPaper.Main;

public class CreativeWorld {
    private static Main plugin;

    public CreativeWorld(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("c").setExecutor(new cCommand());
        new WorldTask(plugin);
    }
}
