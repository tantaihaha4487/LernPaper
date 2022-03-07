package LernPaper.util;

import org.bukkit.inventory.ItemStack;

public class ItemUtils {

    public static Boolean isDiamondToolTierUp(ItemStack item) {
        switch (item.getType()) {
            case DIAMOND_AXE:
            case DIAMOND_BOOTS:
            case DIAMOND_CHESTPLATE:
            case DIAMOND_HELMET:
            case DIAMOND_HOE:
            case DIAMOND_LEGGINGS:
            case DIAMOND_PICKAXE:
            case DIAMOND_SHOVEL:
            case DIAMOND_SWORD:
            case NETHERITE_AXE:
            case NETHERITE_BOOTS:
            case NETHERITE_CHESTPLATE:
            case NETHERITE_HELMET:
            case NETHERITE_HOE:
            case NETHERITE_LEGGINGS:
            case NETHERITE_PICKAXE:
            case NETHERITE_SHOVEL:
            case NETHERITE_SWORD: {
                return true;
            }
            default: {return false;}
        }

    }
}
