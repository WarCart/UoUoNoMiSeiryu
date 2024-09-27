package net.warcar.uo_uo_no_mi.abilities;

import xyz.pixelatedw.mineminenomi.api.abilities.Ability;
import xyz.pixelatedw.mineminenomi.api.abilities.AbilityCategory;
import xyz.pixelatedw.mineminenomi.api.abilities.AbilityCore;

public class TatsumakiAbility extends Ability {
    public static final AbilityCore<TatsumakiAbility> INSTANCE = new AbilityCore.Builder<>("Tatsumaki", AbilityCategory.DEVIL_FRUITS, TatsumakiAbility::new).build();
    public TatsumakiAbility(AbilityCore<TatsumakiAbility> core) {
        super(core);
    }
}
