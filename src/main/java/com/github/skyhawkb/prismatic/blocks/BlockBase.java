package com.github.skyhawkb.prismatic.blocks;

import com.github.skyhawkb.prismatic.Prismatic;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockBase extends Block {
    protected String name;

    public BlockBase(Material material, String name, Integer harvestLevel, Float hardness, boolean fullBlock) {
        super(material);
        super.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        this.name = name;
        this.fullBlock = fullBlock;
        setHarvestLevel("Iron", harvestLevel);
        setHardness(hardness);

        setUnlocalizedName(Prismatic.MODID + "." + name);
        setRegistryName(name);
    }

    public void registerItemModel(Item itemBlock) {
        Prismatic.proxy.registerItemRenderer(itemBlock, 0, name);
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }

    /**
     * @return whether the block is a solid cube or not. Override for blocks that are not solid cubes.
     */
    @Override
    public boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos) {
        return true;
    }
}
