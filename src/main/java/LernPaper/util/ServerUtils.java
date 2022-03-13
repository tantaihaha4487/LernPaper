package LernPaper.util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import java.util.Random;

public class ServerUtils {
    private static Random rand = new Random();
    public static void RandomLogger() {
        int log = rand.nextInt(3);
        switch (log) {
            case 0:
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "===============[Plugin]===============");
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "- Plugin: Lern Plugin V.2 Is Enable!");
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "- Version: " + Bukkit.getVersion());
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "- Max Player: " + Bukkit.getMaxPlayers());
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "- Max View Distance: " + Bukkit.getViewDistance());
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "- Version: " + Bukkit.getMinecraftVersion());
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "======================================");
                break;
            case 1:
                Bukkit.getLogger().info("1");Bukkit.getServer().getLogger().info(ChatColor.GREEN + "\n\n");
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "///        /////////  //////     ///      //");
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "///        ///        ///   ///  /////    //");
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "///        ///        ///   ///  /////    //");
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "///        /////////  /////////  ///  //  //");
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "///        /////////  //////     ///  //  //");
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "///        ///        ///   ///  ///    ////");
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "/////////  ///        ///   ///  ///    ////");
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "/////////  /////////  ///   ///  ///      //");
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "                                    `PAPER.");
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "\n\n");
                break;
            case 2:
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "\n\n");
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "@@@@@@@@@     " + ChatColor.AQUA + "Info..");
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "@@@@@@@@@");
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "   @@@        " + ChatColor.AQUA +"Action: " + ChatColor.GREEN + "Enable!");
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "   @@@        " + ChatColor.AQUA + "Server Version:" + ChatColor.GOLD + Bukkit.getVersion());
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "   @@@        " + ChatColor.AQUA +"Version: " + Bukkit.getMinecraftVersion());
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "   @@@        " + ChatColor.AQUA +"Max Player: " + Bukkit.getMaxPlayers());
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "\n\n");

                break;
            default: {
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "\n\n");
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "@@@@@@@@@     " + ChatColor.AQUA + "Info..");
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "@@@@@@@@@");
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "   @@@        " + ChatColor.AQUA +"Action: " + ChatColor.GREEN + "Enable!");
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "   @@@        " + ChatColor.AQUA + "Server Version:" + ChatColor.GOLD + Bukkit.getVersion());
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "   @@@        " + ChatColor.AQUA +"Version: " + Bukkit.getMinecraftVersion());
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "   @@@        " + ChatColor.AQUA +"Max Player: " + Bukkit.getMaxPlayers());
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "\n\n");
                break;
            }
        }
    }
}
