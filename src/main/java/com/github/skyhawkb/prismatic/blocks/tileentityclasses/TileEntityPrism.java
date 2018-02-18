package com.github.skyhawkb.prismatic.blocks.tileentityclasses;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class TileEntityPrism extends TileEntity implements ITickable {
    private int count = 0;

    public void update() {
        count++;
        if(count == 200) {
            System.out.println("It's been 10 seconds I think.");
        }
    }
}
