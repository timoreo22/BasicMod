package fr.timoreo.test.init;

import fr.timoreo.test.Reference;
import fr.timoreo.test.blocks.BlockCopperOre;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block copper_ore;

	public static void init(){
		copper_ore = new BlockCopperOre();
	}
	
	public static void register(){
	registerBlock(copper_ore);	
	}
    
	public static void registerBlock(Block block){
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		//item.setUnlocalizedName(block.getUnlocalizedName());
	    GameRegistry.register(item);
	}
	
	
    public static void registerRenders(){
    	registerRender(copper_ore);
    }

    public static void registerRender(Block block) {
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, block.getUnlocalizedName().substring(5)),"inventory"));
    	
    }
	
}
