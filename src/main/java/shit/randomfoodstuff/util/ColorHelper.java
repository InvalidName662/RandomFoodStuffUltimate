package shit.randomfoodstuff.util;


import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumChatFormatting;

import java.util.HashMap;

import static net.minecraft.util.EnumChatFormatting.*;

public class ColorHelper {

    private static HashMap<String, String> colorMap = new HashMap<String, String>();

    static {
        for (EnumChatFormatting e : EnumChatFormatting.values()) {
            colorMap.put(e.name().toLowerCase(), e.toString());
        }
    }

    public static String getColorByName(String name) {
        return colorMap.getOrDefault(name.toLowerCase(), null);
    }

    public static void addColor(String name, String color) {
        colorMap.put(name, color);
    }

    private static final EnumChatFormatting[] rainbow = new EnumChatFormatting[]{RED, GOLD, YELLOW, GREEN, AQUA, BLUE, LIGHT_PURPLE};

    public static String makeRainbow(String input) {
        return textFormatting(input, rainbow, 80.0, 1, 1);
    }

    private static final EnumChatFormatting[] sanic = new EnumChatFormatting[]{BLUE, BLUE, BLUE, BLUE, WHITE, BLUE, WHITE, WHITE, BLUE, WHITE, WHITE, BLUE, RED, WHITE, GRAY, GRAY, GRAY, GRAY, GRAY, GRAY, GRAY, GRAY, GRAY, GRAY, GRAY, GRAY, GRAY, GRAY, GRAY, GRAY};

    public static String makeSANIC(String input) {
        return textFormatting(input, sanic, 50.0, 2, 1);
    }

    public static String textFormatting(String input, EnumChatFormatting[] colours, double delay, int step, int posstep) {
        StringBuilder sb = new StringBuilder(input.length() * 3);
        if (delay <= 0) {
            delay = 0.001;
        }

        int offset = (int) Math.floor(Minecraft.getSystemTime() / delay) % colours.length;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            int col = ((i * posstep) + colours.length - offset) % colours.length;

            sb.append(colours[col].toString());
            sb.append(c);
        }

        return sb.toString();
    }

}
