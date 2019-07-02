package thinkcreate.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import thinkcreate.mod.Main;
import thinkcreate.mod.objects.blocks.BlockBase;
import thinkcreate.mod.objects.blocks.BlockChocolatePlant;
import thinkcreate.mod.objects.blocks.BlockOres;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_SUGAR = new BlockBase("block_sugar", Material.SAND).setHardness(3.4F).setCreativeTab(Main.sstab);
	public static final Block BLOCK_SALT = new BlockBase("block_salt", Material.SAND).setHardness(3.4F).setCreativeTab(Main.sstab);
	public static final Block CHOCOLATE_PLANT = new BlockChocolatePlant("chocolate_plant");
	//public static final Block BLOCK_TELEPORTER = new BlockTeleporter("block_teleporter");
	//public static final Block BLOCK_TNT = new BlockTNT().setCreativeTab(Main.sstab);
	//public static final Block CAKE_SALT = new BlockCakeSalt("cake_salt");
	
	public static final Block BLOCK_ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld").setCreativeTab(Main.sstab).setHardness(3.0F);
}
