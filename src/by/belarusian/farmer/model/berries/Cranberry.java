package by.belarusian.farmer.model.berries;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;

import java.util.Objects;

public class Cranberry {

    public final Type TYPE;

    private int weigh;

    private Color color;

    public Cranberry(Type TYPE, int weigh, Color color) {
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
    public String toString() {
        return "Cranberry{" +
                "TYPE=" + TYPE +
                ", weigh=" + weigh +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cranberry cranberry = (Cranberry) o;
        return weigh == cranberry.weigh &&
                TYPE == cranberry.TYPE &&
                color == cranberry.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(TYPE, weigh, color);
    }
}
