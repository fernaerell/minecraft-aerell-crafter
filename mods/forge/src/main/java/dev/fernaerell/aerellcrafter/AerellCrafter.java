package dev.fernaerell.aerellcrafter;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(AerellCrafter.MODID)
public class AerellCrafter {
    public static final String MODID = "aerellcrafter";
    private static final Logger LOGGER = LogUtils.getLogger();

    public AerellCrafter() {
        LOGGER.info("Thanks for using Aerell Crafter...");
        LOGGER.info("Create by Fern Aerell.");
    }
}
