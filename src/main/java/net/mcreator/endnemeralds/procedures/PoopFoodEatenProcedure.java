package net.mcreator.endnemeralds.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.endnemeralds.EndNEmeraldsModElements;
import net.mcreator.endnemeralds.EndNEmeraldsMod;

import java.util.Map;

@EndNEmeraldsModElements.ModElement.Tag
public class PoopFoodEatenProcedure extends EndNEmeraldsModElements.ModElement {
	public PoopFoodEatenProcedure(EndNEmeraldsModElements instance) {
		super(instance, 22);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				EndNEmeraldsMod.LOGGER.warn("Failed to load dependency entity for procedure PoopFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).setHealth((float) 2);
	}
}
