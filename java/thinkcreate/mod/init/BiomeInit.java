package thinkcreate.mod.init;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import thinkcreate.mod.world.biomes.BiomeSalt;
import thinkcreate.mod.world.biomes.BiomeSugar;

public class BiomeInit 
{
	
	public static final Biome SUGAR = new BiomeSugar();
	public static final Biome SALT_DIMENSION = new BiomeSalt();
	
	public static void registerBiomes()
	{
		initBiome(SUGAR, "Sugar", BiomeType.COOL, Type.COLD, Type.MOUNTAIN, Type.HILLS, Type.MAGICAL, Type.MESA, Type.SPOOKY);
		initBiome(SALT_DIMENSION, "Salt", BiomeType.WARM, Type.HOT, Type.PLAINS, Type.VOID, Type.LUSH, Type.SPOOKY, Type.MESA);
	}
	
	private static Biome initBiome(Biome biome, String name, BiomeType biometype, Type...types)
	{
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		System.out.println("Biome Registered");
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biometype, new BiomeEntry(biome, 10));
		BiomeManager.addSpawnBiome(biome);
		System.out.println("Biome Added");;
		return biome;
	}
	
}
