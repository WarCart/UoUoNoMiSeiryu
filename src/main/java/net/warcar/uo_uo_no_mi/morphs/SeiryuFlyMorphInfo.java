package net.warcar.uo_uo_no_mi.morphs;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Pose;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.warcar.uo_uo_no_mi.UoUoMod;
import net.warcar.uo_uo_no_mi.init.UoAbilities;
import net.warcar.uo_uo_no_mi.models.SeiryuFlyModel;
import net.warcar.uo_uo_no_mi.models.SeiryuFlyMorphRenderer;
import xyz.pixelatedw.mineminenomi.api.morph.MorphInfo;
import xyz.pixelatedw.mineminenomi.api.morph.MorphModel;
import xyz.pixelatedw.mineminenomi.items.AkumaNoMiItem;

import javax.annotation.Nullable;
import java.util.Map;

public class SeiryuFlyMorphInfo extends MorphInfo {
    private static final EntitySize SIZE = EntitySize.scalable(10, 10);
    @Nullable
    @Override
    public AkumaNoMiItem getDevilFruit() {
        return UoAbilities.UO_UO_NO_MI_MODEL_SEIRYU;
    }

    public String getForm() {
        return "seiryu_fly";
    }

    @OnlyIn(Dist.CLIENT)
    public IRenderFactory getRendererFactory() {
        return new SeiryuFlyMorphRenderer.Factory<>();
    }

    @OnlyIn(Dist.CLIENT)
    public MorphModel getModel() {
        return new SeiryuFlyModel();
    }

    @Nullable
    @Override
    public ResourceLocation getTexture() {
        return new ResourceLocation(UoUoMod.MOD_ID, "textures/dragon_full.png");
    }

    public String getDisplayName() {
        return "Seiryu Fly Point";
    }

    public double getEyeHeight() {
        return 5.5;
    }

    public double getCameraZoom(LivingEntity entity) {
        return 20;
    }

    @Nullable
    @Override
    public Map<Pose, EntitySize> getSizes() {
        return new ImmutableMap.Builder<Pose, EntitySize>().put(Pose.STANDING, SIZE).put(Pose.CROUCHING, SIZE).build();
    }
}
