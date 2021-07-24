package by.belarusian.farmer.utils;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.model.Fruit;
import by.belarusian.farmer.model.Harvest;
import by.belarusian.farmer.model.fruits.Apple;
import by.belarusian.farmer.model.fruits.Lemon;

import java.util.ArrayList;
import java.util.Random;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.model.Berry;
import by.belarusian.farmer.model.Fruit;
import by.belarusian.farmer.model.Harvest;
import by.belarusian.farmer.model.Vegetable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HarvestFactory {

    public ArrayList<Harvest> generate(Class cl, int count) {

        ArrayList<Harvest> harvests = new ArrayList<>();
        Random random = new Random();

        if (cl.isInstance(Apple.class)) {
            for(int i = 0; i < count; i++) {
                harvests.add(new Apple(random.nextInt(3), Color.GREEN));
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
