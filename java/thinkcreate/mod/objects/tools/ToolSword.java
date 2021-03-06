package thinkcreate.mod.objects.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import thinkcreate.mod.Main;
import thinkcreate.mod.init.ItemInit;
import thinkcreate.mod.util.interfaces.IHasModel;

public class ToolSword extends ItemSword implements IHasModel
{

	public ToolSword(String name, ToolMaterial material) 
	{
		super(material);
		
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(Main.sstab);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
