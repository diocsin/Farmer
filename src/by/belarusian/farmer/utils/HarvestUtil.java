package by.belarusian.farmer.utils;

import by.belarusian.farmer.model.Harvest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class HarvestUtil {

    public static <T extends Harvest> List<T> weightGreaterThen(Collection<? extends Harvest> collection, int weight){
        List<?> list = collection.stream().filter(plod -> plod.getWeight() > weight).collect(Collectors.toList());
        return (List<T>) list;
    }
}
