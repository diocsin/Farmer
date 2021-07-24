package by.belarusian.farmer.model;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;

public abstract class Berry extends Harvest {

    public Berry(int weight, Color color) {
        super(weight, color);
        super.setType(Type.BERRIES);
    }

}
