package com.pseudo_sudo.openstorage.block;

import com.pseudo_sudo.openstorage.util.Name;

public class BlockNAS extends BlockOpenStorage {
    public BlockNAS() {
        super();

        this.setBlockName(Name.Blocks.NAS.getQualifiedBlockName());
    }
}
