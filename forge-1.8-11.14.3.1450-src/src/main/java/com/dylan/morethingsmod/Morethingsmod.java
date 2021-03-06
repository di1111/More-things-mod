package com.dylan.morethingsmod;

import com.dylan.item.ItemManager;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Morethingsmod.MODID, version = Morethingsmod.VERSION)
public class Morethingsmod
{
    public static final String MODID = "morethingsmod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
    	
    	ItemManager.mainRegistry();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
        System.out.println("MODID="+ Morethingsmod.MODID);
    }
}
