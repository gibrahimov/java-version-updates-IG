package com.cydeo;

import com.cydeo.task2.Dish;
import com.cydeo.task2.DishData;
import com.cydeo.task2.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 6, 7);
        //toCollection(Supplier) : is used to create a Collection using Collector
        System.out.println("------------------");

        List<Integer> numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        //result is assigned to new array list
        System.out.println(numberList);

        System.out.println("------------------");
        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect((Collectors.toCollection(HashSet::new)));
        System.out.println(numberSet);

        System.out.println("-----------toList---------------");
//returns a Collector interface that gathers the input data into a new list, short version of above codes

        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(numberList2);

        System.out.println("-----------toSet---------------");
        Set<Integer> numberList3 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println(numberList3);

        System.out.println("-----------toMap---------------");
        //toMap(Function, Function): returns a Collector interface that gathers the input data into a new map

        Map<String, Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
        System.out.println(dishMap);

        System.out.println("-----------summingInt---------------");
//summingInt(ToIntFinction) :returns a Collector that produces the sum of  Integer valued function

        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        System.out.println("-----------summingInt---------------");

//counting(): returns a Collector that counts the number of the elements

        long evenCount = numbers.stream()
                .filter(x -> x % 2 == 0).count();
        // or. collect(Collectors.counting());
        System.out.println(evenCount);

        System.out.println("-----------averageingInt---------------");

//averageingInt(toFunction): returns average of the integers passed values

        Double colorieAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(colorieAverage);

        System.out.println("-----------joining()---------------");

//joining(): is used to join various elements of char or string array into a single object

        List<String> courses = Arrays.asList("Java", "JS", "C++");
        String str = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);

//partitioningBy(): is used to partition a stream of objects (or set of element) based on a given predicate.
        System.out.println("-----------partitioningBy()---------------");

        Map<Boolean,List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);


        System.out.println("-----------groupingBy()---------------");
//groupingBy() is used for grouping objects by some property and storing results in a Map instance.
       Map<Type, List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);


    }
}
