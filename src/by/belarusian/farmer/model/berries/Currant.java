package by.belarusian.farmer.model.berries;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;

import java.util.Objects;

public class Currant {

    public final Type TYPE;

    private int weigh;

    private Color color;

    public Currant(Type TYPE, int weigh, Color color) {
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
        return "Currant{" +
                "TYPE=" + TYPE +
                ", weigh=" + weigh +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currant currant = (Currant) o;
        return weigh == currant.weigh &&
                TYPE == currant.TYPE &&
                color == currant.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(TYPE, weigh, color);
    }
}
