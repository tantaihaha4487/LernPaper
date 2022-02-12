package LernPaper;

import LernPaper.event.onPlayerExp;
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
        getServer().getPluginManager().registerEvents(new onPlayerExp(), this);

    }
}
