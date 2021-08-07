package by.belarusian.farmer.model.newfunctioninterface;

import by.belarusian.farmer.model.Harvest;

@FunctionalInterface
public interface Filter <T> {

    boolean test(T obj);



}
