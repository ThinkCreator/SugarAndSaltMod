package thinkcreate.mod.world.biomes;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;

public class BiomeSalt extends Biome 
{

	public BiomeSalt() 
	{
		super(new BiomeProperties("Sallt").setTemperature(1.0F).setBaseHeight(1.5F).setHeightVariation(1.2F).setWaterColor(16777196).setRainfall(1.0F));
		
		
		
	}
	
}
