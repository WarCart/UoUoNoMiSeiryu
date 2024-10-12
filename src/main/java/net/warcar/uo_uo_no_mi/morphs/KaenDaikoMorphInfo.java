package net.warcar.uo_uo_no_mi.morphs;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Pose;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.warcar.uo_uo_no_mi.init.UoAbilities;
import net.warcar.uo_uo_no_mi.models.KaenDaikoMorphRenderer;
import xyz.pixelatedw.mineminenomi.api.morph.MorphInfo;
import xyz.pixelatedw.mineminenomi.api.morph.MorphModel;
import xyz.pixelatedw.mineminenomi.items.AkumaNoMiItem;
import xyz.pixelatedw.mineminenomi.models.morphs.NoMorphModel;

import javax.annotation.Nullable;
import java.util.Map;

public class KaenDaikoMorphInfo extends MorphInfo {
    private static final EntitySize SIZE = EntitySize.scalable(10, 10);
    @Nullable
    @Override
    public AkumaNoMiItem getDevilFruit() {
        return UoAbilities.UO_UO_NO_MI_MODEL_SEIRYU;
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public IRenderFactory getRendererFactory() {
        return new KaenDaikoMorphRenderer.Factory<>();
    }


    public String getForm() {
        return "kaen_daiko";
    }

    @OnlyIn(Dist.CLIENT)
    public MorphModel getModel() {
        return new NoMorphModel<>(false);
    }

    public String getDisplayName() {
        return "Kaen Daiko";
    }

    public double getEyeHeight() {
        return 5.5;
    }

    public double getCameraZoom(LivingEntity entity) {
        return 100;
    }

    @Nullable
    @Override
    public Map<Pose, EntitySize> getSizes() {
        return new ImmutableMap.Builder<Pose, EntitySize>().put(Pose.STANDING, SIZE).put(Pose.CROUCHING, SIZE).build();
    }
}
