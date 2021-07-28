package by.belarusian.farmer.model;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;

public abstract class Harvest {

    private Type type; //Todo Должно быть final

    private int weight;

    private Color color;

    public Harvest(int weight, Color color) {
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

    public void setType(Type type) {
        this.type = type;
    }

    public String getRusName(){
        return "Плод";
    } //Todo убрать и перенести в toString

    //Todo тут должен быть HashCode и Equals
    @Override
    public String toString() {
        return this.getType().getRusName() + " - " + this.getRusName() + " " + this.getWeight() + " грамм, цвет - " + this.getColor().getRusName();
    }
}
