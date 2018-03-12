package fr.timoreo.test;

import fr.timoreo.test.handler.OreDictionnaryHandler;
import fr.timoreo.test.handler.RecipeHandler;
import fr.timoreo.test.init.ModBlocks;
import fr.timoreo.test.init.ModItems;
import fr.timoreo.test.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.NAME, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class TestMod {

	
	@Mod.Instance
	public static TestMod instance;
    
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) // execut� au d�marrage!
    {
    	proxy.init();
    	OreDictionnaryHandler.registerOreDictionnary();
        RecipeHandler.registerSmeltingRecipes();
        RecipeHandler.registerCraftingRecipes();
    	if(event.getSide().isClient()) { 
    		System.out.println("C�t� Client!");
    	}else {
    		System.out.println("C�t� Server!");
    	}
    }
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent e) { // execut� avant la m�thode au dessus!
    	ModItems.init();
    	ModBlocks.init();
    	ModItems.register();
    	ModBlocks.register();
    	proxy.registerRenders();
    	System.out.println("d�marage du mod!");
    }
}
