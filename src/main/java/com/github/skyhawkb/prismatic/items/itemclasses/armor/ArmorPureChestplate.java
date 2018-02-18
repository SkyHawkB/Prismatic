package com.github.skyhawkb.prismatic.items.itemclasses.armor;

import com.github.skyhawkb.prismatic.Prismatic;
import com.github.skyhawkb.prismatic.items.ItemArmorBase;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ArmorPureChestplate extends ItemArmorBase {
    public ArmorPureChestplate() {
        super(Prismatic.pureArmorMaterial, EntityEquipmentSlot.CHEST, "pure_chestplate");
    }
}
