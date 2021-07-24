package by.belarusian.farmer.utils;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.model.Berry;
import by.belarusian.farmer.model.Harvest;

import java.util.List;
import java.util.Random;

public class HarvestFactory {

    public static List<Harvest> getHarvest(int number) {

        Random rand = new Random();
        Color[] colors = Color.values();

        for (int i = 0; i < number; i++) {
            switch (rand.nextInt(2)) {
                case 0:
//                    return new Berry(rand.nextInt(20), colors[rand.nextInt(10)])
            }
        }


        return null;
    }
}
