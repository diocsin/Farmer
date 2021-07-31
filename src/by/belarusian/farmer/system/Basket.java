package by.belarusian.farmer.system;

import by.belarusian.farmer.model.Harvest;

import java.util.List;

public class Basket {

    private final int totalWeight;
    private List<Harvest> harvests;

    public Basket(List<Harvest> harvests) {
        this.harvests = harvests;
        this.totalWeight = takeTotalWeight(harvests);
    }

    private int takeTotalWeight(List<Harvest> harvests) {
        return harvests.stream().mapToInt(harvest -> harvest.getWeight()).reduce(0, (x, y) -> x + y);
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "totalWeight=" + totalWeight +
                ", harvests=" + harvests.size() +
                '}';
    }
}
