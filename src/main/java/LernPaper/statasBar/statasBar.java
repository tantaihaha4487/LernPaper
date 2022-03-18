package LernPaper.statasBar;

import LernPaper.Main;
import LernPaper.statasBar.commands.barCommands;
import LernPaper.statasBar.task.barTask;

public class statasBar {
    private final Main plugin;
    public statasBar(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("bar").setExecutor(new barCommands());
        new barTask(plugin);
        barTask.onUpdateBar();
    }
}
