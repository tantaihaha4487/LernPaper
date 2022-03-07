package LernPaper.ExpGain.event;

import com.destroystokyo.paper.event.player.PlayerPickupExperienceEvent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class onPlayerExp implements Listener {

    @EventHandler
    public void onExp(PlayerPickupExperienceEvent e) {
        Player p = e.getPlayer();
        int exp = e.getExperienceOrb().getExperience();
        p.sendActionBar(ChatColor.GREEN + ChatColor.BOLD.toString() + "Gain XP: " + ChatColor.YELLOW + ChatColor.BOLD + exp);
    }
}
