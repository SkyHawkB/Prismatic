package com.github.skyhawkb.prismatic.blocks.blockclasses;

import com.github.skyhawkb.prismatic.blocks.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMysticalBlock extends BlockBase {
    public BlockMysticalBlock() {
        super(Material.IRON, "mystical_block", 2, 15F, true);
        super.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }
}
