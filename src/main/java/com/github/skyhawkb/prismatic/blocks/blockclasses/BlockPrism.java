package com.github.skyhawkb.prismatic.blocks.blockclasses;

import com.github.skyhawkb.prismatic.blocks.BlockTEBase;
import com.github.skyhawkb.prismatic.blocks.tileentityclasses.TileEntityPrism;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockPrism extends BlockTEBase implements ITickable {
    public BlockPrism() {
        super(Material.CLAY, "prism", 2, 4f, false);
    }

    public void update() {
        
    }

    @Override
    public Class<TileEntityPrism> getTileEntityClass() {
        return TileEntityPrism.class;
    }

    @Nullable
    @Override
    public TileEntityPrism createTileEntity(World world, IBlockState state) {
        return new TileEntityPrism();
    }

    @Override
    public boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
}
