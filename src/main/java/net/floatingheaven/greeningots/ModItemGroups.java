package net.floatingheaven.greeningots;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup GREEN_INGOTS_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(GreenIngots.MOD_ID,
            "greeningots"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.greeningots"))
                    .icon(() -> new ItemStack(ModItems.GREEN_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_GREEN);
                        entries.add(ModItems.GREEN_INGOT);

                    }).build());





    public static void registerItemGroups() {
        GreenIngots.LOGGER.info("Registring "+GreenIngots.MOD_ID+" item groups. ");


    }
}
