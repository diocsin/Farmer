package by.belarusian.farmer.model;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;

public abstract class Fruit extends Harvest {

    public Fruit(int weight, Color color) {
        super(weight, color);
        super.setType(Type.FRUITS);
    }
}
