package net.warcar.uo_uo_no_mi.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.layers.HeldItemLayer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.warcar.uo_uo_no_mi.UoUoMod;
import net.warcar.uo_uo_no_mi.init.UoMorphs;
import net.warcar.uo_uo_no_mi.morphs.KaenDaikoLayer;
import net.warcar.uo_uo_no_mi.morphs.SeiryuHeavyLayer;
import xyz.pixelatedw.mineminenomi.api.morph.MorphModel;
import xyz.pixelatedw.mineminenomi.renderers.layers.morphs.PartialZoanHeldItemLayer;
import xyz.pixelatedw.mineminenomi.renderers.morphs.ZoanMorphRenderer;

public class KaenDaikoMorphRenderer<T extends AbstractClientPlayerEntity, M extends MorphModel> extends ZoanMorphRenderer<T, M> {
    public KaenDaikoMorphRenderer(EntityRendererManager renderManager) {
        super(renderManager, UoMorphs.KAEN_DAIKO.get());
        this.removeLayer(HeldItemLayer.class);
        this.addLayer(new KaenDaikoLayer<>(this));
    }

    public ResourceLocation getTextureLocation(AbstractClientPlayerEntity entity) {
        return new ResourceLocation(UoUoMod.MOD_ID, "textures/dragon_full.png");
    }

    @Override
    public void render(AbstractClientPlayerEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    public static class Factory<T extends PlayerEntity> implements IRenderFactory<T> {
        public Factory() {
        }

        public EntityRenderer<? super T> createRenderFor(EntityRendererManager manager) {
            return new KaenDaikoMorphRenderer(manager);
        }
    }
}
