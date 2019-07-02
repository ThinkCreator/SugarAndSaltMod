package thinkcreate.mod;

import org.apache.commons.codec.language.bm.Lang;
import org.apache.commons.codec.language.bm.Languages;

import com.jcraft.jorbis.Block;
import com.mojang.authlib.properties.Property;

import net.minecraft.block.BlockTNT;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import thinkcreate.mod.proxy.CommonProxy;
import thinkcreate.mod.tabs.SSTab;
import thinkcreate.mod.util.Reference;
import thinkcreate.mod.util.handlers.EnumHandler;
import thinkcreate.mod.util.handlers.RegistryHandler;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{
	//Languages
	public static Languages en_us;
	public static Languages fil_ph;
	
	//Instance
	@Instance
	public static Main instance;
	
	//Creative Tab
	public static final CreativeTabs sstab = new SSTab("ssTab");
	
	//Proxy
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	//Pre Initialization
    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) { RegistryHandler.preInitRegistries();}
    
    //Initialization
    @EventHandler
    public static void init(FMLInitializationEvent event) { RegistryHandler.initRegistries(); }
    
    //Post Initialization
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) { RegistryHandler.postInitRegistries();}
    
    //Server Initialization
    public static void serverInit(FMLServerStartingEvent event) { RegistryHandler.serverRegistries(event); }
    
    /**
    public void unStackFood() 
    {Items.APPLE.setMaxStackSize(1); Items.BAKED_POTATO.setMaxStackSize(1); Items.BEEF.setMaxStackSize(1); 
    Items.BEETROOT.setMaxStackSize(1); 
    Items.BREAD.setMaxStackSize(1); 
	Items.CARROT.setMaxStackSize(1); 
	Items.CHICKEN.setMaxStackSize(1); 
	Items.COOKED_BEEF.setMaxStackSize(1);
	Items.COOKED_CHICKEN.setMaxStackSize(1);
	Items.COOKED_FISH.setMaxStackSize(1);
	Items.COOKED_MUTTON.setMaxStackSize(1);
	Items.COOKED_PORKCHOP.setMaxStackSize(1);
	Items.COOKED_RABBIT.setMaxStackSize(1);
	Items.POISONOUS_POTATO.setMaxStackSize(1);
	Items.COOKIE.setMaxStackSize(1);
	Items.FISH.setMaxStackSize(1);
	Items.GOLDEN_APPLE.setMaxStackSize(1);
	Items.MELON.setMaxStackSize(1);
	Items.MUTTON.setMaxStackSize(1);
	Items.POTATO.setMaxStackSize(1);
	Items.PORKCHOP.setMaxStackSize(1);
	Items.PUMPKIN_PIE.setMaxStackSize(1);
	Items.RABBIT.setMaxStackSize(1);
	*/
    
}

