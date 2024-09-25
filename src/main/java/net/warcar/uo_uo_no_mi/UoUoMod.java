package net.warcar.uo_uo_no_mi;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.warcar.uo_uo_no_mi.init.UoAbilities;
import net.warcar.uo_uo_no_mi.init.UoMorphs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(UoUoMod.MOD_ID)
public class UoUoMod {
    public static final String MOD_ID = "uo_uo_no_mi";
    public static final Logger LOGGER = LogManager.getLogger();
    public UoUoMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        UoAbilities.init();
        UoMorphs.init();
        MinecraftForge.EVENT_BUS.register(this);
    }
}
