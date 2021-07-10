package net.mcreator.endnemeralds.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.endnemeralds.EndNEmeraldsModElements;
import net.mcreator.endnemeralds.EndNEmeraldsMod;

import java.util.Map;

@EndNEmeraldsModElements.ModElement.Tag
public class AcidMobplayerCollidesBlockProcedure extends EndNEmeraldsModElements.ModElement {
	public AcidMobplayerCollidesBlockProcedure(EndNEmeraldsModElements instance) {
		super(instance, 34);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				EndNEmeraldsMod.LOGGER.warn("Failed to load dependency entity for procedure AcidMobplayerCollidesBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
	}
}
