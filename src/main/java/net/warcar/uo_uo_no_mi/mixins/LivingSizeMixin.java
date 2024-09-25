package net.warcar.uo_uo_no_mi.mixins;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.extensions.IForgeEntity;
import net.minecraftforge.entity.PartEntity;
import net.warcar.uo_uo_no_mi.UoUoMod;
import net.warcar.uo_uo_no_mi.entities.LivingPartEntity;
import net.warcar.uo_uo_no_mi.events.LivingMultisizeEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import javax.annotation.Nullable;

@Mixin(value = LivingEntity.class, priority = 100)
public abstract class LivingSizeMixin extends Entity implements IForgeEntity {
    @Shadow public abstract boolean isAlive();

    private LivingPartEntity[] entities = new LivingPartEntity[0];
    protected LivingSizeMixin(EntityType<? extends LivingEntity> p_i48577_1_, World p_i48577_2_) {
        super(p_i48577_1_, p_i48577_2_);
    }

    @Override
    public boolean isMultipartEntity() {
        return true;
    }

    @Nullable
    @Override
    public PartEntity<?>[] getParts() {
        LivingEntity entity = (LivingEntity) (Object) this;
        LivingMultisizeEvent event = new LivingMultisizeEvent(entity);
        MinecraftForge.EVENT_BUS.post(event);
        this.entities = event.getParts().toArray(new LivingPartEntity[0]);
        return this.entities;
    }
}
