package com.github.skyhawkb.prismatic;

import com.github.skyhawkb.prismatic.blocks.ModBlocks;
import com.github.skyhawkb.prismatic.items.ModItems;
import com.github.skyhawkb.prismatic.world.ModWorldGen;
import net.minecraft.block.Block;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import portablejim.veinminer.api.IMCMessage;

@Mod(modid = Prismatic.MODID, name = Prismatic.NAME, version = Prismatic.VERSION)
public class Prismatic {
    public static final String MODID = "prismatic";
    public static final String NAME = "Prismatic";
    public static final String VERSION = "1.0.4";

    @Mod.Instance(MODID)
    public static Prismatic instance;

    @SidedProxy(serverSide = "com.github.skyhawkb.prismatic.CommonProxy", clientSide = "com.github.skyhawkb.prismatic.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        initVeinMiner();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {}

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {
        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            ModBlocks.register(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ModBlocks.registerItems(event.getRegistry());
            ModItems.register(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event) {
            ModItems.registerModels();
            ModBlocks.registerModels();
        }
    }

    public static final ItemArmor.ArmorMaterial pureArmorMaterial = EnumHelper.addArmorMaterial("PURE", MODID + ":pure", 15, new int[]{4, 10, 7, 4}, 17, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 3.0F);
    public static final Item.ToolMaterial pureToolMaterial = EnumHelper.addToolMaterial("PURE", 3, 1337, 9f,9F, 14);

    private void initVeinMiner() {
        if(Loader.isModLoaded("veinminer")) {
            IMCMessage.addBlock("pickaxe", "prismatic:rainbow_ore");

            IMCMessage.addTool("axe", "prismatic:pure_axe");
            IMCMessage.addTool("hoe", "prismatic:pure_hoe");
            IMCMessage.addTool("pickaxe", "prismatic:pure_pickaxe");
            IMCMessage.addTool("shovel", "prismatic:pure_shovel");

            System.out.println("VeinMiner mappings added!");
        }
    }
}
