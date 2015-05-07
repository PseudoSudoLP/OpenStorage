package com.pseudo_sudo.openstorage.init;

import com.pseudo_sudo.openstorage.block.BlockNAS;
import com.pseudo_sudo.openstorage.util.Name;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks {
    private static final Block blockNAS = new BlockNAS();

    public static void init() {
        GameRegistry.registerBlock(blockNAS, Name.Blocks.NAS.getBlockName());
    }
}
