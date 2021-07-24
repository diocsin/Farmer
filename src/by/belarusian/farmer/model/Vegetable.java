package by.belarusian.farmer.model;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;

public abstract class Vegetable extends Harvest {

    private final Type type;

    public Vegetable(Long weight, Color color) {
        super(weight, color);
        this.type = Type.VEGETABLES;
    }

    public Type getType() {
        return type;
    }


}
