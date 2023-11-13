/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package mods.coder2195.notjavascript.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import mods.coder2195.notjavascript.item.RawUraniumItem;
import mods.coder2195.notjavascript.NotJavascriptMod;

public class NotJavascriptModItems {
	public static Item RAW_URANIUM;
	public static Item URANIUM_ORE;
	public static Item ENRICHMENT_TABLE;

	public static void load() {
		RAW_URANIUM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(NotJavascriptMod.MODID, "raw_uranium"), new RawUraniumItem());
		URANIUM_ORE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(NotJavascriptMod.MODID, "uranium_ore"), new BlockItem(NotJavascriptModBlocks.URANIUM_ORE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(content -> content.accept(URANIUM_ORE));
		ENRICHMENT_TABLE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(NotJavascriptMod.MODID, "enrichment_table"), new BlockItem(NotJavascriptModBlocks.ENRICHMENT_TABLE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.accept(ENRICHMENT_TABLE));
	}

	public static void clientLoad() {
	}
}
