package com.github.skyhawkb.prismatic.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.github.skyhawkb.prismatic.Prismatic;

public class ItemBase extends Item {
    protected String name;

    public ItemBase(String name) {
        this.name = name;
        setUnlocalizedName(Prismatic.MODID + "." + name);
        setRegistryName(name);
    }

    public void registerItemModel() {
        Prismatic.proxy.registerItemRenderer(this, 0, name);
    }
}
