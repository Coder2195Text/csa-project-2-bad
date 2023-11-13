
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package mods.coder2195.notjavascript.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

import mods.coder2195.notjavascript.block.entity.EnrichingTableBlockEntity;
import mods.coder2195.notjavascript.NotJavascriptMod;

public class NotJavascriptModBlockEntities {
	public static BlockEntityType<?> ENRICHING_TABLE;

	public static void load() {
		ENRICHING_TABLE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(NotJavascriptMod.MODID, "enriching_table"),
				FabricBlockEntityTypeBuilder.create(EnrichingTableBlockEntity::new, NotJavascriptModBlocks.ENRICHING_TABLE).build(null));
	}
}
