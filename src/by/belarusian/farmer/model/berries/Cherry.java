package by.belarusian.farmer.model.berries;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;

import java.util.Objects;

public class Cherry {

    public final Type TYPE = Type.BERRIES;

    private int weigh;

    private Color color;

    public Cherry(int weigh, Color color) {
        this.weigh = weigh;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cherry{" +
                "TYPE=" + TYPE +
                ", weigh=" + weigh +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cherry cherry = (Cherry) o;
        return weigh == cherry.weigh &&
                TYPE == cherry.TYPE &&
                color == cherry.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(TYPE, weigh, color);
    }
}
