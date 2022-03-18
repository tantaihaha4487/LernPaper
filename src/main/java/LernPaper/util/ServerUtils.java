package LernPaper.util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import java.util.Random;

public class ServerUtils {
    private static final Random rand = new Random();
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
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "▓▓▓▓▓▓    ▓▓      ▓▓    ▓▓  ▓▓▓▓▓▓      ▓▓      ▓▓▓▓");
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "  ▓▓    ▓▓  ▓▓    ▓▓▓▓  ▓▓    ▓▓      ▓▓  ▓▓        ");
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "  ▓▓    ▓▓▓▓▓▓    ▓▓  ▓▓▓▓    ▓▓      ▓▓▓▓▓▓    ▓▓▓▓");
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "  ▓▓  ▓▓      ▓▓  ▓▓    ▓▓    ▓▓    ▓▓      ▓▓  ▓▓▓▓");
                Bukkit.getServer().getLogger().info(ChatColor.GREEN + "                                                      `PAPER.");
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
    public static String getTps() {
        double[] tps = Bukkit.getTPS();
        String[] tpsAvg = new String[tps.length];
        for ( int i = 0; i < tps.length; i++) {
            tpsAvg[i] = tpsFormat( tps[i] );
        }
        String test = org.apache.commons.lang.StringUtils.join(tpsAvg, ", ");
        return test;
    }
    private static String tpsFormat(double tps) // Paper - Made static
    {
        return ( ( tps > 18.0 ) ? ChatColor.GREEN : ( tps > 16.0 ) ? ChatColor.YELLOW : ChatColor.RED ).toString()
                + ( ( tps > 21.0 ) ? "*" : "" ) + Math.min( Math.round( tps * 100.0 ) / 100.0, 20.0 ); // Paper - only print * at 21, we commonly peak to 20.02 as the tick sleep is not accurate enough, stop the noise
    }
}
