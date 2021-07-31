package by.belarusian.farmer.system;

import by.belarusian.farmer.model.Harvest;

import java.util.List;

public class Basket {

    private final int totalWeight;
    private List<Harvest> harvests;

    public Basket(int totalWeight, List<Harvest> harvests){
        this.totalWeight = takeTotalWeight(harvests);
        this.harvests = harvests;
    }

    private int takeTotalWeight(List<Harvest> harvests){
        return harvests.stream().mapToInt(harvest -> harvest.getWeight()).sum();
    }

}
