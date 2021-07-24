package by.belarusian.farmer.model.vegetables;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.model.Vegetable;

public class Radish extends Vegetable {

    public Radish(int weight, Color color) {
        super(weight, color);
    }

    public String getRusName() {
        return "Редиска";
    }
}
