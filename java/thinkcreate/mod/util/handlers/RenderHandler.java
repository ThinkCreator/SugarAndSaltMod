package thinkcreate.mod.util.handlers;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import thinkcreate.mod.entity.EntityStranger;
import thinkcreate.mod.entity.EntitySugarMan;
import thinkcreate.mod.entity.render.RenderStranger;
import thinkcreate.mod.entity.render.RenderSugarMan;

public class RenderHandler 
{
	public static void registerEnityRenderers() 
	{
		RenderingRegistry.registerEntityRenderingHandler(EntitySugarMan.class, new IRenderFactory() 
		{

			@Override
			public Render createRenderFor(RenderManager manager) 
			{
				return new RenderSugarMan(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityStranger.class, new IRenderFactory() 
		{
			@Override
			public Render createRenderFor(RenderManager manager)
			{
				return new RenderStranger(manager);
			}
			
		});
	}
}
