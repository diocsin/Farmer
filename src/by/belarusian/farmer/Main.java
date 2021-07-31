package by.belarusian.farmer;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;
import by.belarusian.farmer.model.Berry;
import by.belarusian.farmer.model.Fruit;
import by.belarusian.farmer.model.Harvest;
import by.belarusian.farmer.model.Vegetable;
import by.belarusian.farmer.model.fruits.Apple;
import by.belarusian.farmer.model.fruits.Orange;
import by.belarusian.farmer.utils.HarvestFactory;
import by.belarusian.farmer.utils.HarvestUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
/*
Сгенерировать 50000 плодов и отсортировать по весу.
Выбрать из списка только Апельсины у которых вес меньше 1000 грамм
Выбрать из списка плодов овощи, фрукты, ягоды. Т.е. сделать 3 списка. отсортировать по весу.
*/
        List<Harvest> hl = HarvestFactory.getHarvest(50_000);
        List<Harvest> orangeList = HarvestUtil.takeOnlyType(hl, Orange.class);
        HarvestUtil.weightLessThen(orangeList, 1000).forEach(System.out::println);

        List<Harvest> berry1 = HarvestUtil.takeOnlyType(hl, Berry.class);
        List<Harvest> fruit1 = HarvestUtil.takeOnlyType(hl, Fruit.class);
        List<Harvest> vegetable1 = HarvestUtil.takeOnlyType(hl, Vegetable.class);
        berry1 = berry1.stream()
                .sorted((h1, h2) -> h1.getWeight() > h2.getWeight() ? 1 : h1.getWeight() < h2.getWeight() ? -1 : 0)
                .collect(Collectors.toList());
        berry1.forEach(System.out::println);
/*
Сгенерировать 100000 Яблок и отсортировать по весу.
Выбрать из списка только Зеленые Яблоки.
*/
        List<Harvest> apples = HarvestFactory.generate(Apple.class, 100_000);
        List<Harvest> applesGreen = HarvestUtil.filterByColor(apples, Color.GREEN);
        applesGreen = applesGreen.stream()
                .sorted((h1, h2) -> h1.getWeight() > h2.getWeight() ? 1 : h1.getWeight() < h2.getWeight() ? -1 : 0)
                .collect(Collectors.toList());
        applesGreen.forEach(System.out::println);

/*
Сгенерировать 1000000 Ягод и отсортировать по весу.
Выбрать из списка только Черные Ягоды вес которых больше 10 грамм.
*/
        List<Harvest> berry2 = HarvestFactory.generateHarvestType(1000_000, Type.BERRIES);
        berry2 = berry2.stream()
                .sorted((h1, h2) -> h1.getWeight() > h2.getWeight() ? 1 : h1.getWeight() < h2.getWeight() ? -1 : 0)
                .collect(Collectors.toList());
        berry2 = berry2.stream().filter(b -> b.getColor() == Color.BLACK && b.getWeight() > 10).collect(Collectors.toList());
        berry2.forEach(System.out::println);

//Todo Создать класс Корзина которая будет името одно поле это List<Harvest> и константу Размер корзины в граммах.
//todo Классе Фабрике плодов, сделать ещещ один метод который принимает List<Harvest> и возвращает List<Корзин> заполненных
//todo В корзинах лежат плоды одного типа.

        List<Harvest> berry = HarvestFactory.generateHarvestType(10000, Type.BERRIES);
        List<Harvest> vegetable = HarvestFactory.generateHarvestType(5000, Type.VEGETABLES);
        List<Harvest> fruit = HarvestFactory.generateHarvestType(300, Type.FRUITS);

        List<Harvest> harvestList = new ArrayList<>();
        berry.forEach(b -> harvestList.add(b));
        vegetable.forEach(v -> harvestList.add(v));
        fruit.forEach(f -> harvestList.add(f));

        HarvestFactory.getAllBaskets(harvestList).forEach(System.out::println);

    }
}
