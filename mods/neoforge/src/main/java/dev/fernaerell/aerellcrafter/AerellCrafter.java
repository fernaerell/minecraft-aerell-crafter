package dev.fernaerell.aerellcrafter;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.fml.common.Mod;

@Mod(AerellCrafter.MODID)
public class AerellCrafter {
    public static final String MODID = "aerellcrafter";
    public static final Logger LOGGER = LogUtils.getLogger();

    public AerellCrafter() {
        LOGGER.info("Thanks for using Aerell Crafter...");
        LOGGER.info("Create by Fern Aerell.");
    }
}
