package by.belarusian.farmer.model.berries;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;
import by.belarusian.farmer.model.Berry;

import java.util.Objects;

public class Strawberry extends Berry {

    public Strawberry(int weight, Color color) {
        super(weight, color);
    }

    @Override
    public String getRusName() {
        return "Клубника";
    }
}
