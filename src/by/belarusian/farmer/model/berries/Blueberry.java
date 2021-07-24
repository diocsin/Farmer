package by.belarusian.farmer.model.berries;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;

import java.util.Objects;

public class Blueberry {

    public final Type TYPE;

    private int weigh;

    private Color color;

    public Blueberry(Type TYPE, int weigh, Color color) {
        this.TYPE = TYPE;
        this.weigh = weigh;
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
