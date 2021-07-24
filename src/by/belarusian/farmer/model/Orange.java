package by.belarusian.farmer.model;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;

import java.util.Objects;

public class Orange {

    private int weight;

    private Color orangeColor;

    private final Type TYPE = Type.FRUITS;

    public Orange(int weight, Color orangeColor) {
        this.weight = weight;
        this.orangeColor = orangeColor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getOrangeColor() {
        return orangeColor;
    }

    public void setOrangeColor(Color orangeColor) {
        this.orangeColor = orangeColor;
    }

    public Type getTYPE() {
        return TYPE;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "weight=" + weight +
                ", orangeColor=" + orangeColor +
                ", TYPE=" + TYPE +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orange orange = (Orange) o;
        return weight == orange.weight && orangeColor == orange.orangeColor && TYPE == orange.TYPE;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, orangeColor, TYPE);
    }

    public String getEnumFruitColor() {
        return orangeColor.getRusName();
    }

}
