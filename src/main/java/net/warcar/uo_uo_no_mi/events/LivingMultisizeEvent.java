package net.warcar.uo_uo_no_mi.events;

import net.minecraft.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.warcar.uo_uo_no_mi.entities.LivingPartEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LivingMultisizeEvent extends LivingEvent {
    private final List<LivingPartEntity> parts = new ArrayList<>();
    public LivingMultisizeEvent(LivingEntity player) {
        super(player);
    }

    public void addParts(LivingPartEntity... partEntities) {
        this.parts.addAll(Arrays.asList(partEntities));
    }

    public List<LivingPartEntity> getParts() {
        return this.parts;
    }
}
