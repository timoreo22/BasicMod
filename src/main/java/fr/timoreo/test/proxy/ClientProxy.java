package fr.timoreo.test.proxy;

import fr.timoreo.test.init.ModBlocks;
import fr.timoreo.test.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
	}

	@Override
	public void registerRenders() {
		ModItems.registerRender();
		ModBlocks.registerRenders();
	}
	
	
}
