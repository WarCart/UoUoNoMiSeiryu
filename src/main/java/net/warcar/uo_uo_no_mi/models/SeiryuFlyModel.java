package net.warcar.uo_uo_no_mi.models;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.HandSide;
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
    private final ModelRenderer[] bodysections15;
    private final ModelRenderer bodysection16;
    private final ModelRenderer bodysection17;
    private final ModelRenderer bodysection18;
    private final ModelRenderer bodysection19;
    private final List<ModelRenderer> body;
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
    private final ModelRenderer head;
    private final ModelRenderer downhead;
    private final ModelRenderer head_r1;

    public SeiryuFlyModel() {
        super(0);
        texWidth = 512;
        texHeight = 512;

        necksection1 = new ModelRenderer(this);
        necksection1.setPos(-0.1666F, 19.3429F, 0.901F);


        bodysection1 = new ModelRenderer(this);
        bodysection1.setPos(-0.2334F, 7.6571F, 49.099F);
        necksection1.addChild(bodysection1);
        bodysection1.texOffs(150, 372).addBox(-9.2655F, -10.6368F, -2.235F, 19.0F, 20.0F, 20.0F, 0.0F, false);
        bodysection1.texOffs(422, 57).addBox(-0.2655F, -23.6368F, -2.235F, 0.0F, 13.0F, 20.0F, 0.0F, false);

        bodysection2 = new ModelRenderer(this);
        bodysection2.setPos(-0.2334F, 0F, 19F);
        bodysection1.addChild(bodysection2);
        bodysection2.texOffs(336, 222).addBox(-10.2655F, -11.6368F, -1.235F, 21.0F, 22.0F, 20.0F, 0.0F, false);
        bodysection2.texOffs(418, 216).addBox(0.2345F, -26.6368F, -1.235F, 0.0F, 15.0F, 20.0F, 0.0F, false);

        bodysection3 = new ModelRenderer(this);
        bodysection3.setPos(-0.2334F, 0F, 18F);
        bodysection2.addChild(bodysection3);
        bodysection3.texOffs(240, 114).addBox(-11.2655F, -12.6368F, -0.235F, 23.0F, 24.0F, 27.0F, 0.0F, false);
        bodysection3.texOffs(416, 163).addBox(0.3325F, -27.0818F, -0.2095F, 0.0F, 15.0F, 26.0F, 0.0F, false);

        leftarm2 = new ModelRenderer(this);
        leftarm2.setPos(14.5495F, -5.0201F, 11.6933F);
        bodysection3.addChild(leftarm2);
        leftarm2.texOffs(216, 252).addBox(-2.5F, -2.5F, -3.5F, 5.0F, 5.0F, 7.0F, 0.6F, false);

        upperleftarm2 = new ModelRenderer(this);
        upperleftarm2.setPos(-4.55F, 0.1245F, -83.0354F);
        leftarm2.addChild(upperleftarm2);
        upperleftarm2.texOffs(392, 305).addBox(6.0625F, -2.5F, 79.5F, 26.0F, 5.0F, 7.0F, 0.02F, false);

        lowerleftarm2 = new ModelRenderer(this);
        lowerleftarm2.setPos(23.4475F, 0.4134F, 0.1053F);
        upperleftarm2.addChild(lowerleftarm2);
        lowerleftarm2.texOffs(418, 251).addBox(4.6069F, -2.4588F, 79.37F, 20.0F, 4.0F, 7.0F, 0.02F, false);

        lefthand2 = new ModelRenderer(this);
        lefthand2.setPos(16.4105F, -1.3282F, 0.0265F);
        lowerleftarm2.addChild(lefthand2);
        lefthand2.texOffs(94, 281).addBox(6.9375F, -3.0625F, 79.0F, 5.0F, 6.0F, 8.0F, 0.02F, false);

        leftthumbsection8 = new ModelRenderer(this);
        leftthumbsection8.setPos(3.5447F, -1.0808F, -3.3107F);
        lefthand2.addChild(leftthumbsection8);
        leftthumbsection8.texOffs(110, 63).addBox(5.5F, -1.5F, 81.375F, 3.0F, 3.0F, 2.0F, 0.3F, false);

        leftthumbsection7 = new ModelRenderer(this);
        leftthumbsection7.setPos(1.5815F, 0.0865F, -0.4592F);
        leftthumbsection8.addChild(leftthumbsection7);
        leftthumbsection7.texOffs(80, 341).addBox(6.5F, -1.0F, 82.0F, 3.0F, 2.0F, 2.0F, 0.2F, false);

        leftthumbsection6 = new ModelRenderer(this);
        leftthumbsection6.setPos(2.3746F, -0.0149F, -0.0947F);
        leftthumbsection7.addChild(leftthumbsection6);
        leftthumbsection6.texOffs(230, 60).addBox(6.5F, -1.0F, 82.5F, 3.0F, 2.0F, 1.0F, 0.1F, false);

        leftthumbsection5 = new ModelRenderer(this);
        leftthumbsection5.setPos(2.3437F, 0.0F, -0.0163F);
        leftthumbsection6.addChild(leftthumbsection5);
        leftthumbsection5.texOffs(264, 320).addBox(6.75F, -0.5F, 82.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        leftpointfingersection8 = new ModelRenderer(this);
        leftpointfingersection8.setPos(2.7115F, -3.288F, -2.8486F);
        lefthand2.addChild(leftpointfingersection8);
        leftpointfingersection8.texOffs(264, 315).addBox(5.0F, -2.75F, 82.0F, 4.0F, 3.0F, 2.0F, 0.02F, false);

        leftpointfingersection7 = new ModelRenderer(this);
        leftpointfingersection7.setPos(0.8083F, -2.7732F, 0.0013F);
        leftpointfingersection8.addChild(leftpointfingersection7);
        leftpointfingersection7.texOffs(110, 73).addBox(6.0F, -2.25F, 82.0F, 2.0F, 4.0F, 2.0F, 0.01F, false);

        leftpointfingersection6 = new ModelRenderer(this);
        leftpointfingersection6.setPos(-0.0074F, -2.4571F, 0.0F);
        leftpointfingersection7.addChild(leftpointfingersection6);
        leftpointfingersection6.texOffs(208, 308).addBox(6.0F, -3.5F, 82.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        leftpointfingersection5 = new ModelRenderer(this);
        leftpointfingersection5.setPos(-0.3956F, -3.5959F, -0.0026F);
        leftpointfingersection6.addChild(leftpointfingersection5);
        leftpointfingersection5.texOffs(90, 341).addBox(6.5F, -2.25F, 82.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        leftmiddlefingersection8 = new ModelRenderer(this);
        leftmiddlefingersection8.setPos(2.7115F, -3.163F, -0.6611F);
        lefthand2.addChild(leftmiddlefingersection8);
        leftmiddlefingersection8.texOffs(276, 315).addBox(5.0F, -2.75F, 82.0F, 4.0F, 3.0F, 2.0F, 0.02F, false);

        leftmiddlefingersection7 = new ModelRenderer(this);
        leftmiddlefingersection7.setPos(0.8083F, -2.7732F, 0.0013F);
        leftmiddlefingersection8.addChild(leftmiddlefingersection7);
        leftmiddlefingersection7.texOffs(110, 79).addBox(6.0F, -2.25F, 82.0F, 2.0F, 4.0F, 2.0F, 0.01F, false);

        leftmiddlefingersection6 = new ModelRenderer(this);
        leftmiddlefingersection6.setPos(-0.0074F, -2.4571F, 0.0F);
        leftmiddlefingersection7.addChild(leftmiddlefingersection6);
        leftmiddlefingersection6.texOffs(176, 350).addBox(6.0F, -3.5F, 82.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        leftmiddlefingersection5 = new ModelRenderer(this);
        leftmiddlefingersection5.setPos(-0.3956F, -3.5959F, -0.0026F);
        leftmiddlefingersection6.addChild(leftmiddlefingersection5);
        leftmiddlefingersection5.texOffs(90, 345).addBox(6.5F, -2.25F, 82.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        leftringfingersection8 = new ModelRenderer(this);
        leftringfingersection8.setPos(2.7115F, -2.9755F, 1.5264F);
        lefthand2.addChild(leftringfingersection8);
        leftringfingersection8.texOffs(288, 315).addBox(5.0F, -2.75F, 82.0F, 4.0F, 3.0F, 2.0F, 0.02F, false);

        leftringfingersection7 = new ModelRenderer(this);
        leftringfingersection7.setPos(0.8083F, -2.7732F, 0.0013F);
        leftringfingersection8.addChild(leftringfingersection7);
        leftringfingersection7.texOffs(110, 85).addBox(6.0F, -2.25F, 82.0F, 2.0F, 4.0F, 2.0F, 0.01F, false);

        leftringfingersection6 = new ModelRenderer(this);
        leftringfingersection6.setPos(-0.0074F, -2.4571F, 0.0F);
        leftringfingersection7.addChild(leftringfingersection6);
        leftringfingersection6.texOffs(176, 356).addBox(6.0F, -3.5F, 82.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        leftringfingersection5 = new ModelRenderer(this);
        leftringfingersection5.setPos(-0.3956F, -3.5959F, -0.0026F);
        leftringfingersection6.addChild(leftringfingersection5);
        leftringfingersection5.texOffs(174, 368).addBox(6.5F, -2.25F, 82.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        leftpinkyfingersection8 = new ModelRenderer(this);
        leftpinkyfingersection8.setPos(2.7115F, -2.3505F, 3.3389F);
        lefthand2.addChild(leftpinkyfingersection8);
        leftpinkyfingersection8.texOffs(94, 295).addBox(5.0F, -2.75F, 82.0F, 4.0F, 4.0F, 2.0F, 0.02F, false);

        leftpinkyfingersection7 = new ModelRenderer(this);
        leftpinkyfingersection7.setPos(0.8083F, -2.7732F, 0.0013F);
        leftpinkyfingersection8.addChild(leftpinkyfingersection7);
        leftpinkyfingersection7.texOffs(208, 302).addBox(6.0F, -2.25F, 82.0F, 2.0F, 4.0F, 2.0F, 0.01F, false);

        leftpinkyfingersection6 = new ModelRenderer(this);
        leftpinkyfingersection6.setPos(-0.0074F, -2.4571F, 0.0F);
        leftpinkyfingersection7.addChild(leftpinkyfingersection6);
        leftpinkyfingersection6.texOffs(176, 362).addBox(6.0F, -3.5F, 82.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        leftpinkyfingersection5 = new ModelRenderer(this);
        leftpinkyfingersection5.setPos(-0.3956F, -3.5959F, -0.0026F);
        leftpinkyfingersection6.addChild(leftpinkyfingersection5);
        leftpinkyfingersection5.texOffs(178, 368).addBox(6.5F, -2.25F, 82.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        rightarm2 = new ModelRenderer(this);
        rightarm2.setPos(-14.7495F, -5.0201F, 11.6933F);
        bodysection3.addChild(rightarm2);
        rightarm2.texOffs(184, 302).addBox(-2.5F, -2.5F, -3.5F, 5.0F, 5.0F, 7.0F, 0.6F, false);

        upperrightarm2 = new ModelRenderer(this);
        upperrightarm2.setPos(5.55F, 0.1245F, -83.0354F);
        rightarm2.addChild(upperrightarm2);
        upperrightarm2.texOffs(416, 204).addBox(-33.0625F, -2.5F, 79.5F, 26.0F, 5.0F, 7.0F, 0.02F, false);

        lowerrightarm2 = new ModelRenderer(this);
        lowerrightarm2.setPos(-23.4475F, 0.4134F, 0.1053F);
        upperrightarm2.addChild(lowerrightarm2);
        lowerrightarm2.texOffs(422, 90).addBox(-25.6069F, -2.4588F, 79.37F, 20.0F, 4.0F, 7.0F, 0.02F, false);

        righthand2 = new ModelRenderer(this);
        righthand2.setPos(-16.4105F, -1.3282F, 0.0265F);
        lowerrightarm2.addChild(righthand2);
        righthand2.texOffs(150, 350).addBox(-12.9375F, -3.0625F, 79.0F, 5.0F, 6.0F, 8.0F, 0.02F, false);

        rightthumbsection7 = new ModelRenderer(this);
        rightthumbsection7.setPos(-3.5447F, -1.0808F, -3.3107F);
        righthand2.addChild(rightthumbsection7);
        rightthumbsection7.texOffs(110, 68).addBox(-9.5F, -1.5F, 81.375F, 3.0F, 3.0F, 2.0F, 0.3F, false);

        rightthumbsection6 = new ModelRenderer(this);
        rightthumbsection6.setPos(-1.5815F, 0.0865F, -0.4592F);
        rightthumbsection7.addChild(rightthumbsection6);
        rightthumbsection6.texOffs(80, 345).addBox(-10.5F, -1.0F, 82.0F, 3.0F, 2.0F, 2.0F, 0.2F, false);

        rightthumbsection5 = new ModelRenderer(this);
        rightthumbsection5.setPos(-2.3746F, -0.0149F, -0.0947F);
        rightthumbsection6.addChild(rightthumbsection5);
        rightthumbsection5.texOffs(344, 57).addBox(-10.5F, -1.0F, 82.5F, 3.0F, 2.0F, 1.0F, 0.1F, false);

        rightthumbsection2 = new ModelRenderer(this);
        rightthumbsection2.setPos(-2.3437F, 0.0F, -0.0163F);
        rightthumbsection5.addChild(rightthumbsection2);
        rightthumbsection2.texOffs(270, 320).addBox(-9.75F, -0.5F, 82.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        rightpointfingersection8 = new ModelRenderer(this);
        rightpointfingersection8.setPos(-2.7115F, -3.288F, -2.8486F);
        righthand2.addChild(rightpointfingersection8);
        rightpointfingersection8.texOffs(300, 315).addBox(-10.0F, -2.75F, 82.0F, 4.0F, 3.0F, 2.0F, 0.02F, false);

        rightpointfingersection7 = new ModelRenderer(this);
        rightpointfingersection7.setPos(-0.8083F, -2.7732F, 0.0013F);
        rightpointfingersection8.addChild(rightpointfingersection7);
        rightpointfingersection7.texOffs(150, 364).addBox(-9.0F, -2.25F, 82.0F, 2.0F, 4.0F, 2.0F, 0.01F, false);

        rightpointfingersection6 = new ModelRenderer(this);
        rightpointfingersection6.setPos(0.0074F, -2.4571F, 0.0F);
        rightpointfingersection7.addChild(rightpointfingersection6);
        rightpointfingersection6.texOffs(158, 364).addBox(-9.0F, -3.5F, 82.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        rightpointfingersection5 = new ModelRenderer(this);
        rightpointfingersection5.setPos(0.3956F, -3.5959F, -0.0026F);
        rightpointfingersection6.addChild(rightpointfingersection5);
        rightpointfingersection5.texOffs(260, 372).addBox(-8.5F, -2.25F, 82.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        rightmiddlefingersection8 = new ModelRenderer(this);
        rightmiddlefingersection8.setPos(-2.7115F, -3.163F, -0.6611F);
        righthand2.addChild(rightmiddlefingersection8);
        rightmiddlefingersection8.texOffs(80, 331).addBox(-10.0F, -2.75F, 82.0F, 4.0F, 3.0F, 2.0F, 0.02F, false);

        rightmiddlefingersection7 = new ModelRenderer(this);
        rightmiddlefingersection7.setPos(-0.8083F, -2.7732F, 0.0013F);
        rightmiddlefingersection8.addChild(rightmiddlefingersection7);
        rightmiddlefingersection7.texOffs(166, 364).addBox(-9.0F, -2.25F, 82.0F, 2.0F, 4.0F, 2.0F, 0.01F, false);

        rightmiddlefingersection6 = new ModelRenderer(this);
        rightmiddlefingersection6.setPos(0.0074F, -2.4571F, 0.0F);
        rightmiddlefingersection7.addChild(rightmiddlefingersection6);
        rightmiddlefingersection6.texOffs(228, 372).addBox(-9.0F, -3.5F, 82.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        rightmiddlefingersection5 = new ModelRenderer(this);
        rightmiddlefingersection5.setPos(0.3956F, -3.5959F, -0.0026F);
        rightmiddlefingersection6.addChild(rightmiddlefingersection5);
        rightmiddlefingersection5.texOffs(302, 379).addBox(-8.5F, -2.25F, 82.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        rightringfingersection8 = new ModelRenderer(this);
        rightringfingersection8.setPos(-2.7115F, -2.9755F, 1.5264F);
        righthand2.addChild(rightringfingersection8);
        rightringfingersection8.texOffs(80, 336).addBox(-10.0F, -2.75F, 82.0F, 4.0F, 3.0F, 2.0F, 0.02F, false);

        rightringfingersection7 = new ModelRenderer(this);
        rightringfingersection7.setPos(-0.8083F, -2.7732F, 0.0013F);
        rightringfingersection8.addChild(rightringfingersection7);
        rightringfingersection7.texOffs(236, 372).addBox(-9.0F, -2.25F, 82.0F, 2.0F, 4.0F, 2.0F, 0.01F, false);

        rightringfingersection6 = new ModelRenderer(this);
        rightringfingersection6.setPos(0.0074F, -2.4571F, 0.0F);
        rightringfingersection7.addChild(rightringfingersection6);
        rightringfingersection6.texOffs(244, 372).addBox(-9.0F, -3.5F, 82.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        rightringfingersection5 = new ModelRenderer(this);
        rightringfingersection5.setPos(0.3956F, -3.5959F, -0.0026F);
        rightringfingersection6.addChild(rightringfingersection5);
        rightringfingersection5.texOffs(306, 379).addBox(-8.5F, -2.25F, 82.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        rightpinkyfingersection8 = new ModelRenderer(this);
        rightpinkyfingersection8.setPos(-2.7115F, -2.3505F, 3.3389F);
        righthand2.addChild(rightpinkyfingersection8);
        rightpinkyfingersection8.texOffs(106, 295).addBox(-10.0F, -2.75F, 82.0F, 4.0F, 4.0F, 2.0F, 0.02F, false);

        rightpinkyfingersection7 = new ModelRenderer(this);
        rightpinkyfingersection7.setPos(-0.8083F, -2.7732F, 0.0013F);
        rightpinkyfingersection8.addChild(rightpinkyfingersection7);
        rightpinkyfingersection7.texOffs(252, 372).addBox(-9.0F, -2.25F, 82.0F, 2.0F, 4.0F, 2.0F, 0.01F, false);

        rightpinkyfingersection6 = new ModelRenderer(this);
        rightpinkyfingersection6.setPos(0.0074F, -2.4571F, 0.0F);
        rightpinkyfingersection7.addChild(rightpinkyfingersection6);
        rightpinkyfingersection6.texOffs(294, 379).addBox(-9.0F, -3.5F, 82.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        rightpinkyfingersection5 = new ModelRenderer(this);
        rightpinkyfingersection5.setPos(0.3956F, -3.5959F, -0.0026F);
        rightpinkyfingersection6.addChild(rightpinkyfingersection5);
        rightpinkyfingersection5.texOffs(310, 379).addBox(-8.5F, -2.25F, 82.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        bodysection4 = new ModelRenderer(this);
        bodysection4.setPos(-0.2334F, 0, 26F);
        bodysection3.addChild(bodysection4);
        bodysection4.texOffs(0, 218).addBox(-9.7261F, -10.2568F, -0.247F, 20.0F, 23.0F, 40.0F, 0.0F, false);
        bodysection4.texOffs(344, 0).addBox(0.3325F, -27.2568F, -0.247F, 0.0F, 17.0F, 40.0F, 0.0F, false);

        bodysection5 = new ModelRenderer(this);
        bodysection5.setPos(-0.2334F, 0, 39F);
        bodysection4.addChild(bodysection5);
        bodysection5.texOffs(240, 215).addBox(-9.7261F, -11.2568F, -0.247F, 20.0F, 22.0F, 28.0F, 0.0F, false);
        bodysection5.texOffs(294, 408).addBox(0.3325F, -28.2568F, -0.247F, 0.0F, 17.0F, 28.0F, 0.0F, false);

        bodysection6 = new ModelRenderer(this);
        bodysection6.setPos(-0.2334F, 0, 26F);
        bodysection5.addChild(bodysection6);
        bodysection6.texOffs(120, 63).addBox(-9.7261F, -11.2568F, 0.753F, 20.0F, 23.0F, 40.0F, 0.0F, false);
        bodysection6.texOffs(264, 322).addBox(0.3325F, -28.2568F, 0.753F, 0.0F, 17.0F, 40.0F, 0.0F, false);

        bodysection7 = new ModelRenderer(this);
        bodysection7.setPos(0F, 0F, 37F);
        bodysection6.addChild(bodysection7);
        bodysection7.texOffs(240, 165).addBox(-10.1261F, -10.2568F, 0.753F, 20.0F, 22.0F, 28.0F, 0.0F, false);
        bodysection7.texOffs(66, 399).addBox(-0.0675F, -27.2568F, 0.753F, 0.0F, 17.0F, 28.0F, 0.0F, false);

        bodysection8 = new ModelRenderer(this);
        bodysection8.setPos(-0.2334F, 0, 31F);
        bodysection7.addChild(bodysection8);
        bodysection8.texOffs(0, 92).addBox(-9.7261F, -10.2568F, -0.247F, 20.0F, 23.0F, 40.0F, 0.0F, false);
        bodysection8.texOffs(312, 265).addBox(0.3325F, -27.2568F, -0.247F, 0.0F, 17.0F, 40.0F, 0.0F, false);

        bodysection9 = new ModelRenderer(this);
        bodysection9.setPos(0F, 0, 32F);
        bodysection8.addChild(bodysection9);
        bodysection9.texOffs(110, 0).addBox(-9.7261F, -11.2568F, -1.247F, 20.0F, 23.0F, 40.0F, 0.0F, false);
        bodysection9.texOffs(184, 315).addBox(0.3325F, -28.2568F, -1.247F, 0.0F, 17.0F, 40.0F, 0.0F, false);

        bodysection10 = new ModelRenderer(this);
        bodysection10.setPos(-0.2334F, 0, 37F);
        bodysection9.addChild(bodysection10);
        bodysection10.texOffs(120, 252).addBox(-9.7261F, -11.2568F, 0.753F, 20.0F, 22.0F, 28.0F, 0.0F, false);
        bodysection10.texOffs(350, 408).addBox(0.3325F, -28.2568F, 0.753F, 0.0F, 17.0F, 28.0F, 0.0F, false);

        bodysection11 = new ModelRenderer(this);
        bodysection11.setPos(-0.2334F, 0F, 28F);
        bodysection10.addChild(bodysection11);
        bodysection11.texOffs(120, 126).addBox(-9.7261F, -12.2568F, -0.247F, 20.0F, 23.0F, 40.0F, 0.0F, false);
        bodysection11.texOffs(0, 331).addBox(0.3325F, -29.2568F, -0.247F, 0.0F, 17.0F, 40.0F, 0.0F, false);

        bodysection12 = new ModelRenderer(this);
        bodysection12.setPos(-0.2334F, 0, 39F);
        bodysection11.addChild(bodysection12);
        bodysection12.texOffs(120, 189).addBox(-9.7261F, -10.2568F, -0.247F, 20.0F, 23.0F, 40.0F, 0.0F, false);
        bodysection12.texOffs(342, 60).addBox(0.3325F, -27.2568F, -0.247F, 0.0F, 17.0F, 40.0F, 0.0F, false);

        bodysection13 = new ModelRenderer(this);
        bodysection13.setPos(-0.2334F, 0, 37F);
        bodysection12.addChild(bodysection13);
        bodysection13.texOffs(216, 265).addBox(-9.7261F, -11.2568F, 0.753F, 20.0F, 22.0F, 28.0F, 0.0F, false);
        bodysection13.texOffs(406, 408).addBox(0.3325F, -28.2568F, 0.753F, 0.0F, 17.0F, 28.0F, 0.0F, false);

        bodysection14 = new ModelRenderer(this);
        bodysection14.setPos(-0.2334F, 0, 27F);
        bodysection13.addChild(bodysection14);
        bodysection14.texOffs(0, 155).addBox(-9.7261F, -11.2568F, 0.753F, 20.0F, 23.0F, 40.0F, 0.0F, false);
        bodysection14.texOffs(336, 165).addBox(0.3325F, -28.2568F, 0.753F, 0.0F, 17.0F, 40.0F, 0.0F, false);

        bodysections15 = new ModelRenderer[34];
        for (int i = 0; i < bodysections15.length; i++) {
            ModelRenderer bodysection15 = new ModelRenderer(this);
            bodysection15.setPos(-0.2334F, 0, 40F);
            if (i == 0) {
                bodysection14.addChild(bodysection15);
            } else {
                bodysections15[i - 1].addChild(bodysection15);
            }
            bodysection15.texOffs(230, 0).addBox(-8.7261F, -10.2568F, -0.247F, 18.0F, 21.0F, 39.0F, 0.0F, false);
            bodysection15.texOffs(344, 322).addBox(0.2739F, -25.2568F, -0.247F, 0.0F, 15.0F, 39.0F, 0.0F, false);
            bodysections15[i] = bodysection15;
        }

        bodysection16 = new ModelRenderer(this);
        bodysection16.setPos(-0.2334F, 0, 38F);
        bodysections15[bodysections15.length - 1].addChild(bodysection16);
        bodysection16.texOffs(240, 60).addBox(-7.7261F, -9.2568F, -0.5F, 16.0F, 19.0F, 35.0F, 0.0F, false);
        bodysection16.texOffs(80, 350).addBox(0.2739F, -23.2568F, -0.5F, 0.0F, 14.0F, 35.0F, 0.0F, false);

        bodysection17 = new ModelRenderer(this);
        bodysection17.setPos(-0.2334F, 0, 34F);
        bodysection16.addChild(bodysection17);
        bodysection17.texOffs(0, 281).addBox(-6.7261F, -8.2568F, -0.247F, 14.0F, 17.0F, 33.0F, 0.0F, false);
        bodysection17.texOffs(228, 379).addBox(0.2739F, -20.2568F, -0.247F, 0.0F, 12.0F, 33.0F, 0.0F, false);

        bodysection18 = new ModelRenderer(this);
        bodysection18.setPos(-0.2334F, 0, 33F);
        bodysection17.addChild(bodysection18);
        bodysection18.texOffs(94, 302).addBox(-5.7261F, -7.2568F, -1.247F, 12.0F, 15.0F, 33.0F, 0.0F, false);
        bodysection18.texOffs(0, 388).addBox(0.2739F, -17.2568F, -1.247F, 0.0F, 10.0F, 33.0F, 0.0F, false);

        bodysection19 = new ModelRenderer(this);
        bodysection19.setPos(-0.2334F, 0, 32F);
        bodysection18.addChild(bodysection19);
        bodysection19.texOffs(340, 117).addBox(-4.7261F, -6.2568F, -1.247F, 10.0F, 13.0F, 33.0F, 0.0F, false);
        bodysection19.texOffs(392, 264).addBox(0.2739F, -14.2568F, -1.247F, 0.0F, 8.0F, 33.0F, 0.0F, false);
        bodysection19.texOffs(0, 0).addBox(0.3325F, -18.0877F, 31.0792F, 0.0F, 37.0F, 55.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setPos(-0.1655F, 25.3632F, 49.765F);
        head.texOffs(344, 376).addBox(-10.5F, -8.0F, -22.0F, 21.0F, 12.0F, 20.0F, 0.0F, false);

        downhead = new ModelRenderer(this);
        downhead.setPos(0.0F, 6.5265F, -4.7018F);
        head.addChild(downhead);
        setRotationAngle(downhead, -0.3927F, 0.0F, 0.0F);

        head_r1 = new ModelRenderer(this);
        head_r1.setPos(0.0F, -4.8989F, 0.0F);
        downhead.addChild(head_r1);
        setRotationAngle(head_r1, 0.3927F, 0.0F, 0.0F);
        head_r1.texOffs(122, 412).addBox(-10.5F, 0.0F, -15.0F, 21.0F, 4.0F, 16.0F, 0.0F, false);

        body = Lists.newArrayList(bodysection1, bodysection2, bodysection3, bodysection4, bodysection5,
                bodysection6, bodysection7, bodysection8, bodysection9, bodysection10,
                bodysection11, bodysection12, bodysection13, bodysection14);
        body.addAll(Arrays.asList(bodysections15));
        body.addAll(Lists.newArrayList(bodysection16, bodysection17, bodysection18, bodysection19));
    }

    public void renderFirstPersonArm(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v, float v1, float v2, float v3, HandSide handSide) {
    }

    public void renderFirstPersonLeg(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v, float v1, float v2, float v3, HandSide handSide) {
    }

    public void setupAnim(LivingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        if (Math.pow(entity.xo - entity.getX(), 2) + Math.pow(entity.zo - entity.getZ(), 2) > 0) {
            for (int i = 0; i < body.size(); i++) {
                body.get(i).yRot += (float) Math.sin(i - Math.toRadians(ageInTicks) * 3) / body.size() * i / 2;
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
            this.head.xRot -= (float) (Math.toRadians(70));
            this.downhead.xRot += (float) (Math.toRadians(140));
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
        matrixStack.scale(10, 10, 10);
        matrixStack.translate(0, -1.6, -2.4);
        this.head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        this.necksection1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        matrixStack.popPose();
    }
}
