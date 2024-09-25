package net.warcar.uo_uo_no_mi.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.IHasArm;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.HandSide;
import xyz.pixelatedw.mineminenomi.api.morph.MorphModel;

public class SeiryuHeavyModel extends MorphModel<LivingEntity> {
    private final ModelRenderer Head;
    private final ModelRenderer Body;
    private final ModelRenderer Tail;
    private final ModelRenderer Tail_r1;
    private final ModelRenderer Tail_r2;
    private final ModelRenderer Tail_r3;
    private final ModelRenderer Tail_r4;
    private final ModelRenderer Tail_r5;
    private final ModelRenderer Tail_r6;
    private final ModelRenderer Tail_r7;
    private final ModelRenderer Tail_r8;
    private final ModelRenderer Tail_r9;
    private final ModelRenderer Tail_r10;
    private final ModelRenderer Tail_r11;
    private final ModelRenderer Tail_r12;
    private final ModelRenderer LeftArm;
    private final ModelRenderer RightArm;
    private final ModelRenderer LeftLeg;
    private final ModelRenderer RightLeg;

    public SeiryuHeavyModel() {
        super(0);
        texWidth = 256;
        texHeight = 256;

        Head = new ModelRenderer(this);
        Head.setPos(0.0F, -41.0F, -1.0F);
        Head.texOffs(84, 85).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
        Head.texOffs(4, 0).addBox(1.6F, -15.0F, -0.5F, 1.0F, 11.0F, 1.0F, 0.1F, false);
        Head.texOffs(0, 0).addBox(-2.6F, -15.0F, -0.5F, 1.0F, 11.0F, 1.0F, 0.1F, false);
        Head.texOffs(0, 53).addBox(-5.7F, -7.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        Head.texOffs(54, 53).addBox(2.7F, -7.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        Head.texOffs(8, 5).addBox(4.7F, -11.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        Head.texOffs(8, 0).addBox(-5.7F, -11.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

        Body = new ModelRenderer(this);
        Body.setPos(0.0F, -26.0F, 0.0F);
        Body.texOffs(68, 0).addBox(-7.0F, -10.0F, -4.0F, 14.0F, 1.0F, 8.0F, 0.0F, false);
        Body.texOffs(86, 101).addBox(-5.0F, -11.0F, -4.0F, 10.0F, 1.0F, 8.0F, 0.0F, false);
        Body.texOffs(56, 45).addBox(-10.0F, -9.0F, -5.0F, 20.0F, 1.0F, 10.0F, 0.0F, false);
        Body.texOffs(0, 53).addBox(-11.0F, -8.0F, -5.0F, 22.0F, 2.0F, 10.0F, 0.0F, false);
        Body.texOffs(0, 0).addBox(-14.0F, -6.0F, -6.0F, 28.0F, 17.0F, 12.0F, 0.0F, false);
        Body.texOffs(0, 29).addBox(-13.0F, 11.0F, -5.0F, 26.0F, 2.0F, 10.0F, 0.0F, false);
        Body.texOffs(0, 41).addBox(-12.0F, 13.0F, -5.0F, 24.0F, 3.0F, 9.0F, 0.0F, false);
        Body.texOffs(55, 56).addBox(-11.0F, 16.0F, -5.0F, 22.0F, 4.0F, 9.0F, 0.0F, false);
        Body.texOffs(64, 33).addBox(-11.0F, 20.0F, -4.0F, 22.0F, 4.0F, 8.0F, 0.0F, false);

        Tail = new ModelRenderer(this);
        Tail.setPos(0.4F, 19.2561F, 7.7981F);
        Body.addChild(Tail);


        Tail_r1 = new ModelRenderer(this);
        Tail_r1.setPos(0.0F, 0.0F, 0.0F);
        Tail.addChild(Tail_r1);
        setRotationAngle(Tail_r1, -0.7854F, 0.0F, 0.0F);
        Tail_r1.texOffs(0, 65).addBox(-4.0F, -4.0F, -7.0F, 8.0F, 8.0F, 10.0F, 0.0F, false);

        Tail_r2 = new ModelRenderer(this);
        Tail_r2.setPos(-0.075F, -3.1441F, -3.0784F);
        Tail.addChild(Tail_r2);
        setRotationAngle(Tail_r2, -0.7854F, 0.0F, 0.0F);
        Tail_r2.texOffs(30, 109).addBox(-4.0F, -4.0F, 7.0F, 8.0F, 8.0F, 6.0F, -0.4F, false);

        Tail_r3 = new ModelRenderer(this);
        Tail_r3.setPos(-0.075F, -4.8941F, -4.8284F);
        Tail.addChild(Tail_r3);
        setRotationAngle(Tail_r3, -0.7854F, 0.0F, 0.0F);
        Tail_r3.texOffs(84, 69).addBox(-4.0F, -4.0F, 14.0F, 8.0F, 8.0F, 8.0F, -0.8F, false);

        Tail_r4 = new ModelRenderer(this);
        Tail_r4.setPos(-0.075F, -5.6441F, -5.5784F);
        Tail.addChild(Tail_r4);
        setRotationAngle(Tail_r4, -0.7854F, 0.0F, 0.0F);
        Tail_r4.texOffs(56, 97).addBox(-4.0F, -4.0F, 21.0F, 8.0F, 8.0F, 7.0F, -1.2F, false);

        Tail_r5 = new ModelRenderer(this);
        Tail_r5.setPos(-0.075F, -5.227F, -5.2363F);
        Tail.addChild(Tail_r5);
        setRotationAngle(Tail_r5, -0.7854F, 0.0F, 0.0F);
        Tail_r5.texOffs(0, 102).addBox(-4.0F, -4.0F, 29.0F, 8.0F, 8.0F, 7.0F, -2.4F, false);

        Tail_r6 = new ModelRenderer(this);
        Tail_r6.setPos(-0.075F, -3.227F, -3.2363F);
        Tail.addChild(Tail_r6);
        setRotationAngle(Tail_r6, -0.7854F, 0.0F, 0.0F);
        Tail_r6.texOffs(24, 93).addBox(-4.0F, -4.0F, 28.0F, 8.0F, 8.0F, 8.0F, -2.8F, false);

        Tail_r7 = new ModelRenderer(this);
        Tail_r7.setPos(-0.075F, -4.727F, -4.7363F);
        Tail.addChild(Tail_r7);
        setRotationAngle(Tail_r7, -0.7854F, 0.0F, 0.0F);
        Tail_r7.texOffs(105, 2).addBox(-4.0F, -4.0F, 26.0F, 8.0F, 8.0F, 7.0F, -2.0F, false);

        Tail_r8 = new ModelRenderer(this);
        Tail_r8.setPos(-0.075F, -6.227F, -6.2363F);
        Tail.addChild(Tail_r8);
        setRotationAngle(Tail_r8, -0.7854F, 0.0F, 0.0F);
        Tail_r8.texOffs(110, 50).addBox(-4.0F, -4.0F, 26.0F, 8.0F, 8.0F, 6.0F, -1.6F, false);

        Tail_r9 = new ModelRenderer(this);
        Tail_r9.setPos(-0.075F, 22.1196F, 22.1603F);
        Tail.addChild(Tail_r9);
        setRotationAngle(Tail_r9, 0.0F, -0.7854F, -1.5708F);
        Tail_r9.texOffs(20, 65).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 0.0F, 6.0F, 0.0F, false);

        Tail_r10 = new ModelRenderer(this);
        Tail_r10.setPos(-0.075F, 22.1196F, 22.1603F);
        Tail.addChild(Tail_r10);
        setRotationAngle(Tail_r10, -0.7854F, 0.0F, 0.0F);
        Tail_r10.texOffs(56, 29).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 0.0F, 6.0F, 0.0F, false);

        Tail_r11 = new ModelRenderer(this);
        Tail_r11.setPos(-0.075F, 22.1196F, 22.1603F);
        Tail.addChild(Tail_r11);
        setRotationAngle(Tail_r11, 0.6155F, 0.5236F, 2.5261F);
        Tail_r11.texOffs(62, 0).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 0.0F, 6.0F, 0.0F, false);

        Tail_r12 = new ModelRenderer(this);
        Tail_r12.setPos(-0.075F, 22.1196F, 22.1603F);
        Tail.addChild(Tail_r12);
        setRotationAngle(Tail_r12, -0.3655F, 0.7119F, 1.0409F);
        Tail_r12.texOffs(48, 56).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 0.0F, 6.0F, 0.0F, false);

        LeftArm = new ModelRenderer(this);
        LeftArm.setPos(18.0F, -26.0F, 0.0F);
        LeftArm.texOffs(0, 83).addBox(-4.0F, -5.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);
        LeftArm.texOffs(60, 69).addBox(-3.0F, 5.0F, -3.0F, 6.0F, 22.0F, 6.0F, 0.0F, false);

        RightArm = new ModelRenderer(this);
        RightArm.setPos(-18.0F, -26.0F, 0.0F);
        RightArm.texOffs(36, 65).addBox(-3.0F, 5.0F, -3.0F, 6.0F, 22.0F, 6.0F, 0.0F, false);
        RightArm.texOffs(0, 83).addBox(-4.0F, -5.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);

        LeftLeg = new ModelRenderer(this);
        LeftLeg.setPos(5.0F, -1.0F, -2.0F);
        LeftLeg.texOffs(103, 110).addBox(-2.9F, -1.0F, -2.0F, 6.0F, 13.0F, 5.0F, 0.0F, false);
        LeftLeg.texOffs(116, 17).addBox(-1.9F, 5.0F, 3.0F, 4.0F, 18.0F, 3.0F, 0.0F, false);
        LeftLeg.texOffs(109, 64).addBox(-1.9F, 23.0F, -2.0F, 4.0F, 2.0F, 8.0F, 0.0F, false);
        LeftLeg.texOffs(0, 45).addBox(1.1F, 23.0F, -4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        LeftLeg.texOffs(0, 41).addBox(-0.4F, 23.0F, -4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        LeftLeg.texOffs(4, 35).addBox(-1.9F, 23.0F, -4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

        RightLeg = new ModelRenderer(this);
        RightLeg.setPos(-4.0F, -1.0F, -2.0F);
        RightLeg.texOffs(81, 110).addBox(-3.9F, -1.0F, -2.0F, 6.0F, 13.0F, 5.0F, 0.0F, false);
        RightLeg.texOffs(58, 112).addBox(-2.9F, 5.0F, 3.0F, 4.0F, 18.0F, 3.0F, 0.0F, false);
        RightLeg.texOffs(108, 77).addBox(-2.9F, 23.0F, -2.0F, 4.0F, 2.0F, 8.0F, 0.0F, false);
        RightLeg.texOffs(0, 33).addBox(0.1F, 23.0F, -4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        RightLeg.texOffs(4, 31).addBox(-1.4F, 23.0F, -4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        RightLeg.texOffs(0, 29).addBox(-2.9F, 23.0F, -4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(LivingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        setRotationAngle(Head, head);
        setRotationAngle(Body, body);
        setRotationAngle(LeftArm, leftArm);
        setRotationAngle(RightArm, rightArm);
        setRotationAngle(LeftLeg, leftLeg);
        setRotationAngle(RightLeg, rightLeg);
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    public void setRotationAngle(ModelRenderer modelRenderer, ModelRenderer from) {
        float x = modelRenderer.x;
        float y = modelRenderer.y;
        float z = modelRenderer.z;
        modelRenderer.copyFrom(from);
        modelRenderer.x = x;
        modelRenderer.y = y;
        modelRenderer.z = z;
    }

    public void renderFirstPersonArm(MatrixStack matrixStack, IVertexBuilder vertex, int packedLight, int overlay, float red, float green, float blue, float alpha, HandSide side) {
    }

    public void renderFirstPersonLeg(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v, float v1, float v2, float v3, HandSide handSide) {
    }

    @Override
    public ModelRenderer getArm(HandSide side) {
        if (side == HandSide.LEFT) {
            return this.LeftArm;
        } else {
            return this.RightArm;
        }
    }

    public boolean renderItemInHand(LivingEntity entity, HandSide side, MatrixStack matrixStack) {
        this.getArm(side).translateAndRotate(matrixStack);
        matrixStack.translate(0, 1, 0);
        return true;
    }
}
