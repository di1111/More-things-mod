package com.dylan.item;

import com.dylan.morethingsmod.Morethingsmod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class AwesomeIronPickaxe extends ItemPickaxe{

    public static final String name = "AwesomeIronPickaxe";

    protected AwesomeIronPickaxe(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(Morethingsmod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.tabTools);

    }
}
