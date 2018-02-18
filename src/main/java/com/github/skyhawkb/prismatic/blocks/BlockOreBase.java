package com.github.skyhawkb.prismatic.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockOreBase extends BlockBase {
    public BlockOreBase(String name) {
        super(Material.ROCK, name, 1, 3f, true);
        setResistance(5f);
    }
}