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
import by.belarusian.farmer.system.Basket;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HarvestFactory {

    private static Color[] colors = Color.values();
    private static Random rand = new Random();


    public static List<Basket> getAllBaskets(List<Harvest> harvests) {
        Map<Type, List<Harvest>> collect = harvests.stream().collect(Collectors.groupingBy(Harvest::getType));
        return collect.values().stream().map(list -> new Basket(list)).collect(Collectors.toList());
    }


    public static ArrayList<Harvest> generate(Class cl, int count) {

        ArrayList<Harvest> harvests = new ArrayList<>();

        if (cl.isAssignableFrom(Apple.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Apple(rand.nextInt(500), Color.values()[rand.nextInt(11)]));
            }
        }

        if (cl.isAssignableFrom(Apricot.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Apricot(rand.nextInt(20), Color.values()[rand.nextInt(11)]));
            }
        }

        if (cl.isAssignableFrom(Grape.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Grape(rand.nextInt(20), Color.values()[rand.nextInt(11)]));
            }
        }

        if (cl.isAssignableFrom(Blueberry.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Blueberry(rand.nextInt(20), Color.values()[rand.nextInt(11)]));
            }
        }

        if (cl.isAssignableFrom(Cherry.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Cherry(rand.nextInt(20), Color.values()[rand.nextInt(11)]));
            }
        }

        if (cl.isAssignableFrom(Cranberry.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Cranberry(rand.nextInt(20), Color.values()[rand.nextInt(11)]));
            }
        }

        if (cl.isAssignableFrom(Currant.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Currant(rand.nextInt(20), Color.values()[rand.nextInt(11)]));
            }
        }
        if (cl.isAssignableFrom(Strawberry.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Strawberry(rand.nextInt(20), Color.values()[rand.nextInt(11)]));
            }
        }
        if (cl.isAssignableFrom(Gooseberry.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Gooseberry(rand.nextInt(20), Color.values()[rand.nextInt(11)]));
            }
        }
        if (cl.isAssignableFrom(Banana.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Banana(rand.nextInt(20), Color.values()[rand.nextInt(11)]));
            }
        }
        if (cl.isAssignableFrom(Apricot.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Apricot(rand.nextInt(20), Color.values()[rand.nextInt(11)]));
            }
        }
        if (cl.isAssignableFrom(Garnet.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Garnet(rand.nextInt(20), Color.values()[rand.nextInt(11)]));
            }
        }
        if (cl.isAssignableFrom(Guava.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Guava(rand.nextInt(20), Color.values()[rand.nextInt(11)]));
            }
        }
        if (cl.isAssignableFrom(Lemon.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Lemon(rand.nextInt(20), Color.values()[rand.nextInt(11)]));
            }
        }
        if (cl.isAssignableFrom(Orange.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Orange(rand.nextInt(20), Color.values()[rand.nextInt(11)]));
            }
        }
        if (cl.isAssignableFrom(Plum.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Plum(rand.nextInt(20), Color.values()[rand.nextInt(11)]));
            }
        }
        if (cl.isAssignableFrom(Beet.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Beet(rand.nextInt(20), Color.values()[rand.nextInt(11)]));
            }
        }
        if (cl.isAssignableFrom(Carrot.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Carrot(rand.nextInt(20), Color.values()[rand.nextInt(11)]));
            }
        }
        if (cl.isAssignableFrom(Cucumber.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Cucumber(rand.nextInt(20), Color.values()[rand.nextInt(11)]));
            }
        }
        if (cl.isAssignableFrom(Pepper.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Pepper(rand.nextInt(20), Color.values()[rand.nextInt(11)]));
            }
        }
        if (cl.isAssignableFrom(Potato.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Potato(rand.nextInt(20), Color.values()[rand.nextInt(11)]));
            }
        }

        if (cl.isAssignableFrom(Radish.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Radish(rand.nextInt(20), Color.values()[rand.nextInt(11)]));
            }
        }
        if (cl.isAssignableFrom(Tomato.class)) {
            for (int i = 0; i < count; i++) {
                harvests.add(new Tomato(rand.nextInt(20), Color.values()[rand.nextInt(11)]));
            }
        }
        return harvests;
    }

    public static List<Harvest> generateHarvestType(int amount, Type type) {
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
            switch (rand.nextInt(3)) {

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
                return new Blueberry(rand.nextInt(10) + 1, colors[rand.nextInt(10)]);

            case 1:
                return new Cherry(rand.nextInt(20) + 1, colors[rand.nextInt(10)]);

            case 2:
                return new Cranberry(rand.nextInt(10) + 1, colors[rand.nextInt(10)]);

            case 3:
                return new Currant(rand.nextInt(10) + 1, colors[rand.nextInt(10)]);

            case 4:
                return new Gooseberry(rand.nextInt(20) + 1, colors[rand.nextInt(10)]);

            case 5:
                return new Grape(rand.nextInt(30) + 1, colors[rand.nextInt(10)]);

            default:
                return new Strawberry(rand.nextInt(100) + 1, colors[rand.nextInt(10)]);
        }
    }

    private static Fruit getFruit() {

        switch (rand.nextInt(7)) {

            case 0:
                return new Apple(rand.nextInt(500) + 1, colors[rand.nextInt(10)]);

            case 1:
                return new Apricot(rand.nextInt(400) + 1, colors[rand.nextInt(10)]);

            case 2:
                return new Banana(rand.nextInt(300) + 1, colors[rand.nextInt(10)]);

            case 3:
                return new Garnet(rand.nextInt(150) + 1, colors[rand.nextInt(10)]);

            case 4:
                return new Guava(rand.nextInt(400) + 1, colors[rand.nextInt(10)]);

            case 5:
                return new Lemon(rand.nextInt(100) + 1, colors[rand.nextInt(10)]);

            case 6:
                return new Orange(rand.nextInt(300) + 1, colors[rand.nextInt(10)]);

            default:
                return new Plum(rand.nextInt(70) + 1, colors[rand.nextInt(10)]);
        }

    }

    private static Vegetable getVegetable() {

        switch (rand.nextInt(6)) {

            case 0:
                return new Beet(rand.nextInt(200) + 1, colors[rand.nextInt(10)]);

            case 1:
                return new Carrot(rand.nextInt(200) + 1, colors[rand.nextInt(10)]);

            case 2:
                return new Cucumber(rand.nextInt(500) + 1, colors[rand.nextInt(10)]);

            case 3:
                return new Pepper(rand.nextInt(100) + 1, colors[rand.nextInt(10)]);

            case 4:
                return new Potato(rand.nextInt(300) + 1, colors[rand.nextInt(10)]);

            case 5:
                return new Radish(rand.nextInt(50) + 1, colors[rand.nextInt(10)]);

            default:
                return new Tomato(rand.nextInt(300) + 1, colors[rand.nextInt(10)]);

        }

    }


}
