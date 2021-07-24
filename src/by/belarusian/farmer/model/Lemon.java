package by.belarusian.farmer.model;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;

import java.util.Objects;

public class Lemon {

    private int weight;

    private Color lemonColor;

    private final Type TYPE = Type.FRUITS;

    public Lemon(int weight, Color lemonColor) {
        this.weight = weight;
        this.lemonColor = lemonColor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getLemonColor() {
        return lemonColor;
    }

    public void setLemonColor(Color lemonColor) {
        this.lemonColor = lemonColor;
    }

    public Type getTYPE() {
        return TYPE;
    }

    @Override
    public String toString() {
        return "Lemon{" +
                "weight=" + weight +
                ", lemonColor=" + lemonColor +
                ", TYPE=" + TYPE +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lemon lemon = (Lemon) o;
        return weight == lemon.weight && lemonColor == lemon.lemonColor && TYPE == lemon.TYPE;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, lemonColor, TYPE);
    }

    public String getEnumFruitColor() {
        return lemonColor.getRusName();
    }

}
