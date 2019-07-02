package thinkcreate.mod.init;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import thinkcreate.mod.Main;
import thinkcreate.mod.entity.EntityStranger;
import thinkcreate.mod.entity.EntitySugarMan;
import thinkcreate.mod.util.Reference;

public class EntityInit 
{
	
	public static void registerEntities()
	{
		registerEntity("sugar_man", EntitySugarMan.class, Reference.ENTITY_SNOW_MAN, 50, 12754764, 0000000);
		registerEntity("stranger", EntityStranger.class, Reference.ENTITY_STRANGER, 100, 4671621, 16711680);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int colour1, int colour2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, colour1, colour2);
	}
}
