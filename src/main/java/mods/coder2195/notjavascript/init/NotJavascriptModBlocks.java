
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package mods.coder2195.notjavascript.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import mods.coder2195.notjavascript.block.UraniumOreBlock;
import mods.coder2195.notjavascript.block.EnrichingTableBlock;
import mods.coder2195.notjavascript.NotJavascriptMod;

public class NotJavascriptModBlocks {
	public static Block URANIUM_ORE;
	public static Block ENRICHING_TABLE;

	public static void load() {
		URANIUM_ORE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(NotJavascriptMod.MODID, "uranium_ore"), new UraniumOreBlock());
		ENRICHING_TABLE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(NotJavascriptMod.MODID, "enriching_table"), new EnrichingTableBlock());
	}

	public static void clientLoad() {
		UraniumOreBlock.clientInit();
		EnrichingTableBlock.clientInit();
	}
}
