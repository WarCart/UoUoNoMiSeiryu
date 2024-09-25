package net.warcar.uo_uo_no_mi.entities.projectiles;

import net.minecraft.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.warcar.uo_uo_no_mi.models.BoroBreathModel;
import xyz.pixelatedw.mineminenomi.renderers.abilities.StretchingProjectileRenderer;
import xyz.pixelatedw.mineminenomi.wypi.WyRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UoProjectiles {
    public static final RegistryObject<EntityType<BoroBreathProjectile>> BORO_BREATH = WyRegistry.registerEntityType("Boro Breath", () -> {
        return WyRegistry.createEntityType(BoroBreathProjectile::new).sized(5F, 5F).build("mineminenomi:boro_breath");
    });

    public static final RegistryObject<EntityType<BoroBreathProjectile>> BORO_BREATH_LARGE = WyRegistry.registerEntityType("Boro Breath Large", () -> {
        return WyRegistry.createEntityType(BoroBreathProjectile::new).sized(15F, 15F).build("mineminenomi:boro_breath");
    });

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void registerEntityRenderers(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(BORO_BREATH.get(), (new StretchingProjectileRenderer.Factory(new BoroBreathModel()).setStretchScale(3, 3).setColor(255, 51, 0, 51).setGlowing()));
        RenderingRegistry.registerEntityRenderingHandler(BORO_BREATH_LARGE.get(), (new StretchingProjectileRenderer.Factory(new BoroBreathModel()).setStretchScale(10, 10).setColor(255, 51, 0, 51).setGlowing()));
    }
}
