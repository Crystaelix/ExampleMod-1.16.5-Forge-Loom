package com.example.examplemod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.examplemod.client.ExampleModClient;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExampleMod.MOD_ID)
public class ExampleMod {

	public static final String MOD_ID = "examplemod";
	public static final Logger LOGGER = LogManager.getLogger();

	public ExampleMod() {
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
		DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> ExampleModClient::new);
	}

	@SubscribeEvent
	public void commonSetup(FMLCommonSetupEvent event) {
		LOGGER.info("Hello, from example mod common setup");
	}
}
