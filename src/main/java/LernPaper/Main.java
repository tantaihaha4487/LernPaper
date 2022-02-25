package LernPaper;

import LernPaper.DamageIndicator.event.EntityDmg;
import LernPaper.DamageIndicator.task.ArmorStandTask;
import LernPaper.ExpGain.event.onPlayerExp;
import LernPaper.tantaihaha.commands.tantaihahaCommands;
import LernPaper.tantaihaha.tab.tantaihahaTab;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        /*===============================================[Logger]===============================================*/
        getServer().getLogger().info(ChatColor.GREEN + "===============[Plugin]===============");
        getServer().getLogger().info(ChatColor.GREEN + "- Plugin: Lern Plugin V.2 Is Enable!");
        getServer().getLogger().info(ChatColor.GREEN + "- Version: " + Bukkit.getVersion());
        getServer().getLogger().info(ChatColor.GREEN + "- Max Player: " + Bukkit.getMaxPlayers());
        getServer().getLogger().info(ChatColor.GREEN + "- Max View Distance: " + Bukkit.getViewDistance());
        getServer().getLogger().info(ChatColor.GREEN + "======================================");
        /*===============================================[Event]===============================================*/
        //ExpGain
        getServer().getPluginManager().registerEvents(new onPlayerExp(), this);
        //DamageIndicator
        getServer().getPluginManager().registerEvents(new EntityDmg(), this);
        /*===============================================[Commands]===============================================*/
        //TantaiHaha Commands hard coded
        getCommand("tantaihaha").setExecutor(new tantaihahaCommands());
        getCommand("tantaihaha").setTabCompleter(new tantaihahaTab());
        /*===============================================[Logic]===============================================*/
        new ArmorStandTask(this);

    }
}
