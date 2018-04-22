package thinkcreate.mod.entity.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import thinkcreate.mod.entity.EntitySugarMan;
import thinkcreate.mod.entity.model.ModelSugarMan;
import thinkcreate.mod.util.Reference;

public class RenderSugarMan extends RenderLiving<EntitySugarMan>
{
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/sugarman.png");
	
	public RenderSugarMan(RenderManager manager) 
	{
		super(manager, new ModelSugarMan(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntitySugarMan entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntitySugarMan entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		// TODO Auto-generated method stub
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
