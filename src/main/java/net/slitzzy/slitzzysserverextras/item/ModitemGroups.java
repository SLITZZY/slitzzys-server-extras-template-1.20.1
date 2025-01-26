package net.slitzzy.slitzzysserverextras.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.slitzzy.slitzzysserverextras.SlitzzysServerExtras;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModitemGroups {
    public static final ItemGroup SSE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SlitzzysServerExtras.MOD_ID, "ssetabicon"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ssetabicon"))
                    .icon(() -> new ItemStack(Moditems.SSE_TAB_ICON)).entries((displayContext, entries) -> {


                        entries.add(Moditems.SSE_TAB_ICON);
                        entries.add(Items.DIAMOND);


                    }).build());


    public static void registerItemGroups() {
        SlitzzysServerExtras.LOGGER.info("Registering Item Groups for " + SlitzzysServerExtras.MOD_ID);
    }
}