
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package mods.coder2195.notjavascript.init;

import net.minecraft.client.gui.screens.MenuScreens;

import mods.coder2195.notjavascript.client.gui.EnrichingGUIScreen;

public class NotJavascriptModScreens {
	public static void load() {
		MenuScreens.register(NotJavascriptModMenus.ENRICHING_GUI, EnrichingGUIScreen::new);
	}
}
