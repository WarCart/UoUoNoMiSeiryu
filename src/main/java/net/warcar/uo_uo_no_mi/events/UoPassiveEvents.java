package net.warcar.uo_uo_no_mi.events;


import net.minecraft.entity.LivingEntity;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.warcar.uo_uo_no_mi.UoUoMod;
import net.warcar.uo_uo_no_mi.abilities.BoroBreathAbility;
import xyz.pixelatedw.mineminenomi.api.events.WyLivingAttackEvent;
import xyz.pixelatedw.mineminenomi.data.entity.ability.AbilityDataCapability;
import xyz.pixelatedw.mineminenomi.data.entity.ability.IAbilityData;

@Mod.EventBusSubscriber(modid = UoUoMod.MOD_ID)
public class UoPassiveEvents {
    @SubscribeEvent
    public static void onDamage(WyLivingAttackEvent event) {
        LivingEntity target = event.getEntityLiving();
        IAbilityData abilityData = AbilityDataCapability.get(target);
        BoroBreathAbility ability = abilityData.getEquippedAbility(BoroBreathAbility.INSTANCE);
        if (ability != null && ability.isCharging() && event.getAmount() > 80) {
            ability.stopCharging(target);
        }
    }
}
