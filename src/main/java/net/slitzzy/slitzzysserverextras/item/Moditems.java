package net.slitzzy.slitzzysserverextras.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slitzzy.slitzzysserverextras.SlitzzysServerExtras;

public class Moditems {

    public static final Item SSE_TAB_ICON = registerItem("ssetabicon", new Item(new FabricItemSettings()));

    private static void addItemsToItemGroup(FabricItemGroupEntries entries) {
        entries.add(SSE_TAB_ICON);
    }

    private static  Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SlitzzysServerExtras.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SlitzzysServerExtras.LOGGER.info("Registering Modded Items for " + SlitzzysServerExtras.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(Moditems::addItemsToItemGroup);
    }
}
