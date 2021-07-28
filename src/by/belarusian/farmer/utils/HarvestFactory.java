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

    private static Color[] colors = Color.values();
    private static Type[] types = Type.values();
    private static Random rand = new Random();


    public static ArrayList<Harvest> generate(Class cl, int count) {

        ArrayList<Harvest> harvests = new ArrayList<>();

        if (cl.isInstance(Apple.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Apple(rand.nextInt(3), Color.values()[rand.nextInt(12)]));
            }
        }

        if (cl.isInstance(Apricot.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Apricot(rand.nextInt(3), Color.values()[rand.nextInt(12)]));
            }
        }

        if (cl.isInstance(Grape.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Grape(rand.nextInt(3), Color.values()[rand.nextInt(12)]));
            }
        }

        if (cl.isInstance(Blueberry.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Blueberry(rand.nextInt(3), Color.values()[rand.nextInt(12)]));
            }
        }

        if (cl.isInstance(Cherry.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Cherry(rand.nextInt(3), Color.values()[rand.nextInt(12)]));
            }
        }

        if (cl.isInstance(Cranberry.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Cranberry(rand.nextInt(3), Color.values()[rand.nextInt(12)]));
            }
        }

        if (cl.isInstance(Currant.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Currant(rand.nextInt(3), Color.values()[rand.nextInt(12)]));
            }
        }
        if (cl.isInstance(Strawberry.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Strawberry(rand.nextInt(3), Color.values()[rand.nextInt(12)]));
            }
        }
        if (cl.isInstance(Gooseberry.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Gooseberry(rand.nextInt(3), Color.values()[rand.nextInt(12)]));
            }
        }
        if (cl.isInstance(Banana.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Banana(rand.nextInt(3), Color.values()[rand.nextInt(12)]));
            }
        }
        if (cl.isInstance(Apricot.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Apricot(rand.nextInt(3), Color.values()[rand.nextInt(12)]));
            }
        }
        if (cl.isInstance(Garnet.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Garnet(rand.nextInt(3), Color.values()[rand.nextInt(12)]));
            }
        }
        if (cl.isInstance(Guava.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Guava(rand.nextInt(3), Color.values()[rand.nextInt(12)]));
            }
        }
        if (cl.isInstance(Lemon.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Lemon(rand.nextInt(3), Color.values()[rand.nextInt(12)]));
            }
        }
        if (cl.isInstance(Orange.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Orange(rand.nextInt(3), Color.values()[rand.nextInt(12)]));
            }
        }
        if (cl.isInstance(Plum.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Plum(rand.nextInt(3), Color.values()[rand.nextInt(12)]));
            }
        }
        if (cl.isInstance(Beet.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Beet(rand.nextInt(3), Color.values()[rand.nextInt(12)]));
            }
        }
        if (cl.isInstance(Carrot.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Carrot(rand.nextInt(3), Color.values()[rand.nextInt(12)]));
            }
        }
        if (cl.isInstance(Cucumber.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Cucumber(rand.nextInt(3), Color.values()[rand.nextInt(12)]));
            }
        }
        if (cl.isInstance(Pepper.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Pepper(rand.nextInt(3), Color.values()[rand.nextInt(12)]));
            }
        }
        if (cl.isInstance(Potato.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Potato(rand.nextInt(3), Color.values()[rand.nextInt(12)]));
            }
        }

        if (cl.isInstance(Radish.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Radish(rand.nextInt(3), Color.values()[rand.nextInt(12)]));
            }
        }
        if (cl.isInstance(Tomato.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Tomato(rand.nextInt(3), Color.values()[rand.nextInt(12)]));
            }
        }
        return harvests;
    }

    public static List<Harvest> getHarvestType(int amount, Type type) {
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

    public static List<Harvest> getHarvest(int number) {

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

    private static Berry getBerry() {

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

            default:
                return new Strawberry(rand.nextInt(100), colors[rand.nextInt(10)]);
        }
    }

    private static Fruit getFruit() {

        switch (rand.nextInt(7)) {

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

            default:
                return new Plum(rand.nextInt(70), colors[rand.nextInt(10)]);
        }

    }

    private static Vegetable getVegetable() {

        switch (rand.nextInt(6)) {

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

            default:
                return new Tomato(rand.nextInt(300), colors[rand.nextInt(10)]);

        }

    }


}
