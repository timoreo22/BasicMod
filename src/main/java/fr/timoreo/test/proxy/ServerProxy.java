package fr.timoreo.test.proxy;

import fr.timoreo.test.worldgen.OreGen;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ServerProxy implements CommonProxy {

	@Override
	public void init() { 
		GameRegistry.registerWorldGenerator(new OreGen(), 0);
	}

	@Override
	public void registerRenders() {
		// TODO Auto-generated method stub
		
	}

	




}
