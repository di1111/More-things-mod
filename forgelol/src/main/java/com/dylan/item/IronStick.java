package com.dylan.item;

import com.dylan.morethingsmod.Morethingsmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IronStick extends Item {
	
	public static final String name = "IronStick";
	
	public IronStick() {
		super();
		
		
		this.setUnlocalizedName(Morethingsmod.MODID + "_" + this.name);
		
		this.setCreativeTab(CreativeTabs.tabMisc);
	}

}
