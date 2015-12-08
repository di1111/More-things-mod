package com.dylan.item;

import com.dylan.morethingsmod.Morethingsmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GoldStick extends Item {
	
	public static final String name = "GoldStick";
	
	public GoldStick() {
		super();
		
		this.setUnlocalizedName(Morethingsmod.MODID + "_" + this.name);
		
		this.setCreativeTab(CreativeTabs.tabMisc);
		
	}

}
