package LernPaper;

import LernPaper.DamageIndicator.DamgeIndicator;
import LernPaper.DamageIndicator.task.ArmorStandTask;
import LernPaper.DeathPaper.DeathPaper;
import LernPaper.ExpGain.ExpGain;
import LernPaper.tantaihaha.tantaihaha;
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
        /*===============================================[Sub Plugin]===============================================*/
        new DamgeIndicator(this);
        new ExpGain(this);
        new tantaihaha(this);
        new DeathPaper(this);
    }
    @Override
    public void onDisable() {
        ArmorStandTask.removeAll();
    }
}
