package com.github.skyhawkb.prismatic.items.itemclasses.armor;

import com.github.skyhawkb.prismatic.Prismatic;
import com.github.skyhawkb.prismatic.items.ItemArmorBase;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ArmorPureHelmet extends ItemArmorBase {
    public ArmorPureHelmet() {
        super(Prismatic.pureArmorMaterial, EntityEquipmentSlot.HEAD, "pure_helmet");
    }
}
