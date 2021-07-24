package by.belarusian.farmer.model.fruits;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;
import by.belarusian.farmer.model.Fruit;

import java.util.Objects;

public class Lemon extends Fruit {


    public Lemon(int weight, Color color) {
        super(weight, color);
    }

    @Override
    public String getRusName() {
        return "Лимон";
    }
}
