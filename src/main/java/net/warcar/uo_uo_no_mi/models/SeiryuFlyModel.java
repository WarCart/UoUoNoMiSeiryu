package net.warcar.uo_uo_no_mi.models;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.HandSide;
import net.warcar.uo_uo_no_mi.UoUoMod;
import net.warcar.uo_uo_no_mi.abilities.BoroBreathAbility;
import net.warcar.uo_uo_no_mi.abilities.KaifuAbility;
import xyz.pixelatedw.mineminenomi.api.morph.MorphModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import xyz.pixelatedw.mineminenomi.data.entity.ability.AbilityDataCapability;
import xyz.pixelatedw.mineminenomi.data.entity.ability.IAbilityData;

import java.util.Arrays;
import java.util.List;

public class SeiryuFlyModel extends MorphModel<LivingEntity> {
    private final ModelRenderer necksection1;
    private final ModelRenderer bodysection1;
    private final ModelRenderer bodysection2;
    private final ModelRenderer bodysection3;
    private final ModelRenderer leftarm2;
    private final ModelRenderer upperleftarm2;
    private final ModelRenderer lowerleftarm2;
    private final ModelRenderer lefthand2;
    private final ModelRenderer leftthumbsection8;
    private final ModelRenderer leftthumbsection7;
    private final ModelRenderer leftthumbsection6;
    private final ModelRenderer leftthumbsection5;
    private final ModelRenderer leftpointfingersection8;
    private final ModelRenderer leftpointfingersection7;
    private final ModelRenderer leftpointfingersection6;
    private final ModelRenderer leftpointfingersection5;
    private final ModelRenderer leftmiddlefingersection8;
    private final ModelRenderer leftmiddlefingersection7;
    private final ModelRenderer leftmiddlefingersection6;
    private final ModelRenderer leftmiddlefingersection5;
    private final ModelRenderer leftringfingersection8;
    private final ModelRenderer leftringfingersection7;
    private final ModelRenderer leftringfingersection6;
    private final ModelRenderer leftringfingersection5;
    private final ModelRenderer leftpinkyfingersection8;
    private final ModelRenderer leftpinkyfingersection7;
    private final ModelRenderer leftpinkyfingersection6;
    private final ModelRenderer leftpinkyfingersection5;
    private final ModelRenderer rightarm2;
    private final ModelRenderer upperrightarm2;
    private final ModelRenderer lowerrightarm2;
    private final ModelRenderer righthand2;
    private final ModelRenderer rightthumbsection7;
    private final ModelRenderer rightthumbsection6;
    private final ModelRenderer rightthumbsection5;
    private final ModelRenderer rightthumbsection2;
    private final ModelRenderer rightpointfingersection8;
    private final ModelRenderer rightpointfingersection7;
    private final ModelRenderer rightpointfingersection6;
    private final ModelRenderer rightpointfingersection5;
    private final ModelRenderer rightmiddlefingersection8;
    private final ModelRenderer rightmiddlefingersection7;
    private final ModelRenderer rightmiddlefingersection6;
    private final ModelRenderer rightmiddlefingersection5;
    private final ModelRenderer rightringfingersection8;
    private final ModelRenderer rightringfingersection7;
    private final ModelRenderer rightringfingersection6;
    private final ModelRenderer rightringfingersection5;
    private final ModelRenderer rightpinkyfingersection8;
    private final ModelRenderer rightpinkyfingersection7;
    private final ModelRenderer rightpinkyfingersection6;
    private final ModelRenderer rightpinkyfingersection5;
    private final ModelRenderer bodysection4;
    private final ModelRenderer bodysection5;
    private final ModelRenderer bodysection6;
    private final ModelRenderer bodysection7;
    private final ModelRenderer bodysection8;
    private final ModelRenderer bodysection9;
    private final ModelRenderer bodysection10;
    private final ModelRenderer bodysection11;
    private final ModelRenderer bodysection12;
    private final ModelRenderer bodysection13;
    private final ModelRenderer bodysection14;
    private final ModelRenderer bodysection16;
    private final ModelRenderer bodysection17;
    private final ModelRenderer bodysection18;
    private final ModelRenderer bodysection19;
    private final ModelRenderer head;
    private final ModelRenderer uphead;
    private final ModelRenderer head_r1;
    private final ModelRenderer head_r2;
    private final ModelRenderer head_r3;
    private final ModelRenderer head_r4;
    private final ModelRenderer head_r5;
    private final ModelRenderer head_r6;
    private final ModelRenderer bone2;
    private final ModelRenderer head_r7;
    private final ModelRenderer head_r8;
    private final ModelRenderer head_r9;
    private final ModelRenderer head_r10;
    private final ModelRenderer head_r11;
    private final ModelRenderer head_r12;
    private final ModelRenderer head_r13;
    private final ModelRenderer bone;
    private final ModelRenderer head_r14;
    private final ModelRenderer head_r15;
    private final ModelRenderer head_r16;
    private final ModelRenderer head_r17;
    private final ModelRenderer head_r18;
    private final ModelRenderer head_r19;
    private final ModelRenderer head_r20;
    private final ModelRenderer downhead;
    private final ModelRenderer bone3;
    private final ModelRenderer head_r21;
    private final ModelRenderer head_r22;
    private final ModelRenderer head_r23;
    private final ModelRenderer head_r24;
    private final ModelRenderer bone4;
    private final ModelRenderer head_r25;
    private final ModelRenderer head_r26;
    private final ModelRenderer head_r27;
    private final ModelRenderer head_r28;
    private final ModelRenderer[] bodysections15;
    public final List<ModelRenderer> body;

    public SeiryuFlyModel() {
        super(0);
        texWidth = 512;
        texHeight = 512;

        necksection1 = new ModelRenderer(this);
        necksection1.setPos(-0.1666F, 19.3429F, 0.901F);


        bodysection1 = new ModelRenderer(this);
        bodysection1.setPos(-0.2334F, 7.6571F, 49.099F);
        necksection1.addChild(bodysection1);
        bodysection1.texOffs(166, 324).addBox(0.2345F, -27.6368F, -7.235F, 0.0F, 15.0F, 25.0F, 0.0F, false);
        bodysection1.texOffs(102, 180).addBox(-13.2655F, -12.6368F, -7.235F, 27.0F, 24.0F, 25.0F, 0.0F, false);

        bodysection2 = new ModelRenderer(this);
        bodysection2.setPos(0.0F, 0.0F, 18.0F);
        bodysection1.addChild(bodysection2);
        bodysection2.texOffs(242, 48).addBox(-12.2655F, -12.6368F, -1.235F, 25.0F, 24.0F, 20.0F, 0.0F, false);
        bodysection2.texOffs(216, 288).addBox(0.2345F, -27.6368F, -1.235F, 0.0F, 15.0F, 20.0F, 0.0F, false);

        bodysection3 = new ModelRenderer(this);
        bodysection3.setPos(0.0F, 0.0F, 18.0F);
        bodysection2.addChild(bodysection3);
        bodysection3.texOffs(206, 180).addBox(-11.2655F, -12.6368F, -0.235F, 23.0F, 24.0F, 27.0F, 0.0F, false);
        bodysection3.texOffs(56, 324).addBox(0.3325F, -27.0818F, -0.2095F, 0.0F, 15.0F, 26.0F, 0.0F, false);

        leftarm2 = new ModelRenderer(this);
        leftarm2.setPos(14.5495F, -5.0201F, 11.6933F);
        bodysection3.addChild(leftarm2);
        leftarm2.texOffs(102, 168).addBox(-2.5F, -2.5F, -3.5F, 5.0F, 5.0F, 7.0F, 0.6F, false);

        upperleftarm2 = new ModelRenderer(this);
        upperleftarm2.setPos(2.5125F, 0.1245F, -0.0354F);
        leftarm2.addChild(upperleftarm2);
        setRotationAngle(upperleftarm2, 0.0F, 0.0F, 0.3927F);
        upperleftarm2.texOffs(306, 214).addBox(-1.0F, -2.5F, -3.5F, 26.0F, 5.0F, 7.0F, 0.02F, false);

        lowerleftarm2 = new ModelRenderer(this);
        lowerleftarm2.setPos(16.385F, 0.4134F, -82.8947F);
        upperleftarm2.addChild(lowerleftarm2);
        lowerleftarm2.texOffs(340, 264).addBox(4.6069F, -2.4588F, 79.37F, 20.0F, 4.0F, 7.0F, 0.02F, false);

        lefthand2 = new ModelRenderer(this);
        lefthand2.setPos(16.4105F, -1.3282F, 0.0265F);
        lowerleftarm2.addChild(lefthand2);
        lefthand2.texOffs(102, 154).addBox(6.9375F, -3.0625F, 79.0F, 5.0F, 6.0F, 8.0F, 0.02F, false);

        leftthumbsection8 = new ModelRenderer(this);
        leftthumbsection8.setPos(3.5447F, -1.0808F, -3.3107F);
        lefthand2.addChild(leftthumbsection8);
        leftthumbsection8.texOffs(256, 303).addBox(5.5F, -1.5F, 81.375F, 3.0F, 3.0F, 2.0F, 0.3F, false);

        leftthumbsection7 = new ModelRenderer(this);
        leftthumbsection7.setPos(1.5815F, 0.0865F, -0.4592F);
        leftthumbsection8.addChild(leftthumbsection7);
        leftthumbsection7.texOffs(178, 284).addBox(6.5F, -1.0F, 82.0F, 3.0F, 2.0F, 2.0F, 0.2F, false);

        leftthumbsection6 = new ModelRenderer(this);
        leftthumbsection6.setPos(2.3746F, -0.0149F, -0.0947F);
        leftthumbsection7.addChild(leftthumbsection6);
        leftthumbsection6.texOffs(340, 275).addBox(6.5F, -1.0F, 82.5F, 3.0F, 2.0F, 1.0F, 0.1F, false);

        leftthumbsection5 = new ModelRenderer(this);
        leftthumbsection5.setPos(2.3437F, 0.0F, -0.0163F);
        leftthumbsection6.addChild(leftthumbsection5);
        leftthumbsection5.texOffs(122, 77).addBox(6.75F, -0.5F, 82.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        leftpointfingersection8 = new ModelRenderer(this);
        leftpointfingersection8.setPos(2.7115F, -3.288F, -2.8486F);
        lefthand2.addChild(leftpointfingersection8);
        leftpointfingersection8.texOffs(230, 58).addBox(5.0F, -2.75F, 82.0F, 4.0F, 3.0F, 2.0F, 0.02F, false);

        leftpointfingersection7 = new ModelRenderer(this);
        leftpointfingersection7.setPos(0.8083F, -2.7732F, 0.0013F);
        leftpointfingersection8.addChild(leftpointfingersection7);
        leftpointfingersection7.texOffs(256, 308).addBox(6.0F, -2.25F, 82.0F, 2.0F, 4.0F, 2.0F, 0.01F, false);

        leftpointfingersection6 = new ModelRenderer(this);
        leftpointfingersection6.setPos(-0.0074F, -2.4571F, 0.0F);
        leftpointfingersection7.addChild(leftpointfingersection6);
        leftpointfingersection6.texOffs(56, 318).addBox(6.0F, -3.5F, 82.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        leftpointfingersection5 = new ModelRenderer(this);
        leftpointfingersection5.setPos(-0.3956F, -3.5959F, -0.0026F);
        leftpointfingersection6.addChild(leftpointfingersection5);
        leftpointfingersection5.texOffs(122, 79).addBox(6.5F, -2.25F, 82.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        leftmiddlefingersection8 = new ModelRenderer(this);
        leftmiddlefingersection8.setPos(2.7115F, -3.163F, -0.6611F);
        lefthand2.addChild(leftmiddlefingersection8);
        leftmiddlefingersection8.texOffs(178, 279).addBox(5.0F, -2.75F, 82.0F, 4.0F, 3.0F, 2.0F, 0.02F, false);

        leftmiddlefingersection7 = new ModelRenderer(this);
        leftmiddlefingersection7.setPos(0.8083F, -2.7732F, 0.0013F);
        leftmiddlefingersection8.addChild(leftmiddlefingersection7);
        leftmiddlefingersection7.texOffs(56, 312).addBox(6.0F, -2.25F, 82.0F, 2.0F, 4.0F, 2.0F, 0.01F, false);

        leftmiddlefingersection6 = new ModelRenderer(this);
        leftmiddlefingersection6.setPos(-0.0074F, -2.4571F, 0.0F);
        leftmiddlefingersection7.addChild(leftmiddlefingersection6);
        leftmiddlefingersection6.texOffs(64, 318).addBox(6.0F, -3.5F, 82.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        leftmiddlefingersection5 = new ModelRenderer(this);
        leftmiddlefingersection5.setPos(-0.3956F, -3.5959F, -0.0026F);
        leftmiddlefingersection6.addChild(leftmiddlefingersection5);
        leftmiddlefingersection5.texOffs(122, 83).addBox(6.5F, -2.25F, 82.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        leftringfingersection8 = new ModelRenderer(this);
        leftringfingersection8.setPos(2.7115F, -2.9755F, 1.5264F);
        lefthand2.addChild(leftringfingersection8);
        leftringfingersection8.texOffs(288, 173).addBox(5.0F, -2.75F, 82.0F, 4.0F, 3.0F, 2.0F, 0.02F, false);

        leftringfingersection7 = new ModelRenderer(this);
        leftringfingersection7.setPos(0.8083F, -2.7732F, 0.0013F);
        leftringfingersection8.addChild(leftringfingersection7);
        leftringfingersection7.texOffs(64, 312).addBox(6.0F, -2.25F, 82.0F, 2.0F, 4.0F, 2.0F, 0.01F, false);

        leftringfingersection6 = new ModelRenderer(this);
        leftringfingersection6.setPos(-0.0074F, -2.4571F, 0.0F);
        leftringfingersection7.addChild(leftringfingersection6);
        leftringfingersection6.texOffs(328, 130).addBox(6.0F, -3.5F, 82.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        leftringfingersection5 = new ModelRenderer(this);
        leftringfingersection5.setPos(-0.3956F, -3.5959F, -0.0026F);
        leftringfingersection6.addChild(leftringfingersection5);
        leftringfingersection5.texOffs(96, 208).addBox(6.5F, -2.25F, 82.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        leftpinkyfingersection8 = new ModelRenderer(this);
        leftpinkyfingersection8.setPos(2.7115F, -2.3505F, 3.3389F);
        lefthand2.addChild(leftpinkyfingersection8);
        leftpinkyfingersection8.texOffs(78, 258).addBox(5.0F, -2.75F, 82.0F, 4.0F, 4.0F, 2.0F, 0.02F, false);

        leftpinkyfingersection7 = new ModelRenderer(this);
        leftpinkyfingersection7.setPos(0.8083F, -2.7732F, 0.0013F);
        leftpinkyfingersection8.addChild(leftpinkyfingersection7);
        leftpinkyfingersection7.texOffs(256, 314).addBox(6.0F, -2.25F, 82.0F, 2.0F, 4.0F, 2.0F, 0.01F, false);

        leftpinkyfingersection6 = new ModelRenderer(this);
        leftpinkyfingersection6.setPos(-0.0074F, -2.4571F, 0.0F);
        leftpinkyfingersection7.addChild(leftpinkyfingersection6);
        leftpinkyfingersection6.texOffs(336, 130).addBox(6.0F, -3.5F, 82.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        leftpinkyfingersection5 = new ModelRenderer(this);
        leftpinkyfingersection5.setPos(-0.3956F, -3.5959F, -0.0026F);
        leftpinkyfingersection6.addChild(leftpinkyfingersection5);
        leftpinkyfingersection5.texOffs(96, 212).addBox(6.5F, -2.25F, 82.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        rightarm2 = new ModelRenderer(this);
        rightarm2.setPos(-14.7495F, -5.0201F, 11.6933F);
        bodysection3.addChild(rightarm2);
        rightarm2.texOffs(190, 364).addBox(-2.5F, -2.5F, -3.5F, 5.0F, 5.0F, 7.0F, 0.6F, false);

        upperrightarm2 = new ModelRenderer(this);
        upperrightarm2.setPos(-0.5125F, 0.1245F, -0.0354F);
        rightarm2.addChild(upperrightarm2);
        setRotationAngle(upperrightarm2, 0.0F, 0.0F, -0.3927F);
        upperrightarm2.texOffs(328, 118).addBox(-27.0F, -2.5F, -3.5F, 26.0F, 5.0F, 7.0F, 0.02F, false);

        lowerrightarm2 = new ModelRenderer(this);
        lowerrightarm2.setPos(-17.385F, 0.4134F, -82.8947F);
        upperrightarm2.addChild(lowerrightarm2);
        lowerrightarm2.texOffs(0, 357).addBox(-25.6069F, -2.4588F, 79.37F, 20.0F, 4.0F, 7.0F, 0.02F, false);

        righthand2 = new ModelRenderer(this);
        righthand2.setPos(-16.4105F, -1.3282F, 0.0265F);
        lowerrightarm2.addChild(righthand2);
        righthand2.texOffs(164, 364).addBox(-12.9375F, -3.0625F, 79.0F, 5.0F, 6.0F, 8.0F, 0.02F, false);

        rightthumbsection7 = new ModelRenderer(this);
        rightthumbsection7.setPos(-3.5447F, -1.0808F, -3.3107F);
        righthand2.addChild(rightthumbsection7);
        rightthumbsection7.texOffs(306, 226).addBox(-9.5F, -1.5F, 81.375F, 3.0F, 3.0F, 2.0F, 0.3F, false);

        rightthumbsection6 = new ModelRenderer(this);
        rightthumbsection6.setPos(-1.5815F, 0.0865F, -0.4592F);
        rightthumbsection7.addChild(rightthumbsection6);
        rightthumbsection6.texOffs(316, 226).addBox(-10.5F, -1.0F, 82.0F, 3.0F, 2.0F, 2.0F, 0.2F, false);

        rightthumbsection5 = new ModelRenderer(this);
        rightthumbsection5.setPos(-2.3746F, -0.0149F, -0.0947F);
        rightthumbsection6.addChild(rightthumbsection5);
        rightthumbsection5.texOffs(348, 275).addBox(-10.5F, -1.0F, 82.5F, 3.0F, 2.0F, 1.0F, 0.1F, false);

        rightthumbsection2 = new ModelRenderer(this);
        rightthumbsection2.setPos(-2.3437F, 0.0F, -0.0163F);
        rightthumbsection5.addChild(rightthumbsection2);
        rightthumbsection2.texOffs(96, 216).addBox(-9.75F, -0.5F, 82.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        rightpointfingersection8 = new ModelRenderer(this);
        rightpointfingersection8.setPos(-2.7115F, -3.288F, -2.8486F);
        righthand2.addChild(rightpointfingersection8);
        rightpointfingersection8.texOffs(256, 288).addBox(-10.0F, -2.75F, 82.0F, 4.0F, 3.0F, 2.0F, 0.02F, false);

        rightpointfingersection7 = new ModelRenderer(this);
        rightpointfingersection7.setPos(-0.8083F, -2.7732F, 0.0013F);
        rightpointfingersection8.addChild(rightpointfingersection7);
        rightpointfingersection7.texOffs(344, 130).addBox(-9.0F, -2.25F, 82.0F, 2.0F, 4.0F, 2.0F, 0.01F, false);

        rightpointfingersection6 = new ModelRenderer(this);
        rightpointfingersection6.setPos(0.0074F, -2.4571F, 0.0F);
        rightpointfingersection7.addChild(rightpointfingersection6);
        rightpointfingersection6.texOffs(352, 130).addBox(-9.0F, -3.5F, 82.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        rightpointfingersection5 = new ModelRenderer(this);
        rightpointfingersection5.setPos(0.3956F, -3.5959F, -0.0026F);
        rightpointfingersection6.addChild(rightpointfingersection5);
        rightpointfingersection5.texOffs(96, 218).addBox(-8.5F, -2.25F, 82.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        rightmiddlefingersection8 = new ModelRenderer(this);
        rightmiddlefingersection8.setPos(-2.7115F, -3.163F, -0.6611F);
        righthand2.addChild(rightmiddlefingersection8);
        rightmiddlefingersection8.texOffs(256, 293).addBox(-10.0F, -2.75F, 82.0F, 4.0F, 3.0F, 2.0F, 0.02F, false);

        rightmiddlefingersection7 = new ModelRenderer(this);
        rightmiddlefingersection7.setPos(-0.8083F, -2.7732F, 0.0013F);
        rightmiddlefingersection8.addChild(rightmiddlefingersection7);
        rightmiddlefingersection7.texOffs(360, 130).addBox(-9.0F, -2.25F, 82.0F, 2.0F, 4.0F, 2.0F, 0.01F, false);

        rightmiddlefingersection6 = new ModelRenderer(this);
        rightmiddlefingersection6.setPos(0.0074F, -2.4571F, 0.0F);
        rightmiddlefingersection7.addChild(rightmiddlefingersection6);
        rightmiddlefingersection6.texOffs(54, 365).addBox(-9.0F, -3.5F, 82.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        rightmiddlefingersection5 = new ModelRenderer(this);
        rightmiddlefingersection5.setPos(0.3956F, -3.5959F, -0.0026F);
        rightmiddlefingersection6.addChild(rightmiddlefingersection5);
        rightmiddlefingersection5.texOffs(96, 222).addBox(-8.5F, -2.25F, 82.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        rightringfingersection8 = new ModelRenderer(this);
        rightringfingersection8.setPos(-2.7115F, -2.9755F, 1.5264F);
        righthand2.addChild(rightringfingersection8);
        rightringfingersection8.texOffs(256, 298).addBox(-10.0F, -2.75F, 82.0F, 4.0F, 3.0F, 2.0F, 0.02F, false);

        rightringfingersection7 = new ModelRenderer(this);
        rightringfingersection7.setPos(-0.8083F, -2.7732F, 0.0013F);
        rightringfingersection8.addChild(rightringfingersection7);
        rightringfingersection7.texOffs(62, 365).addBox(-9.0F, -2.25F, 82.0F, 2.0F, 4.0F, 2.0F, 0.01F, false);

        rightringfingersection6 = new ModelRenderer(this);
        rightringfingersection6.setPos(0.0074F, -2.4571F, 0.0F);
        rightringfingersection7.addChild(rightringfingersection6);
        rightringfingersection6.texOffs(70, 365).addBox(-9.0F, -3.5F, 82.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        rightringfingersection5 = new ModelRenderer(this);
        rightringfingersection5.setPos(0.3956F, -3.5959F, -0.0026F);
        rightringfingersection6.addChild(rightringfingersection5);
        rightringfingersection5.texOffs(90, 258).addBox(-8.5F, -2.25F, 82.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        rightpinkyfingersection8 = new ModelRenderer(this);
        rightpinkyfingersection8.setPos(-2.7115F, -2.3505F, 3.3389F);
        righthand2.addChild(rightpinkyfingersection8);
        rightpinkyfingersection8.texOffs(78, 264).addBox(-10.0F, -2.75F, 82.0F, 4.0F, 4.0F, 2.0F, 0.02F, false);

        rightpinkyfingersection7 = new ModelRenderer(this);
        rightpinkyfingersection7.setPos(-0.8083F, -2.7732F, 0.0013F);
        rightpinkyfingersection8.addChild(rightpinkyfingersection7);
        rightpinkyfingersection7.texOffs(78, 365).addBox(-9.0F, -2.25F, 82.0F, 2.0F, 4.0F, 2.0F, 0.01F, false);

        rightpinkyfingersection6 = new ModelRenderer(this);
        rightpinkyfingersection6.setPos(0.0074F, -2.4571F, 0.0F);
        rightpinkyfingersection7.addChild(rightpinkyfingersection6);
        rightpinkyfingersection6.texOffs(86, 365).addBox(-9.0F, -3.5F, 82.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        rightpinkyfingersection5 = new ModelRenderer(this);
        rightpinkyfingersection5.setPos(0.3956F, -3.5959F, -0.0026F);
        rightpinkyfingersection6.addChild(rightpinkyfingersection5);
        rightpinkyfingersection5.texOffs(90, 262).addBox(-8.5F, -2.25F, 82.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        bodysection4 = new ModelRenderer(this);
        bodysection4.setPos(0.0F, 0.0F, 26.0F);
        bodysection3.addChild(bodysection4);
        bodysection4.texOffs(110, 0).addBox(-9.7261F, -11.2568F, -0.247F, 20.0F, 23.0F, 40.0F, 0.0F, false);
        bodysection4.texOffs(190, 231).addBox(0.3325F, -28.2568F, -0.247F, 0.0F, 17.0F, 40.0F, 0.0F, false);

        bodysection5 = new ModelRenderer(this);
        bodysection5.setPos(0.0F, 0.0F, 39.0F);
        bodysection4.addChild(bodysection5);
        bodysection5.texOffs(0, 208).addBox(-9.7261F, -11.2568F, -0.247F, 20.0F, 22.0F, 28.0F, 0.0F, false);
        bodysection5.texOffs(0, 312).addBox(0.3325F, -28.2568F, -0.247F, 0.0F, 17.0F, 28.0F, 0.0F, false);

        bodysection6 = new ModelRenderer(this);
        bodysection6.setPos(0.0F, 0.0F, 26.0F);
        bodysection5.addChild(bodysection6);
        bodysection6.texOffs(110, 0).addBox(-9.7261F, -11.2568F, 0.753F, 20.0F, 23.0F, 40.0F, 0.0F, false);
        bodysection6.texOffs(190, 231).addBox(0.3325F, -28.2568F, 0.753F, 0.0F, 17.0F, 40.0F, 0.0F, false);

        bodysection7 = new ModelRenderer(this);
        bodysection7.setPos(0.0F, 0.0F, 40.0F);
        bodysection6.addChild(bodysection7);
        bodysection7.texOffs(110, 0).addBox(-9.7261F, -10.2568F, -0.247F, 20.0F, 23.0F, 40.0F, 0.0F, false);
        bodysection7.texOffs(190, 231).addBox(0.3325F, -27.2568F, -0.247F, 0.0F, 17.0F, 40.0F, 0.0F, false);

        bodysection8 = new ModelRenderer(this);
        bodysection8.setPos(0.0F, 0.0F, 39.0F);
        bodysection7.addChild(bodysection8);
        bodysection8.texOffs(0, 208).addBox(-9.7261F, -11.2568F, -1.247F, 20.0F, 22.0F, 28.0F, 0.0F, false);
        bodysection8.texOffs(0, 312).addBox(0.3325F, -28.2568F, -1.247F, 0.0F, 17.0F, 28.0F, 0.0F, false);

        bodysection9 = new ModelRenderer(this);
        bodysection9.setPos(0.0F, 0.0F, 27.0F);
        bodysection8.addChild(bodysection9);
        bodysection9.texOffs(110, 0).addBox(-9.7261F, -11.2568F, -1.247F, 20.0F, 23.0F, 40.0F, 0.0F, false);
        bodysection9.texOffs(190, 231).addBox(0.3325F, -28.2568F, -1.247F, 0.0F, 17.0F, 40.0F, 0.0F, false);

        bodysection10 = new ModelRenderer(this);
        bodysection10.setPos(0.0F, 0.0F, 37.0F);
        bodysection9.addChild(bodysection10);
        bodysection10.texOffs(0, 208).addBox(-9.7261F, -11.2568F, 0.753F, 20.0F, 22.0F, 28.0F, 0.0F, false);
        bodysection10.texOffs(0, 312).addBox(0.3325F, -28.2568F, 0.753F, 0.0F, 17.0F, 28.0F, 0.0F, false);

        bodysection11 = new ModelRenderer(this);
        bodysection11.setPos(0.0F, 1.0F, 28.0F);
        bodysection10.addChild(bodysection11);
        bodysection11.texOffs(110, 0).addBox(-9.7261F, -12.2568F, -0.247F, 20.0F, 23.0F, 40.0F, 0.0F, false);
        bodysection11.texOffs(190, 231).addBox(0.3325F, -29.2568F, -0.247F, 0.0F, 17.0F, 40.0F, 0.0F, false);

        bodysection12 = new ModelRenderer(this);
        bodysection12.setPos(0.0F, -1.0F, 39.0F);
        bodysection11.addChild(bodysection12);
        bodysection12.texOffs(110, 0).addBox(-9.7261F, -10.2568F, -0.247F, 20.0F, 23.0F, 40.0F, 0.0F, false);
        bodysection12.texOffs(190, 231).addBox(0.3325F, -27.2568F, -0.247F, 0.0F, 17.0F, 40.0F, 0.0F, false);

        bodysection13 = new ModelRenderer(this);
        bodysection13.setPos(0.0F, 0.0F, 37.0F);
        bodysection12.addChild(bodysection13);
        bodysection13.texOffs(0, 208).addBox(-9.7261F, -11.2568F, 0.753F, 20.0F, 22.0F, 28.0F, 0.0F, false);
        bodysection13.texOffs(320, 0).addBox(0.3325F, -28.2568F, 0.753F, 0.0F, 17.0F, 28.0F, 0.0F, false);

        bodysection14 = new ModelRenderer(this);
        bodysection14.setPos(0.0F, 0.0F, 27.0F);
        bodysection13.addChild(bodysection14);
        bodysection14.texOffs(110, 0).addBox(-9.7261F, -11.2568F, 0.753F, 20.0F, 23.0F, 40.0F, 0.0F, false);
        bodysection14.texOffs(190, 231).addBox(0.3325F, -28.2568F, 0.753F, 0.0F, 17.0F, 40.0F, 0.0F, false);

        bodysections15 = new ModelRenderer[41];
        for (int i = 0; i < bodysections15.length; i++) {
            ModelRenderer bodysection15;
            bodysection15 = new ModelRenderer(this);
            bodysection15.setPos(0.0F, 0.0F, 40.0F);
            bodysection15.texOffs(128, 63).addBox(-8.7261F, -10.2568F, -0.247F, 18.0F, 21.0F, 39.0F, 0.0F, false);
            bodysection15.texOffs(0, 258).addBox(0.2739F, -25.2568F, -0.247F, 0.0F, 15.0F, 39.0F, 0.0F, false);
            if (i == 0) {
                bodysection14.addChild(bodysection15);
            } else {
                bodysections15[i - 1].addChild(bodysection15);
            }
            bodysections15[i] = bodysection15;
        }

        bodysection16 = new ModelRenderer(this);
        bodysection16.setPos(0.0F, 0.0F, 38.253F);
        bodysection16.texOffs(0, 154).addBox(-7.7261F, -9.2568F, -0.5F, 16.0F, 19.0F, 35.0F, 0.0F, false);
        bodysection16.texOffs(270, 231).addBox(0.2739F, -23.2568F, -0.5F, 0.0F, 14.0F, 35.0F, 0.0F, false);
        bodysections15[bodysections15.length - 1].addChild(bodysection16);

        bodysection17 = new ModelRenderer(this);
        bodysection17.setPos(0.0F, 0.0F, 33.747F);
        bodysection16.addChild(bodysection17);
        bodysection17.texOffs(96, 229).addBox(-6.7261F, -8.2568F, -0.247F, 14.0F, 17.0F, 33.0F, 0.0F, false);
        bodysection17.texOffs(78, 279).addBox(0.2739F, -20.2568F, -0.247F, 0.0F, 12.0F, 33.0F, 0.0F, false);

        bodysection18 = new ModelRenderer(this);
        bodysection18.setPos(0.0F, 0.0F, 33.0F);
        bodysection17.addChild(bodysection18);
        bodysection18.texOffs(230, 0).addBox(-5.7261F, -7.2568F, -1.247F, 12.0F, 15.0F, 33.0F, 0.0F, false);
        bodysection18.texOffs(270, 280).addBox(0.2739F, -17.2568F, -1.247F, 0.0F, 10.0F, 33.0F, 0.0F, false);

        bodysection19 = new ModelRenderer(this);
        bodysection19.setPos(0.0F, 0.0F, 32.0F);
        bodysection18.addChild(bodysection19);
        bodysection19.texOffs(242, 92).addBox(-4.7261F, -6.2568F, -1.247F, 10.0F, 13.0F, 33.0F, 0.0F, false);
        bodysection19.texOffs(306, 173).addBox(0.2739F, -14.2568F, -1.247F, 0.0F, 8.0F, 33.0F, 0.0F, false);
        bodysection19.texOffs(0, 0).addBox(0.3325F, -18.0877F, 31.0792F, 0.0F, 37.0F, 55.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setPos(-0.1655F, 25.3632F, 45.765F);
        head.texOffs(128, 123).addBox(-16.0F, -14.0F, -28.0F, 32.0F, 32.0F, 25.0F, 0.0F, false);
        head.texOffs(144, 288).addBox(-15.0F, -13.0F, -34.0F, 30.0F, 30.0F, 6.0F, 0.0F, false);
        head.texOffs(0, 92).addBox(-32.0F, -29.0F, -3.0F, 64.0F, 62.0F, 0.0F, 0.0F, false);

        uphead = new ModelRenderer(this);
        uphead.setPos(0.1655F, -0.3632F, -96.765F);
        head.addChild(uphead);
        uphead.texOffs(328, 92).addBox(-7.1655F, -2.6368F, 30.765F, 14.0F, 10.0F, 16.0F, 0.0F, false);
        uphead.texOffs(336, 280).addBox(-9.1655F, -5.6368F, 46.765F, 18.0F, 13.0F, 10.0F, 0.0F, false);
        uphead.texOffs(332, 45).addBox(-12.1655F, -8.6368F, 56.765F, 24.0F, 16.0F, 6.0F, 0.0F, false);
        uphead.texOffs(108, 357).addBox(6.8345F, -8.6368F, 54.765F, 6.0F, 7.0F, 8.0F, 0.0F, false);
        uphead.texOffs(136, 357).addBox(-14.1655F, -8.6368F, 54.765F, 6.0F, 7.0F, 8.0F, 0.0F, false);
        uphead.texOffs(332, 67).addBox(-8.6655F, -4.6368F, 19.765F, 17.0F, 12.0F, 11.0F, 0.0F, false);
        uphead.texOffs(300, 177).addBox(5.3345F, 7.3632F, 20.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(264, 313).addBox(5.3345F, 7.3632F, 23.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(72, 315).addBox(5.3345F, 7.3632F, 29.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(90, 274).addBox(5.3345F, 7.3632F, 26.015F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        uphead.texOffs(172, 286).addBox(5.3345F, 7.3632F, 35.015F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        uphead.texOffs(264, 316).addBox(5.3345F, 7.3632F, 32.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(336, 229).addBox(5.3345F, 7.3632F, 41.015F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        uphead.texOffs(72, 318).addBox(5.3345F, 7.3632F, 38.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(266, 319).addBox(5.3345F, 7.3632F, 44.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(72, 321).addBox(6.3345F, 7.3632F, 53.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(90, 266).addBox(6.3345F, 7.3632F, 59.015F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        uphead.texOffs(342, 362).addBox(-6.6655F, 7.3632F, 23.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(90, 270).addBox(-7.6655F, 7.3632F, 59.015F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        uphead.texOffs(342, 171).addBox(6.3345F, 7.3632F, 58.015F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        uphead.texOffs(340, 321).addBox(-7.6655F, 7.3632F, 58.015F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        uphead.texOffs(360, 275).addBox(-7.6655F, 7.3632F, 53.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(344, 136).addBox(6.3345F, 7.3632F, 49.015F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        uphead.texOffs(344, 90).addBox(-7.6655F, 7.3632F, 49.015F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        uphead.texOffs(342, 359).addBox(-6.6655F, 7.3632F, 44.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(342, 356).addBox(-6.6655F, 7.3632F, 38.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(356, 275).addBox(-6.6655F, 7.3632F, 32.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(336, 226).addBox(-6.6655F, 7.3632F, 29.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(340, 278).addBox(-6.6655F, 7.3632F, 26.015F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        uphead.texOffs(340, 90).addBox(-6.6655F, 7.3632F, 35.015F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        uphead.texOffs(336, 321).addBox(-6.6655F, 7.3632F, 41.015F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        uphead.texOffs(266, 307).addBox(-6.6655F, 7.3632F, 20.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(264, 310).addBox(-3.6655F, 6.6132F, 20.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(72, 312).addBox(1.3345F, 7.3632F, 20.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        head_r1 = new ModelRenderer(this);
        head_r1.setPos(-9.6655F, -10.3868F, 56.265F);
        uphead.addChild(head_r1);
        setRotationAngle(head_r1, 0.0F, 0.0F, 0.3927F);
        head_r1.texOffs(110, 70).addBox(-0.5F, -3.0F, -2.0F, 5.0F, 3.0F, 4.0F, 0.0F, false);
        head_r1.texOffs(144, 279).addBox(-8.5F, 0.0F, -2.0F, 13.0F, 3.0F, 4.0F, 0.0F, false);

        head_r2 = new ModelRenderer(this);
        head_r2.setPos(8.3345F, -10.3868F, 56.265F);
        uphead.addChild(head_r2);
        setRotationAngle(head_r2, 0.0F, 0.0F, -0.3927F);
        head_r2.texOffs(110, 63).addBox(-4.5F, -3.0F, -2.0F, 5.0F, 3.0F, 4.0F, 0.0F, false);
        head_r2.texOffs(242, 173).addBox(-4.5F, 0.0F, -2.0F, 13.0F, 3.0F, 4.0F, 0.0F, false);

        head_r3 = new ModelRenderer(this);
        head_r3.setPos(-21.3897F, -18.4911F, 56.265F);
        uphead.addChild(head_r3);
        setRotationAngle(head_r3, 0.0F, 0.0F, 0.3927F);
        head_r3.texOffs(276, 173).addBox(7.5F, 1.0F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

        head_r4 = new ModelRenderer(this);
        head_r4.setPos(4.3603F, -11.9911F, 56.265F);
        uphead.addChild(head_r4);
        setRotationAngle(head_r4, 0.0F, 0.0F, -0.3927F);
        head_r4.texOffs(78, 270).addBox(7.5F, 1.0F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

        head_r5 = new ModelRenderer(this);
        head_r5.setPos(-25.1473F, -20.0467F, 56.265F);
        uphead.addChild(head_r5);
        setRotationAngle(head_r5, 0.0F, 0.0F, 0.3927F);
        head_r5.texOffs(230, 48).addBox(7.5F, 0.0F, -2.0F, 2.0F, 6.0F, 4.0F, 0.0F, false);

        head_r6 = new ModelRenderer(this);
        head_r6.setPos(17.1114F, -14.0223F, 56.265F);
        uphead.addChild(head_r6);
        setRotationAngle(head_r6, 0.0F, 0.0F, -0.3927F);
        head_r6.texOffs(110, 77).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 6.0F, 4.0F, 0.0F, false);

        bone2 = new ModelRenderer(this);
        bone2.setPos(-7.8345F, 0.6368F, -65.765F);
        head.addChild(bone2);
        setRotationAngle(bone2, 0.0F, 0.0F, -0.3927F);
        bone2.texOffs(324, 171).addBox(-4.0328F, -1.5607F, -10.235F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        head_r7 = new ModelRenderer(this);
        head_r7.setPos(-19.5278F, -0.1368F, 18.577F);
        bone2.addChild(head_r7);
        setRotationAngle(head_r7, 0.0F, 0.3927F, 0.0F);
        head_r7.texOffs(158, 286).addBox(-3.7023F, -1.4239F, -8.6685F, 6.0F, 1.0F, 1.0F, 0.0F, false);

        head_r8 = new ModelRenderer(this);
        head_r8.setPos(-17.1868F, -0.1368F, 15.3704F);
        bone2.addChild(head_r8);
        setRotationAngle(head_r8, 0.0F, 0.7854F, 0.0F);
        head_r8.texOffs(326, 226).addBox(1.1346F, -1.4239F, -6.5934F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        head_r9 = new ModelRenderer(this);
        head_r9.setPos(-16.6337F, -0.1368F, 12.4358F);
        bone2.addChild(head_r9);
        setRotationAngle(head_r9, 0.0F, 1.1781F, 0.0F);
        head_r9.texOffs(334, 171).addBox(3.9614F, -1.4239F, -3.5906F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        head_r10 = new ModelRenderer(this);
        head_r10.setPos(-17.2458F, -0.1368F, 9.5129F);
        bone2.addChild(head_r10);
        setRotationAngle(head_r10, 0.0F, 1.5708F, 0.0F);
        head_r10.texOffs(336, 136).addBox(4.5F, -1.4239F, -0.1173F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        head_r11 = new ModelRenderer(this);
        head_r11.setPos(-16.7099F, -0.1368F, 9.8185F);
        bone2.addChild(head_r11);
        setRotationAngle(head_r11, 0.0F, 1.1781F, 0.0F);
        head_r11.texOffs(320, 45).addBox(6.9614F, -1.4239F, -3.5906F, 5.0F, 1.0F, 1.0F, 0.0F, false);

        head_r12 = new ModelRenderer(this);
        head_r12.setPos(-13.004F, -0.1368F, 4.2722F);
        bone2.addChild(head_r12);
        setRotationAngle(head_r12, 0.0F, 0.7854F, 0.0F);
        head_r12.texOffs(190, 229).addBox(3.1346F, -1.4239F, -6.5934F, 7.0F, 1.0F, 1.0F, 0.0F, false);

        head_r13 = new ModelRenderer(this);
        head_r13.setPos(-7.4577F, -0.1368F, 0.5663F);
        bone2.addChild(head_r13);
        setRotationAngle(head_r13, 0.0F, 0.3927F, 0.0F);
        head_r13.texOffs(110, 89).addBox(0.2977F, -1.4239F, -8.6685F, 7.0F, 1.0F, 1.0F, 0.0F, false);

        bone = new ModelRenderer(this);
        bone.setPos(8.1655F, 0.6368F, -65.765F);
        head.addChild(bone);
        setRotationAngle(bone, 0.0F, 0.0F, 0.3927F);
        bone.texOffs(256, 320).addBox(-0.2982F, -1.5607F, -10.235F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        head_r14 = new ModelRenderer(this);
        head_r14.setPos(16.9148F, -0.1368F, 13.0129F);
        bone.addChild(head_r14);
        setRotationAngle(head_r14, 0.0F, -1.5708F, 0.0F);
        head_r14.texOffs(328, 136).addBox(-11.0F, -1.4239F, -0.1173F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        head_r15 = new ModelRenderer(this);
        head_r15.setPos(19.3306F, -0.1368F, 17.8452F);
        bone.addChild(head_r15);
        setRotationAngle(head_r15, 0.0F, -0.7854F, 0.0F);
        head_r15.texOffs(326, 228).addBox(-8.6346F, -1.4239F, -6.5934F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        head_r16 = new ModelRenderer(this);
        head_r16.setPos(22.4304F, -0.1368F, 19.9164F);
        bone.addChild(head_r16);
        setRotationAngle(head_r16, 0.0F, -0.3927F, 0.0F);
        head_r16.texOffs(144, 286).addBox(-5.7977F, -1.4239F, -8.6685F, 6.0F, 1.0F, 1.0F, 0.0F, false);

        head_r17 = new ModelRenderer(this);
        head_r17.setPos(17.6421F, -0.1368F, 15.6693F);
        bone.addChild(head_r17);
        setRotationAngle(head_r17, 0.0F, -1.1781F, 0.0F);
        head_r17.texOffs(332, 90).addBox(-10.4614F, -1.4239F, -3.5906F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        head_r18 = new ModelRenderer(this);
        head_r18.setPos(15.8048F, -0.1368F, 8.4326F);
        bone.addChild(head_r18);
        setRotationAngle(head_r18, 0.0F, -1.1781F, 0.0F);
        head_r18.texOffs(288, 178).addBox(-10.4614F, -1.4239F, -3.5906F, 5.0F, 1.0F, 1.0F, 0.0F, false);

        head_r19 = new ModelRenderer(this);
        head_r19.setPos(11.6123F, -0.1368F, 3.2116F);
        bone.addChild(head_r19);
        setRotationAngle(head_r19, 0.0F, -0.7854F, 0.0F);
        head_r19.texOffs(78, 276).addBox(-8.6346F, -1.4239F, -6.5934F, 7.0F, 1.0F, 1.0F, 0.0F, false);

        head_r20 = new ModelRenderer(this);
        head_r20.setPos(5.7409F, -0.1368F, -0.0077F);
        bone.addChild(head_r20);
        setRotationAngle(head_r20, 0.0F, -0.3927F, 0.0F);
        head_r20.texOffs(110, 87).addBox(-5.7977F, -1.4239F, -8.6685F, 7.0F, 1.0F, 1.0F, 0.0F, false);

        downhead = new ModelRenderer(this);
        downhead.setPos(0.1655F, 6.6368F, -40.765F);
        head.addChild(downhead);
        setRotationAngle(downhead, 0.3927F, 0.0F, 0.0F);
        downhead.texOffs(242, 138).addBox(-7.1655F, 1.3632F, -36.235F, 14.0F, 8.0F, 27.0F, 0.0F, false);
        downhead.texOffs(96, 226).addBox(-1.1655F, 0.3632F, -35.235F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(364, 275).addBox(1.8345F, -0.6368F, -35.235F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        downhead.texOffs(300, 173).addBox(3.8345F, -1.6368F, -34.235F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        downhead.texOffs(344, 278).addBox(4.8345F, 0.3632F, -32.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(344, 321).addBox(4.8345F, 0.3632F, -30.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(348, 90).addBox(4.8345F, 0.3632F, -26.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(346, 171).addBox(4.8345F, 0.3632F, -28.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(348, 278).addBox(4.8345F, 0.3632F, -22.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(348, 136).addBox(4.8345F, 0.3632F, -24.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(352, 90).addBox(4.8345F, 0.3632F, -18.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(350, 171).addBox(4.8345F, 0.3632F, -20.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(352, 278).addBox(4.8345F, 0.3632F, -14.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(352, 136).addBox(4.8345F, 0.3632F, -16.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(356, 90).addBox(4.8345F, 0.3632F, -10.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(354, 171).addBox(4.8345F, 0.3632F, -12.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(4, 368).addBox(-6.1655F, 0.3632F, -10.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(102, 365).addBox(4.8345F, -0.6368F, -2.235F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        downhead.texOffs(98, 365).addBox(-6.1655F, -0.6368F, -2.235F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        downhead.texOffs(12, 368).addBox(4.8345F, 0.3632F, -3.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(8, 368).addBox(-6.1655F, 0.3632F, -3.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(0, 368).addBox(4.8345F, -0.6368F, -6.235F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        downhead.texOffs(342, 365).addBox(-6.1655F, -0.6368F, -6.235F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        downhead.texOffs(366, 171).addBox(-6.1655F, 0.3632F, -12.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(364, 278).addBox(-6.1655F, 0.3632F, -14.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(364, 136).addBox(-6.1655F, 0.3632F, -16.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(364, 90).addBox(-6.1655F, 0.3632F, -18.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(362, 171).addBox(-6.1655F, 0.3632F, -20.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(360, 278).addBox(-6.1655F, 0.3632F, -22.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(360, 136).addBox(-6.1655F, 0.3632F, -24.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(360, 90).addBox(-6.1655F, 0.3632F, -26.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(358, 171).addBox(-6.1655F, 0.3632F, -28.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(356, 278).addBox(-6.1655F, 0.3632F, -30.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(356, 136).addBox(-6.1655F, 0.3632F, -32.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(266, 303).addBox(-5.1655F, -1.6368F, -34.235F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        downhead.texOffs(94, 365).addBox(-3.1655F, -0.6368F, -35.235F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        downhead.texOffs(336, 303).addBox(-9.1655F, 1.3632F, -9.235F, 18.0F, 8.0F, 10.0F, 0.0F, false);
        downhead.texOffs(340, 226).addBox(-11.1655F, 1.3632F, 0.765F, 22.0F, 8.0F, 6.0F, 0.0F, false);

        bone3 = new ModelRenderer(this);
        bone3.setPos(-4.1845F, -12.3632F, -6.515F);
        head.addChild(bone3);
        setRotationAngle(bone3, 0.4363F, -0.3491F, -0.1571F);
        bone3.texOffs(216, 323).addBox(-15.0655F, -7.6368F, -12.235F, 8.0F, 8.0F, 25.0F, 0.0F, false);

        head_r21 = new ModelRenderer(this);
        head_r21.setPos(-9.6583F, -7.4717F, 48.9208F);
        bone3.addChild(head_r21);
        setRotationAngle(head_r21, 0.1886F, -0.3864F, -0.0718F);
        head_r21.texOffs(300, 356).addBox(-2.5F, -4.0F, -8.0F, 5.0F, 8.0F, 16.0F, 0.0F, false);

        head_r22 = new ModelRenderer(this);
        head_r22.setPos(-6.7871F, -4.9652F, 34.7058F);
        bone3.addChild(head_r22);
        setRotationAngle(head_r22, 0.1745F, 0.0F, 0.0F);
        head_r22.texOffs(348, 321).addBox(-2.5F, -4.0F, -8.0F, 5.0F, 8.0F, 16.0F, 0.0F, false);

        head_r23 = new ModelRenderer(this);
        head_r23.setPos(1.6647F, -17.0F, 16.5568F);
        bone3.addChild(head_r23);
        setRotationAngle(head_r23, 0.0F, 0.1745F, 0.0F);
        head_r23.texOffs(340, 240).addBox(-12.7655F, 9.3632F, -6.235F, 5.0F, 8.0F, 16.0F, 0.0F, false);

        head_r24 = new ModelRenderer(this);
        head_r24.setPos(-18.0013F, -3.6368F, 23.3289F);
        bone3.addChild(head_r24);
        setRotationAngle(head_r24, 0.0F, -0.3927F, 0.0F);
        head_r24.texOffs(324, 138).addBox(-2.0F, -4.0F, -12.5F, 4.0F, 8.0F, 25.0F, 0.0F, false);

        bone4 = new ModelRenderer(this);
        bone4.setPos(-4.1845F, -12.3632F, -6.515F);
        head.addChild(bone4);
        setRotationAngle(bone4, 0.4363F, 0.3491F, 0.1571F);
        bone4.texOffs(282, 323).addBox(15.4345F, -7.6368F, -12.235F, 8.0F, 8.0F, 25.0F, 0.0F, false);

        head_r25 = new ModelRenderer(this);
        head_r25.setPos(32.9949F, -17.0F, 13.8037F);
        bone4.addChild(head_r25);
        setRotationAngle(head_r25, 0.0F, 0.3927F, 0.0F);
        head_r25.texOffs(108, 324).addBox(-11.7655F, 9.3632F, -6.235F, 4.0F, 8.0F, 25.0F, 0.0F, false);

        head_r26 = new ModelRenderer(this);
        head_r26.setPos(29.8778F, -17.0F, 20.6429F);
        bone4.addChild(head_r26);
        setRotationAngle(head_r26, 0.0F, -0.1745F, 0.0F);
        head_r26.texOffs(216, 356).addBox(-15.7655F, 9.3632F, -6.235F, 5.0F, 8.0F, 16.0F, 0.0F, false);

        head_r27 = new ModelRenderer(this);
        head_r27.setPos(29.6076F, -19.4672F, 39.9951F);
        bone4.addChild(head_r27);
        setRotationAngle(head_r27, 0.1886F, 0.3864F, 0.0718F);
        head_r27.texOffs(258, 356).addBox(-15.7655F, 9.3632F, -6.235F, 5.0F, 8.0F, 16.0F, 0.0F, false);

        head_r28 = new ModelRenderer(this);
        head_r28.setPos(28.4216F, -17.8189F, 30.6471F);
        bone4.addChild(head_r28);
        setRotationAngle(head_r28, 0.1745F, 0.0F, 0.0F);
        head_r28.texOffs(348, 345).addBox(-15.7655F, 9.3632F, -6.235F, 5.0F, 8.0F, 16.0F, 0.0F, false);

        body = Lists.newArrayList(bodysection1, bodysection2, bodysection3, bodysection4, bodysection5,
                bodysection6, bodysection7, bodysection8, bodysection9, bodysection10,
                bodysection11, bodysection12, bodysection13, bodysection14);
        body.addAll(Arrays.asList(bodysections15));
        body.addAll(Lists.newArrayList(bodysection16, bodysection17, bodysection18, bodysection19));;
    }

    public void renderFirstPersonArm(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v, float v1, float v2, float v3, HandSide handSide) {
    }

    public void renderFirstPersonLeg(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v, float v1, float v2, float v3, HandSide handSide) {
    }

    public void setupAnim(LivingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        double speed = Math.pow(entity.xo - entity.getX(), 2) + Math.pow(entity.zo - entity.getZ(), 2);
        if (speed > 0) {
            for (int i = 0; i < body.size(); i++) {
                double animPos = Math.toRadians(ageInTicks) * 3;
                body.get(i).yRot += (float) Math.cos(i - animPos) / 3;
                if (i > 0) {
                    body.get(i).yRot -= (float) Math.cos(i - 1 - animPos) / 3;
                }
            }
        } else {
            body.get(0).xRot -= (float) Math.toRadians(90);
            body.get(0).z -= 8;
            for (int i = 0; i < 6; i++) {
                body.get(i).xRot += (float) Math.toRadians(15);
            }
            for (int i = 6; i < body.size(); i++) {
                body.get(i).yRot += (float) Math.toRadians(25 - (double) i / 3);
            }
        }
        IAbilityData abilityData = AbilityDataCapability.get(entity);
        BoroBreathAbility boroBreathAbility = abilityData.getEquippedAbility(BoroBreathAbility.INSTANCE);
        KaifuAbility kaifuAbility = abilityData.getEquippedAbility(KaifuAbility.INSTANCE);
        if ((boroBreathAbility != null && boroBreathAbility.isCharging()) || (kaifuAbility != null && kaifuAbility.isContinuous())) {
            this.head.xRot -= (float) (Math.toRadians(50));
            this.downhead.xRot += (float) (Math.toRadians(30));
        }
    }

    public void setRotationAngle(ModelRenderer model, float x, float y, float z) {
        model.xRot = x;
        model.yRot = y;
        model.zRot = z;
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        matrixStack.pushPose();
        matrixStack.scale(5, 5, 5);
        matrixStack.translate(0, -1.6, -2.4);
        this.head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        this.necksection1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        matrixStack.popPose();
    }
}
