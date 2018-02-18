package com.github.skyhawkb.prismatic.items;

import com.github.skyhawkb.prismatic.Prismatic;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class ItemArmorBase extends ItemArmor {
    private String name;

    public ItemArmorBase(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
        super(material, 0, slot);
        super.setCreativeTab(CreativeTabs.COMBAT);
        setRegistryName(name);
        setUnlocalizedName(Prismatic.MODID + "." + name);
        this.name = name;
    }

    public void registerItemModel() {
        Prismatic.proxy.registerItemRenderer(this, 0, name);
    }
}
