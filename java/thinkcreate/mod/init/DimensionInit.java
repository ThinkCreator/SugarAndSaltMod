package thinkcreate.mod.init;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;
import thinkcreate.mod.world.dimension.salt.DimensionSalt;

public class DimensionInit 
{
	public static final DimensionType SALT = DimensionType.register("Salt", "_salt", 2, DimensionSalt.class, false);
	
	public static void registerDimensions()
	{
		DimensionManager.registerDimension(2, SALT);
	}
}
