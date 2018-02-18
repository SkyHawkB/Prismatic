package com.github.skyhawkb.prismatic.items.itemclasses.armor;

import com.github.skyhawkb.prismatic.Prismatic;
import com.github.skyhawkb.prismatic.items.ItemArmorBase;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ArmorPureLeggings extends ItemArmorBase {
    public ArmorPureLeggings() {
        super(Prismatic.pureArmorMaterial, EntityEquipmentSlot.LEGS, "pure_leggings");
    }
}
