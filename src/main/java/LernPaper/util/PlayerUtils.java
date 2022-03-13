package LernPaper.util;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PlayerUtils {

    public static String getEnvironment(Player p) {
        String envi = "";
        switch (p.getWorld().getEnvironment()) {
            case NORMAL:
                envi = "Normal";
            break;
            case NETHER:
                envi = "Nether";
            break;
            case THE_END:
                envi = "The End";
            break;
            case CUSTOM:
                envi = "Custom";
            break;
        }
        return envi;
    }
    public static boolean isOp(CommandSender sender) {
        Player p = (Player) sender;
        if(!p.isOp()) {return false;}
        else {return true;}
    }
}
