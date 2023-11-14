
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package mods.coder2195.notjavascript.init;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;

import mods.coder2195.notjavascript.world.inventory.EnrichingGUIMenu;
import mods.coder2195.notjavascript.NotJavascriptMod;

public class NotJavascriptModMenus {
	public static MenuType<EnrichingGUIMenu> ENRICHING_GUI;

	public static void load() {
		ENRICHING_GUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(NotJavascriptMod.MODID, "enriching_gui"), new ExtendedScreenHandlerType<>(EnrichingGUIMenu::new));
		EnrichingGUIMenu.screenInit();
	}
}
