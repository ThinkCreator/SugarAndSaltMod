package thinkcreate.mod.world.biomes;


import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenMinable;
import thinkcreate.mod.init.BlockInit;

public class BiomeSugar extends Biome 
{

	public BiomeSugar() {
		super(new BiomeProperties("Sugar").setSnowEnabled().setTemperature(0.1F).setBaseHeight(10.0F).setHeightVariation(1.2F).setWaterColor(16777196));
		
		topBlock = BlockInit.BLOCK_SUGAR.getDefaultState();
		fillerBlock = BlockInit.BLOCK_SUGAR.getDefaultState();
		
		this.decorator.coalGen = new WorldGenMinable(BlockInit.BLOCK_SUGAR.getDefaultState(), 10);
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityHusk.class, 10, 1, 5));
	}
	
}
