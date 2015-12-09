package com.dylan.block;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by 22dhu on 12/9/15.
 */
public class BlockManager {

    public static Cat cat;

    public static void mainRegistry() {

        initializeBlock();
        registerBlock();

    }

    public static void initializeBlock() {

        cat = new Cat();

    }

    public static void registerBlock() {

        GameRegistry.registerBlock(cat, cat.name);

    }

}
