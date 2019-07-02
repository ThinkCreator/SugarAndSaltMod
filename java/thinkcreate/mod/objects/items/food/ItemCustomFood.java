package thinkcreate.mod.objects.items.food;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import thinkcreate.mod.Main;
import thinkcreate.mod.init.ItemInit;
import thinkcreate.mod.util.interfaces.IHasModel;

public class ItemCustomFood extends ItemFood implements IHasModel 
{

	public ItemCustomFood(String name, int amount, boolean isWolfFood, boolean isEdibleAlways) 
	{
		super(amount, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.sstab);
		if (isEdibleAlways)
		{
			setAlwaysEdible();
		}
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
