package LernPaper.util;

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
}
