package fr.timoreo.test.handler;

import fr.timoreo.test.init.ModBlocks;
import fr.timoreo.test.init.ModItems;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionnaryHandler {

	public static void registerOreDictionnary() {
		OreDictionary.registerOre("oreCopper", ModBlocks.copper_ore);
		OreDictionary.registerOre("ingotCopper", ModItems.ingotCopper);
	}
	
}
