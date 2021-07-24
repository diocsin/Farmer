package by.belarusian.farmer.model;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;

public abstract class Berry extends Harvest {

    private final Type type;

    public Berry(Long weight, Color color) {
        super(weight, color);
        this.type = Type.BERRIES;
    }

    public Type getType() {
        return type;
    }
}
