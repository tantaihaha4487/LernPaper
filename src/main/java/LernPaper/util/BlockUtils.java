package LernPaper.util;

import org.bukkit.Material;

public class BlockUtils {
    public static boolean isWood(Material material){
        switch (material){
            case ACACIA_LOG:
            case BIRCH_LOG:
            case DARK_OAK_LOG:
            case JUNGLE_LOG:
            case OAK_LOG:
            case SPRUCE_LOG:
            case STRIPPED_ACACIA_LOG:
            case STRIPPED_BIRCH_LOG:
            case STRIPPED_DARK_OAK_LOG:
            case STRIPPED_JUNGLE_LOG:
            case STRIPPED_OAK_LOG:
            case STRIPPED_SPRUCE_LOG:
            case ACACIA_WOOD:
            case BIRCH_WOOD:
            case DARK_OAK_WOOD:
            case JUNGLE_WOOD:
            case OAK_WOOD:
            case SPRUCE_WOOD:
            case STRIPPED_ACACIA_WOOD:
            case STRIPPED_BIRCH_WOOD:
            case STRIPPED_DARK_OAK_WOOD:
            case STRIPPED_JUNGLE_WOOD:
            case STRIPPED_OAK_WOOD:
            case STRIPPED_SPRUCE_WOOD:
            case WARPED_STEM:
            case STRIPPED_WARPED_HYPHAE:
            case STRIPPED_WARPED_STEM:
            case WARPED_HYPHAE:
            case CRIMSON_STEM:
            case STRIPPED_CRIMSON_STEM:
            case STRIPPED_CRIMSON_HYPHAE:
            case CRIMSON_HYPHAE:
            {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    public static boolean isLeaves(Material material){
        switch (material){
            case ACACIA_LEAVES:
            case BIRCH_LEAVES:
            case DARK_OAK_LEAVES:
            case JUNGLE_LEAVES:
            case OAK_LEAVES:
            case SPRUCE_LEAVES:
            case AZALEA_LEAVES:
            case WARPED_WART_BLOCK:
            case NETHER_WART_BLOCK:
            {
                return true;
            }
            default: {
                return false;
            }
        }
    }
}
