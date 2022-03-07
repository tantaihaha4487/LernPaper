package LernPaper.DeathPaper.event;

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

import java.util.ArrayList;
import java.util.List;

public class onplayerDeath implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        Player p = e.getPlayer();
        Location loc = p.getLocation();
        int x = loc.getBlockX();
        int y = loc.getBlockY();
        int z = loc.getBlockZ();

        ItemStack paper = new ItemStack(Material.PAPER);
        ItemMeta paperMeta = paper.getItemMeta();
        paperMeta.setDisplayName(ChatColor.GOLD + "Death Paper");
        paperMeta.addEnchant(Enchantment.LUCK, 1, true);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.LIGHT_PURPLE + "Player: " + p.getName());
        lore.add(ChatColor.LIGHT_PURPLE + "X: " + x + " Y: "+ y + " Z: " + z);

        paperMeta.setLore(lore);
        paperMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        paper.setItemMeta(paperMeta);


        p.getInventory().addItem(paper);
    }
}
