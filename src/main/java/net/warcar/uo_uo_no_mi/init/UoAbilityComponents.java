package net.warcar.uo_uo_no_mi.init;

import net.minecraft.util.ResourceLocation;
import net.warcar.uo_uo_no_mi.UoUoMod;
import net.warcar.uo_uo_no_mi.abilities.components.MultiBoxComponent;
import xyz.pixelatedw.mineminenomi.api.abilities.components.AbilityComponentKey;

public class UoAbilityComponents {
    public static final AbilityComponentKey<MultiBoxComponent> MULTI_BOX = AbilityComponentKey.key(new ResourceLocation(UoUoMod.MOD_ID, "multi_box"));
}
