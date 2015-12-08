package com.dylan.item;

import com.dylan.morethingsmod.Morethingsmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class SuperIronPickaxe extends ItemPickaxe{
	public static final String name = "SuperIronPickaxe";
	
	protected SuperIronPickaxe(ToolMaterial material) {
		super(material);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName(Morethingsmod.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.tabTools);
		
	}

	

}
