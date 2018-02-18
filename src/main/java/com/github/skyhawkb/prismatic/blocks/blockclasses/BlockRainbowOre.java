package com.github.skyhawkb.prismatic.blocks.blockclasses;

import com.github.skyhawkb.prismatic.blocks.BlockOreBase;
import com.github.skyhawkb.prismatic.items.ModItems;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class BlockRainbowOre extends BlockOreBase {
    public BlockRainbowOre() {
        super("rainbow_ore");
        super.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.fullBlock = true;
    }

    @Override
    public Item getItemDropped(IBlockState state, java.util.Random rand, int fortune) {
        return ModItems.RAINBOW_DUST;
    }

    @Override
    public int quantityDropped(java.util.Random random) {
        int num = random.nextInt((4 - 2) + 1) + 2;

        return num;
    }

    @Override
    public void dropXpOnBlockBreak(World worldIn, BlockPos pos, int amount) {
        if (!worldIn.isRemote && worldIn.getGameRules().getBoolean("doTileDrops")) {
            Random rand = new Random();
            amount = rand.nextInt((35 - 25) + 1) + 25;

            while (amount > 0) {
                int i = EntityXPOrb.getXPSplit(amount);
                amount -= i;
                worldIn.spawnEntity(new EntityXPOrb(worldIn, (double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, i));
            }
        }
    }
}
