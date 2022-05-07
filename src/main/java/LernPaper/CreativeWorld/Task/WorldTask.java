package LernPaper.CreativeWorld.Task;

import LernPaper.Main;
import org.bukkit.*;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class WorldTask {
    private static Main plugin;
    public static HashMap<Player, Location> lastLocation = new HashMap<>();

    public WorldTask(Main plugin) {
        WorldTask.plugin = plugin;
    }
    public static void createWorld() {
        WorldCreator world = new WorldCreator("c");
        world.environment(World.Environment.NORMAL);
        world.type(WorldType.FLAT);
        world.createWorld();
        //Disable Mob spawn
        Bukkit.getWorld("c").setGameRule(GameRule.DO_MOB_SPAWNING, false);
    }

    public static void JoinAndExit(Player p) {
        Location loc = p.getLocation();
        Location c = getWorldCreative().getSpawnLocation();
        if(isInWorld(p)) {
            p.teleport(lastLocation.get(p));
            lastLocation.remove(p);
        }
        else {
            lastLocation.put(p, loc);
            p.teleport(c);
        }
    }
    public static boolean isInWorld(Player p) {
        return p.getWorld().getName().equals("c");
    }
    public static World getWorldCreative() {
        return Bukkit.getWorld("c");
    }
}
