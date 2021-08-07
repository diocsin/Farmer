package by.belarusian.farmer.model.newfunctioninterfeise;


import by.belarusian.farmer.model.Harvest;

@FunctionalInterface
public interface Filter<T> {

    boolean test(T obj);

}
