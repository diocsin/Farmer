package by.belarusian.farmer.utils;

import by.belarusian.farmer.enums.Type;
import by.belarusian.farmer.model.Harvest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class HarvestUtil {

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
                    if(iter.next().getWeight()<weight) {
                        iter.remove();
                    }
                    Collections.sort(list, new HarvestComporator());
                }
                return list;
            }
}
