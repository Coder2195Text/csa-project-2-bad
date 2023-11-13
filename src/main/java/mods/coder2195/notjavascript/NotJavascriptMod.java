/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package mods.coder2195.notjavascript;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.api.ModInitializer;

import mods.coder2195.notjavascript.init.NotJavascriptModProcedures;
import mods.coder2195.notjavascript.init.NotJavascriptModMenus;
import mods.coder2195.notjavascript.init.NotJavascriptModItems;
import mods.coder2195.notjavascript.init.NotJavascriptModFeatures;
import mods.coder2195.notjavascript.init.NotJavascriptModBlocks;

public class NotJavascriptMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "not_javascript";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing NotJavascriptMod");

		NotJavascriptModBlocks.load();
		NotJavascriptModItems.load();

		NotJavascriptModFeatures.load();

		NotJavascriptModProcedures.load();

		NotJavascriptModMenus.load();

	}
}
