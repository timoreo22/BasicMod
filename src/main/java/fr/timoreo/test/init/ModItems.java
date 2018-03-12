package fr.timoreo.test.init;

import fr.timoreo.test.Reference;
import fr.timoreo.test.item.ItemCopperIngot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static ItemCopperIngot ingotCopper;
	
	public static void init() {
		ingotCopper =  (ItemCopperIngot) registeritem(new ItemCopperIngot().setCreativeTab(CreativeTabs.MATERIALS));
	}

	public static void register() {
		
	}
	
	public static void registerRender() {
		registerItemRenderer(ingotCopper);
	}

	static Item registeritem(Item item) {
		GameRegistry.register(item);
		return item;
	}
	
	public static void registerItemRenderer(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation( Reference.MOD_ID,  item.getUnlocalizedName().substring(5)), "inventory"));
		
	}
}
