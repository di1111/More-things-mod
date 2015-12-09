package com.dylan.item;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemManager {
	
	public static GoldStick goldStick;
	public static IronStick ironStick;
	public static DiamondStick diamondStick;

	public static AwesomeIronPickaxe awesomeIronPickaxe;
	public static SuperIronPickaxe superIronPickaxe;
	public static OkIronPickaxe okIronPickaxe;
	
	public static void mainRegistry() {
        initializeItem();
        registerItem();
    }
 
    public static void initializeItem() {
    	
    	goldStick = new GoldStick();
    	ironStick = new IronStick();
    	diamondStick = new DiamondStick();
    	
    	superIronPickaxe = new SuperIronPickaxe(ToolMaterial.IRON);
    	okIronPickaxe = new OkIronPickaxe(ToolMaterial.IRON);
        awesomeIronPickaxe = new AwesomeIronPickaxe(ToolMaterial.EMERALD);
 
    }
 
    public static void registerItem() {
    	
    	GameRegistry.registerItem(goldStick, GoldStick.name);
    	GameRegistry.registerItem(ironStick, IronStick.name);
    	GameRegistry.registerItem(diamondStick, DiamondStick.name);
    	
    	GameRegistry.registerItem(superIronPickaxe, SuperIronPickaxe.name);
    	GameRegistry.registerItem(okIronPickaxe, OkIronPickaxe.name);
        GameRegistry.registerItem(awesomeIronPickaxe, AwesomeIronPickaxe.name);
 
    }

}
