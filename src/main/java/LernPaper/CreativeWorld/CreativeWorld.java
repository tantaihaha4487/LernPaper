package LernPaper.CreativeWorld;

import LernPaper.CreativeWorld.Commands.cCommand;
import LernPaper.CreativeWorld.Task.WorldTask;
import LernPaper.CreativeWorld.event.onPlayerChangeWorld;
import LernPaper.Main;

import java.io.File;

public class CreativeWorld {
    private static Main plugin;
    public static File folder = new File("Data/");

    public CreativeWorld(Main plugin) {
        this.plugin = plugin;
        folder.mkdir();
        plugin.getCommand("c").setExecutor(new cCommand());
        new WorldTask(plugin);
        plugin.getServer().getPluginManager().registerEvents(new onPlayerChangeWorld(), plugin);
    }
}
