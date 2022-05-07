package LernPaper.CreativeWorld.event;

import LernPaper.CreativeWorld.Task.FileTask;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

import java.io.IOException;
import java.util.Locale;
import java.util.UUID;

public class onPlayerChangeWorld implements Listener {
    @EventHandler
    public void onPlayerChangeWorld(PlayerTeleportEvent e) {
        Player p = e.getPlayer();
        UUID id = p.getUniqueId();
        try {
            FileTask.DataFile(id, p.getLocation());
        } catch (IOException io) {io.printStackTrace();}
    }
}
