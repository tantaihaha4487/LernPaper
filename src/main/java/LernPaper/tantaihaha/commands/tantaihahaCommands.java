package LernPaper.tantaihaha.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class tantaihahaCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player p = (Player) sender;
        if(!p.isOp()) {
            p.sendMessage(ChatColor.RED.toString() + ChatColor.BOLD + "<!> You don't have permission!" );
        }
        if (cmd.getName().equalsIgnoreCase("tantaihaha")) {
            /*if(args[0].equalsIgnoreCase("dowload")) {
                if(args[1].equalsIgnoreCase("LernSpigot")) {
                    sender.sendMessage("strat dowload LernSoigot.jar..");

                }

            }*/
        }
        return true;
    }
}
