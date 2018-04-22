package thinkcreate.mod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockCakeSalt extends BlockBase
{
	
	public static final AxisAlignedBB CAKE_SALT_AABB = new AxisAlignedBB(0, 0, 0, 1, 1, 1);

	public BlockCakeSalt(String name) 
	{
		super(name, Material.CAKE);
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) 
	{
		return CAKE_SALT_AABB;
	}
	
}
