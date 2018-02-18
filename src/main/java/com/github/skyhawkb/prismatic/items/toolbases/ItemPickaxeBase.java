package com.github.skyhawkb.prismatic.items.toolbases;

import com.github.skyhawkb.prismatic.Prismatic;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemPickaxeBase extends ItemPickaxe {
    private String name;

    public ItemPickaxeBase(ToolMaterial material, String name) {
        super(material);
        super.setCreativeTab(CreativeTabs.TOOLS);
        setRegistryName(name);
        setUnlocalizedName(Prismatic.MODID + "." + name);
        this.name = name;
    }

    public void registerItemModel() {
        Prismatic.proxy.registerItemRenderer(this, 0, name);
    }
}
