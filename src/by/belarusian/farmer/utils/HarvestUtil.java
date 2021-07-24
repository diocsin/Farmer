package by.belarusian.farmer.utils;

import by.belarusian.farmer.enums.Type;
import by.belarusian.farmer.model.Harvest;

import java.util.ArrayList;
import java.util.List;

public class HarvestUtil {

    public List<Harvest> filter(List<Harvest> list, Type type) {
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

}
