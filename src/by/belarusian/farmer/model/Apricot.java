package by.belarusian.farmer.model;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;

import java.util.Objects;

public class Apricot {
    private int weight;

    private Color color;

    private final Type TYPE = Type.FRUITS;

    public Apricot(int weight, Color color) {
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

    public Type getTYPE() {
        return TYPE;
    }

    @Override
    public String toString() {
        return "Apricot{" +
                "weight=" + weight +
                ", color=" + color +
                ", TYPE=" + TYPE +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apricot apricot = (Apricot) o;
        return weight == apricot.weight && color == apricot.color && TYPE == apricot.TYPE;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, color, TYPE);
    }
}


