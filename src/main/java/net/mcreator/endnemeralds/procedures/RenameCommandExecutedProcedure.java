package net.mcreator.endnemeralds.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.Entity;

import net.mcreator.endnemeralds.EndNEmeraldsModElements;
import net.mcreator.endnemeralds.EndNEmeraldsMod;

import java.util.Map;
import java.util.HashMap;

@EndNEmeraldsModElements.ModElement.Tag
public class RenameCommandExecutedProcedure extends EndNEmeraldsModElements.ModElement {
	public RenameCommandExecutedProcedure(EndNEmeraldsModElements instance) {
		super(instance, 18);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				EndNEmeraldsMod.LOGGER.warn("Failed to load dependency entity for procedure RenameCommandExecuted!");
			return;
		}
		if (dependencies.get("cmdparams") == null) {
			if (!dependencies.containsKey("cmdparams"))
				EndNEmeraldsMod.LOGGER.warn("Failed to load dependency cmdparams for procedure RenameCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
		entity.setCustomName(new StringTextComponent((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())));
	}
}
