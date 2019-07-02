package thinkcreate.mod.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import thinkcreate.mod.init.ItemInit;
import thinkcreate.mod.util.handlers.LootTableHandler;
import thinkcreate.mod.util.handlers.SoundHandler;;

public class EntitySugarMan extends EntitySnowman
{

	public EntitySugarMan(World worldIn) 
	{
		super(worldIn);
		this.setSize(0.7F, 2.0F);
	}
	
	@Override
    protected void initEntityAI()
    {
        this.tasks.addTask(1, new EntityAIAttackRanged(this, 1.25D, 20, 10.0F));
        this.tasks.addTask(2, new EntityAIWanderAvoidWater(this, 1.0D, 1.0000001E-5F));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(4, new EntityAILookIdle(this));
        this.tasks.addTask(5, new EntityAITempt(this, 5.0F, Items.SUGAR, true));
        this.tasks.addTask(6, new EntityAIAvoidEntity(this, EntityPlayer.class, 0.1F, 0.5F, 0.3F));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityLiving.class, 10, true, true, IMob.MOB_SELECTOR));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
    }
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20000000298023224D);
	}
	
	@Override
	public float getEyeHeight() {
		// TODO Auto-generated method stub
		return 1.8F;
	}
	
	@Override
	protected ResourceLocation getLootTable() 
	{
		return LootTableHandler.SUGARMAN;
	}
	
	@Override
	protected SoundEvent getAmbientSound() 
	{
		return SoundHandler.ENTITY_SUGARMAN_AMBIENT;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source) 
	{
		return SoundHandler.ENTITY_SUGARMAN_HURT;
	}
	
	@Override
	protected SoundEvent getDeathSound() 
	{
		return SoundHandler.ENTITY_SUGARMAN_DEATH;
	}
	
}
