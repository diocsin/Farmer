package by.belarusian.farmer.utils;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;
import by.belarusian.farmer.model.Berry;
import by.belarusian.farmer.model.Fruit;
import by.belarusian.farmer.model.Harvest;
import by.belarusian.farmer.model.Vegetable;
import by.belarusian.farmer.model.berries.*;
import by.belarusian.farmer.model.fruits.*;
import by.belarusian.farmer.model.vegetables.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HarvestFactory {

    private Random rand = new Random();
    private Color[] colors = Color.values();
    private Type[] types = Type.values();

    public List<Harvest> getHarvestType(int amount, Type type) {
        List<Harvest> harvestList = new ArrayList<>();

        if (type == Type.VEGETABLES) {
            for (int i = 0; i < amount; i++) {
                harvestList.add(getVegetable());
            }
        }

        if (type == Type.FRUITS) {
            for (int i = 0; i < amount; i++) {
                harvestList.add(getFruit());
            }
        }

        if (type == Type.BERRIES) {
            for (int i = 0; i < amount; i++) {
                harvestList.add(getBerry());
            }
        }

        return harvestList;
    }

    public List<Harvest> getHarvest(int number) {
        List<Harvest> harvestList = new ArrayList<>();


        for (int i = 0; i < number; i++) {
            switch (rand.nextInt(2)) {

                case 0:
                    harvestList.add(getBerry());
                    break;

                case 1:
                    harvestList.add(getFruit());
                    break;

                case 2:
                    harvestList.add(getVegetable());
                    break;
            }
        }


        return harvestList;
    }

    private Berry getBerry() {

        switch (rand.nextInt(6)) {

            case 0:
                return new Blueberry(rand.nextInt(10), colors[rand.nextInt(10)]);

            case 1:
                return new Cherry(rand.nextInt(20), colors[rand.nextInt(10)]);

            case 2:
                return new Cranberry(rand.nextInt(10), colors[rand.nextInt(10)]);

            case 3:
                return new Currant(rand.nextInt(10), colors[rand.nextInt(10)]);

            case 4:
                return new Gooseberry(rand.nextInt(20), colors[rand.nextInt(10)]);

            case 5:
                return new Grape(rand.nextInt(30), colors[rand.nextInt(10)]);
        }
        return new Strawberry(rand.nextInt(100), colors[rand.nextInt(10)]);
    }

    private Fruit getFruit() {

        switch (rand.nextInt(7)){

            case 0:
                return new Apple(rand.nextInt(500), colors[rand.nextInt(10)]);

            case 1:
                return new Apricot(rand.nextInt(400), colors[rand.nextInt(10)]);

            case 2:
                return new Banana(rand.nextInt(300), colors[rand.nextInt(10)]);

            case 3:
                return new Garnet(rand.nextInt(150), colors[rand.nextInt(10)]);

            case 4:
                return new Guava(rand.nextInt(400), colors[rand.nextInt(10)]);

            case 5:
                return new Lemon(rand.nextInt(100), colors[rand.nextInt(10)]);

            case 6:
                return new Orange(rand.nextInt(300), colors[rand.nextInt(10)]);

        }
        return new Plum(rand.nextInt(70), colors[rand.nextInt(10)]);
    }

    private Vegetable getVegetable() {

        switch (rand.nextInt(6)){

            case 0:
                return new Beet(rand.nextInt(200), colors[rand.nextInt(10)]);

            case 1:
                return new Carrot(rand.nextInt(200), colors[rand.nextInt(10)]);

            case 2:
                return new Cucumber(rand.nextInt(500), colors[rand.nextInt(10)]);

            case 3:
                return new Pepper(rand.nextInt(100), colors[rand.nextInt(10)]);

            case 4:
                return new Potato(rand.nextInt(300), colors[rand.nextInt(10)]);

            case 5:
                return new Radish(rand.nextInt(50), colors[rand.nextInt(10)]);

        }
        return new Tomato(rand.nextInt(300), colors[rand.nextInt(10)]);
    }
}
