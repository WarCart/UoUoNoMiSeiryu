package net.warcar.uo_uo_no_mi.models;

import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.layers.HeldItemLayer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.warcar.uo_uo_no_mi.UoUoMod;
import net.warcar.uo_uo_no_mi.init.UoMorphs;
import net.warcar.uo_uo_no_mi.morphs.BoroBreathLayer;
import xyz.pixelatedw.mineminenomi.api.morph.MorphModel;
import xyz.pixelatedw.mineminenomi.renderers.layers.morphs.PartialZoanHeldItemLayer;
import xyz.pixelatedw.mineminenomi.renderers.morphs.ZoanMorphRenderer;

public class SeiryuHeavyMorphRenderer<T extends AbstractClientPlayerEntity, M extends MorphModel> extends ZoanMorphRenderer<T, M> {
    public SeiryuHeavyMorphRenderer(EntityRendererManager renderManager) {
        super(renderManager, UoMorphs.SEIRYU_HEAVY.get());
        this.removeLayer(HeldItemLayer.class);
        this.addLayer(new PartialZoanHeldItemLayer(this, new SeiryuHeavyModel()));
        this.addLayer(new BoroBreathLayer<>(this, false));
    }

    public ResourceLocation getTextureLocation(AbstractClientPlayerEntity entity) {
        return new ResourceLocation(UoUoMod.MOD_ID, "textures/dragohybrid.png");
    }

    public static class Factory<T extends PlayerEntity> implements IRenderFactory<T> {
        public Factory() {
        }

        public EntityRenderer<? super T> createRenderFor(EntityRendererManager manager) {
            return new SeiryuHeavyMorphRenderer(manager);
        }
    }
}
