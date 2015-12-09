package com.dylan.morethingsmod;

import com.dylan.block.BlockManager;
import com.dylan.item.ItemManager;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Morethingsmod.MODID, version = Morethingsmod.VERSION)
public class Morethingsmod
{
    public static final String MODID = "morethingsmod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
    	
    	ItemManager.mainRegistry();
        BlockManager.mainRegistry();

    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("MODID="+ Morethingsmod.MODID);

        //Creafing 2x2
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.goldStick), " x", " x", 'x', Blocks.gold_block);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.ironStick), " x", " x", 'x', Blocks.iron_bars);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.diamondStick), " x", " x", 'x', Blocks.diamond_block );

        //Crafting 3x3
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.okIronPickaxe, 1), "xxx", " y ", " y ", 'x', Blocks.iron_bars, 'y', ItemManager.goldStick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.superIronPickaxe, 1), "xxx", " y ", " y ", 'x', Blocks.iron_bars, 'y', ItemManager.ironStick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.awesomeIronPickaxe, 1), "xxx", " y ", " y ", 'x', Blocks.iron_bars, 'y', ItemManager.diamondStick);


    }
}
