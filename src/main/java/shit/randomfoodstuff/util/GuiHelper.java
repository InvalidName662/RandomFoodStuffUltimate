package shit.randomfoodstuff.util;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;
import shit.randomfoodstuff.client.gui.GuiGuide;

public class GuiHelper {

    public static void drawItemStack(GuiGuide screen, ItemStack stack, int x, int y) {
        RenderHelper.disableStandardItemLighting();
        RenderHelper.enableGUIStandardItemLighting();
        GL11.glDisable(GL11.GL_LIGHTING);
        FontRenderer fontRenderer = stack.getItem().getFontRenderer(stack) != null ? stack.getItem().getFontRenderer(stack) : screen.getFontRenderer();
        screen.getItemRenderer().renderItemAndEffectIntoGUI(fontRenderer, screen.mc.getTextureManager(), stack, x, y);
        screen.getItemRenderer().renderItemOverlayIntoGUI(fontRenderer, screen.mc.getTextureManager(), stack, x, y);
    }
}
