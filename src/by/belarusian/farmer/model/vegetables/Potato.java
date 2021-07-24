package by.belarusian.farmer.model.vegetables;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.model.Vegetable;

public class Potato extends Vegetable {

    public Potato(int weight, Color color) {
        super(weight, color);
    }

    public String getRusName() {
        return "Картофель";
    }
}
