package shit.randomfoodstuff.render;

import net.minecraft.tileentity.TileEntity;

import java.util.HashMap;

public abstract class RandomModelCollection {

    //Map holding the Models of this Collection
    protected HashMap<String, RandomModel> modelList = new HashMap<String, RandomModel>();

    public void registerModel(String identifier, RandomModel model) {
        modelList.put(identifier, model);
    }

    public RandomModel getModel(String identifier) {
        return modelList.getOrDefault(identifier, null);
    }

    public abstract RandomModel getModelBasedOn(TileEntity entity, int x, int y, int z);
}
