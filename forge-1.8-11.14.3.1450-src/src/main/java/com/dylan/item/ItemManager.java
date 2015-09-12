package com.dylan.item;

public class ItemManager {
	
	public static GoldStick goldStick;
	public static IronStick ironStick;
	public static DiamondStick diamondStick;
	
	public static void mainRegistry() {
        initializeItem();
        registerItem();
    }
 
    public static void initializeItem() {
    	
    	goldStick = new GoldStick();
    	ironStick = new IronStick();
    	diamondStick = new DiamondStick();
 
    }
 
    public static void registerItem() {
 
    }

}
