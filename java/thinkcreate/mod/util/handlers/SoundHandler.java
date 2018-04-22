package thinkcreate.mod.util.handlers;

import net.minecraft.client.audio.Sound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import thinkcreate.mod.util.Reference;

public class SoundHandler 
{
	
	public static SoundEvent ENTITY_SUGARMAN_AMBIENT, ENTITY_SUGARMAN_HURT, ENTITY_SUGARMAN_DEATH;
	public static SoundEvent ENTITY_STRANGER_AMBIENT, ENTITY_STRANGER_HURT, ENTITY_STRANGER_DEATH;
	
	public static void registerSounds()
	{
		ENTITY_SUGARMAN_AMBIENT = registerSound("entity.sugarman.ambient");
		ENTITY_SUGARMAN_HURT = registerSound("entity.sugarman.hurt");
		ENTITY_SUGARMAN_DEATH = registerSound("entity.sugarman.death");
		ENTITY_STRANGER_AMBIENT = registerSound("entity.stranger.ambient");
		ENTITY_STRANGER_HURT = registerSound("entity.stranger.hurt");
		ENTITY_STRANGER_DEATH = registerSound("entity.stranger.death");
	}
	
	private static SoundEvent registerSound(String name)
	{
		ResourceLocation location = new ResourceLocation(Reference.MODID + ":" + name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
	
}
