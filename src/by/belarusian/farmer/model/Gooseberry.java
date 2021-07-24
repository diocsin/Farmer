package by.belarusian.farmer.model;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;

import java.util.Objects;

public class Gooseberry {
    private int weight;
    private Color color;
    private final Type type = Type.BERRIES;

    public Gooseberry(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
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
        Gooseberry that = (Gooseberry) o;
        return weight == that.weight &&
                color == that.color &&
                type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, color, type);
    }

    @Override
    public String toString() {
        return "Gooseberry{" +
                "weight=" + weight +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
