package net.warcar.uo_uo_no_mi.init;

import net.warcar.uo_uo_no_mi.abilities.*;
import xyz.pixelatedw.mineminenomi.api.abilities.AbilityCore;
import xyz.pixelatedw.mineminenomi.api.enums.FruitType;
import xyz.pixelatedw.mineminenomi.items.AkumaNoMiItem;
import xyz.pixelatedw.mineminenomi.wypi.WyHelper;
import xyz.pixelatedw.mineminenomi.wypi.WyRegistry;

import java.util.Arrays;
import java.util.Objects;

public class UoAbilities {
    public static final AkumaNoMiItem UO_UO_NO_MI_MODEL_SEIRYU = registerFruit(new AkumaNoMiItem("Uo Uo no Mi, Model: Seiryu", 3, FruitType.MYTHICAL_ZOAN,
            SeiryuFlyPointAbility.INSTANCE, BoroBreathAbility.INSTANCE, KaifuAbility.INSTANCE, SeiryuHeavyPointAbility.INSTANCE, KaenDaikoAbility.INSTANCE,
            ShoryuKaenHakkeAbility.INSTANCE, SeiryuFlightAbility.INSTANCE));
    public static void init() {
    }

    private static <T extends AkumaNoMiItem> T registerFruit(T fruit) {
        String resourceName = WyHelper.getResourceName(fruit.getDevilFruitName());
        WyRegistry.getLangMap().put("item.mineminenomi." + resourceName, fruit.getDevilFruitName());
        WyRegistry.registerItem(fruit.getDevilFruitName(), () -> fruit);
        if (fruit.getAbilities() != null && fruit.getAbilities().length > 0) {
            registerAbilities(fruit.getAbilities());
        }

        return fruit;
    }

    private static void registerAbilities(AbilityCore[] abilities) {
        Arrays.stream(abilities).filter(Objects::nonNull).forEach(WyRegistry::registerAbility);
    }
}
