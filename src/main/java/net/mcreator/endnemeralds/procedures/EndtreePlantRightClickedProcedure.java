package net.mcreator.endnemeralds.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.endnemeralds.potion.MegaPotionPotion;
import net.mcreator.endnemeralds.item.DarkchocolateItem;
import net.mcreator.endnemeralds.EndNEmeraldsModElements;
import net.mcreator.endnemeralds.EndNEmeraldsMod;

import java.util.Map;

@EndNEmeraldsModElements.ModElement.Tag
public class EndtreePlantRightClickedProcedure extends EndNEmeraldsModElements.ModElement {
	public EndtreePlantRightClickedProcedure(EndNEmeraldsModElements instance) {
		super(instance, 13);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				EndNEmeraldsMod.LOGGER.warn("Failed to load dependency entity for procedure EndtreePlantRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(DarkchocolateItem.block, (int) (1)).getItem())) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(MegaPotionPotion.potion, (int) 60, (int) 1));
		}
	}
}
