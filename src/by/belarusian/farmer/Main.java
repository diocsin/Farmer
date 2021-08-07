package by.belarusian.farmer;

import by.belarusian.farmer.enums.Color;
import by.belarusian.farmer.enums.Type;
import by.belarusian.farmer.model.Harvest;
import by.belarusian.farmer.model.fruits.Apple;
import by.belarusian.farmer.model.newfunctioninterfeise.Filter;
import by.belarusian.farmer.utils.HarvestFactory;
import by.belarusian.farmer.utils.HarvestUtil;
import org.w3c.dom.ls.LSOutput;

import java.io.InputStream;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
///*
//Сгенерировать 50000 плодов и отсортировать по весу.
//Выбрать из списка только Апельсины у которых вес меньше 1000 грамм
//Выбрать из списка плодов овощи, фрукты, ягоды. Т.е. сделать 3 списка. отсортировать по весу.
//*/
//        List<Harvest> hl = HarvestFactory.getHarvest(50_000);
//        List<Harvest> orangeList = HarvestUtil.takeOnlyType(hl, Orange.class);
//        HarvestUtil.weightLessThen(orangeList, 1000).forEach(System.out::println);
//
//        List<Harvest> berry1 = HarvestUtil.takeOnlyType(hl, Berry.class);
//        List<Harvest> fruit1 = HarvestUtil.takeOnlyType(hl, Fruit.class);
//        List<Harvest> vegetable1 = HarvestUtil.takeOnlyType(hl, Vegetable.class);
//        berry1 = berry1.stream()
//                .sorted((h1, h2) -> h1.getWeight() > h2.getWeight() ? 1 : h1.getWeight() < h2.getWeight() ? -1 : 0)
//                .collect(Collectors.toList());
//        berry1.forEach(System.out::println);
///*
//Сгенерировать 100000 Яблок и отсортировать по весу.
//Выбрать из списка только Зеленые Яблоки.
//*/
//        List<Harvest> apples = HarvestFactory.generate(Apple.class, 100_000);
//        List<Harvest> applesGreen = HarvestUtil.filterByColor(apples, Color.GREEN);
//        applesGreen = applesGreen.stream()
//                .sorted((h1, h2) -> h1.getWeight() > h2.getWeight() ? 1 : h1.getWeight() < h2.getWeight() ? -1 : 0)
//                .collect(Collectors.toList());
//        applesGreen.forEach(System.out::println);
//
///*
//Сгенерировать 1000000 Ягод и отсортировать по весу.
//Выбрать из списка только Черные Ягоды вес которых больше 10 грамм.
//*/
//        List<Harvest> berry2 = HarvestFactory.generateHarvestType(1000_000, Type.BERRIES);
//        berry2 = berry2.stream()
//                .sorted((h1, h2) -> h1.getWeight() > h2.getWeight() ? 1 : h1.getWeight() < h2.getWeight() ? -1 : 0)
//                .collect(Collectors.toList());
//        berry2 = berry2.stream().filter(b -> b.getColor() == Color.BLACK && b.getWeight() > 10).collect(Collectors.toList());
//        berry2.forEach(System.out::println);
//
////Todo Создать класс Корзина которая будет името одно поле это List<Harvest> и константу Размер корзины в граммах.
////todo Классе Фабрике плодов, сделать ещещ один метод который принимает List<Harvest> и возвращает List<Корзин> заполненных
////todo В корзинах лежат плоды одного типа.
//
//        List<Harvest> berry = HarvestFactory.generateHarvestType(10000, Type.BERRIES);
//        List<Harvest> vegetable = HarvestFactory.generateHarvestType(5000, Type.VEGETABLES);
//        List<Harvest> fruit = HarvestFactory.generateHarvestType(300, Type.FRUITS);
//
//        List<Harvest> harvestList = new ArrayList<>();
//        berry.forEach(b -> harvestList.add(b));
//        vegetable.forEach(v -> harvestList.add(v));
//        fruit.forEach(f -> harvestList.add(f));
//
//        HarvestFactory.getAllBaskets(harvestList).forEach(System.out::println);
//

        List<Harvest> harvests = HarvestFactory.generate(Apple.class, 1000);


        // HarvestUtil.filterByGreen(harvests, h -> ((Harvest) h).getColor() == Color.RED).forEach(System.out::println);


        Filter<Integer> integerPredicate = new Filter<Integer>() {
            @Override
            public boolean test(Integer obj) {
                return obj % 2 == 0;
            }
        };
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //HarvestUtil.filterByGreen(integerList, integerPredicate).forEach(System.out::println);

        List<Integer> integerList10 = integerList.stream().map(x -> x * 10).collect(Collectors.toList());
        integerList10.forEach(System.out::println);

        List<String> nameList = Arrays.asList("Vasa", "Koliy", "Petiy", "Koliy", "Grisha", "Koliy", "Toly", "Koliy");
        Filter<String> strPredicate = new Filter<String>() {
            @Override
            public boolean test(String obj) {
                return obj.contains("Koliy");
            }
        };
        nameList.stream().sorted((s1, s2) -> s1.compareTo(s2));
        nameList.stream().sorted(String::compareTo);


        //HarvestUtil.filterByGreen(nameList, strPredicate).forEach(System.out::println);
        HarvestUtil.map(nameList, str -> str.length()).forEach(System.out::println);
        System.out.println();
        HarvestUtil.map(nameList, String::length).forEach(System.out::println);


        Comparator<Harvest> comparator = new Comparator<Harvest>() {
            @Override
            public int compare(Harvest o1, Harvest o2) {
                return Integer.compare(o1.getWeight(), o2.getWeight());
            }
        };
        Comparator<Harvest> comparator1 = (o1, o2) -> o1.getWeight() > o2.getWeight() ? 1 : o1.getWeight() < o2.getWeight() ? -1 : 0;

        harvests = harvests.stream().sorted(comparator1).collect(Collectors.toList());
        // harvests.forEach(System.out::println);

        //Function<Integer, String> function = (inte, str) -> {};

        long count = harvests.stream().filter(harvest -> harvest.getColor() == Color.RED).count();
        System.out.println(count);
        List<Harvest> list = harvests.stream()
                .filter(harvest -> harvest.getColor() == Color.RED)
                .sorted(Comparator.comparing(harvest -> harvest.getWeight()))
                .collect(Collectors.toList());

        list.forEach(System.out::println);

        int weight = harvests.stream()
                .filter(harvest -> harvest.getColor() == Color.RED)
                .sorted(Comparator.comparing(harvest -> harvest.getWeight()))
                .mapToInt(x -> x.getWeight()).sum();

        System.out.println(weight);

        Map<Type, List<Harvest>> collect = harvests.stream().collect(Collectors.groupingBy((Harvest h) -> h.getType()));
        Map<Type, List<Harvest>> collect1 = harvests.stream().collect(Collectors.groupingBy(Harvest::getType));

        //System.out.println(collect1);

        List<Integer> collect2 = harvests.stream()
                .map(harvest -> harvest.getWeight())
                .distinct()
                .limit(10)
                .collect(Collectors.toList());
        //System.out.println(collect2);

        List<Harvest> collect3 = harvests.stream()
                .takeWhile(harvest -> harvest.getWeight() < 4)
                .skip(2)
                .collect(Collectors.toList());
        // System.out.println(collect3);

        List<Harvest> collect4 = harvests.stream()
                .dropWhile(harvest -> harvest.getWeight() < 50)
                .collect(Collectors.toList());
        // System.out.println(collect4);

//1
        Integer[] mas = {1, 2, 3, 4, 5};
        List<Integer> integerList1 = Arrays.asList(mas);
        List<Integer> result = new ArrayList<>();
        integerList1.stream()
                .mapToInt(x -> x *= x).forEach(x -> result.add(x));
        System.out.println(result);

//2
        List<Integer> listLenghtName = harvests.stream()
                .map(harvest -> harvest.getRusName().length())
                .limit(5)
                .collect(Collectors.toList());
        listLenghtName.forEach(x -> System.out.printf("Длинна имени - %d", x));

//3
        harvests.stream()
                .map(h -> h.getRusName().split(""))
                .flatMap(Arrays::stream).distinct().forEach(System.out::println);

//4
        //   [1, 2, 3][3, 4]List<int[]> [(1, 3),(1, 4),(2, 3),(2, 4),(3, 3),(3, 4)]

        Integer[] mas1 = {1, 2, 3};
        Integer[] mas2 = {3, 4};
        List<Integer> num1 = Arrays.asList(mas1);
        List<Integer> num2 = Arrays.asList(mas2);

        /*List<int[]> pairs =*/
        num1.stream()
                .flatMap(i -> num2.stream().filter((j -> (i+j)%3 ==0)).map(x -> new int[]{i,x}))
                .forEach(p-> System.out.println(Arrays.toString(p)));

        if(harvests.stream().anyMatch(harvest -> harvest.getWeight() == 50)){
            System.out.println("есть");
        }

        Optional<Harvest> any = harvests.stream().filter(h -> h.getWeight() == 50).findAny();
        if(any.isPresent()){
            System.out.println(any.get());
        }

        harvests.stream().mapToInt(x-> x.getWeight()).sum();
        Integer reduce = harvests.stream()
                .map(h -> h.getWeight())
                .filter(h -> h != 0)
                .limit(5)
                .reduce(1, (h1,h2)-> h1*h2);
        System.out.println(reduce);

    }
}
