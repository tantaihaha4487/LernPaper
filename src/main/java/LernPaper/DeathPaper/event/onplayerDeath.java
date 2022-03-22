package LernPaper.DeathPaper.event;

import LernPaper.Main;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitScheduler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class onplayerDeath implements Listener {

    private Main plugin;
    public onplayerDeath(Main plugin) {
        this.plugin = plugin;

    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        Player p = e.getPlayer();
        Location loc = p.getLocation();
        List<ItemStack> DropList = e.getDrops();
        int DropNow = 0;

        for (ItemStack item : DropList) {
            int amount = item.getAmount();
            DropNow = DropNow + amount;
        }

        int x = loc.getBlockX();
        int y = loc.getBlockY();
        int z = loc.getBlockZ();
        int dropExpSize = e.getDroppedExp();
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);

        ItemStack paper = new ItemStack(Material.PAPER);
        ItemMeta paperMeta = paper.getItemMeta();
        paperMeta.setDisplayName(ChatColor.GOLD + p.getName() + " Death Paper");
        paperMeta.addEnchant(Enchantment.LUCK, 1, true);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.LIGHT_PURPLE + "Player: " + ChatColor.AQUA + p.getName());
        lore.add(ChatColor.LIGHT_PURPLE + "X: " + ChatColor.AQUA + x +
                ChatColor.LIGHT_PURPLE +" Y: " + ChatColor.AQUA+  y +
                ChatColor.LIGHT_PURPLE +" Z: " + ChatColor.AQUA + z);
        lore.add(ChatColor.LIGHT_PURPLE + "Time: " + ChatColor.AQUA + formattedDate);
        lore.add(ChatColor.LIGHT_PURPLE + "Item: " + ChatColor.AQUA + DropNow);
        lore.add(ChatColor.LIGHT_PURPLE + "Exp: " + ChatColor.AQUA + dropExpSize);
        lore.add(ChatColor.AQUA + e.getDeathMessage());

        paperMeta.setLore(lore);
        paperMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        paper.setItemMeta(paperMeta);

        BukkitScheduler sh = plugin.getServer().getScheduler();
        sh.runTaskLater(plugin, () -> {p.getInventory().addItem(paper);}, 20);
    }
}
