package thinkcreate.mod.world.types;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import thinkcreate.mod.init.BiomeInit;

public class WorldTypeSugar extends WorldType
{

	public WorldTypeSugar() 
	{
		super("Sugar");
	}
	
	@Override
	public BiomeProvider getBiomeProvider(World world)
	{
		return new BiomeProviderSingle(BiomeInit.SUGAR);
		
	}
	
}
