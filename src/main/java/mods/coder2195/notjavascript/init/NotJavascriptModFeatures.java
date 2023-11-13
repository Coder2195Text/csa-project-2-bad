
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package mods.coder2195.notjavascript.init;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import mods.coder2195.notjavascript.world.features.ores.UraniumOreFeature;
import mods.coder2195.notjavascript.NotJavascriptMod;

import java.util.function.Predicate;

public class NotJavascriptModFeatures {
	public static void load() {
		register("uranium_ore", new UraniumOreFeature(), UraniumOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
	}

	private static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(BuiltInRegistries.FEATURE, new ResourceLocation(NotJavascriptMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep, ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(NotJavascriptMod.MODID, registryName)));
	}
}
