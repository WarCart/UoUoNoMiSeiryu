package net.warcar.uo_uo_no_mi.init;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.warcar.uo_uo_no_mi.UoUoMod;
import net.warcar.uo_uo_no_mi.abilities.*;
import xyz.pixelatedw.mineminenomi.api.ModRegistries;
import xyz.pixelatedw.mineminenomi.api.abilities.AbilityCore;
import xyz.pixelatedw.mineminenomi.api.abilities.IAbility;
import xyz.pixelatedw.mineminenomi.api.enums.FruitType;
import xyz.pixelatedw.mineminenomi.items.AkumaNoMiItem;
import xyz.pixelatedw.mineminenomi.wypi.WyHelper;
import xyz.pixelatedw.mineminenomi.wypi.WyRegistry;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

public class UoAbilities {
    public static final DeferredRegister<AbilityCore<?>> ABILITIES = DeferredRegister.create(ModRegistries.ABILITIES, UoUoMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UoUoMod.MOD_ID);
    public static final AkumaNoMiItem UO_UO_NO_MI_MODEL_SEIRYU = new AkumaNoMiItem("Uo Uo no Mi, Model: Seiryu", 3, FruitType.MYTHICAL_ZOAN,
            SeiryuFlyPointAbility.INSTANCE, BoroBreathAbility.INSTANCE, KaifuAbility.INSTANCE, SeiryuHeavyPointAbility.INSTANCE, KaenDaikoAbility.INSTANCE,
            ShoryuKaenHakkeAbility.INSTANCE, SeiryuFlightAbility.INSTANCE);
    public static void init() {
        registerFruit(UO_UO_NO_MI_MODEL_SEIRYU);
    }

    private static <T extends AkumaNoMiItem> void registerFruit(T fruit) {
        String resourceName = WyHelper.getResourceName(fruit.getDevilFruitName());
        WyRegistry.getLangMap().put("item.mineminenomi." + resourceName, fruit.getDevilFruitName());
        UoAbilities.registerItem(fruit.getDevilFruitName(), () -> fruit);
        if (fruit.getAbilities() != null && fruit.getAbilities().length > 0) {
            registerAbilities(fruit.getAbilities());
        }
    }

    private static void registerAbilities(AbilityCore[] abilities) {
        Arrays.stream(abilities).filter(Objects::nonNull).forEach(UoAbilities::registerAbility);
    }

    private static <T extends Item> void registerItem(String localizedName, Supplier<T> item) {
        String resourceName = WyHelper.getResourceName(localizedName);
        ITEMS.register(resourceName, item);
    }

    private static <T extends IAbility>  void registerAbility(AbilityCore<T> core) {
        String resourceName = WyHelper.getResourceName(core.getId());
        ResourceLocation key = new ResourceLocation(UoUoMod.MOD_ID, resourceName);
        RegistryObject<AbilityCore<?>> ret = RegistryObject.of(key, ModRegistries.ABILITIES);
        if (!ABILITIES.getEntries().contains(ret)) {
            ABILITIES.register(resourceName, () -> core);
            if (core.getIcon() == null) {
                core.setIcon(new ResourceLocation(key.getNamespace(), "textures/abilities/" + key.getPath() + ".png"));
            }
        }
    }
}
