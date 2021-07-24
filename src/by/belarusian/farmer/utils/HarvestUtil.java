package by.belarusian.farmer.utils;

import by.belarusian.farmer.model.Harvest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import by.belarusian.farmer.enums.Type;
import by.belarusian.farmer.model.Harvest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HarvestUtil {

<<<<<<< HEAD
    public static <T extends Harvest> List<T> weightGreaterThen(Collection<? extends Harvest> collection, int weight){
        List<?> list = collection.stream().filter(plod -> plod.getWeight() > weight).collect(Collectors.toList());
        return (List<T>) list;
    }
=======
    public List<Harvest> filterByType(List<Harvest> list, Type type) {
        List<Harvest> filteredList = new ArrayList<>();
        for (Harvest value : list) {
            if (value.getType() == type) {
                filteredList.add(value);
            }
        }
        return filteredList;
    }
    public List<Harvest> moreFilter(List<Harvest> harvests, int weight) {

        List<Harvest> resultHarvest = new ArrayList<>();
        for (Harvest harvest : harvests) {
            if (harvest.getWeight() > weight) {
                resultHarvest.add(harvest);
            }
        }
        return resultHarvest;
    }
            List<Harvest> filterOverWeight(List<Harvest> list, int weight){

                Iterator <Harvest> iter = list.iterator();
                while (iter.hasNext()){
                    iter.next().getWeight();
                        iter.remove();
                }
                return list;
            }
}
