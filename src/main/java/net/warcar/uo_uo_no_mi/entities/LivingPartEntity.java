package net.warcar.uo_uo_no_mi.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Pose;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.DamageSource;
import net.minecraftforge.entity.PartEntity;

public class LivingPartEntity extends PartEntity<LivingEntity> {
    protected final LivingEntity parentMob;
    protected final EntitySize size;

    public LivingPartEntity(LivingEntity parent, EntitySize size) {
        super(parent);
        this.parentMob = parent;
        this.size = size;
        this.refreshDimensions();
    }

    protected void defineSynchedData() {
    }

    protected void readAdditionalSaveData(CompoundNBT p_70037_1_) {
    }

    protected void addAdditionalSaveData(CompoundNBT p_213281_1_) {
    }
    public boolean isPickable() {
        return false;
    }

    public boolean hurt(DamageSource source, float amount) {
        return !this.isInvulnerableTo(source) && this.parentMob.hurt(source, amount);
    }

    public boolean is(Entity entity) {
        return this == entity || this.parentMob == entity;
    }

    public EntitySize getDimensions(Pose pPose) {
        return this.size;
    }
}
