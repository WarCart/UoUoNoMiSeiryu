package net.warcar.uo_uo_no_mi.events;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.warcar.uo_uo_no_mi.UoUoMod;
import net.warcar.uo_uo_no_mi.init.UoAbilityComponents;
import xyz.pixelatedw.mineminenomi.api.abilities.IAbility;
import xyz.pixelatedw.mineminenomi.data.entity.ability.AbilityDataCapability;
import xyz.pixelatedw.mineminenomi.data.entity.ability.IAbilityData;

@Mod.EventBusSubscriber(modid = UoUoMod.MOD_ID)
public class LivingDefaultMultisizeEvent {
    @SubscribeEvent
    public static void onEvent(LivingMultisizeEvent event) {
        IAbilityData data = AbilityDataCapability.get(event.getEntityLiving());
        for (IAbility ability : data.getEquippedAbilities(ability -> ability.hasComponent(UoAbilityComponents.MULTI_BOX))) {
            ability.getComponent(UoAbilityComponents.MULTI_BOX).ifPresent(component -> {
                if (!component.isDisabled()) {
                    event.addParts(component.getEntities());
                }
            });
        }
    }
}
