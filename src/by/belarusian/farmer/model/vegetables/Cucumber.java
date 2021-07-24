package by.belarusian.farmer.model.vegetables;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.model.Vegetable;


public class Cucumber extends Vegetable {


    public Cucumber(int weight, Color color) {
        super(weight, color);
    }

    public String getRusName() {
        return "Огурец";
    }
}
