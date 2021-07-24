package by.belarusian.farmer.model.vegetables;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.model.Vegetable;

public class Beet extends Vegetable {

    public Beet(int weight, Color color) {
        super(weight, color);
    }

    public String getRusName() {
        return "Свекла";
    }
}
