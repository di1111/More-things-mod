package com.dylan.block;

import com.dylan.morethingsmod.Morethingsmod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Cat extends Block{

    public static final String name = "Cat";

    public Cat() {
        super(Material.craftedSnow);
        this.setUnlocalizedName(Morethingsmod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.tabMisc);

    }

}
