package net.floatingheaven.greeningots;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GREEN_INGOT = registerItem("green_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_GREEN = registerItem("raw_green", new Item(new FabricItemSettings()));

    private static void addItemsToInfredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(GREEN_INGOT);
        entries.add(RAW_GREEN);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(GreenIngots.MOD_ID, name),item);


    }

    public static void registerModItems(){
        GreenIngots.LOGGER.info("Registring Mod Items for "+ GreenIngots.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToInfredientTabItemGroup);

    }
}
