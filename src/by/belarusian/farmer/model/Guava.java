package by.belarusian.farmer.model;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;

import java.util.Objects;

public class Guava {

    private int weight;

    private Color guavaColor;

    private final Type TYPE = Type.FRUITS;

    public Guava(int weight, Color guavaColor) {
        this.weight = weight;
        this.guavaColor = guavaColor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getGuavaColor() {
        return guavaColor;
    }

    public void setGuavaColor(Color guavaColor) {
        this.guavaColor = guavaColor;
    }

    public Type getTYPE() {
        return TYPE;
    }

    @Override
    public String toString() {
        return "Guava{" +
                "weight=" + weight +
                ", guavaColor=" + guavaColor +
                ", TYPE=" + TYPE +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guava guava = (Guava) o;
        return weight == guava.weight && guavaColor == guava.guavaColor && TYPE == guava.TYPE;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, guavaColor, TYPE);
    }

    public String getEnumFruitColor() {
        return guavaColor.getRusName();
    }

}
