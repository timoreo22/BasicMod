package fr.timoreo.test.handler;

import fr.timoreo.test.init.ModBlocks;
import fr.timoreo.test.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {

	public static void registerCraftingRecipes() {
		
	}
	
	public static void registerSmeltingRecipes() {
		GameRegistry.addSmelting(ModBlocks.copper_ore, new ItemStack(ModItems.ingotCopper), 0.7f);
	}
}
