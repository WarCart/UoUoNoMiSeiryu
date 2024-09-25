package net.warcar.uo_uo_no_mi.abilities.components;

import net.minecraft.nbt.CompoundNBT;
import net.warcar.uo_uo_no_mi.entities.LivingPartEntity;
import net.warcar.uo_uo_no_mi.init.UoAbilityComponents;
import xyz.pixelatedw.mineminenomi.api.abilities.IAbility;
import xyz.pixelatedw.mineminenomi.api.abilities.components.AbilityComponent;

import javax.annotation.Nullable;

public class MultiBoxComponent extends AbilityComponent<IAbility> {
    private LivingPartEntity[] entities = new LivingPartEntity[0];
    public MultiBoxComponent(IAbility ability) {
        super(UoAbilityComponents.MULTI_BOX, ability);
        this.setDisabled(true);
    }

    public LivingPartEntity[] getEntities() {
        return entities;
    }

    public void setEntities(LivingPartEntity... entities) {
        this.entities = entities;
    }

    @Nullable
    @Override
    public CompoundNBT save() {
        CompoundNBT compoundNBT = super.save();
        if (compoundNBT == null) {
            compoundNBT = new CompoundNBT();
        }
        compoundNBT.putBoolean("disabled", this.isDisabled());
        return compoundNBT;
    }

    @Override
    public void load(CompoundNBT nbt) {
        super.load(nbt);
        this.setDisabled(nbt.getBoolean("disabled"));
    }
}
