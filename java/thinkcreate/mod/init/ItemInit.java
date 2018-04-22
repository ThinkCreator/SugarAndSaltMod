package thinkcreate.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import thinkcreate.mod.objects.armor.ArmorBase;
import thinkcreate.mod.objects.items.ItemBase;
import thinkcreate.mod.objects.items.food.ItemChocolate;
import thinkcreate.mod.objects.items.food.ItemCustomFood;
import thinkcreate.mod.objects.tools.ToolAxe;
import thinkcreate.mod.objects.tools.ToolBow;
import thinkcreate.mod.objects.tools.ToolHoe;
import thinkcreate.mod.objects.tools.ToolPickaxe;
import thinkcreate.mod.objects.tools.ToolShovel;
import thinkcreate.mod.objects.tools.ToolSword;
import thinkcreate.mod.util.Reference;

public class ItemInit 
{
	//List for Registration
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial TOOL_SUGAR = EnumHelper.addToolMaterial("tool_sugar", 3, 1572, 15.0F, 5.0F, 30);
	public static final ToolMaterial TOOL_SALT = EnumHelper.addToolMaterial("tool_salt", 53, 2000, 45.0F, 10.0F, 30);
	public static final ArmorMaterial ARMOR_SUGAR = EnumHelper.addArmorMaterial("armor_sugar", Reference.MODID + ":sugar", 33, new int[]{4, 7, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	
	//Items
	public static final Item ROSE = new ItemBase("rose");
	public static final Item SALT = new ItemBase("salt");
	
	//Tools
	public static final Item AXE_SUGAR = new ToolAxe("axe_sugar", TOOL_SUGAR);
	public static final Item HOE_SUGAR = new ToolHoe("hoe_sugar", TOOL_SUGAR);
	public static final Item PICKAXE_SUGAR = new ToolPickaxe("pickaxe_sugar",TOOL_SUGAR);
	public static final Item SHOVEL_SUGAR = new ToolShovel("shovel_sugar",TOOL_SUGAR);
	public static final Item SWORD_SUGAR = new ToolSword("sword_sugar",TOOL_SUGAR);
	public static final Item AXE_SALT = new ToolAxe("axe_salt", TOOL_SALT);
	public static final Item HOE_SALT = new ToolHoe("hoe_salt", TOOL_SALT);
	public static final Item PICKAXE_SALT = new ToolPickaxe("pickaxe_salt", TOOL_SALT);
	public static final Item SHOVEL_SALT = new ToolShovel("shovel_salt", TOOL_SALT);
	public static final Item SWORD_SALT = new ToolSword("sword_salt", TOOL_SALT);
	public static final Item BOW_SUGAR = new ToolBow("bow_sugar");
	
	//Armor
	public static final Item HELMET_SUGAR = new ArmorBase("helmet_sugar", ARMOR_SUGAR, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_SUGAR = new ArmorBase("chestplate_sugar", ARMOR_SUGAR, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_SUGAR = new ArmorBase("leggings_sugar", ARMOR_SUGAR, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_SUGAR = new ArmorBase("boots_sugar", ARMOR_SUGAR, 1, EntityEquipmentSlot.FEET);
	
	//Food
	public static final Item CHOCOLATE_BAR = new ItemCustomFood("chocolate", 8, false, true).getContainerItem();
	public static final Item CHOCOCOLATE = new ItemChocolate("choc", 3, false, false);
	public static final Item CUPCAKE = new ItemCustomFood("cupcake", 5, false, true);
}
