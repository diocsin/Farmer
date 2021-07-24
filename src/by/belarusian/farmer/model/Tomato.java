package by.belarusian.farmer.model;

import by.belarusian.farmer.enums.Type;

public class Tomato {
    private int weight;
    private final Type type = Type.VEGETABLES;


    public Type getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
