package net.warcar.uo_uo_no_mi.init;

import net.minecraftforge.fml.RegistryObject;
import net.warcar.uo_uo_no_mi.morphs.KaenDaikoMorphInfo;
import net.warcar.uo_uo_no_mi.morphs.SeiryuHeavyMorphInfo;
import net.warcar.uo_uo_no_mi.morphs.SeiryuFlyMorphInfo;
import xyz.pixelatedw.mineminenomi.api.morph.MorphInfo;
import xyz.pixelatedw.mineminenomi.wypi.WyRegistry;

public class UoMorphs {
    public static final RegistryObject<MorphInfo> SEIRYU_FLY = WyRegistry.registerMorph("seiryu_fly", SeiryuFlyMorphInfo::new);
    public static final RegistryObject<MorphInfo> SEIRYU_HEAVY = WyRegistry.registerMorph("seiryu_heavy", SeiryuHeavyMorphInfo::new);
    public static final RegistryObject<MorphInfo> KAEN_DAIKO = WyRegistry.registerMorph("kaen_daiko", KaenDaikoMorphInfo::new);
    public static void init() {
    }
}
