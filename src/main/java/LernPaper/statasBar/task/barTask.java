package LernPaper.statasBar.task;

import LernPaper.Main;
import LernPaper.util.ServerUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitScheduler;

import java.util.ArrayList;
import java.util.List;

public class barTask {
    private static Main plugin;
    public static BossBar bar = Bukkit.createBossBar("Tps", BarColor.BLUE, BarStyle.SOLID, BarFlag.DARKEN_SKY);
    public static List<Player> inUse = new ArrayList<>();

    public barTask(Main plugin) {
        barTask.plugin = plugin;
    }

    public static void onUpdateBar() {
        BukkitScheduler sh = plugin.getServer().getScheduler();
        sh.scheduleSyncRepeatingTask(plugin, () -> bar.setTitle(ChatColor.YELLOW + "TPS from 1m, 3m, 5m: " + ServerUtils.getTps()), 5, 5);
    }
    public static void add(Player p) {
        bar.addPlayer(p);
        inUse.add(p);
    }
    public static void remove(Player p) {
        bar.removePlayer(p);
        inUse.remove(p);
    }
    public static void removeAll() {
        bar.removeAll();
        inUse.removeAll(inUse);
    }
}
