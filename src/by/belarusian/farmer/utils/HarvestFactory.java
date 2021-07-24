package by.belarusian.farmer.utils;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.model.Fruit;
import by.belarusian.farmer.model.Harvest;
import by.belarusian.farmer.model.berries.*;
import by.belarusian.farmer.model.fruits.*;
import java.util.ArrayList;
import java.util.Random;
import by.belarusian.farmer.model.Berry;
import by.belarusian.farmer.model.Vegetable;
import by.belarusian.farmer.model.vegetables.*;


import java.util.List;


public class HarvestFactory {

    public ArrayList<Harvest> generate(Class cl, int count) {

        ArrayList<Harvest> harvests = new ArrayList<>();
        Random random = new Random();

        if (cl.isInstance(Apple.class)) {
            for(int i = 0; i < count; i++) {
                harvests.add(new Apple(random.nextInt(3), Color.values()[random.nextInt(12)]));

            }

        }

        if (cl.isInstance(Apricot.class)) {
            for(int i = 0; i < count; i++) {
                harvests.add(new Apricot(random.nextInt(3), Color.values()[random.nextInt(12)]));
            }
        }

        if (cl.isInstance(Grape.class)) {
            for(int i = 0; i < count; i++) {
                harvests.add(new Grape(random.nextInt(3), Color.values()[random.nextInt(12)]));
            }
        }

        if (cl.isInstance(Blueberry.class)) {
            for(int i = 0; i < count; i++) {
                harvests.add(new Blueberry(random.nextInt(3), Color.values()[random.nextInt(12)]));
            }
        }

        if (cl.isInstance(Cherry.class)) {
            for(int i = 0; i < count; i++) {
                harvests.add(new Cherry(random.nextInt(3), Color.values()[random.nextInt(12)]));
            }
        }

        if (cl.isInstance(Cranberry.class)) {
            for(int i = 0; i < count; i++) {
                harvests.add(new Cranberry(random.nextInt(3), Color.values()[random.nextInt(12)]));
            }
        }

        if (cl.isInstance(Currant.class)) {
            for(int i = 0; i < count; i++) {
                harvests.add(new Currant(random.nextInt(3), Color.values()[random.nextInt(12)]));
            }
        }
        if (cl.isInstance(Strawberry.class)) {
            for(int i = 0; i < count; i++) {
                harvests.add(new Strawberry(random.nextInt(3), Color.values()[random.nextInt(12)]));
            }
        }
        if (cl.isInstance(Gooseberry.class)) {
            for(int i = 0; i < count; i++) {
                harvests.add(new Gooseberry(random.nextInt(3), Color.values()[random.nextInt(12)]));
            }
        }
        if (cl.isInstance(Banana.class)) {
            for(int i = 0; i < count; i++) {
                harvests.add(new Banana(random.nextInt(3), Color.values()[random.nextInt(12)]));
            }
        }
        if (cl.isInstance(Apricot.class)) {
            for(int i = 0; i < count; i++) {
                harvests.add(new Apricot(random.nextInt(3), Color.values()[random.nextInt(12)]));
            }
        }
        if (cl.isInstance(Garnet.class)) {
            for(int i = 0; i < count; i++) {
                harvests.add(new Garnet(random.nextInt(3), Color.values()[random.nextInt(12)]));
            }
        }
        if (cl.isInstance(Guava.class)) {
            for(int i = 0; i < count; i++) {
                harvests.add(new Guava(random.nextInt(3), Color.values()[random.nextInt(12)]));
            }
        }
        if (cl.isInstance(Lemon.class)) {
            for(int i = 0; i < count; i++) {
                harvests.add(new Lemon(random.nextInt(3), Color.values()[random.nextInt(12)]));
            }
        }
        if (cl.isInstance(Orange.class)) {
            for(int i = 0; i < count; i++) {
                harvests.add(new Orange(random.nextInt(3), Color.values()[random.nextInt(12)]));
            }
        }
        if (cl.isInstance(Plum.class)) {
            for(int i = 0; i < count; i++) {
                harvests.add(new Plum(random.nextInt(3), Color.values()[random.nextInt(12)]));
            }
        }
        if (cl.isInstance(Beet.class)) {
            for(int i = 0; i < count; i++) {
                harvests.add(new Beet(random.nextInt(3), Color.values()[random.nextInt(12)]));
            }
        }
        if (cl.isInstance(Carrot.class)) {
            for(int i = 0; i < count; i++) {
                harvests.add(new Carrot(random.nextInt(3), Color.values()[random.nextInt(12)]));
            }
        }
        if (cl.isInstance(Cucumber.class)) {
            for(int i = 0; i < count; i++) {
                harvests.add(new Cucumber(random.nextInt(3), Color.values()[random.nextInt(12)]));
            }
        }
        if (cl.isInstance(Pepper.class)) {
            for(int i = 0; i < count; i++) {
                harvests.add(new Pepper(random.nextInt(3), Color.values()[random.nextInt(12)]));
            }
        }
        if (cl.isInstance(Potato.class)) {
            for(int i = 0; i < count; i++) {
                harvests.add(new Potato(random.nextInt(3), Color.values()[random.nextInt(12)]));
            }
        }

        if (cl.isInstance(Radish.class)) {
            for(int i = 0; i < count; i++) {
                harvests.add(new Radish(random.nextInt(3), Color.values()[random.nextInt(12)]));
            }
        }
        if (cl.isInstance(Tomato.class)) {
            for(int i = 0; i < count; i++) {
                harvests.add(new Tomato(random.nextInt(3), Color.values()[random.nextInt(12)]));
            }
        }
        return harvests;
    }

    public void test() {
        generate(Apple.class, 23);
    }
    private Random rand = new Random();
    private Color[] colors = Color.values();


    public List<Harvest> getHarvest(int number) {
        List<Harvest> harvestList = new ArrayList<>();


        for (int i = 0; i < number; i++) {
            switch (rand.nextInt(2)) {
                case 0:

            }
        }


        return harvestList;
    }

    private Berry getBerry(){

        return null;
    }

    private Fruit getFruit(){

        return null;
    }

    private Vegetable getVegetable(){

        return null;
    }
}
