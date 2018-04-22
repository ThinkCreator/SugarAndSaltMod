package thinkcreate.mod.entity.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import thinkcreate.mod.entity.EntityStranger;
import thinkcreate.mod.entity.model.ModelStranger;
import thinkcreate.mod.util.Reference;

public class RenderStranger extends RenderLiving<EntityStranger>
{
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/stranger.png");
	
	public RenderStranger(RenderManager manager) 
	{
		super(manager, new ModelStranger(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityStranger entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityStranger entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		// TODO Auto-generated method stub
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
