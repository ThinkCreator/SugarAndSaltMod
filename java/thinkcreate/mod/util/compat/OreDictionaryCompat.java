package thinkcreate.mod.util.compat;

import net.minecraftforge.oredict.OreDictionary;
import thinkcreate.mod.init.BlockInit;
import thinkcreate.mod.init.ItemInit;

public class OreDictionaryCompat 
{
	public static void registerOres()
	{
		OreDictionary.registerOre("oreSalt", BlockInit.BLOCK_ORE_OVERWORLD);
		OreDictionary.registerOre("dustTinySalt", ItemInit.SALT);
	}
}
