package shit.randomfoodstuff.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityItemPepperoni extends EntityItem {

    public EntityItemPepperoni(World world, double par1, double par2, double par3) {
        super(world, par1, par2, par3);

        this.lifespan = 72000;
        this.delayBeforeCanPickup = 30;
        this.isImmuneToFire = true;
    }

    public EntityItemPepperoni(World world, Entity original, ItemStack stack) {
        this(world, original.posX, original.posY, original.posZ);

        this.motionX = original.motionX;
        this.motionY = original.motionY;
        this.motionZ = original.motionZ;
        this.setEntityItemStack(stack);
    }


}
