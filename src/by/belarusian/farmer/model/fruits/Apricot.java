package by.belarusian.farmer.model.fruits;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;
import by.belarusian.farmer.model.Fruit;

import java.util.Objects;

public class Apricot extends Fruit {

    public Apricot(int weight, Color color) {
        super(weight, color);
    }

    public String getRusName() {
        return "Абрикос";
    }
}


