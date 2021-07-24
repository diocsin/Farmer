package by.belarusian.farmer.utils;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.model.Berry;
import by.belarusian.farmer.model.Fruit;
import by.belarusian.farmer.model.Harvest;
import by.belarusian.farmer.model.Vegetable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HarvestFactory {

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
