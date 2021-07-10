package net.mcreator.endnemeralds.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.endnemeralds.EndNEmeraldsModElements;
import net.mcreator.endnemeralds.EndNEmeraldsMod;

import java.util.Map;

@EndNEmeraldsModElements.ModElement.Tag
public class MegaPotionPotionExpiresProcedure extends EndNEmeraldsModElements.ModElement {
	public MegaPotionPotionExpiresProcedure(EndNEmeraldsModElements instance) {
		super(instance, 8);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				EndNEmeraldsMod.LOGGER.warn("Failed to load dependency entity for procedure MegaPotionPotionExpires!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).abilities.disableDamage = (false);
			((PlayerEntity) entity).sendPlayerAbilities();
		}
	}
}
