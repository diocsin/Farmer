package by.belarusian.farmer.model.berries;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;
import by.belarusian.farmer.model.Berry;

import java.util.Objects;

public class Blueberry extends Berry {
    public Blueberry(int weight, Color color) {
        super(weight, color);
    }

    public String getRusName() {
        return "Черника";
    }
}
