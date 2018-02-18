package com.github.skyhawkb.prismatic.items.itemclasses.armor;

import com.github.skyhawkb.prismatic.Prismatic;
import com.github.skyhawkb.prismatic.items.ItemArmorBase;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ArmorPureBoots extends ItemArmorBase {
    public ArmorPureBoots() {
        super(Prismatic.pureArmorMaterial, EntityEquipmentSlot.FEET, "pure_boots");
    }
}
