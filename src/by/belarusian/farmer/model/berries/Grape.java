package by.belarusian.farmer.model.berries;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.model.Berry;

public class Grape extends Berry {
    public Grape(int weight, Color color) {
        super(weight, color);
    }

    @Override
    public String getRusName() {
        return "Виноград";
    }
}
