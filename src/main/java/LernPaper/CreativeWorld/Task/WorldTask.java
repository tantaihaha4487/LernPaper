package LernPaper.CreativeWorld.Task;

import LernPaper.Main;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WorldTask {
    private static Main plugin;
    public static List<Player> inWorld = new ArrayList<>();
    public static HashMap<Player, Location> lastLocation = new HashMap<>();

    public WorldTask(Main plugin) {
        this.plugin = plugin;
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
        Location c = Bukkit.getWorld("c").getSpawnLocation();
        if(inWorld.contains(p)) {
            p.teleport(lastLocation.get(p));
            inWorld.remove(p);
            lastLocation.remove(p);
        }
        else {
            inWorld.add(p);
            lastLocation.put(p, loc);
            p.teleport(c);
        }
    }
}
