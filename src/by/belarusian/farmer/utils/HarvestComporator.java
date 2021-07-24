package by.belarusian.farmer.utils;

import java.util.Comparator;

public class HarvestComporator implements Comparator <?> {
    @Override
    public int compare(Object o1, Object o2) {
        return o1.weight-o2.weight;
    }
}
