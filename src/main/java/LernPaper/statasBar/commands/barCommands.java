package LernPaper.statasBar.commands;

import LernPaper.statasBar.task.barTask;
import LernPaper.util.PlayerUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class barCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        PlayerUtils.isPlayer(sender);
        Player p = (Player) sender;
        if(cmd.getName().equalsIgnoreCase("bar")) {
            if(barTask.inUse.contains(p)) {
                barTask.remove(p);
            }
            else {barTask.add(p);}
        }
        return true;
    }
}
