package by.belarusian.farmer;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.model.Berry;
import by.belarusian.farmer.model.Fruit;
import by.belarusian.farmer.model.Harvest;
import by.belarusian.farmer.model.Vegetable;
import by.belarusian.farmer.model.berries.Blueberry;
import by.belarusian.farmer.model.berries.Cherry;
import by.belarusian.farmer.model.fruits.Apple;
import by.belarusian.farmer.model.fruits.Banana;
import by.belarusian.farmer.model.fruits.Lemon;
import by.belarusian.farmer.model.vegetables.Beet;
import by.belarusian.farmer.model.vegetables.Cucumber;
import by.belarusian.farmer.model.vegetables.Pepper;
import by.belarusian.farmer.model.vegetables.Tomato;
import by.belarusian.farmer.utils.HarvestUtil;
import by.belarusian.farmer.utils.PrintUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
//Todo Создать класс Корзина которая будет името одно поле это List<Harvest> и константу Размер корзины в граммах.
    //todo Классе Фабрике плодов, сделать ещещ один метод который принимает List<Harvest> и возвращает List<Корзин> заполненных
    //todo В корзинах лежат плоды одного типа.
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
        List<Fruit> fruits = Arrays.asList(a1, a2, a3, b1, l1);
        HarvestUtil.weightGreaterThen(fruits, 200).stream().forEach(System.out::println); //todo Stream лишнее

        Beet be1 = new Beet(300, Color.GREY);
        Pepper pe1 = new Pepper(270, Color.BLACK);
        Cherry ce1 = new Cherry(100, Color.RED);
        Blueberry blu1 = new Blueberry(50, Color.BLUE);
        List<Harvest> harvests = Arrays.asList(a1, a2, a3, b1, l1, be1, pe1, ce1, blu1);
        System.out.println();
        HarvestUtil.takeOnlyType(harvests, Vegetable.class).stream().forEach(System.out::println);

    }
}
