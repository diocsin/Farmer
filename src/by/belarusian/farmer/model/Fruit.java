package by.belarusian.farmer.model;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;

public abstract class Fruit extends Harvest {

    private final Type type;

    public Fruit(Long weight, Color color) {
        super(weight, color);
        this.type = Type.FRUITS;
    }

    public Type getType() {
        return type;
    }


}
