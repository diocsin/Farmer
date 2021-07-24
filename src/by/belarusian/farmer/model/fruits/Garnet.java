package by.belarusian.farmer.model.fruits;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;
import by.belarusian.farmer.model.Fruit;

import java.util.Objects;

public class Garnet extends Fruit {

    public Garnet(int weight, Color color) {
        super(weight, color);
    }

    @Override
    public String getRusName() {
        return "Гранат";
    }
}
