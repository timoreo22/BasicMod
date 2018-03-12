package fr.timoreo.test.blocks;

import java.util.Random;

import fr.timoreo.test.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class BlockCopperOre extends Block {

	public BlockCopperOre() {
		super(Material.ROCK);
		this.setUnlocalizedName("copper_ore");
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, "copper_ore"));
		this.setHardness(2.2f);
		this.setResistance(2.0f);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		
		return Item.getItemFromBlock(this);
	}

	@Override
	public CreativeTabs getCreativeTabToDisplayOn() {
		
		return CreativeTabs.DECORATIONS;
	}
}
