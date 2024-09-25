package net.warcar.uo_uo_no_mi.morphs;

import com.google.common.collect.ImmutableMap;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Pose;
import net.minecraft.util.HandSide;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.warcar.uo_uo_no_mi.UoUoMod;
import net.warcar.uo_uo_no_mi.init.UoAbilities;
import net.warcar.uo_uo_no_mi.models.NullMorphModel;
import net.warcar.uo_uo_no_mi.models.SeiryuHeavyModel;
import net.warcar.uo_uo_no_mi.models.SeiryuHeavyMorphRenderer;
import xyz.pixelatedw.mineminenomi.api.morph.MorphInfo;
import xyz.pixelatedw.mineminenomi.api.morph.MorphModel;
import xyz.pixelatedw.mineminenomi.items.AkumaNoMiItem;
import xyz.pixelatedw.mineminenomi.models.NullModel;

import javax.annotation.Nullable;
import java.util.Map;

public class SeiryuHeavyMorphInfo extends MorphInfo {
    private static final EntitySize STANDING_SIZE = EntitySize.scalable(2f, 3.8f);
    private static final EntitySize CROUCHING_SIZE = EntitySize.scalable(2f, 3.5f);

    @Nullable
    @Override
    public AkumaNoMiItem getDevilFruit() {
        return UoAbilities.UO_UO_NO_MI_MODEL_SEIRYU;
    }

    @Override
    public IRenderFactory getRendererFactory(LivingEntity entity) {
        return new SeiryuHeavyMorphRenderer.Factory<>();
    }

    public String getForm() {
        return "seiryu_heavy";
    }

    @OnlyIn(Dist.CLIENT)
    public MorphModel getModel() {
        return new SeiryuHeavyModel();
    }

    public String getDisplayName() {
        return "Seiryu Heavy Point";
    }

    @Nullable
    @Override
    public ResourceLocation getTexture(LivingEntity entity) {
        return new ResourceLocation(UoUoMod.MOD_ID, "textures/dragohybrid.png");
    }

    public double getEyeHeight() {
        return 3.5;
    }

    @Nullable
    @Override
    public Map<Pose, EntitySize> getSizes() {
        return new ImmutableMap.Builder<Pose, EntitySize>().put(Pose.STANDING, STANDING_SIZE).put(Pose.CROUCHING, CROUCHING_SIZE).build();
    }
}
