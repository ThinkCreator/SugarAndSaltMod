package thinkcreate.mod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import thinkcreate.mod.init.ItemInit;

public class SSTab extends CreativeTabs
{

	public SSTab(String label) {
		super(label);
	}
	
	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.SWORD_SUGAR);
	}
	
}
