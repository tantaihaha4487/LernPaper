package LernPaper;

import LernPaper.DamageIndicator.DamgeIndicator;
import LernPaper.DamageIndicator.task.ArmorStandTask;
import LernPaper.DeathPaper.DeathPaper;
import LernPaper.ExpGain.ExpGain;
import LernPaper.tantaihaha.tantaihaha;
import LernPaper.util.ServerUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        /*===============================================[Logger]===============================================*/
        ServerUtils.RandomLogger();
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
