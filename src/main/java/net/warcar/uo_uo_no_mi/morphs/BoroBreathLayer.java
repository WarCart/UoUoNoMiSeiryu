package net.warcar.uo_uo_no_mi.morphs;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.LivingEntity;
import net.warcar.uo_uo_no_mi.abilities.BoroBreathAbility;
import net.warcar.uo_uo_no_mi.models.BoroBreathModel;
import net.warcar.uo_uo_no_mi.models.SeiryuHeavyModel;
import xyz.pixelatedw.mineminenomi.data.entity.ability.AbilityDataCapability;
import xyz.pixelatedw.mineminenomi.init.ModRenderTypes;

public class BoroBreathLayer<T extends LivingEntity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
    private final BoroBreathModel model = new BoroBreathModel();
    private final boolean large;

    public BoroBreathLayer(IEntityRenderer<T, M> p_i50926_1_, boolean large) {
        super(p_i50926_1_);
        this.large = large;
    }

    public void render(MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight, T entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        BoroBreathAbility ability = AbilityDataCapability.get(entity).getEquippedAbility(BoroBreathAbility.INSTANCE);
        if (!entity.isInvisible() && ability != null && ability.isCharging()) {
            matrixStack.pushPose();
            if (this.large) {
                matrixStack.scale(20, 20, 20);
                matrixStack.translate(0, -1, -1.4);
            } else {
                matrixStack.translate(0, -2.5, -0.4);
            }
            this.model.renderToBuffer(matrixStack, buffer.getBuffer(ModRenderTypes.getEnergyRenderType()), packedLight, OverlayTexture.NO_OVERLAY, 1, 51f / 255, 0, 51f / 255, true);
            matrixStack.popPose();
        }
    }
}
