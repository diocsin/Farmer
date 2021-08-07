package by.belarusian.farmer.utils;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;
import by.belarusian.farmer.model.Harvest;
import by.belarusian.farmer.model.newfunctioninterfeise.Filter;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class HarvestUtil {


    public static <T extends Harvest> List<T> weightGreaterThen(List<T> collection, int weight) {
        if (collection == null || collection.isEmpty()) {
            return new ArrayList<>();
        }
        return collection.stream().filter(plod -> plod.getWeight() > weight).collect(Collectors.toList());
    }

    public static <T extends Harvest> List<T> weightLessThen(List<T> collection, int weight) {
        if (collection == null || collection.isEmpty()) {
            return new ArrayList<>();
        }
        return collection.stream().filter(plod -> plod.getWeight() < weight).collect(Collectors.toList());
    }

    public static <T extends Harvest> List<T> takeOnlyType(Collection<T> collection, Class<? extends Harvest> clazz){
        if (collection == null || collection.isEmpty()) {
            return new ArrayList<T>();
        }
        return collection.stream().filter(obj -> clazz.isInstance(obj)).collect(Collectors.toList());
    }

    public static List<Harvest> filterByType(List<Harvest> list, Type type) {
        List<Harvest> filteredList = new ArrayList<>();
        for (Harvest value : list) {
            if (value.getType() == type) {
                filteredList.add(value);
            }
        }
        return filteredList;
    }

    public static List<Harvest> smallerThen(List<Harvest> harvests, int weight) {

        List<Harvest> resultHarvest = new ArrayList<>();
        for (Harvest harvest : harvests) {
            if (harvest.getWeight() < weight) {
                resultHarvest.add(harvest);
            }
        }
        return resultHarvest;

    }

    public static List<Harvest> filterByColor(List<Harvest> harvests, Color color) {
        List<Harvest> list = new ArrayList<>();
        for (Harvest harvest : harvests) {
            if (harvest.getColor() == color) {
                list.add(harvest);
            }
        }
        return list;
    }

    public static<T> List<T> filterByGreen(List<T> harvests, Filter predicate) {
        List<T> list = new ArrayList<>();
        for (T harvest : harvests) {
            if (predicate.test(harvest)) {
                list.add(harvest);
            }
        }
        return list;
    }


    public static List<Harvest> biggerThen(List<Harvest> list, int weight) {
        List<Harvest> resultHarvest = new ArrayList<>();
        for (Harvest harvest : list) {
            if (harvest.getWeight() > weight) {
                resultHarvest.add(harvest);
            }
        }
        return resultHarvest;
    }

    public static <T, R> List<R> map(List<T> list, Function<T,R> f){
        List<R> rList = new ArrayList<>();
        for(T t: list){
            rList.add(f.apply(t));
        }
        return rList;
    }

}
