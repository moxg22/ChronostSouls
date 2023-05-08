package net.moxg.souls.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.moxg.souls.Souls;

public class ModItemGroup {
    public static final ItemGroup CHRONOST_SOULS = FabricItemGroupBuilder.build(
            new Identifier(Souls.MOD_ID, "chronost_souls"), () -> new ItemStack(ModItems.CAPTURED_SOUL));
}
