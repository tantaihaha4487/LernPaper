package LernPaper.tantaihaha;

import LernPaper.Main;
import LernPaper.tantaihaha.commands.tantaihahaCommands;
import LernPaper.tantaihaha.tab.tantaihahaTab;

public class tantaihaha {
    private Main plugin;
    public tantaihaha(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("tantaihaha").setExecutor(new tantaihahaCommands());
        plugin.getCommand("tantaihaha").setTabCompleter(new tantaihahaTab());
    }
}
