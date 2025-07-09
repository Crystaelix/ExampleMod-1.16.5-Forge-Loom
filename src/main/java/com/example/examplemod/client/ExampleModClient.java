package com.example.examplemod.client;

import com.example.examplemod.ExampleMod;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class ExampleModClient {

	public ExampleModClient() {
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void clientSetup(FMLClientSetupEvent event) {
		ExampleMod.LOGGER.info("Hello, from example mod client setup");
	}
}
