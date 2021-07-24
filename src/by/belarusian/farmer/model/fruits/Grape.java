package by.belarusian.farmer.model.fruits;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;

import java.util.Objects;

public class Grape {
    private double weight;
    private Color color;
    private final Type type = Type.BERRIES;

    public Grape(double weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grape grape = (Grape) o;
        return Double.compare(grape.weight, weight) == 0 &&
                color == grape.color &&
                type == grape.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, color, type);
    }

    @Override
    public String toString() {
        return "Grape{" +
                "weight=" + weight +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
