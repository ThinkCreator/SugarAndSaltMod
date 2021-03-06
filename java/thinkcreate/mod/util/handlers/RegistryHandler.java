package thinkcreate.mod.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import thinkcreate.mod.Main;
import thinkcreate.mod.commands.CommandDimensionTeleport;
import thinkcreate.mod.init.BiomeInit;
import thinkcreate.mod.init.BlockInit;
import thinkcreate.mod.init.DimensionInit;
import thinkcreate.mod.init.EntityInit;
import thinkcreate.mod.init.ItemInit;
import thinkcreate.mod.util.compat.OreDictionaryCompat;
import thinkcreate.mod.util.interfaces.IHasModel;
import thinkcreate.mod.world.gen.WorldGenCustomOres;
import thinkcreate.mod.world.gen.WorldGenCustomStructures;
import thinkcreate.mod.world.types.WorldTypeSugar;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ItemInit.ITEMS)
		{
			if(item instanceof IHasModel) 
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : BlockInit.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
		
	}
	
	public static void preInitRegistries()
	{
		GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
		
		BiomeInit.registerBiomes();
		DimensionInit.registerDimensions();
		
		EntityInit.registerEntities();
		RenderHandler.registerEnityRenderers();
	}
	
	public static void initRegistries()
	{
		SoundHandler.registerSounds();
		OreDictionaryCompat.registerOres();
	}
	
	public static void postInitRegistries()
	{
		WorldType SUGAR = new WorldTypeSugar();
	}
	
	public static void serverRegistries(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandDimensionTeleport());
	}
	
}
