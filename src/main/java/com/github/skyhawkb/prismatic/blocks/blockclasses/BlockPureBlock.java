package com.github.skyhawkb.prismatic.blocks.blockclasses;

import com.github.skyhawkb.prismatic.blocks.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPureBlock extends BlockBase {
    public BlockPureBlock() {
        super(Material.IRON, "pure_block", 2, 6f, true);
        super.setLightLevel(3f);
        super.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }
}
