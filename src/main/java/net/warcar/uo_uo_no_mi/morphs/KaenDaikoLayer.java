package net.warcar.uo_uo_no_mi.morphs;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import net.warcar.uo_uo_no_mi.UoUoMod;
import net.warcar.uo_uo_no_mi.abilities.KaenDaikoAbility;
import net.warcar.uo_uo_no_mi.models.SeiryuFlyModel;
import net.warcar.uo_uo_no_mi.models.SeiryuHeavyModel;
import xyz.pixelatedw.mineminenomi.data.entity.ability.AbilityDataCapability;
import xyz.pixelatedw.mineminenomi.init.ModRenderTypes;

public class KaenDaikoLayer<T extends LivingEntity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
    private final SeiryuFlyModel model = new SeiryuFlyModel();

    public KaenDaikoLayer(IEntityRenderer<T, M> p_i50926_1_) {
        super(p_i50926_1_);
    }

    public void render(MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight, T entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if (!entity.isInvisible()) {
            this.model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            KaenDaikoAbility ability = AbilityDataCapability.get(entity).getEquippedAbility(KaenDaikoAbility.INSTANCE);
            if (ability != null && ability.isContinuous()) {
                matrixStack.pushPose();
                matrixStack.scale(5, 5, 5);
                this.model.renderToBuffer(matrixStack, buffer.getBuffer(ModRenderTypes.getZoanRenderType(new ResourceLocation(UoUoMod.MOD_ID, "textures/dragon_full_torch.png"))), packedLight, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.85f);
                matrixStack.popPose();
            }
        }
    }
}
