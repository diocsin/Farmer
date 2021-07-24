package by.belarusian.farmer.utils;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;
import by.belarusian.farmer.model.Fruit;
import by.belarusian.farmer.model.Harvest;

import java.util.*;
import java.util.stream.Collectors;

public class HarvestUtil {

    public static <T extends Harvest> List<T> weightGreaterThen(List<T> collection, int weight) {
        if (collection.isEmpty() || collection == null) {
            return new ArrayList<>();
        }
        return collection.stream().filter(plod -> plod.getWeight() > weight).collect(Collectors.toList());
    }

    public static <T extends Harvest> List<T> takeOnlyType(Collection<T> collection, Class clazz){
        return collection.stream().filter(obj -> obj.equals(clazz)).collect(Collectors.toList());
    }




    public List<Harvest> filterByType(List<Harvest> list, Type type) {
        List<Harvest> filteredList = new ArrayList<>();
        for (Harvest value : list) {
            if (value.getType() == type) {
                filteredList.add(value);
            }
        }
        filteredList.sort(new HarvestComporator());
        return filteredList;
    }

    public List<Harvest> smallerThen(List<Harvest> harvests, int weight) {

        List<Harvest> resultHarvest = new ArrayList<>();
        for (Harvest harvest : harvests) {
            if (harvest.getWeight() < weight) {
                resultHarvest.add(harvest);
            }
        }
        resultHarvest.sort(new HarvestComporator());
        return resultHarvest;

    }

    public List<Harvest> filterByColor(List<Harvest> harvests, Color color) {
        List<Harvest> list = new ArrayList<>();
        for (Harvest harvest : harvests) {
            if (harvest.getColor() == color) {
                list.add(harvest);
            }
        }
        list.sort(new HarvestComporator());
        return list;
    }

    List<Harvest> biggerThen(List<Harvest> list, int weight) {
        Iterator<Harvest> iter = list.iterator();
        while (iter.hasNext()) {
            if (iter.next().getWeight() < weight) {
                iter.remove();
            }
            Collections.sort(list, new HarvestComporator());
        }
        list.sort(new HarvestComporator());
        return list;
    }
}
