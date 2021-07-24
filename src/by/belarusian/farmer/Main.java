package by.belarusian.farmer;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.model.Harvest;
import by.belarusian.farmer.model.berries.Cherry;
import by.belarusian.farmer.model.fruits.Apple;
import by.belarusian.farmer.model.vegetables.Cucumber;
import by.belarusian.farmer.model.vegetables.Tomato;
import by.belarusian.farmer.utils.PrintUtil;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Harvest harvest1 = new Cherry(123, Color.RED);
        Harvest harvest2 = new Cucumber(18, Color.GREEN);
        ArrayList<Harvest> list = new ArrayList<Harvest>();
        list.add(harvest1);
        list.add(harvest2);
        PrintUtil.print(list);
    }
}
