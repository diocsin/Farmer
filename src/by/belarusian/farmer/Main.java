package by.belarusian.farmer;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.model.Fruit;
import by.belarusian.farmer.model.Harvest;
import by.belarusian.farmer.model.berries.Cherry;
import by.belarusian.farmer.model.fruits.Apple;
import by.belarusian.farmer.model.fruits.Banana;
import by.belarusian.farmer.model.fruits.Lemon;
import by.belarusian.farmer.model.vegetables.Cucumber;
import by.belarusian.farmer.model.vegetables.Tomato;
import by.belarusian.farmer.utils.HarvestUtil;
import by.belarusian.farmer.utils.PrintUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Harvest harvest1 = new Cherry(123, Color.RED);
//        Harvest harvest2 = new Cucumber(18, Color.GREEN);
//        ArrayList<Harvest> list = new ArrayList<Harvest>();
//        list.add(harvest1);
//        list.add(harvest2);
//        PrintUtil.print(list);

        Apple a1 = new Apple(500, Color.GREEN);
        Apple a2 = new Apple(400, Color.BROWN);
        Apple a3 = new Apple(200, Color.ORANGE);
        Banana b1 = new Banana(150, Color.PURPLE);
        Lemon l1 = new Lemon(520, Color.GREY);
        List<Fruit> appleList = Arrays.asList(a1,a2, a3, b1, l1);
        HarvestUtil.weightGreaterThen(appleList, 200).stream().forEach(System.out::println);



//        HarvestUtil.takeOnlyType();

    }
}
