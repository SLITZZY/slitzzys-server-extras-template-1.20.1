package net.slitzzy.slitzzysserverextras;

import net.fabricmc.api.ModInitializer;

import net.slitzzy.slitzzysserverextras.item.ModitemGroups;
import net.slitzzy.slitzzysserverextras.item.Moditems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlitzzysServerExtras implements ModInitializer {

	public static final String MOD_ID = "slitzzys-server-extras";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModitemGroups.registerItemGroups();
		Moditems.registerModItems();

		LOGGER.info("Slitzzy's Server Extras Is Initialized");
	}
}