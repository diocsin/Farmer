package by.belarusian.farmer.model.berries;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;
import by.belarusian.farmer.model.Berry;

import java.util.Objects;

public class Cherry extends Berry {

    public Cherry(int weight, Color color) {
        super(weight, color);
    }

    public String getRusName() {
        return "Вишня";
    }
}
