package by.belarusian.farmer.utils;

import by.belarusian.farmer.model.Harvest;

import java.util.Comparator;

public class HarvestComparator implements Comparator <Harvest> {
    @Override
    public int compare(Harvest o1, Harvest o2) {
        if (o1.getWeight() == o2.getWeight()) {
            return 0;
        } else if (o1.getWeight() < o2.getWeight()) {
            return -1;
        } else {
            return 1;
        }

    }


}