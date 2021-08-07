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
        return harvests.stream().mapToInt(Harvest::getWeight).sum();

    }

    public List<Harvest> getHarvests() {
        return harvests;
    }

    public void setHarvests(List<Harvest> harvests) {
        this.harvests = harvests;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public List<Harvest> getHarvests(){
        return harvests;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "totalWeight=" + totalWeight +
                ", harvests=" + harvests.size() +
                '}';
    }
}
