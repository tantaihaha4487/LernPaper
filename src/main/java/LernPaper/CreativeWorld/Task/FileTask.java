package LernPaper.CreativeWorld.Task;

import com.google.gson.JsonObject;
import netscape.javascript.JSObject;
import org.bukkit.Location;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

public class FileTask {
    public static File folder = new File("Data/c/");

    public static void DataFile(UUID PlayerID, Location loc) throws IOException {
        String id = PlayerID.toString();
        File DataFile = new File(folder + id + ".json");
        JSONObject data =  new JSONObject();
        data.put("location", loc.toString());

        try (FileWriter file = new FileWriter(DataFile)) {
            file.write(data.toJSONString());
        } catch (IOException e) {e.printStackTrace();}
    }
}
