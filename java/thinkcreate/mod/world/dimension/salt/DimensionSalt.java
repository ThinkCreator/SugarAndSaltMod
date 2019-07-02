package thinkcreate.mod.world.dimension.salt;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.ChunkGeneratorDebug;
import net.minecraft.world.gen.IChunkGenerator;
import thinkcreate.mod.init.BiomeInit;
import thinkcreate.mod.init.DimensionInit;

public class DimensionSalt extends WorldProvider
{
	
	public DimensionSalt() 
	{
		this.biomeProvider = new BiomeProviderSingle(BiomeInit.SALT_DIMENSION);
	}
	
	@Override
	public DimensionType getDimensionType() 
	{
		return DimensionInit.SALT;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() 
	{
		return new ChunkGeneratorSalt(world, false, world.getSeed());
	}
	
	@Override
	public boolean canRespawnHere() 
	{
		return false;
	}
	
	@Override
	public boolean isSurfaceWorld() 
	{
		return false;
	}
	
}
