package com.github.skyhawkb.prismatic.blocks.blockclasses;

import com.github.skyhawkb.prismatic.blocks.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockRainbowBlock extends BlockBase {
    public BlockRainbowBlock() {
        super(Material.IRON, "rainbow_block", 2, 6f, true);
        super.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }
}
