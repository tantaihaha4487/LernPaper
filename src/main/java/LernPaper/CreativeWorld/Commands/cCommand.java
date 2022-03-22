package LernPaper.CreativeWorld.Commands;

import LernPaper.CreativeWorld.Task.WorldTask;
import LernPaper.util.PlayerUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class cCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        PlayerUtils.isPlayer(sender);
        if(cmd.getName().equalsIgnoreCase("c")) {
            Player p = (Player) sender;
            if(Bukkit.getWorld("c") == null) {
                WorldTask.createWorld();
                sender.sendMessage(ChatColor.AQUA +"Creating world..");
            }
            WorldTask.JoinAndExit(p);
        }
        return true;
    }
}
