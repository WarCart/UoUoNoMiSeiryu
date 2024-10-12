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
    private final ModelRenderer bone2;
    private final ModelRenderer head_r1;
    private final ModelRenderer head_r2;
    private final ModelRenderer head_r3;
    private final ModelRenderer head_r4;
    private final ModelRenderer head_r5;
    private final ModelRenderer head_r6;
    private final ModelRenderer head_r7;
    private final ModelRenderer bone;
    private final ModelRenderer head_r8;
    private final ModelRenderer head_r9;
    private final ModelRenderer head_r10;
    private final ModelRenderer head_r11;
    private final ModelRenderer head_r12;
    private final ModelRenderer head_r13;
    private final ModelRenderer head_r14;
    private final ModelRenderer downhead;
    private final ModelRenderer bone3;
    private final ModelRenderer head_r15;
    private final ModelRenderer head_r16;
    private final ModelRenderer head_r17;
    private final ModelRenderer head_r18;
    private final ModelRenderer bone4;
    private final ModelRenderer head_r19;
    private final ModelRenderer head_r20;
    private final ModelRenderer head_r21;
    private final ModelRenderer head_r22;
    private final ModelRenderer[] bodysections15;
    private final List<ModelRenderer> body;

    public SeiryuFlyModel() {
        super(0);
        texWidth = 1024;
        texHeight = 1024;

        necksection1 = new ModelRenderer(this);
        necksection1.setPos(-0.1666F, 19.3429F, 0.901F);


        bodysection1 = new ModelRenderer(this);
        bodysection1.setPos(-0.2334F, 7.6571F, 49.099F);
        necksection1.addChild(bodysection1);
        bodysection1.texOffs(432, 450).addBox(0.2345F, -27.6368F, -7.235F, 0.0F, 15.0F, 25.0F, 0.0F, false);
        bodysection1.texOffs(240, 249).addBox(-13.2655F, -12.6368F, -7.235F, 27.0F, 24.0F, 25.0F, 0.0F, false);

        bodysection2 = new ModelRenderer(this);
        bodysection2.setPos(0.0F, 0.0F, 18.0F);
        bodysection1.addChild(bodysection2);
        bodysection2.texOffs(362, 57).addBox(-12.2655F, -12.6368F, -1.235F, 25.0F, 24.0F, 20.0F, 0.0F, false);
        bodysection2.texOffs(122, 453).addBox(0.2345F, -27.6368F, -1.235F, 0.0F, 15.0F, 20.0F, 0.0F, false);

        bodysection3 = new ModelRenderer(this);
        bodysection3.setPos(0.0F, 0.0F, 18.0F);
        bodysection2.addChild(bodysection3);
        bodysection3.texOffs(120, 252).addBox(-11.2655F, -12.6368F, -0.235F, 23.0F, 24.0F, 27.0F, 0.0F, false);
        bodysection3.texOffs(322, 440).addBox(0.3325F, -27.0818F, -0.2095F, 0.0F, 15.0F, 26.0F, 0.0F, false);

        leftarm2 = new ModelRenderer(this);
        leftarm2.setPos(14.5495F, -5.0201F, 11.6933F);
        bodysection3.addChild(leftarm2);
        leftarm2.texOffs(96, 280).addBox(-2.5F, -2.5F, -3.5F, 5.0F, 5.0F, 7.0F, 0.6F, false);

        upperleftarm2 = new ModelRenderer(this);
        upperleftarm2.setPos(2.5125F, 0.1245F, -0.0354F);
        leftarm2.addChild(upperleftarm2);
        setRotationAngle(upperleftarm2, 0.0F, 0.0F, 0.3927F);
        upperleftarm2.texOffs(248, 174).addBox(-1.0F, -2.5F, -3.5F, 26.0F, 5.0F, 7.0F, 0.02F, false);

        lowerleftarm2 = new ModelRenderer(this);
        lowerleftarm2.setPos(16.385F, 0.4134F, -82.8947F);
        upperleftarm2.addChild(lowerleftarm2);
        lowerleftarm2.texOffs(452, 90).addBox(4.6069F, -2.4588F, 79.37F, 20.0F, 4.0F, 7.0F, 0.02F, false);

        lefthand2 = new ModelRenderer(this);
        lefthand2.setPos(16.4105F, -1.3282F, 0.0265F);
        lowerleftarm2.addChild(lefthand2);
        lefthand2.texOffs(192, 303).addBox(6.9375F, -3.0625F, 79.0F, 5.0F, 6.0F, 8.0F, 0.02F, false);

        leftthumbsection8 = new ModelRenderer(this);
        leftthumbsection8.setPos(3.5447F, -1.0808F, -3.3107F);
        lefthand2.addChild(leftthumbsection8);
        leftthumbsection8.texOffs(220, 277).addBox(5.5F, -1.5F, 81.375F, 3.0F, 3.0F, 2.0F, 0.3F, false);

        leftthumbsection7 = new ModelRenderer(this);
        leftthumbsection7.setPos(1.5815F, 0.0865F, -0.4592F);
        leftthumbsection8.addChild(leftthumbsection7);
        leftthumbsection7.texOffs(220, 282).addBox(6.5F, -1.0F, 82.0F, 3.0F, 2.0F, 2.0F, 0.2F, false);

        leftthumbsection6 = new ModelRenderer(this);
        leftthumbsection6.setPos(2.3746F, -0.0149F, -0.0947F);
        leftthumbsection7.addChild(leftthumbsection6);
        leftthumbsection6.texOffs(120, 184).addBox(6.5F, -1.0F, 82.5F, 3.0F, 2.0F, 1.0F, 0.1F, false);

        leftthumbsection5 = new ModelRenderer(this);
        leftthumbsection5.setPos(2.3437F, 0.0F, -0.0163F);
        leftthumbsection6.addChild(leftthumbsection5);
        leftthumbsection5.texOffs(122, 65).addBox(6.75F, -0.5F, 82.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        leftpointfingersection8 = new ModelRenderer(this);
        leftpointfingersection8.setPos(2.7115F, -3.288F, -2.8486F);
        lefthand2.addChild(leftpointfingersection8);
        leftpointfingersection8.texOffs(110, 83).addBox(5.0F, -2.75F, 82.0F, 4.0F, 3.0F, 2.0F, 0.02F, false);

        leftpointfingersection7 = new ModelRenderer(this);
        leftpointfingersection7.setPos(0.8083F, -2.7732F, 0.0013F);
        leftpointfingersection8.addChild(leftpointfingersection7);
        leftpointfingersection7.texOffs(120, 154).addBox(6.0F, -2.25F, 82.0F, 2.0F, 4.0F, 2.0F, 0.01F, false);

        leftpointfingersection6 = new ModelRenderer(this);
        leftpointfingersection6.setPos(-0.0074F, -2.4571F, 0.0F);
        leftpointfingersection7.addChild(leftpointfingersection6);
        leftpointfingersection6.texOffs(120, 178).addBox(6.0F, -3.5F, 82.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        leftpointfingersection5 = new ModelRenderer(this);
        leftpointfingersection5.setPos(-0.3956F, -3.5959F, -0.0026F);
        leftpointfingersection6.addChild(leftpointfingersection5);
        leftpointfingersection5.texOffs(122, 67).addBox(6.5F, -2.25F, 82.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        leftmiddlefingersection8 = new ModelRenderer(this);
        leftmiddlefingersection8.setPos(2.7115F, -3.163F, -0.6611F);
        lefthand2.addChild(leftmiddlefingersection8);
        leftmiddlefingersection8.texOffs(220, 252).addBox(5.0F, -2.75F, 82.0F, 4.0F, 3.0F, 2.0F, 0.02F, false);

        leftmiddlefingersection7 = new ModelRenderer(this);
        leftmiddlefingersection7.setPos(0.8083F, -2.7732F, 0.0013F);
        leftmiddlefingersection8.addChild(leftmiddlefingersection7);
        leftmiddlefingersection7.texOffs(120, 160).addBox(6.0F, -2.25F, 82.0F, 2.0F, 4.0F, 2.0F, 0.01F, false);

        leftmiddlefingersection6 = new ModelRenderer(this);
        leftmiddlefingersection6.setPos(-0.0074F, -2.4571F, 0.0F);
        leftmiddlefingersection7.addChild(leftmiddlefingersection6);
        leftmiddlefingersection6.texOffs(232, 252).addBox(6.0F, -3.5F, 82.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        leftmiddlefingersection5 = new ModelRenderer(this);
        leftmiddlefingersection5.setPos(-0.3956F, -3.5959F, -0.0026F);
        leftmiddlefingersection6.addChild(leftmiddlefingersection5);
        leftmiddlefingersection5.texOffs(122, 73).addBox(6.5F, -2.25F, 82.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        leftringfingersection8 = new ModelRenderer(this);
        leftringfingersection8.setPos(2.7115F, -2.9755F, 1.5264F);
        lefthand2.addChild(leftringfingersection8);
        leftringfingersection8.texOffs(220, 257).addBox(5.0F, -2.75F, 82.0F, 4.0F, 3.0F, 2.0F, 0.02F, false);

        leftringfingersection7 = new ModelRenderer(this);
        leftringfingersection7.setPos(0.8083F, -2.7732F, 0.0013F);
        leftringfingersection8.addChild(leftringfingersection7);
        leftringfingersection7.texOffs(120, 166).addBox(6.0F, -2.25F, 82.0F, 2.0F, 4.0F, 2.0F, 0.01F, false);

        leftringfingersection6 = new ModelRenderer(this);
        leftringfingersection6.setPos(-0.0074F, -2.4571F, 0.0F);
        leftringfingersection7.addChild(leftringfingersection6);
        leftringfingersection6.texOffs(232, 258).addBox(6.0F, -3.5F, 82.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        leftringfingersection5 = new ModelRenderer(this);
        leftringfingersection5.setPos(-0.3956F, -3.5959F, -0.0026F);
        leftringfingersection6.addChild(leftringfingersection5);
        leftringfingersection5.texOffs(122, 83).addBox(6.5F, -2.25F, 82.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        leftpinkyfingersection8 = new ModelRenderer(this);
        leftpinkyfingersection8.setPos(2.7115F, -2.3505F, 3.3389F);
        lefthand2.addChild(leftpinkyfingersection8);
        leftpinkyfingersection8.texOffs(110, 65).addBox(5.0F, -2.75F, 82.0F, 4.0F, 4.0F, 2.0F, 0.02F, false);

        leftpinkyfingersection7 = new ModelRenderer(this);
        leftpinkyfingersection7.setPos(0.8083F, -2.7732F, 0.0013F);
        leftpinkyfingersection8.addChild(leftpinkyfingersection7);
        leftpinkyfingersection7.texOffs(120, 172).addBox(6.0F, -2.25F, 82.0F, 2.0F, 4.0F, 2.0F, 0.01F, false);

        leftpinkyfingersection6 = new ModelRenderer(this);
        leftpinkyfingersection6.setPos(-0.0074F, -2.4571F, 0.0F);
        leftpinkyfingersection7.addChild(leftpinkyfingersection6);
        leftpinkyfingersection6.texOffs(232, 264).addBox(6.0F, -3.5F, 82.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        leftpinkyfingersection5 = new ModelRenderer(this);
        leftpinkyfingersection5.setPos(-0.3956F, -3.5959F, -0.0026F);
        leftpinkyfingersection6.addChild(leftpinkyfingersection5);
        leftpinkyfingersection5.texOffs(124, 87).addBox(6.5F, -2.25F, 82.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        rightarm2 = new ModelRenderer(this);
        rightarm2.setPos(-14.7495F, -5.0201F, 11.6933F);
        bodysection3.addChild(rightarm2);
        rightarm2.texOffs(192, 317).addBox(-2.5F, -2.5F, -3.5F, 5.0F, 5.0F, 7.0F, 0.6F, false);

        upperrightarm2 = new ModelRenderer(this);
        upperrightarm2.setPos(-0.5125F, 0.1245F, -0.0354F);
        rightarm2.addChild(upperrightarm2);
        setRotationAngle(upperrightarm2, 0.0F, 0.0F, -0.3927F);
        upperrightarm2.texOffs(354, 234).addBox(-27.0F, -2.5F, -3.5F, 26.0F, 5.0F, 7.0F, 0.02F, false);

        lowerrightarm2 = new ModelRenderer(this);
        lowerrightarm2.setPos(-17.385F, 0.4134F, -82.8947F);
        upperrightarm2.addChild(lowerrightarm2);
        lowerrightarm2.texOffs(470, 428).addBox(-25.6069F, -2.4588F, 79.37F, 20.0F, 4.0F, 7.0F, 0.02F, false);

        righthand2 = new ModelRenderer(this);
        righthand2.setPos(-16.4105F, -1.3282F, 0.0265F);
        lowerrightarm2.addChild(righthand2);
        righthand2.texOffs(314, 174).addBox(-12.9375F, -3.0625F, 79.0F, 5.0F, 6.0F, 8.0F, 0.02F, false);

        rightthumbsection7 = new ModelRenderer(this);
        rightthumbsection7.setPos(-3.5447F, -1.0808F, -3.3107F);
        righthand2.addChild(rightthumbsection7);
        rightthumbsection7.texOffs(230, 277).addBox(-9.5F, -1.5F, 81.375F, 3.0F, 3.0F, 2.0F, 0.3F, false);

        rightthumbsection6 = new ModelRenderer(this);
        rightthumbsection6.setPos(-1.5815F, 0.0865F, -0.4592F);
        rightthumbsection7.addChild(rightthumbsection6);
        rightthumbsection6.texOffs(230, 282).addBox(-10.5F, -1.0F, 82.0F, 3.0F, 2.0F, 2.0F, 0.2F, false);

        rightthumbsection5 = new ModelRenderer(this);
        rightthumbsection5.setPos(-2.3746F, -0.0149F, -0.0947F);
        rightthumbsection6.addChild(rightthumbsection5);
        rightthumbsection5.texOffs(106, 298).addBox(-10.5F, -1.0F, 82.5F, 3.0F, 2.0F, 1.0F, 0.1F, false);

        rightthumbsection2 = new ModelRenderer(this);
        rightthumbsection2.setPos(-2.3437F, 0.0F, -0.0163F);
        rightthumbsection5.addChild(rightthumbsection2);
        rightthumbsection2.texOffs(122, 77).addBox(-9.75F, -0.5F, 82.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        rightpointfingersection8 = new ModelRenderer(this);
        rightpointfingersection8.setPos(-2.7115F, -3.288F, -2.8486F);
        righthand2.addChild(rightpointfingersection8);
        rightpointfingersection8.texOffs(220, 262).addBox(-10.0F, -2.75F, 82.0F, 4.0F, 3.0F, 2.0F, 0.02F, false);

        rightpointfingersection7 = new ModelRenderer(this);
        rightpointfingersection7.setPos(-0.8083F, -2.7732F, 0.0013F);
        rightpointfingersection8.addChild(rightpointfingersection7);
        rightpointfingersection7.texOffs(232, 270).addBox(-9.0F, -2.25F, 82.0F, 2.0F, 4.0F, 2.0F, 0.01F, false);

        rightpointfingersection6 = new ModelRenderer(this);
        rightpointfingersection6.setPos(0.0074F, -2.4571F, 0.0F);
        rightpointfingersection7.addChild(rightpointfingersection6);
        rightpointfingersection6.texOffs(220, 286).addBox(-9.0F, -3.5F, 82.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        rightpointfingersection5 = new ModelRenderer(this);
        rightpointfingersection5.setPos(0.3956F, -3.5959F, -0.0026F);
        rightpointfingersection6.addChild(rightpointfingersection5);
        rightpointfingersection5.texOffs(236, 286).addBox(-8.5F, -2.25F, 82.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        rightmiddlefingersection8 = new ModelRenderer(this);
        rightmiddlefingersection8.setPos(-2.7115F, -3.163F, -0.6611F);
        righthand2.addChild(rightmiddlefingersection8);
        rightmiddlefingersection8.texOffs(220, 267).addBox(-10.0F, -2.75F, 82.0F, 4.0F, 3.0F, 2.0F, 0.02F, false);

        rightmiddlefingersection7 = new ModelRenderer(this);
        rightmiddlefingersection7.setPos(-0.8083F, -2.7732F, 0.0013F);
        rightmiddlefingersection8.addChild(rightmiddlefingersection7);
        rightmiddlefingersection7.texOffs(228, 286).addBox(-9.0F, -2.25F, 82.0F, 2.0F, 4.0F, 2.0F, 0.01F, false);

        rightmiddlefingersection6 = new ModelRenderer(this);
        rightmiddlefingersection6.setPos(0.0074F, -2.4571F, 0.0F);
        rightmiddlefingersection7.addChild(rightmiddlefingersection6);
        rightmiddlefingersection6.texOffs(96, 292).addBox(-9.0F, -3.5F, 82.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        rightmiddlefingersection5 = new ModelRenderer(this);
        rightmiddlefingersection5.setPos(0.3956F, -3.5959F, -0.0026F);
        rightmiddlefingersection6.addChild(rightmiddlefingersection5);
        rightmiddlefingersection5.texOffs(236, 290).addBox(-8.5F, -2.25F, 82.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        rightringfingersection8 = new ModelRenderer(this);
        rightringfingersection8.setPos(-2.7115F, -2.9755F, 1.5264F);
        righthand2.addChild(rightringfingersection8);
        rightringfingersection8.texOffs(220, 272).addBox(-10.0F, -2.75F, 82.0F, 4.0F, 3.0F, 2.0F, 0.02F, false);

        rightringfingersection7 = new ModelRenderer(this);
        rightringfingersection7.setPos(-0.8083F, -2.7732F, 0.0013F);
        rightringfingersection8.addChild(rightringfingersection7);
        rightringfingersection7.texOffs(104, 292).addBox(-9.0F, -2.25F, 82.0F, 2.0F, 4.0F, 2.0F, 0.01F, false);

        rightringfingersection6 = new ModelRenderer(this);
        rightringfingersection6.setPos(0.0074F, -2.4571F, 0.0F);
        rightringfingersection7.addChild(rightringfingersection6);
        rightringfingersection6.texOffs(112, 292).addBox(-9.0F, -3.5F, 82.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        rightringfingersection5 = new ModelRenderer(this);
        rightringfingersection5.setPos(0.3956F, -3.5959F, -0.0026F);
        rightringfingersection6.addChild(rightringfingersection5);
        rightringfingersection5.texOffs(236, 294).addBox(-8.5F, -2.25F, 82.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        rightpinkyfingersection8 = new ModelRenderer(this);
        rightpinkyfingersection8.setPos(-2.7115F, -2.3505F, 3.3389F);
        righthand2.addChild(rightpinkyfingersection8);
        rightpinkyfingersection8.texOffs(110, 73).addBox(-10.0F, -2.75F, 82.0F, 4.0F, 4.0F, 2.0F, 0.02F, false);

        rightpinkyfingersection7 = new ModelRenderer(this);
        rightpinkyfingersection7.setPos(-0.8083F, -2.7732F, 0.0013F);
        rightpinkyfingersection8.addChild(rightpinkyfingersection7);
        rightpinkyfingersection7.texOffs(220, 292).addBox(-9.0F, -2.25F, 82.0F, 2.0F, 4.0F, 2.0F, 0.01F, false);

        rightpinkyfingersection6 = new ModelRenderer(this);
        rightpinkyfingersection6.setPos(0.0074F, -2.4571F, 0.0F);
        rightpinkyfingersection7.addChild(rightpinkyfingersection6);
        rightpinkyfingersection6.texOffs(228, 292).addBox(-9.0F, -3.5F, 82.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        rightpinkyfingersection5 = new ModelRenderer(this);
        rightpinkyfingersection5.setPos(0.3956F, -3.5959F, -0.0026F);
        rightpinkyfingersection6.addChild(rightpinkyfingersection5);
        rightpinkyfingersection5.texOffs(216, 317).addBox(-8.5F, -2.25F, 82.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        bodysection4 = new ModelRenderer(this);
        bodysection4.setPos(0.0F, 0.0F, 26.0F);
        bodysection3.addChild(bodysection4);
        bodysection4.texOffs(230, 0).addBox(-9.7261F, -10.2568F, -0.247F, 20.0F, 23.0F, 40.0F, 0.0F, false);
        bodysection4.texOffs(354, 177).addBox(0.3325F, -27.2568F, -0.247F, 0.0F, 17.0F, 40.0F, 0.0F, false);

        bodysection5 = new ModelRenderer(this);
        bodysection5.setPos(0.0F, 0.0F, 39.0F);
        bodysection4.addChild(bodysection5);
        bodysection5.texOffs(220, 298).addBox(-9.7261F, -11.2568F, -0.247F, 20.0F, 22.0F, 28.0F, 0.0F, false);
        bodysection5.texOffs(430, 101).addBox(0.3325F, -28.2568F, -0.247F, 0.0F, 17.0F, 28.0F, 0.0F, false);

        bodysection6 = new ModelRenderer(this);
        bodysection6.setPos(0.0F, 0.0F, 26.0F);
        bodysection5.addChild(bodysection6);
        bodysection6.texOffs(128, 126).addBox(-9.7261F, -11.2568F, 0.753F, 20.0F, 23.0F, 40.0F, 0.0F, false);
        bodysection6.texOffs(350, 0).addBox(0.3325F, -28.2568F, 0.753F, 0.0F, 17.0F, 40.0F, 0.0F, false);

        bodysection7 = new ModelRenderer(this);
        bodysection7.setPos(0.0F, 0.0F, 40.0F);
        bodysection6.addChild(bodysection7);
        bodysection7.texOffs(110, 0).addBox(-9.7261F, -10.2568F, -0.247F, 20.0F, 23.0F, 40.0F, 0.0F, false);
        bodysection7.texOffs(192, 348).addBox(0.3325F, -27.2568F, -0.247F, 0.0F, 17.0F, 40.0F, 0.0F, false);

        bodysection8 = new ModelRenderer(this);
        bodysection8.setPos(0.0F, 0.0F, 39.0F);
        bodysection7.addChild(bodysection8);
        bodysection8.texOffs(0, 280).addBox(-9.7261F, -11.2568F, -1.247F, 20.0F, 22.0F, 28.0F, 0.0F, false);
        bodysection8.texOffs(430, 0).addBox(0.3325F, -28.2568F, -1.247F, 0.0F, 17.0F, 28.0F, 0.0F, false);

        bodysection9 = new ModelRenderer(this);
        bodysection9.setPos(0.0F, 0.0F, 27.0F);
        bodysection8.addChild(bodysection9);
        bodysection9.texOffs(128, 63).addBox(-9.7261F, -11.2568F, -1.247F, 20.0F, 23.0F, 40.0F, 0.0F, false);
        bodysection9.texOffs(272, 348).addBox(0.3325F, -28.2568F, -1.247F, 0.0F, 17.0F, 40.0F, 0.0F, false);

        bodysection10 = new ModelRenderer(this);
        bodysection10.setPos(0.0F, 0.0F, 37.0F);
        bodysection9.addChild(bodysection10);
        bodysection10.texOffs(96, 303).addBox(-9.7261F, -11.2568F, 0.753F, 20.0F, 22.0F, 28.0F, 0.0F, false);
        bodysection10.texOffs(432, 333).addBox(0.3325F, -28.2568F, 0.753F, 0.0F, 17.0F, 28.0F, 0.0F, false);

        bodysection11 = new ModelRenderer(this);
        bodysection11.setPos(0.0F, 1.0F, 28.0F);
        bodysection10.addChild(bodysection11);
        bodysection11.texOffs(0, 154).addBox(-9.7261F, -12.2568F, -0.247F, 20.0F, 23.0F, 40.0F, 0.0F, false);
        bodysection11.texOffs(350, 120).addBox(0.3325F, -29.2568F, -0.247F, 0.0F, 17.0F, 40.0F, 0.0F, false);

        bodysection12 = new ModelRenderer(this);
        bodysection12.setPos(0.0F, -1.0F, 39.0F);
        bodysection11.addChild(bodysection12);
        bodysection12.texOffs(0, 217).addBox(-9.7261F, -10.2568F, -0.247F, 20.0F, 23.0F, 40.0F, 0.0F, false);
        bodysection12.texOffs(94, 353).addBox(0.3325F, -27.2568F, -0.247F, 0.0F, 17.0F, 40.0F, 0.0F, false);

        bodysection13 = new ModelRenderer(this);
        bodysection13.setPos(0.0F, 0.0F, 37.0F);
        bodysection12.addChild(bodysection13);
        bodysection13.texOffs(316, 298).addBox(-9.7261F, -11.2568F, 0.753F, 20.0F, 22.0F, 28.0F, 0.0F, false);
        bodysection13.texOffs(434, 146).addBox(0.3325F, -28.2568F, 0.753F, 0.0F, 17.0F, 28.0F, 0.0F, false);

        bodysection14 = new ModelRenderer(this);
        bodysection14.setPos(0.0F, 0.0F, 27.0F);
        bodysection13.addChild(bodysection14);
        bodysection14.texOffs(120, 189).addBox(-9.7261F, -11.2568F, 0.753F, 20.0F, 23.0F, 40.0F, 0.0F, false);
        bodysection14.texOffs(352, 348).addBox(0.3325F, -28.2568F, 0.753F, 0.0F, 17.0F, 40.0F, 0.0F, false);

        bodysections15 = new ModelRenderer[42];
        for (int i = 0; i < bodysections15.length; i++) {
            ModelRenderer bodysection15 = new ModelRenderer(this);
            bodysection15.setPos(0.0F, 0.0F, 40.0F);
            if (i == 0) {
                bodysection14.addChild(bodysection15);
            } else {
                bodysections15[i - 1].addChild(bodysection15);
            }
            bodysection15.texOffs(240, 189).addBox(-8.7261F, -10.2568F, -0.247F, 18.0F, 21.0F, 39.0F, 0.0F, false);
            bodysection15.texOffs(174, 405).addBox(0.2739F, -25.2568F, -0.247F, 0.0F, 15.0F, 39.0F, 0.0F, false);
            bodysections15[i] = bodysection15;
        }

        bodysection16 = new ModelRenderer(this);
        bodysection16.setPos(0.0F, 0.0F, 38.253F);
        bodysections15[bodysections15.length - 1].addChild(bodysection16);
        bodysection16.texOffs(248, 120).addBox(-7.7261F, -9.2568F, -0.5F, 16.0F, 19.0F, 35.0F, 0.0F, false);
        bodysection16.texOffs(252, 405).addBox(0.2739F, -23.2568F, -0.5F, 0.0F, 14.0F, 35.0F, 0.0F, false);

        bodysection17 = new ModelRenderer(this);
        bodysection17.setPos(0.0F, 0.0F, 33.747F);
        bodysection16.addChild(bodysection17);
        bodysection17.texOffs(0, 330).addBox(-6.7261F, -8.2568F, -0.247F, 14.0F, 17.0F, 33.0F, 0.0F, false);
        bodysection17.texOffs(404, 405).addBox(0.2739F, -20.2568F, -0.247F, 0.0F, 12.0F, 33.0F, 0.0F, false);

        bodysection18 = new ModelRenderer(this);
        bodysection18.setPos(0.0F, 0.0F, 33.0F);
        bodysection17.addChild(bodysection18);
        bodysection18.texOffs(344, 249).addBox(-5.7261F, -7.2568F, -1.247F, 12.0F, 15.0F, 33.0F, 0.0F, false);
        bodysection18.texOffs(86, 410).addBox(0.2739F, -17.2568F, -1.247F, 0.0F, 10.0F, 33.0F, 0.0F, false);

        bodysection19 = new ModelRenderer(this);
        bodysection19.setPos(0.0F, 0.0F, 32.0F);
        bodysection18.addChild(bodysection19);
        bodysection19.texOffs(0, 380).addBox(-4.7261F, -6.2568F, -1.247F, 10.0F, 13.0F, 33.0F, 0.0F, false);
        bodysection19.texOffs(0, 426).addBox(0.2739F, -14.2568F, -1.247F, 0.0F, 8.0F, 33.0F, 0.0F, false);
        bodysection19.texOffs(0, 0).addBox(0.3325F, -18.0877F, 31.0792F, 0.0F, 37.0F, 55.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setPos(-0.1655F, 25.3632F, 45.765F);
        head.texOffs(248, 63).addBox(-16.0F, -14.0F, -28.0F, 32.0F, 32.0F, 25.0F, 0.0F, false);
        head.texOffs(412, 297).addBox(-15.0F, -13.0F, -34.0F, 30.0F, 30.0F, 6.0F, 0.0F, false);
        head.texOffs(0, 92).addBox(-32.0F, -29.0F, -3.0F, 64.0F, 62.0F, 0.0F, 0.0F, false);

        uphead = new ModelRenderer(this);
        uphead.setPos(0.1655F, -0.3632F, -96.765F);
        head.addChild(uphead);
        uphead.texOffs(432, 378).addBox(-7.1655F, -2.6368F, 30.765F, 14.0F, 10.0F, 16.0F, 0.0F, false);
        uphead.texOffs(66, 453).addBox(-9.1655F, -5.6368F, 46.765F, 18.0F, 13.0F, 10.0F, 0.0F, false);
        uphead.texOffs(452, 45).addBox(-12.1655F, -8.6368F, 56.765F, 24.0F, 16.0F, 6.0F, 0.0F, false);
        uphead.texOffs(452, 67).addBox(-8.6655F, -4.6368F, 19.765F, 17.0F, 12.0F, 11.0F, 0.0F, false);
        uphead.texOffs(302, 186).addBox(5.3345F, 7.3632F, 20.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(204, 329).addBox(5.3345F, 7.3632F, 23.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(208, 329).addBox(5.3345F, 7.3632F, 29.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(200, 338).addBox(5.3345F, 7.3632F, 26.015F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        uphead.texOffs(204, 338).addBox(5.3345F, 7.3632F, 35.015F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        uphead.texOffs(212, 329).addBox(5.3345F, 7.3632F, 32.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(208, 338).addBox(5.3345F, 7.3632F, 41.015F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        uphead.texOffs(216, 329).addBox(5.3345F, 7.3632F, 38.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(200, 332).addBox(5.3345F, 7.3632F, 44.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(204, 332).addBox(6.3345F, 7.3632F, 53.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(216, 321).addBox(6.3345F, 7.3632F, 59.015F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        uphead.texOffs(200, 335).addBox(-6.6655F, 7.3632F, 23.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(216, 325).addBox(-7.6655F, 7.3632F, 59.015F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        uphead.texOffs(340, 174).addBox(6.3345F, 7.3632F, 58.015F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        uphead.texOffs(196, 339).addBox(-7.6655F, 7.3632F, 58.015F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        uphead.texOffs(196, 333).addBox(-7.6655F, 7.3632F, 53.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(340, 178).addBox(6.3345F, 7.3632F, 49.015F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        uphead.texOffs(340, 176).addBox(-7.6655F, 7.3632F, 49.015F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        uphead.texOffs(192, 333).addBox(-6.6655F, 7.3632F, 44.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(216, 332).addBox(-6.6655F, 7.3632F, 38.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(212, 332).addBox(-6.6655F, 7.3632F, 32.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(208, 332).addBox(-6.6655F, 7.3632F, 29.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(192, 339).addBox(-6.6655F, 7.3632F, 26.015F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        uphead.texOffs(216, 338).addBox(-6.6655F, 7.3632F, 35.015F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        uphead.texOffs(212, 338).addBox(-6.6655F, 7.3632F, 41.015F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        uphead.texOffs(306, 186).addBox(-6.6655F, 7.3632F, 20.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(310, 186).addBox(-3.6655F, 6.6132F, 20.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        uphead.texOffs(200, 329).addBox(1.3345F, 7.3632F, 20.015F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        bone2 = new ModelRenderer(this);
        bone2.setPos(-7.8345F, 0.6368F, -65.765F);
        head.addChild(bone2);
        setRotationAngle(bone2, 0.0F, 0.0F, -0.3927F);
        bone2.texOffs(282, 186).addBox(-4.0328F, -1.5607F, -10.235F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        head_r1 = new ModelRenderer(this);
        head_r1.setPos(-19.5278F, -0.1368F, 18.577F);
        bone2.addChild(head_r1);
        setRotationAngle(head_r1, 0.0F, 0.3927F, 0.0F);
        head_r1.texOffs(110, 90).addBox(-3.7023F, -1.4239F, -8.6685F, 6.0F, 1.0F, 1.0F, 0.0F, false);

        head_r2 = new ModelRenderer(this);
        head_r2.setPos(-17.1868F, -0.1368F, 15.3704F);
        bone2.addChild(head_r2);
        setRotationAngle(head_r2, 0.0F, 0.7854F, 0.0F);
        head_r2.texOffs(292, 186).addBox(1.1346F, -1.4239F, -6.5934F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        head_r3 = new ModelRenderer(this);
        head_r3.setPos(-16.6337F, -0.1368F, 12.4358F);
        bone2.addChild(head_r3);
        setRotationAngle(head_r3, 0.0F, 1.1781F, 0.0F);
        head_r3.texOffs(104, 301).addBox(3.9614F, -1.4239F, -3.5906F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        head_r4 = new ModelRenderer(this);
        head_r4.setPos(-17.2458F, -0.1368F, 9.5129F);
        bone2.addChild(head_r4);
        setRotationAngle(head_r4, 0.0F, 1.5708F, 0.0F);
        head_r4.texOffs(112, 301).addBox(4.5F, -1.4239F, -0.1173F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        head_r5 = new ModelRenderer(this);
        head_r5.setPos(-16.7099F, -0.1368F, 9.8185F);
        bone2.addChild(head_r5);
        setRotationAngle(head_r5, 0.0F, 1.1781F, 0.0F);
        head_r5.texOffs(260, 186).addBox(6.9614F, -1.4239F, -3.5906F, 5.0F, 1.0F, 1.0F, 0.0F, false);

        head_r6 = new ModelRenderer(this);
        head_r6.setPos(-13.004F, -0.1368F, 4.2722F);
        bone2.addChild(head_r6);
        setRotationAngle(head_r6, 0.0F, 0.7854F, 0.0F);
        head_r6.texOffs(110, 79).addBox(3.1346F, -1.4239F, -6.5934F, 7.0F, 1.0F, 1.0F, 0.0F, false);

        head_r7 = new ModelRenderer(this);
        head_r7.setPos(-7.4577F, -0.1368F, 0.5663F);
        bone2.addChild(head_r7);
        setRotationAngle(head_r7, 0.0F, 0.3927F, 0.0F);
        head_r7.texOffs(110, 71).addBox(0.2977F, -1.4239F, -8.6685F, 7.0F, 1.0F, 1.0F, 0.0F, false);

        bone = new ModelRenderer(this);
        bone.setPos(8.1655F, 0.6368F, -65.765F);
        head.addChild(bone);
        setRotationAngle(bone, 0.0F, 0.0F, 0.3927F);
        bone.texOffs(272, 186).addBox(-0.2982F, -1.5607F, -10.235F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        head_r8 = new ModelRenderer(this);
        head_r8.setPos(16.9148F, -0.1368F, 13.0129F);
        bone.addChild(head_r8);
        setRotationAngle(head_r8, 0.0F, -1.5708F, 0.0F);
        head_r8.texOffs(120, 187).addBox(-11.0F, -1.4239F, -0.1173F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        head_r9 = new ModelRenderer(this);
        head_r9.setPos(19.3306F, -0.1368F, 17.8452F);
        bone.addChild(head_r9);
        setRotationAngle(head_r9, 0.0F, -0.7854F, 0.0F);
        head_r9.texOffs(96, 298).addBox(-8.6346F, -1.4239F, -6.5934F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        head_r10 = new ModelRenderer(this);
        head_r10.setPos(22.4304F, -0.1368F, 19.9164F);
        bone.addChild(head_r10);
        setRotationAngle(head_r10, 0.0F, -0.3927F, 0.0F);
        head_r10.texOffs(110, 88).addBox(-5.7977F, -1.4239F, -8.6685F, 6.0F, 1.0F, 1.0F, 0.0F, false);

        head_r11 = new ModelRenderer(this);
        head_r11.setPos(17.6421F, -0.1368F, 15.6693F);
        bone.addChild(head_r11);
        setRotationAngle(head_r11, 0.0F, -1.1781F, 0.0F);
        head_r11.texOffs(96, 300).addBox(-10.4614F, -1.4239F, -3.5906F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        head_r12 = new ModelRenderer(this);
        head_r12.setPos(15.8048F, -0.1368F, 8.4326F);
        bone.addChild(head_r12);
        setRotationAngle(head_r12, 0.0F, -1.1781F, 0.0F);
        head_r12.texOffs(248, 186).addBox(-10.4614F, -1.4239F, -3.5906F, 5.0F, 1.0F, 1.0F, 0.0F, false);

        head_r13 = new ModelRenderer(this);
        head_r13.setPos(11.6123F, -0.1368F, 3.2116F);
        bone.addChild(head_r13);
        setRotationAngle(head_r13, 0.0F, -0.7854F, 0.0F);
        head_r13.texOffs(110, 81).addBox(-8.6346F, -1.4239F, -6.5934F, 7.0F, 1.0F, 1.0F, 0.0F, false);

        head_r14 = new ModelRenderer(this);
        head_r14.setPos(5.7409F, -0.1368F, -0.0077F);
        bone.addChild(head_r14);
        setRotationAngle(head_r14, 0.0F, -0.3927F, 0.0F);
        head_r14.texOffs(110, 63).addBox(-5.7977F, -1.4239F, -8.6685F, 7.0F, 1.0F, 1.0F, 0.0F, false);

        downhead = new ModelRenderer(this);
        downhead.setPos(0.1655F, 6.6368F, -40.765F);
        head.addChild(downhead);
        setRotationAngle(downhead, 0.3927F, 0.0F, 0.0F);
        downhead.texOffs(322, 405).addBox(-7.1655F, 1.3632F, -36.235F, 14.0F, 8.0F, 27.0F, 0.0F, false);
        downhead.texOffs(114, 298).addBox(-1.1655F, 0.3632F, -35.235F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(204, 335).addBox(1.8345F, -0.6368F, -35.235F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        downhead.texOffs(192, 329).addBox(3.8345F, -1.6368F, -34.235F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        downhead.texOffs(340, 180).addBox(4.8345F, 0.3632F, -32.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(340, 182).addBox(4.8345F, 0.3632F, -30.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(340, 186).addBox(4.8345F, 0.3632F, -26.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(340, 184).addBox(4.8345F, 0.3632F, -28.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(204, 340).addBox(4.8345F, 0.3632F, -22.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(200, 340).addBox(4.8345F, 0.3632F, -24.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(212, 340).addBox(4.8345F, 0.3632F, -18.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(208, 340).addBox(4.8345F, 0.3632F, -20.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(192, 341).addBox(4.8345F, 0.3632F, -14.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(216, 340).addBox(4.8345F, 0.3632F, -16.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(200, 342).addBox(4.8345F, 0.3632F, -10.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(196, 341).addBox(4.8345F, 0.3632F, -12.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(344, 184).addBox(-6.1655F, 0.3632F, -10.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(216, 335).addBox(4.8345F, -0.6368F, -2.235F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        downhead.texOffs(212, 335).addBox(-6.1655F, -0.6368F, -2.235F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        downhead.texOffs(200, 344).addBox(4.8345F, 0.3632F, -3.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(344, 186).addBox(-6.1655F, 0.3632F, -3.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(196, 336).addBox(4.8345F, -0.6368F, -6.235F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        downhead.texOffs(192, 336).addBox(-6.1655F, -0.6368F, -6.235F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        downhead.texOffs(344, 182).addBox(-6.1655F, 0.3632F, -12.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(344, 180).addBox(-6.1655F, 0.3632F, -14.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(344, 178).addBox(-6.1655F, 0.3632F, -16.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(344, 176).addBox(-6.1655F, 0.3632F, -18.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(344, 174).addBox(-6.1655F, 0.3632F, -20.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(196, 343).addBox(-6.1655F, 0.3632F, -22.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(192, 343).addBox(-6.1655F, 0.3632F, -24.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(216, 342).addBox(-6.1655F, 0.3632F, -26.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(212, 342).addBox(-6.1655F, 0.3632F, -28.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(208, 342).addBox(-6.1655F, 0.3632F, -30.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(204, 342).addBox(-6.1655F, 0.3632F, -32.235F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        downhead.texOffs(196, 329).addBox(-5.1655F, -1.6368F, -34.235F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        downhead.texOffs(208, 335).addBox(-3.1655F, -0.6368F, -35.235F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        downhead.texOffs(362, 101).addBox(-9.1655F, 1.3632F, -9.235F, 18.0F, 8.0F, 10.0F, 0.0F, false);
        downhead.texOffs(252, 454).addBox(-11.1655F, 1.3632F, 0.765F, 22.0F, 8.0F, 6.0F, 0.0F, false);

        bone3 = new ModelRenderer(this);
        bone3.setPos(-4.1845F, -12.3632F, -6.515F);
        head.addChild(bone3);
        setRotationAngle(bone3, 0.4363F, -0.3491F, -0.1571F);
        bone3.texOffs(434, 191).addBox(-15.0655F, -7.6368F, -12.235F, 8.0F, 8.0F, 25.0F, 0.0F, false);

        head_r15 = new ModelRenderer(this);
        head_r15.setPos(-9.6583F, -7.4717F, 48.9208F);
        bone3.addChild(head_r15);
        setRotationAngle(head_r15, 0.1886F, -0.3864F, -0.0718F);
        head_r15.texOffs(42, 476).addBox(-2.5F, -4.0F, -8.0F, 5.0F, 8.0F, 16.0F, 0.0F, false);

        head_r16 = new ModelRenderer(this);
        head_r16.setPos(-6.7871F, -4.9652F, 34.7058F);
        bone3.addChild(head_r16);
        setRotationAngle(head_r16, 0.1745F, 0.0F, 0.0F);
        head_r16.texOffs(204, 459).addBox(-2.5F, -4.0F, -8.0F, 5.0F, 8.0F, 16.0F, 0.0F, false);

        head_r17 = new ModelRenderer(this);
        head_r17.setPos(1.6647F, -17.0F, 16.5568F);
        bone3.addChild(head_r17);
        setRotationAngle(head_r17, 0.0F, 0.1745F, 0.0F);
        head_r17.texOffs(162, 459).addBox(-12.7655F, 9.3632F, -6.235F, 5.0F, 8.0F, 16.0F, 0.0F, false);

        head_r18 = new ModelRenderer(this);
        head_r18.setPos(-18.0013F, -3.6368F, 23.3289F);
        bone3.addChild(head_r18);
        setRotationAngle(head_r18, 0.0F, -0.3927F, 0.0F);
        head_r18.texOffs(374, 450).addBox(-2.0F, -4.0F, -12.5F, 4.0F, 8.0F, 25.0F, 0.0F, false);

        bone4 = new ModelRenderer(this);
        bone4.setPos(-4.1845F, -12.3632F, -6.515F);
        head.addChild(bone4);
        setRotationAngle(bone4, 0.4363F, 0.3491F, 0.1571F);
        bone4.texOffs(434, 224).addBox(15.4345F, -7.6368F, -12.235F, 8.0F, 8.0F, 25.0F, 0.0F, false);

        head_r19 = new ModelRenderer(this);
        head_r19.setPos(32.9949F, -17.0F, 13.8037F);
        bone4.addChild(head_r19);
        setRotationAngle(head_r19, 0.0F, 0.3927F, 0.0F);
        head_r19.texOffs(434, 257).addBox(-11.7655F, 9.3632F, -6.235F, 4.0F, 8.0F, 25.0F, 0.0F, false);

        head_r20 = new ModelRenderer(this);
        head_r20.setPos(29.8778F, -17.0F, 20.6429F);
        bone4.addChild(head_r20);
        setRotationAngle(head_r20, 0.0F, -0.1745F, 0.0F);
        head_r20.texOffs(246, 468).addBox(-15.7655F, 9.3632F, -6.235F, 5.0F, 8.0F, 16.0F, 0.0F, false);

        head_r21 = new ModelRenderer(this);
        head_r21.setPos(29.6076F, -19.4672F, 39.9951F);
        bone4.addChild(head_r21);
        setRotationAngle(head_r21, 0.1886F, 0.3864F, 0.0718F);
        head_r21.texOffs(470, 404).addBox(-15.7655F, 9.3632F, -6.235F, 5.0F, 8.0F, 16.0F, 0.0F, false);

        head_r22 = new ModelRenderer(this);
        head_r22.setPos(28.4216F, -17.8189F, 30.6471F);
        bone4.addChild(head_r22);
        setRotationAngle(head_r22, 0.1745F, 0.0F, 0.0F);
        head_r22.texOffs(0, 467).addBox(-15.7655F, 9.3632F, -6.235F, 5.0F, 8.0F, 16.0F, 0.0F, false);
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
        matrixStack.scale(10, 10, 10);
        matrixStack.translate(0, -1.6, -2.4);
        this.head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        this.necksection1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        matrixStack.popPose();
    }
}
