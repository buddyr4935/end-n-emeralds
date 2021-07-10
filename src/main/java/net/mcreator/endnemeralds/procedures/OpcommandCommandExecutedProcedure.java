package net.mcreator.endnemeralds.procedures;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.command.FunctionObject;

import net.mcreator.endnemeralds.EndNEmeraldsModElements;
import net.mcreator.endnemeralds.EndNEmeraldsMod;

import java.util.Optional;
import java.util.Map;

@EndNEmeraldsModElements.ModElement.Tag
public class OpcommandCommandExecutedProcedure extends EndNEmeraldsModElements.ModElement {
	public OpcommandCommandExecutedProcedure(EndNEmeraldsModElements instance) {
		super(instance, 29);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				EndNEmeraldsMod.LOGGER.warn("Failed to load dependency entity for procedure OpcommandCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (!entity.world.isRemote && entity.world.getServer() != null) {
			Optional<FunctionObject> _fopt = entity.world.getServer().getFunctionManager().get(new ResourceLocation("mod:op"));
			if (_fopt.isPresent()) {
				FunctionObject _fobj = _fopt.get();
				entity.world.getServer().getFunctionManager().execute(_fobj, entity.getCommandSource());
			}
		}
	}
}
