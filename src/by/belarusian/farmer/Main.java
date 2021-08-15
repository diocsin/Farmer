package by.belarusian.farmer;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;
import by.belarusian.farmer.model.Harvest;
import by.belarusian.farmer.model.Basket;
import by.belarusian.farmer.utils.HarvestFactory;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;


public class Main {
    public static void main(String[] args) {
/*
Сгенерировать 50000 плодов и отсортировать по весу.
Выбрать из списка только Апельсины у которых вес меньше 1000 грамм
Выбрать из списка плодов овощи, фрукты, ягоды. Т.е. сделать 3 списка. отсортировать по весу.
*/
    /*    List<Harvest> hl = HarvestFactory.getHarvest(50_000);
        List<Harvest> orangeList = HarvestUtil.takeOnlyType(hl, Orange.class);
        HarvestUtil.weightLessThen(orangeList, 1000).forEach(System.out::println);

        List<Harvest> berry1 = HarvestUtil.takeOnlyType(hl, Berry.class);
        List<Harvest> fruit1 = HarvestUtil.takeOnlyType(hl, Fruit.class);
        List<Harvest> vegetable1 = HarvestUtil.takeOnlyType(hl, Vegetable.class);
        berry1 = berry1.stream()
                .sorted((h1, h2) -> h1.getWeight() > h2.getWeight() ? 1 : h1.getWeight() < h2.getWeight() ? -1 : 0)
                .collect(Collectors.toList());
        berry1.forEach(System.out::println);*/
/*
Сгенерировать 100000 Яблок и отсортировать по весу.
Выбрать из списка только Зеленые Яблоки.
*/
       /* List<Harvest> apples = HarvestFactory.generate(Apple.class, 100_000);
        List<Harvest> applesGreen = HarvestUtil.filterByColor(apples, Color.GREEN);
        applesGreen = applesGreen.stream()
                .sorted((h1, h2) -> h1.getWeight() > h2.getWeight() ? 1 : h1.getWeight() < h2.getWeight() ? -1 : 0)
                .collect(Collectors.toList());
        applesGreen.forEach(System.out::println);*/

/*
Сгенерировать 1000000 Ягод и отсортировать по весу.
Выбрать из списка только Черные Ягоды вес которых больше 10 грамм.
*/
       /* List<Harvest> berry2 = HarvestFactory.generateHarvestType(1000_000, Type.BERRIES);
        berry2 = berry2.stream()
                .sorted((h1, h2) -> h1.getWeight() > h2.getWeight() ? 1 : h1.getWeight() < h2.getWeight() ? -1 : 0)
                .collect(Collectors.toList());
        berry2 = berry2.stream().filter(b -> b.getColor() == Color.BLACK && b.getWeight() > 10).collect(Collectors.toList());
        berry2.forEach(System.out::println);*/

//Todo Создать класс Корзина которая будет името одно поле это List<Harvest> и константу Размер корзины в граммах.
//todo Классе Фабрике плодов, сделать ещещ один метод который принимает List<Harvest> и возвращает List<Корзин> заполненных
//todo В корзинах лежат плоды одного типа.

        /*List<Harvest> berry = HarvestFactory.generateHarvestType(10000, Type.BERRIES);
        List<Harvest> vegetable = HarvestFactory.generateHarvestType(5000, Type.VEGETABLES);
        List<Harvest> fruit = HarvestFactory.generateHarvestType(300, Type.FRUITS);

        List<Harvest> harvestList = new ArrayList<>();
        berry.forEach(b -> harvestList.add(b));
        vegetable.forEach(v -> harvestList.add(v));
        fruit.forEach(f -> harvestList.add(f));*/

        // HarvestFactory.getAllBaskets(harvestList).forEach(System.out::println);


      /*  List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> result = HarvestUtil.filterByAll(integerList, new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        });
        System.out.println(result);

        List<String> nameList = new ArrayList<>((Arrays.asList("Иван", "Сергей", "Дмитрий", "Леонид", "Егор", "Сергей")));
        List<String> nameResult = HarvestUtil.filterByAll(nameList, new Predicate<String>() {
            @Override
            public boolean test(String name) {
                //return name.equals("Сергей");
                return name.contains("Сергей");
            }
        });
        System.out.println(nameResult);*/

        List<Harvest> harvests = HarvestFactory.getHarvest(50);
        /*List<Harvest> color = HarvestUtil.filterByAll(harvests, (Harvest h) -> Color.RED.equals(h.getColor()));
        System.out.println(color);*/


        // Comparator<Harvest> harvestComparator = ();

      /*  harvests.sort((Harvest o1, Harvest o2) -> Integer.compare(o1.getWeight(), o2.getWeight()));
        System.out.println(harvests);

        List<String> nameArray = new ArrayList<>((Arrays.asList("Иван", "Сергей", "Дмитрий", "Леонид", "Егор", "Сергей")));
        List<Integer> integers = HarvestUtil.map(nameArray, (String name) -> name.length());
        System.out.println(integers);

        List<Integer> listInteger = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> newInteger = HarvestUtil.map(listInteger, (Integer number) -> number * 10);
        System.out.println(newInteger);

        List<String> nameArray2 = new ArrayList<>((Arrays.asList("Иван", "Сергей", "Дмитрий", "Леонид", "Егор", "Сергей")));
        List<Integer> integers2 = HarvestUtil.map(nameArray, String::length);
        System.out.println(integers);

        nameArray.sort((String s1, String s2) -> s1.compareTo(s2));

        nameArray2.sort(String::compareTo);

        System.out.println(nameArray2);


        harvests.stream().filter((Harvest h) -> Color.RED.equals(h.getColor())).forEach((Harvest h) -> System.out.println(h));
        Long count = harvests.stream().filter((Harvest h) -> Color.RED.equals(h.getColor())).count();
        System.out.println(count);

        List <Harvest> list = harvests.stream()
                .filter((Harvest h) -> Color.RED.equals(h.getColor()))
                .sorted(Comparator.comparing(harvest -> harvest.getWeight()))
                .collect(Collectors.toList());

        System.out.println(list);

       List <Integer> weightSum = list.stream()
                .filter((Harvest h) -> Color.RED.equals(h.getColor()))
                .sorted(Comparator.comparing(harvest -> harvest.getWeight()))
                .map((Harvest h)-> h.getWeight())
                .collect(Collectors.toList());
        System.out.println(weightSum);*/


        Map<Type, List<Harvest>> listMap = harvests.stream().collect(groupingBy((Harvest h) -> h.getType()));
        //  System.out.println(listMap);


        List<Integer> collect = harvests.stream().map(harvest -> harvest.getWeight()).distinct().collect(Collectors.toList());
        //  System.out.println(collect);

        /*1.Переписать метод HarvestFactory.getAllBaskets c использованием java 8. (получится 2 строки)
                ------Положить все плоды в корзины.------
            2. Найти все в корзинах все плоды которые больше 50 грамм и Черного или Белого Цвета.
            3. Вернуть строку со всеми именами плодов отсортированные в алфавитном порядке.
            4. Узнать есть ли хоть однин огурец в корзинах.
            5. Вывести сумму веса всех корзин.
            6. Каков вес самого тяжелого плода в корзинах.
            7. Найти самый легкий плод в корзинах.
            8. Вывести все имена плодов большими буквами без повторений через точку с запятой.
        */
        doTasks();
    }

    public static void doTasks() {
        List<Harvest> harvest = HarvestFactory.getHarvest(100);
        List<Basket> allBaskets = HarvestFactory.getAllBaskets(harvest);
        allBaskets.stream().flatMap(b -> b.getHarvests().stream())
                .filter(h -> h.getWeight() > 50)
                .filter(h -> h.getColor() == Color.BLACK || h.getColor() == Color.WHITE).forEach(System.out::println);
        System.out.println();
        allBaskets.stream().flatMap(b -> b.getHarvests().stream()).map(Harvest::getRusName).sorted().forEach(System.out::println);
        System.out.println();
        boolean isCucumber = allBaskets.stream().flatMap(b -> b.getHarvests().stream()).anyMatch(h -> h.getRusName().equals("Огурец"));
        System.out.println("Огурец " + isCucumber);
        int sum = allBaskets.stream().mapToInt(Basket::getTotalWeight).sum();
        System.out.printf("Вес всех коризн %d\n", sum);
        OptionalInt max = allBaskets.stream().flatMap(b -> b.getHarvests().stream()).mapToInt(Harvest::getWeight).max();
        System.out.printf("Максимальный вес %d\n", max.getAsInt());
        Optional<Harvest> minHarvest = allBaskets.stream().flatMap(b -> b.getHarvests().stream()).reduce((h1, h2) -> h1.getWeight() < h2.getWeight() ? h1 : h2);
        System.out.println("Самый легкий плод " + minHarvest.get());
        allBaskets.stream().flatMap(b -> b.getHarvests().stream()).map(Harvest::getRusName)
                .map(String::toUpperCase).distinct().forEach(s -> System.out.printf("%s; ", s));
        IntSummaryStatistics collect = allBaskets.stream().flatMap(b -> b.getHarvests().stream()).collect(Collectors.summarizingInt(Harvest::getWeight));
        String collect1 = allBaskets.stream().flatMap(b -> b.getHarvests().stream()).map(Harvest::getRusName)
                .map(String::toUpperCase).distinct().collect(Collectors.joining("; "));
        System.out.println(collect1);

        List<String> fr = Arrays.asList("as", "ad", "da");
        fr.add("sd");


    }


}
