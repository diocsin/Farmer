package by.belarusian.farmer.model.berries;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;

import java.util.Objects;

public class Blueberry {

    public final Type TYPE = Type.BERRIES;

    private int weigh;

    private Color color;

    public Blueberry(int weigh, Color color) {
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
        return "Blueberry{" +
                "TYPE=" + TYPE +
                ", weigh=" + weigh +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blueberry blueberry = (Blueberry) o;
        return weigh == blueberry.weigh &&
                TYPE == blueberry.TYPE &&
                color == blueberry.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(TYPE, weigh, color);
    }
}
