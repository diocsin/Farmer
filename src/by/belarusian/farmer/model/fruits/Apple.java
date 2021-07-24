package by.belarusian.farmer.model.fruits;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;

import java.util.Objects;

public class Apple {

    private int weight;

    private Color appleColor;

    private final Type TYPE = Type.FRUITS;

    public Apple(int weight, Color appleColor) {
        this.weight = weight;
        this.appleColor = appleColor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(Color appleColor) {
        this.appleColor = appleColor;
    }

    public Type getTYPE() {
        return TYPE;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", appleColor=" + appleColor +
                ", TYPE=" + TYPE +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return weight == apple.weight && appleColor == apple.appleColor && TYPE == apple.TYPE;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, appleColor, TYPE);
    }

    public String getEnumFruitColor() {
        return appleColor.getRusName();
    }

}
