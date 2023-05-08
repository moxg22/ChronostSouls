package net.moxg.souls.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.moxg.souls.Souls;

public class ModItems {

    public static final Item SOUL_EXTRACTOR = registerItem("soul_extractor",
            new Item(new FabricItemSettings().group(ModItemGroup.CHRONOST_SOULS)));
    public static final Item CAPTURED_SOUL = registerItem("captured_soul",
            new Item(new FabricItemSettings().group(ModItemGroup.CHRONOST_SOULS)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Souls.MOD_ID, name),item);
    }

    public static void registerModItems() {
        Souls.LOGGER.debug("Registering Mod Items for " + Souls.MOD_ID);
    }
}
