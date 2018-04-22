package thinkcreate.mod.entity.model;

import akka.routing.ListenerMessage;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelSnowMan - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelSugarMan extends ModelBase {
    public ModelRenderer SnowmanBody;
    public ModelRenderer LeftArm;
    public ModelRenderer RightArm;
    public ModelRenderer Bottom;
    public ModelRenderer RightArm_1;
    public ModelRenderer EnderRightArm;
    public ModelRenderer EnderHead;
    public ModelRenderer EnderLeftArm;
    public ModelRenderer EnderInnerHead;

    public ModelSugarMan() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.EnderHead = new ModelRenderer(this, 0, 0);
        this.EnderHead.setRotationPoint(0.09999999999999998F, -1.8000000000000005F, 0.0F);
        this.EnderHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.EnderLeftArm = new ModelRenderer(this, 56, 0);
        this.EnderLeftArm.setRotationPoint(0.09999999999999998F, -1.8000000000000005F, 0.0F);
        this.EnderLeftArm.addBox(-1.0F, -2.0F, -1.0F, 2, 30, 2, 0.0F);
        this.setRotateAngle(EnderLeftArm, 0.0F, 0.19198621771937624F, 1.9071212736542036F);
        this.RightArm_1 = new ModelRenderer(this, 56, 0);
        this.RightArm_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightArm_1.addBox(0.0F, 0.0F, 0.0F, 2, 30, 2, 0.0F);
        this.EnderRightArm = new ModelRenderer(this, 56, 0);
        this.EnderRightArm.setRotationPoint(0.09999999999999998F, -1.8000000000000005F, 0.0F);
        this.EnderRightArm.addBox(-1.0F, -2.0F, -1.0F, 2, 30, 2, 0.0F);
        this.setRotateAngle(EnderRightArm, 0.0F, 0.22689280275926282F, -2.09910749137358F);
        this.Bottom = new ModelRenderer(this, 0, 36);
        this.Bottom.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.Bottom.addBox(-6.0F, -12.0F, -6.0F, 12, 12, 12, -0.5F);
        this.RightArm = new ModelRenderer(this, 32, 0);
        this.RightArm.setRotationPoint(-5.0F, 6.0F, 0.0F);
        this.RightArm.addBox(-1.0F, 0.0F, -1.0F, 12, 2, 2, -0.5F);
        this.setRotateAngle(RightArm, 0.0F, 3.141592653589793F, -1.0000736613927508F);
        this.EnderInnerHead = new ModelRenderer(this, 0, 16);
        this.EnderInnerHead.setRotationPoint(0.1F, 3.7F, 0.0F);
        this.EnderInnerHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.setRotateAngle(EnderInnerHead, 0.0F, -0.3665191429188092F, 0.05235987755982988F);
        this.LeftArm = new ModelRenderer(this, 32, 0);
        this.LeftArm.setRotationPoint(5.0F, 6.0F, -0.0F);
        this.LeftArm.addBox(-1.0F, 0.0F, -1.0F, 12, 2, 2, -0.5F);
        this.setRotateAngle(LeftArm, 0.0F, 0.0F, 1.0000736613927508F);
        this.SnowmanBody = new ModelRenderer(this, 0, 16);
        this.SnowmanBody.setRotationPoint(0.0F, 13.0F, 0.0F);
        this.SnowmanBody.addBox(-5.0F, -10.0F, -5.0F, 10, 10, 10, -0.5F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.EnderHead.render(f5);
        this.EnderLeftArm.render(f5);
        this.RightArm_1.render(f5);
        this.EnderRightArm.render(f5);
        this.Bottom.render(f5);
        this.RightArm.render(f5);
        this.EnderInnerHead.render(f5);
        this.LeftArm.render(f5);
        this.SnowmanBody.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) 
    {
    		this.RightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    		this.LeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    		this.EnderRightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    		this.EnderLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    		
    		this.EnderHead.rotateAngleY = netHeadYaw * 0.017453292F;
    		this.EnderHead.rotateAngleY = headPitch * 0.017453292F;
    }
    
}
