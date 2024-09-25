package net.warcar.uo_uo_no_mi.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import xyz.pixelatedw.mineminenomi.models.abilities.CubeModel;

public class BoroBreathModel extends CubeModel {
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        matrixStack.pushPose();
        for (int i = 30; i > 0; i--) {
            matrixStack.pushPose();
            float size = (float) i / 30;
            matrixStack.scale(size, size, 1);
            super.renderToBuffer(matrixStack, buffer, packedLight, packedOverlay, red, green + (float) Math.pow(1 - (double) i / 30, 10) * 80, blue + (float) Math.pow(1 - (double) i / 30, 10) * 30, alpha);
            matrixStack.popPose();
        }
        matrixStack.popPose();
    }
}
