package net.mcreator.endnemeralds.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.endnemeralds.EndNEmeraldsModElements;
import net.mcreator.endnemeralds.EndNEmeraldsMod;

import java.util.Map;

@EndNEmeraldsModElements.ModElement.Tag
public class RightclickwithmeRightClickedInAirProcedure extends EndNEmeraldsModElements.ModElement {
	public RightclickwithmeRightClickedInAirProcedure(EndNEmeraldsModElements instance) {
		super(instance, 14);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				EndNEmeraldsMod.LOGGER.warn("Failed to load dependency x for procedure RightclickwithmeRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				EndNEmeraldsMod.LOGGER.warn("Failed to load dependency y for procedure RightclickwithmeRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				EndNEmeraldsMod.LOGGER.warn("Failed to load dependency z for procedure RightclickwithmeRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				EndNEmeraldsMod.LOGGER.warn("Failed to load dependency world for procedure RightclickwithmeRightClickedInAir!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.BEDROCK.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), Blocks.BEDROCK.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), Blocks.BEDROCK.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), Blocks.BEDROCK.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), Blocks.BEDROCK.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), Blocks.BEDROCK.getDefaultState(), 3);
	}
}
