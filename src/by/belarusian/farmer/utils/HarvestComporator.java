package by.belarusian.farmer.utils;

import by.belarusian.farmer.model.Harvest;

import java.util.Comparator;

public class HarvestComporator implements Comparator <Harvest> {
    @Override
    public int compare(Harvest o1, Harvest o2) {
        return o1.getWeight()-o2.getWeight();
    }
}
