package by.belarusian.farmer.model.fruits;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;
import by.belarusian.farmer.model.Fruit;

import java.util.Objects;

public class Guava extends Fruit {


    public Guava(int weight, Color color) {
        super(weight, color);
    }

    public String getRusName() {
        return "Гуава";
    }
}
