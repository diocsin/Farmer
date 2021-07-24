package by.belarusian.farmer.model.berries;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;

import java.util.Objects;

public class Strawberry {

    public final Type TYPE;

    private int weigh;

    private Color color;

    public Strawberry(Type TYPE, int weigh, Color color) {
        this.TYPE = TYPE;
        this.weigh = weigh;
        this.color = color;
    }

    public Type getTYPE() {
        return TYPE;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Strawberry that = (Strawberry) o;
        return weigh == that.weigh &&
                TYPE == that.TYPE &&
                color == that.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(TYPE, weigh, color);
    }

    @Override
    public String toString() {
        return "Strawberry{" +
                "TYPE=" + TYPE +
                ", weigh=" + weigh +
                ", color=" + color +
                '}';
    }
}
