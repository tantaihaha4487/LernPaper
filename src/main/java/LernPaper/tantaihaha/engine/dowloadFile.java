package LernPaper.tantaihaha.engine;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class dowloadFile {
    public static void dowload() {
        File file = new File("Lern.jar");
        if (!file.exists()) {
            try {
                Bukkit.getLogger().info("Start Dowload..");
                HttpURLConnection http = (HttpURLConnection)(new URL("https://github.com/tantaihaha4487/ReleaseFile/blob/main/Lern.jar")).openConnection();
                double size = (double)http.getContentLengthLong();
                BufferedInputStream in = new BufferedInputStream(http.getInputStream());
                FileOutputStream fileout = new FileOutputStream("plugins/Lern.jar");
                BufferedOutputStream out = new BufferedOutputStream(fileout, 1024);
                byte[] bytes = new byte[1024];
                //out.close();
                //in.close();
                Bukkit.getLogger().info(ChatColor.GREEN + "Download Done!");
            } catch (Exception var19) {
                Bukkit.getLogger().info(ChatColor.RED + "Error to Download File!");
                return;
            }
        }
    }
}
