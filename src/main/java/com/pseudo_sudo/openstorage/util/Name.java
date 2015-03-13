package com.pseudo_sudo.openstorage.util;

import com.pseudo_sudo.openstorage.OpenStorage;

public class Name {
    public static enum Blocks {
        NAS("nas");

        private String blockName;

        Blocks(String blockName) {
            this.blockName = blockName;
        }

        public String getBlockName() {
            return this.blockName;
        }
    }
}
