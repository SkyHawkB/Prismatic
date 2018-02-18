package com.github.skyhawkb.prismatic.items.toolbases;

import com.github.skyhawkb.prismatic.Prismatic;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemAxeBase extends ItemAxe {
    private String name;

    public ItemAxeBase(ToolMaterial material, String name) {
        super(material, 8F, -1.3F);
        super.setCreativeTab(CreativeTabs.TOOLS);
        setRegistryName(name);
        setUnlocalizedName(Prismatic.MODID + "." + name);
        this.name = name;
    }

    public void registerItemModel() {
        Prismatic.proxy.registerItemRenderer(this, 0, name);
    }
}
