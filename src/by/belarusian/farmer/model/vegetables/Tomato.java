package by.belarusian.farmer.model.vegetables;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.model.Vegetable;

public class Tomato extends Vegetable {


    public Tomato(int weight, Color color) {
        super(weight, color);
    }

    @Override
    public String getRusName() {
        return "Помидор";
    }
}
