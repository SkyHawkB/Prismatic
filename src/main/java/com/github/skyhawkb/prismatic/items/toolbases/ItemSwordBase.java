package com.github.skyhawkb.prismatic.items.toolbases;

import com.github.skyhawkb.prismatic.Prismatic;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemSwordBase extends ItemSword {
    private String name;

    public ItemSwordBase(ToolMaterial material, String name) {
        super(material);
        super.setCreativeTab(CreativeTabs.COMBAT);
        setRegistryName(name);
        setUnlocalizedName(Prismatic.MODID + "." + name);
        this.name = name;
    }

    public void registerItemModel() {
        Prismatic.proxy.registerItemRenderer(this, 0, name);
    }
}
