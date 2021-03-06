/*
 * Copyright (C) 2015-2021 Daniel Saukel.
 *
 * This library is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNULesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package de.erethon.caliburn.category;

import de.erethon.caliburn.CaliburnAPI;
import de.erethon.caliburn.item.ExItem;
import de.erethon.caliburn.item.VanillaItem;
import static de.erethon.caliburn.item.VanillaItem.*;
import de.erethon.caliburn.mob.ExMob;
import de.erethon.caliburn.mob.VanillaMob;
import static de.erethon.caliburn.mob.VanillaMob.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

/**
 * This class groups together certain values that can be subsumed under a superterm.
 * <p>
 * It is similar to Bukkit's {@link org.bukkit.Tag} class.
 *
 * @param <T> the type that can be subsumed under this category
 * @author Daniel Saukel
 */
public class Category<T extends Categorizable> extends Categorizable {

    public static final Category<ExItem> ACACIA_LOGS = new Category<>("acacia_logs", ACACIA_WOOD, ACACIA_LOG, STRIPPED_ACACIA_LOG, STRIPPED_ACACIA_WOOD);
    public static final Category<ExItem> ANVIL = new Category<>("anvil", VanillaItem.ANVIL, CHIPPED_ANVIL, DAMAGED_ANVIL);
    public static final Category<ExItem> ARROWS = new Category<>("arrows", VanillaItem.ARROW, VanillaItem.TIPPED_ARROW, VanillaItem.SPECTRAL_ARROW);
    public static final Category<ExItem> BANNERS = new Category<>("banners", WHITE_BANNER, ORANGE_BANNER, MAGENTA_BANNER, LIGHT_BLUE_BANNER, YELLOW_BANNER, LIME_BANNER,
            PINK_BANNER, GRAY_BANNER, LIGHT_GRAY_BANNER, CYAN_BANNER, PURPLE_BANNER, BLUE_BANNER, BROWN_BANNER, GREEN_BANNER, RED_BANNER, BLACK_BANNER,
            WHITE_WALL_BANNER, ORANGE_WALL_BANNER, MAGENTA_WALL_BANNER, LIGHT_BLUE_WALL_BANNER, YELLOW_WALL_BANNER, LIME_WALL_BANNER, PINK_WALL_BANNER, GRAY_WALL_BANNER,
            LIGHT_GRAY_WALL_BANNER, CYAN_WALL_BANNER, PURPLE_WALL_BANNER, BLUE_WALL_BANNER, BROWN_WALL_BANNER, GREEN_WALL_BANNER, RED_WALL_BANNER, BLACK_WALL_BANNER);
    public static final Category<ExItem> BASE_STONE_NETHER = new Category<>("base_stone_nether", NETHERRACK, BASALT, BLACKSTONE);
    public static final Category<ExItem> BASE_STONE_OVERWORLD = new Category<>("base_stone_overworld", STONE, GRANITE, DIORITE, ANDESITE);
    public static final Category<ExItem> BEACON_BASE_BLOCKS = new Category<>("beacon_base_blocks", NETHERITE_BLOCK, EMERALD_BLOCK, DIAMOND_BLOCK, GOLD_BLOCK,
            IRON_BLOCK);
    public static final Category<ExItem> BEDS = new Category<>("beds", WHITE_BED, ORANGE_BED, MAGENTA_BED, LIGHT_BLUE_BED, YELLOW_BED, LIME_BED, PINK_BED, GRAY_BED,
            LIGHT_GRAY_BED, CYAN_BED, PURPLE_BED, BLUE_BED, BROWN_BED, GREEN_BED, RED_BED, BLACK_BED);
    public static final Category<ExItem> BEEHIVES = new Category<>("beehives", VanillaItem.BEEHIVE, BEE_NEST);
    public static final Category<ExItem> BIRCH_LOGS = new Category<>("birch_logs", BIRCH_WOOD, BIRCH_LOG, STRIPPED_BIRCH_LOG, STRIPPED_BIRCH_WOOD);
    public static final Category<ExItem> BOATS = new Category<>("boats", OAK_BOAT, SPRUCE_BOAT, BIRCH_BOAT, JUNGLE_BOAT, ACACIA_BOAT, DARK_OAK_BOAT);
    public static final Category<ExItem> CAMPFIRES = new Category<>("campfires", CAMPFIRE, SOUL_CAMPFIRE);
    public static final Category<ExItem> CARPETS = new Category<>("carpets", WHITE_CARPET, ORANGE_CARPET, MAGENTA_CARPET, LIGHT_BLUE_CARPET, YELLOW_CARPET, LIME_CARPET,
            PINK_CARPET, GRAY_CARPET, LIGHT_GRAY_CARPET, CYAN_CARPET, PURPLE_CARPET, BLUE_CARPET, BROWN_CARPET, GREEN_CARPET, RED_CARPET, BLACK_CARPET);
    public static final Category<ExItem> CLIMBABLE = new Category<>("climbable", LADDER, VINE, SCAFFOLDING, WEEPING_VINES, WEEPING_VINES_PLANT, TWISTING_VINES,
            TWISTING_VINES_PLANT);
    public static final Category<ExItem> COALS = new Category<>("coals", COAL, CHARCOAL);
    public static final Category<ExItem> CORAL_BLOCKS = new Category<>("coral_blocks", TUBE_CORAL_BLOCK, BRAIN_CORAL_BLOCK, BUBBLE_CORAL_BLOCK, FIRE_CORAL_BLOCK, HORN_CORAL_BLOCK);
    public static final Category<ExItem> CORAL_PLANTS = new Category<>("coral_plants", TUBE_CORAL, BRAIN_CORAL, BUBBLE_CORAL, FIRE_CORAL, HORN_CORAL);
    public static final Category<ExItem> CRIMSON_STEMS = new Category<>("crimson_stems", CRIMSON_STEM, STRIPPED_CRIMSON_STEM, CRIMSON_HYPHAE, STRIPPED_CRIMSON_HYPHAE);
    public static final Category<ExItem> CROPS = new Category<>("crops", BEETROOTS, CARROTS, POTATOES, WHEAT, MELON, PUMPKIN);
    public static final Category<ExItem> DARK_OAK_LOGS = new Category<>("dark_oak_logs", DARK_OAK_WOOD, DARK_OAK_LOG, STRIPPED_DARK_OAK_LOG, STRIPPED_DARK_OAK_WOOD);
    public static final Category<ExItem> DEAD_CORAL_BLOCKS = new Category<>("dead_coral_blocks", DEAD_TUBE_CORAL_BLOCK, DEAD_BRAIN_CORAL_BLOCK, DEAD_BUBBLE_CORAL_BLOCK,
            DEAD_FIRE_CORAL_BLOCK, DEAD_HORN_CORAL_BLOCK);
    public static final Category<ExItem> DRAGON_IMMUNE = new Category<>("dragon_immune", BARRIER, BEDROCK, END_PORTAL, END_PORTAL_FRAME, END_GATEWAY, COMMAND_BLOCK,
            REPEATING_COMMAND_BLOCK, CHAIN_COMMAND_BLOCK, STRUCTURE_BLOCK, JIGSAW, MOVING_PISTON, OBSIDIAN, CRYING_OBSIDIAN, END_STONE, IRON_BARS, RESPAWN_ANCHOR);
    public static final Category<ExItem> FIRE = new Category<>("fire", VanillaItem.FIRE, SOUL_FIRE);
    public static final Category<ExItem> FISHES = new Category<>("fishes", VanillaItem.COD, VanillaItem.COOKED_COD, VanillaItem.SALMON, VanillaItem.COOKED_SALMON,
            VanillaItem.PUFFERFISH, VanillaItem.TROPICAL_FISH);
    public static final Category<ExItem> FLOWER_POTS = new Category<>("flower_pots", FLOWER_POT, POTTED_POPPY, POTTED_DANDELION, POTTED_OAK_SAPLING, POTTED_SPRUCE_SAPLING,
            POTTED_BIRCH_SAPLING, POTTED_JUNGLE_SAPLING, POTTED_RED_MUSHROOM, POTTED_BROWN_MUSHROOM, POTTED_CACTUS, POTTED_DEAD_BUSH, POTTED_FERN, POTTED_ACACIA_SAPLING,
            POTTED_DARK_OAK_SAPLING, POTTED_BLUE_ORCHID, POTTED_ALLIUM, POTTED_AZURE_BLUET, POTTED_RED_TULIP, POTTED_ORANGE_TULIP, POTTED_WHITE_TULIP, POTTED_PINK_TULIP,
            POTTED_OXEYE_DAISY, POTTED_CORNFLOWER, POTTED_LILY_OF_THE_VALLEY, POTTED_WITHER_ROSE, POTTED_BAMBOO, POTTED_CRIMSON_FUNGUS, POTTED_WARPED_FUNGUS,
            POTTED_CRIMSON_ROOTS, POTTED_WARPED_ROOTS);
    public static final Category<ExItem> GOLD_ORES = new Category<>("gold_ores", GOLD_ORE, NETHER_GOLD_ORE);
    public static final Category<ExItem> ICE = new Category<>("ice", VanillaItem.ICE, FROSTED_ICE, PACKED_ICE, BLUE_ICE);
    public static final Category<ExItem> IMPERMEABLE = new Category<>("impermeable", GLASS, WHITE_STAINED_GLASS, ORANGE_STAINED_GLASS, MAGENTA_STAINED_GLASS, LIGHT_BLUE_STAINED_GLASS,
            YELLOW_STAINED_GLASS, LIME_STAINED_GLASS, PINK_STAINED_GLASS, GRAY_STAINED_GLASS, LIGHT_GRAY_STAINED_GLASS, CYAN_STAINED_GLASS, PURPLE_STAINED_GLASS,
            BLUE_STAINED_GLASS, BROWN_STAINED_GLASS, GREEN_STAINED_GLASS, RED_STAINED_GLASS, BLACK_STAINED_GLASS);
    public static final Category<ExItem> INFINIBURN_OVERWORLD = new Category<>("infiniburn_overworld", NETHERRACK, MAGMA_BLOCK);
    public static final Category<ExItem> HOGLIN_REPELLENTS = new Category<>("hoglin_repellents", WARPED_FUNGUS, POTTED_WARPED_FUNGUS, NETHER_PORTAL, RESPAWN_ANCHOR);
    public static final Category<ExItem> JUNGLE_LOGS = new Category<>("jungle_logs", JUNGLE_WOOD, JUNGLE_LOG, STRIPPED_JUNGLE_LOG, STRIPPED_JUNGLE_WOOD);
    public static final Category<ExItem> LAVA = new Category<>("lava", VanillaItem.LAVA, FLOWING_LAVA);
    public static final Category<ExItem> LEAVES = new Category<>("leaves", JUNGLE_LEAVES, OAK_LEAVES, SPRUCE_LEAVES, DARK_OAK_LEAVES, ACACIA_LEAVES, BIRCH_LEAVES);
    public static final Category<ExItem> LECTERN_BOOKS = new Category<>("lectern_books", WRITTEN_BOOK, WRITABLE_BOOK);
    public static final Category<ExItem> LIVE_CORAL_BLOCKS = new Category<>("live_coral_blocks", TUBE_CORAL_BLOCK, BRAIN_CORAL_BLOCK, BUBBLE_CORAL_BLOCK, FIRE_CORAL_BLOCK,
            HORN_CORAL_BLOCK);
    public static final Category<ExItem> MUSHROOM_GROW_BLOCK = new Category<>("mushroom_grow_block‌", MYCELIUM, PODZOL, CRIMSON_NYLIUM, WARPED_NYLIUM);
    public static final Category<ExItem> MUSIC_DISCS = new Category<>("music_discs", MUSIC_DISC_13, MUSIC_DISC_CAT, MUSIC_DISC_BLOCKS, MUSIC_DISC_CHIRP, MUSIC_DISC_FAR,
            MUSIC_DISC_MALL, MUSIC_DISC_MELLOHI, MUSIC_DISC_STAL, MUSIC_DISC_STRAD, MUSIC_DISC_WARD, MUSIC_DISC_11, MUSIC_DISC_WAIT);
    public static final Category<ExItem> NON_FLAMABLE_WOOD = new Category("non_flamable_wood", WARPED_STEM, STRIPPED_WARPED_STEM, WARPED_HYPHAE,
            STRIPPED_WARPED_HYPHAE, CRIMSON_STEM, STRIPPED_CRIMSON_STEM, CRIMSON_HYPHAE, STRIPPED_CRIMSON_HYPHAE, CRIMSON_PLANKS, WARPED_PLANKS, CRIMSON_SLAB,
            WARPED_SLAB, CRIMSON_PRESSURE_PLATE, WARPED_PRESSURE_PLATE, CRIMSON_FENCE, WARPED_FENCE, CRIMSON_TRAPDOOR, WARPED_TRAPDOOR, CRIMSON_FENCE_GATE,
            WARPED_FENCE_GATE, CRIMSON_STAIRS, WARPED_STAIRS, CRIMSON_BUTTON, WARPED_BUTTON, CRIMSON_DOOR, WARPED_DOOR, CRIMSON_SIGN, WARPED_SIGN,
            CRIMSON_WALL_SIGN, WARPED_WALL_SIGN);
    public static final Category<ExItem> OAK_LOGS = new Category<>("oak_logs", OAK_WOOD, OAK_LOG, STRIPPED_OAK_LOG, STRIPPED_OAK_WOOD);
    public static final Category<ExItem> PIGLIN_REPELLENTS = new Category<>("piglin_repellents", SOUL_FIRE, SOUL_TORCH, SOUL_WALL_TORCH, SOUL_LANTERN, SOUL_CAMPFIRE);
    public static final Category<ExItem> PLANKS = new Category<>("planks", OAK_PLANKS, SPRUCE_PLANKS, BIRCH_PLANKS, JUNGLE_PLANKS, ACACIA_PLANKS, DARK_OAK_PLANKS);
    public static final Category<ExItem> PORTALS = new Category<>("portals", NETHER_PORTAL, END_PORTAL, END_GATEWAY);
    public static final Category<ExItem> RAILS = new Category<>("rails", RAIL, POWERED_RAIL, DETECTOR_RAIL, ACTIVATOR_RAIL);
    public static final Category<ExItem> SAND = new Category<>("sand", VanillaItem.SAND, RED_SAND);
    public static final Category<ExItem> SAPLINGS = new Category<>("saplings", OAK_SAPLING, SPRUCE_SAPLING, BIRCH_SAPLING, JUNGLE_SAPLING, ACACIA_SAPLING, DARK_OAK_SAPLING);
    public static final Category<ExItem> SHULKER_BOXES = new Category<>("shulker_boxes", SHULKER_BOX, WHITE_SHULKER_BOX, ORANGE_SHULKER_BOX, MAGENTA_SHULKER_BOX,
            LIGHT_BLUE_SHULKER_BOX, YELLOW_SHULKER_BOX, LIME_SHULKER_BOX, PINK_SHULKER_BOX, GRAY_SHULKER_BOX, LIGHT_GRAY_SHULKER_BOX, CYAN_SHULKER_BOX,
            PURPLE_SHULKER_BOX, BLUE_SHULKER_BOX, BROWN_SHULKER_BOX, GREEN_SHULKER_BOX, RED_SHULKER_BOX, BLACK_SHULKER_BOX);
    public static final Category<ExItem> SLABS = new Category<>("slabs", STONE_SLAB, SMOOTH_STONE_SLAB, STONE_BRICK_SLAB, SANDSTONE_SLAB, ACACIA_SLAB, BIRCH_SLAB,
            DARK_OAK_SLAB, JUNGLE_SLAB, OAK_SLAB, SPRUCE_SLAB, PURPUR_SLAB, QUARTZ_SLAB, RED_SANDSTONE_SLAB, BRICK_SLAB, COBBLESTONE_SLAB, NETHER_BRICK_SLAB,
            PETRIFIED_OAK_SLAB, PRISMARINE_SLAB, PRISMARINE_BRICK_SLAB, DARK_PRISMARINE_SLAB, POLISHED_GRANITE_SLAB, SMOOTH_RED_SANDSTONE_SLAB,
            MOSSY_STONE_BRICK_SLAB, POLISHED_DIORITE_SLAB, MOSSY_COBBLESTONE_SLAB, END_STONE_BRICK_SLAB, SMOOTH_SANDSTONE_SLAB, SMOOTH_QUARTZ_SLAB, GRANITE_SLAB,
            ANDESITE_SLAB, RED_NETHER_BRICK_SLAB, POLISHED_ANDESITE_SLAB, DIORITE_SLAB, CUT_SANDSTONE_SLAB, CUT_RED_SANDSTONE_SLAB, BLACKSTONE_SLAB,
            POLISHED_BLACKSTONE_BRICK_SLAB, POLISHED_BLACKSTONE_SLAB);
    public static final Category<ExItem> SMALL_FLOWERS = new Category<>("small_flowers", DANDELION, POPPY, BLUE_ORCHID, ALLIUM, AZURE_BLUET, RED_TULIP, ORANGE_TULIP,
            WHITE_TULIP, PINK_TULIP, OXEYE_DAISY, CORNFLOWER, LILY_OF_THE_VALLEY, WITHER_ROSE);
    public static final Category<ExItem> SOUL_FIRE_BASE_BLOCKS = new Category<>("soul_fire_base_blocks", SOUL_SAND, SOUL_SOIL);
    public static final Category<ExItem> SOUL_SPEED_BLOCKS = new Category<>("soul_speed_blocks", SOUL_SAND, SOUL_SOIL);
    public static final Category<ExItem> SPRUCE_LOGS = new Category<>("spruce_logs", SPRUCE_WOOD, SPRUCE_LOG, STRIPPED_SPRUCE_LOG, STRIPPED_SPRUCE_WOOD);
    public static final Category<ExItem> STAIRS = new Category<>("stairs", OAK_STAIRS, COBBLESTONE_STAIRS, SPRUCE_STAIRS, SANDSTONE_STAIRS, ACACIA_STAIRS, JUNGLE_STAIRS,
            BIRCH_STAIRS, DARK_OAK_STAIRS, NETHER_BRICK_STAIRS, STONE_BRICK_STAIRS, BRICK_STAIRS, PURPUR_STAIRS, QUARTZ_STAIRS, RED_SANDSTONE_STAIRS,
            PRISMARINE_BRICK_STAIRS, PRISMARINE_STAIRS, DARK_PRISMARINE_STAIRS, POLISHED_GRANITE_STAIRS, SMOOTH_RED_SANDSTONE_STAIRS, MOSSY_STONE_BRICK_STAIRS,
            POLISHED_DIORITE_STAIRS, MOSSY_COBBLESTONE_STAIRS, END_STONE_BRICK_STAIRS, STONE_STAIRS, SMOOTH_SANDSTONE_STAIRS, SMOOTH_QUARTZ_STAIRS, GRANITE_STAIRS,
            ANDESITE_STAIRS, RED_NETHER_BRICK_STAIRS, POLISHED_ANDESITE_STAIRS, DIORITE_STAIRS, BLACKSTONE_STAIRS, POLISHED_BLACKSTONE_BRICK_STAIRS, POLISHED_BLACKSTONE_STAIRS);
    public static final Category<ExItem> STANDING_SIGNS = new Category<>("standing_signs", OAK_SIGN, SPRUCE_SIGN, BIRCH_SIGN, ACACIA_SIGN, JUNGLE_SIGN, DARK_OAK_SIGN,
            CRIMSON_SIGN, WARPED_SIGN, SIGN_POST);
    public static final Category<ExItem> STONE_BRICKS = new Category<>("stone_bricks", VanillaItem.STONE_BRICKS, MOSSY_STONE_BRICKS, CRACKED_STONE_BRICKS, CHISELED_STONE_BRICKS);
    public static final Category<ExItem> STONE_PRESSURE_PLATES = new Category<>("stone_pressure_plates", STONE_PRESSURE_PLATE, POLISHED_BLACKSTONE_PRESSURE_PLATE);
    public static final Category<ExItem> STRIDER_WARM_BLOCKS = new Category<>("strider_warm_blocks", LAVA);
    public static final Category<ExItem> TALL_FLOWERS = new Category<>("tall_flowers", SUNFLOWER, LILAC, PEONY, ROSE_BUSH);
    public static final Category<ExItem> VALID_SPAWN = new Category<>("valid_spawn", GRASS_BLOCK, PODZOL);
    public static final Category<ExItem> WALL_CORALS = new Category<>("wall_corals", TUBE_CORAL_WALL_FAN, BRAIN_CORAL_WALL_FAN, BUBBLE_CORAL_WALL_FAN, FIRE_CORAL_WALL_FAN,
            HORN_CORAL_WALL_FAN);
    public static final Category<ExItem> WALL_SIGNS = new Category<>("wall_signs", OAK_WALL_SIGN, SPRUCE_WALL_SIGN, BIRCH_WALL_SIGN, ACACIA_WALL_SIGN, JUNGLE_WALL_SIGN,
            DARK_OAK_WALL_SIGN, CRIMSON_WALL_SIGN, WARPED_WALL_SIGN);
    public static final Category<ExItem> WALLS = new Category<>("walls", COBBLESTONE_WALL, MOSSY_COBBLESTONE_WALL, BRICK_WALL, PRISMARINE_WALL, RED_SANDSTONE_WALL,
            MOSSY_STONE_BRICK_WALL, GRANITE_WALL, STONE_BRICK_WALL, NETHER_BRICK_WALL, ANDESITE_WALL, RED_NETHER_BRICK_WALL, SANDSTONE_WALL, END_STONE_BRICK_WALL,
            DIORITE_WALL, BLACKSTONE_WALL, POLISHED_BLACKSTONE_BRICK_WALL, POLISHED_BLACKSTONE_WALL);
    public static final Category<ExItem> WARPED_STEMS = new Category<>("warped_stems", WARPED_STEM, STRIPPED_WARPED_STEM, WARPED_HYPHAE, STRIPPED_WARPED_HYPHAE);
    public static final Category<ExItem> WART_BLOCKS = new Category<>("wart_blocks", NETHER_WART_BLOCK, WARPED_WART_BLOCK);
    public static final Category<ExItem> WATER = new Category<>("water", VanillaItem.WATER, FLOWING_WATER);
    public static final Category<ExItem> WITHER_IMMUNE = new Category<>("wither_immune", BARRIER, BEDROCK, END_PORTAL, END_PORTAL_FRAME, END_GATEWAY, COMMAND_BLOCK,
            REPEATING_COMMAND_BLOCK, CHAIN_COMMAND_BLOCK, STRUCTURE_BLOCK, JIGSAW, MOVING_PISTON, OBSIDIAN, END_STONE, IRON_BARS);
    public static final Category<ExItem> WITHER_SUMMON_BASE_BLOCKS = new Category<>("wither_summon_base_blocks", SOUL_SAND, SOUL_SOIL);
    public static final Category<ExItem> WOODEN_BUTTONS = new Category<>("wooden_butons", OAK_BUTTON, SPRUCE_BUTTON, BIRCH_BUTTON, JUNGLE_BUTTON, ACACIA_BUTTON,
            DARK_OAK_BUTTON, CRIMSON_BUTTON, WARPED_BUTTON);
    public static final Category<ExItem> WOODEN_DOORS = new Category<>("wooden_doors", OAK_DOOR, SPRUCE_DOOR, BIRCH_DOOR, JUNGLE_DOOR, ACACIA_DOOR, DARK_OAK_DOOR,
            WOODEN_DOOR, SPRUCE_DOOR_BLOCK, BIRCH_DOOR_BLOCK, BIRCH_DOOR_BLOCK, JUNGLE_DOOR_BLOCK, ACACIA_DOOR_BLOCK, DARK_OAK_DOOR_BLOCK, CRIMSON_DOOR, WARPED_DOOR);
    public static final Category<ExItem> WOODEN_FENCE_GATES = new Category<>("wooden_fence_gates", OAK_FENCE_GATE, ACACIA_FENCE_GATE, DARK_OAK_FENCE_GATE,
            SPRUCE_FENCE_GATE, BIRCH_FENCE_GATE, JUNGLE_FENCE_GATE, CRIMSON_FENCE_GATE, WARPED_FENCE_GATE);
    public static final Category<ExItem> WOODEN_FENCES = new Category<>("wooden_fences", OAK_FENCE, ACACIA_FENCE, DARK_OAK_FENCE, SPRUCE_FENCE, BIRCH_FENCE,
            JUNGLE_FENCE, CRIMSON_FENCE, WARPED_FENCE);
    public static final Category<ExItem> WOODEN_PRESSURE_PLATES = new Category<>("wooden_pressure_plates", OAK_PRESSURE_PLATE, SPRUCE_PRESSURE_PLATE, BIRCH_PRESSURE_PLATE,
            JUNGLE_PRESSURE_PLATE, ACACIA_PRESSURE_PLATE, DARK_OAK_PRESSURE_PLATE, CRIMSON_PRESSURE_PLATE, WARPED_PRESSURE_PLATE);
    public static final Category<ExItem> WOODEN_SLABS = new Category<>("wooden_slabs", OAK_SLAB, SPRUCE_SLAB, BIRCH_SLAB, JUNGLE_SLAB, ACACIA_SLAB, DARK_OAK_SLAB,
            CRIMSON_SLAB, WARPED_SLAB);
    public static final Category<ExItem> WOODEN_STAIRS = new Category<>("wooden_stairs", OAK_STAIRS, SPRUCE_STAIRS, BIRCH_STAIRS, JUNGLE_STAIRS, ACACIA_STAIRS,
            DARK_OAK_STAIRS, CRIMSON_STAIRS, WARPED_STAIRS);
    public static final Category<ExItem> WOODEN_TRAPDOORS = new Category<>("wooden_trapdoors", ACACIA_TRAPDOOR, BIRCH_TRAPDOOR, DARK_OAK_TRAPDOOR, JUNGLE_TRAPDOOR,
            OAK_TRAPDOOR, SPRUCE_TRAPDOOR, CRIMSON_TRAPDOOR, WARPED_TRAPDOOR);
    public static final Category<ExItem> WOOL = new Category<>("wool", WHITE_WOOL, ORANGE_WOOL, MAGENTA_WOOL, LIGHT_BLUE_WOOL, YELLOW_WOOL, LIME_WOOL, PINK_WOOL,
            GRAY_WOOL, LIGHT_GRAY_WOOL, CYAN_WOOL, PURPLE_WOOL, BLUE_WOOL, BROWN_WOOL, GREEN_WOOL, RED_WOOL, BLACK_WOOL);

    // In Minecraft "arrows"
    public static final Category<ExMob> ARROW_MOBS = new Category<>("arrow_mobs", VanillaMob.ARROW, VanillaMob.TIPPED_ARROW, VanillaMob.SPECTRAL_ARROW);
    public static final Category<ExMob> BEEHIVE_INHABITORS = new Category<>("beehive_inhabitors", BEE);
    public static final Category<ExMob> RAIDERS = new Category<>("raiders", EVOKER, ILLUSIONER, PILLAGER, RAVAGER, VINDICATOR, WITCH);
    public static final Category<ExMob> SKELETONS = new Category<>("skeletons", SKELETON, STRAY, WITHER_SKELETON);

    public static final Category<ExMob> IMPACT_PROJECTILES = new Category<>("impact_projectiles", ARROW_MOBS, VanillaMob.SNOWBALL, FIREBALL, SMALL_FIREBALL,
            VanillaMob.EGG, VanillaMob.TRIDENT, DRAGON_FIREBALL, WITHER_SKULL);

    // Removed in 1.15
    public static final Category<ExItem> DIRT_LIKE = new Category<>("dirt_like", DIRT, GRASS_BLOCK, PODZOL, COARSE_DIRT, MYCELIUM);

    // Parents
    public static final Category<ExItem> BAMBOO_PLANTABLE_ON = new Category<>("bamboo_plantable_on", SAND, DIRT_LIKE, BAMBOO, BAMBOO_SAPLING, GRAVEL);
    public static final Category<ExItem> BEE_GROWABLES = new Category<>("bee_growables", CROPS, SWEET_BERRY_BUSH);
    public static final Category<ExItem> BUTTONS = new Category<>("buttons", WOODEN_BUTTONS, STONE_BUTTON);
    public static final Category<ExItem> CORALS = new Category<>("corals", CORAL_PLANTS, TUBE_CORAL_FAN, BRAIN_CORAL_FAN, BUBBLE_CORAL_FAN, FIRE_CORAL_FAN, HORN_CORAL_FAN);
    public static final Category<ExItem> DOORS = new Category<>("doors", WOODEN_DOORS, IRON_DOOR, IRON_DOOR_BLOCK);
    public static final Category<ExItem> ENDERMAN_HOLDABLE = new Category<>("enderman_holdable", SMALL_FLOWERS, GRASS_BLOCK, DIRT, COARSE_DIRT, PODZOL, VanillaItem.SAND, RED_SAND,
            GRAVEL, BROWN_MUSHROOM, RED_MUSHROOM, VanillaItem.TNT, CACTUS, CLAY, PUMPKIN, CARVED_PUMPKIN, MELON, MYCELIUM, CRIMSON_FUNGUS, CRIMSON_NYLIUM, CRIMSON_ROOTS,
            WARPED_FUNGUS, WARPED_NYLIUM, WARPED_ROOTS);
    public static final Category<ExItem> FENCE_GATES = new Category<>("fence_gates", WOODEN_FENCE_GATES);
    public static final Category<ExItem> FENCES = new Category<>("fences", WOODEN_FENCES, FENCE_GATES, NETHER_BRICK_FENCE);
    public static final Category<ExItem> FLOWERS = new Category<>("flowers", SMALL_FLOWERS, TALL_FLOWERS);
    public static final Category<ExItem> GUARDED_BY_PIGLINS = new Category<>("guarded_by_piglins", GOLD_BLOCK, BARREL, CHEST, ENDER_CHEST, GILDED_BLACKSTONE,
            TRAPPED_CHEST, SHULKER_BOXES, GOLD_ORES);
    public static final Category<ExItem> INFINIBURN_END = new Category<>("infiniburn_end", INFINIBURN_OVERWORLD, BEDROCK);
    public static final Category<ExItem> INFINIBURN_NETHER = new Category<>("infiniburn_nether", INFINIBURN_OVERWORLD);
    public static final Category<ExItem> LOGS_THAT_BURN = new Category<>("logs_that_burn", OAK_LOGS, SPRUCE_LOGS, BIRCH_LOGS, JUNGLE_LOGS, ACACIA_LOGS, DARK_OAK_LOGS);
    public static final Category<ExItem> LOGS = new Category<>("logs", LOGS_THAT_BURN, CRIMSON_STEMS, WARPED_STEMS);
    public static final Category<ExItem> PRESSURE_PLATES = new Category<>("pressure_plates", WOODEN_PRESSURE_PLATES, STONE_PRESSURE_PLATES,
            LIGHT_WEIGHTED_PRESSURE_PLATE, HEAVY_WEIGHTED_PRESSURE_PLATE);
    public static final Category<ExItem> SIGNS = new Category<>("signs", STANDING_SIGNS, WALL_SIGNS);
    public static final Category<ExItem> TRAPDOORS = new Category<>("trapdoors", WOODEN_TRAPDOORS, IRON_TRAPDOOR);
    public static final Category<ExItem> UNDERWATER_BONEMEALS = new Category<>("underwater_bonemeals", CORALS, WALL_CORALS);
    public static final Category<ExItem> UNSTABLE_BOTTOM_CENTER = new Category<>("unstable_bottom_center", FENCE_GATES);
    public static final Category<ExItem> WALL_POST_OVERRIDE = new Category<>("wall_post_override", TORCH, SOUL_TORCH, REDSTONE_TORCH, TRIPWIRE, SIGNS, BANNERS,
            PRESSURE_PLATES);

    // Caliburn
    public static final Category<ExItem> CHESTS = new Category<>("chests", CHEST, TRAPPED_CHEST, ENDER_CHEST, SHULKER_BOXES);

    private String id;
    private Set<T> elements = new HashSet<>();

    public Category(String id) {
        this.id = id;
    }

    public Category(CaliburnAPI api, String id, List<String> elements) {
        this(id);
        elements.forEach(e -> this.elements.add((T) api.getExObject(e)));
    }

    private Category(String id, Categorizable... elements) {
        this.id = id;
        for (Categorizable element : elements) {
            if (element instanceof Category) {
                this.elements.addAll(((Category) element).elements);
            } else {
                this.elements.add((T) element);
            }
        }
    }

    @Override
    public String getId() {
        return id;
    }

    /**
     * Returns the objects that belong to this category.
     *
     * @return the objects that belong to this category
     */
    public Set<T> getElements() {
        return elements;
    }

    /**
     * Returns if this category contains the given value.
     *
     * @param t an object of the category type
     * @return if this category contains the given value
     */
    public boolean contains(T t) {
        if (t == null) {
            return false;
        }
        return elements.contains(t);
    }

    /**
     * Returns if this category ontains the {@link VanillaItem} that wraps the given material.
     *
     * @param material the material
     * @return if this category contains an item that wraps the material
     */
    public boolean containsMaterial(Material material) {
        if (material == null) {
            return false;
        }
        try {
            return contains((T) VanillaItem.get(material));
        } catch (ClassCastException exception) {
            return false;
        }
    }

    /**
     * Returns if this category contains a {@link VanillaItem} that wraps the material of this block.
     *
     * @param block a block
     * @return if this category contains an {@link VanillaItem} that wraps the material of this block
     */
    public boolean containsBlock(Block block) {
        if (block == null) {
            return false;
        }
        return containsMaterial(block.getType());
    }

    /**
     * Returns if this category contains the {@link ExItem} of the given ItemStack.
     *
     * @param item an item stack
     * @return if this category contains the {@link ExItem} of the given ItemStack
     */
    public boolean containsItem(ItemStack item) {
        if (item == null) {
            return false;
        }
        try {
            return contains((T) api.getExItem(item));
        } catch (ClassCastException exception) {
            return false;
        }
    }

}
