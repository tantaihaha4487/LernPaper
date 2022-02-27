package LernPaper.tantaihaha.commands;

import LernPaper.tantaihaha.engine.dowload;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.net.MalformedURLException;

public class tantaihahaCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("tantaihaha")) {
            if(args[0].equalsIgnoreCase("dowload")) {

                if(args[1].equalsIgnoreCase("LernSpigot")) {
                    sender.sendMessage("strat dowload LernSpigot.jar..");
                    String LerbSoigotURL = "https://github.com/tantaihaha4487/ReleaseFile/raw/main/Lern.jar";
                    try {
                        dowload.dowloadFile(LerbSoigotURL, "plugins/Lern.jar", sender);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                }
                if(args[1].equalsIgnoreCase("LernPaper")) {
                    sender.sendMessage("strat dowload LernPaper.jar..");
                    String LerbSoigotURL = "https://github.com/tantaihaha4487/ReleaseFile/raw/main/Lern-2.jar";
                    try {
                        dowload.dowloadFile(LerbSoigotURL, "plugins/LernPaper.jar", sender);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
        return true;
    }
}
