package com.github.skyhawkb.prismatic.blocks;

import com.github.skyhawkb.prismatic.blocks.blockclasses.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
    public static final BlockRainbowBlock RAINBOW_BLOCK = new BlockRainbowBlock();
    public static final BlockRainbowOre RAINBOW_ORE = new BlockRainbowOre();
    public static final BlockPureBlock PURE_BLOCK = new BlockPureBlock();
    public static final BlockMysticalBlock MYSTICAL_BLOCK = new BlockMysticalBlock();
    public static final BlockPrism PRISM = new BlockPrism();

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                RAINBOW_BLOCK,
                RAINBOW_ORE,
                PURE_BLOCK,
                MYSTICAL_BLOCK,
                PRISM
        );

        GameRegistry.registerTileEntity(PRISM.getTileEntityClass(), PRISM.getRegistryName().toString());
    }

    public static void registerItems(IForgeRegistry<Item> registry) {
        registry.registerAll(
                RAINBOW_BLOCK.createItemBlock(),
                RAINBOW_ORE.createItemBlock(),
                PURE_BLOCK.createItemBlock(),
                MYSTICAL_BLOCK.createItemBlock(),
                PRISM.createItemBlock()
        );
    }

    public static void registerModels() {
        RAINBOW_BLOCK.registerItemModel(Item.getItemFromBlock(RAINBOW_BLOCK));
        RAINBOW_ORE.registerItemModel(Item.getItemFromBlock(RAINBOW_ORE));
        PURE_BLOCK.registerItemModel(Item.getItemFromBlock(PURE_BLOCK));
        MYSTICAL_BLOCK.registerItemModel(Item.getItemFromBlock(MYSTICAL_BLOCK));
        PRISM.registerItemModel(Item.getItemFromBlock(PRISM));
    }

}