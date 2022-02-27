package LernPaper.tantaihaha.commands;

import LernPaper.tantaihaha.engine.dowloadFile;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class tantaihahaCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("tantaihaha")) {
            if(args[0].equalsIgnoreCase("dowload")) {
                if(args[1].equalsIgnoreCase("LernSpigot")) {
                    sender.sendMessage("strat dowload LernSpigot.jar..");
                    dowloadFile.dowload();
                }

            }
        }
        return true;
    }
}
