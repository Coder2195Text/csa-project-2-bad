package mods.coder2195.notjavascript.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class UraniumOreWitherProcedure {
	public static void execute(Entity e) {
		if (e == null)
			return;
		if (e instanceof LivingEntity entity && !entity.level().isClientSide()) {
			entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 100, 1, false, true));
			entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200, 5, false, true));
			entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 60, 1, false, true));
		}
	}
}
