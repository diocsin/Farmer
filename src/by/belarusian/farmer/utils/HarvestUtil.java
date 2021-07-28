package by.belarusian.farmer.utils;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;
import by.belarusian.farmer.model.Fruit;
import by.belarusian.farmer.model.Harvest;
import com.sun.xml.internal.bind.v2.TODO;

import java.util.*;
import java.util.stream.Collectors;
//Todo Все методы которые публичные в этом классе должны быть static
public class HarvestUtil {

    public static <T extends Harvest> List<T> weightGreaterThen(List<T> collection, int weight) {
        if (collection.isEmpty()) {
            return new ArrayList<>();
        }
        return collection.stream().filter(plod -> plod.getWeight() > weight).collect(Collectors.toList());
    }

    public static <T extends Harvest, clazz> List<T> takeOnlyType(Collection<T> collection, Class<? extends Harvest> clazz){
        if (collection.isEmpty()) {
            return new ArrayList<>();
        }
        return collection.stream().filter(obj -> clazz.isInstance(obj)).collect(Collectors.toList());
        //collection.stream().filter(obj -> (obj.getClass().equals(clazz))).collect(Collectors.toList());
    }

    public static List<Harvest> filterByType(List<Harvest> list, Type type) {
        List<Harvest> filteredList = new ArrayList<>();
        for (Harvest value : list) {
            if (value.getType() == type) {
                filteredList.add(value);
            }
        }
        filteredList.sort(new HarvestComporator()); //todo лищняя операция.
        return filteredList;
    }

    public static List<Harvest> smallerThen(List<Harvest> harvests, int weight) {

        List<Harvest> resultHarvest = new ArrayList<>();
        for (Harvest harvest : harvests) {
            if (harvest.getWeight() < weight) {
                resultHarvest.add(harvest);
            }
        }
        resultHarvest.sort(new HarvestComporator()); //todo лищняя операция.
        return resultHarvest;

    }

    public static List<Harvest> filterByColor(List<Harvest> harvests, Color color) {
        List<Harvest> list = new ArrayList<>();
        for (Harvest harvest : harvests) {
            if (harvest.getColor() == color) {
                list.add(harvest);
            }
        }
        list.sort(new HarvestComporator()); //todo лищняя операция.
        return list;
    }

    public static List<Harvest> biggerThen(List<Harvest> list, int weight) {
        Iterator<Harvest> iter = list.iterator();
        while (iter.hasNext()) {
            if (iter.next().getWeight() < weight) {
                iter.remove();
            }
            Collections.sort(list, new HarvestComporator()); //todo лищняя операция.
        }
        list.sort(new HarvestComporator()); //todo лищняя операция.
        return list;
    }
}
