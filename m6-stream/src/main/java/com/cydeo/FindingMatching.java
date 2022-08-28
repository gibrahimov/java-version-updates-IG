package com.cydeo;

import com.cydeo.task2.Dish;
import com.cydeo.task2.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {
    //ALL MATCH

    public static void main(String[] args) {

        System.out.println("----------------ALL MATCH------------------");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);

        System.out.println("----------------ANY MATCH------------------");
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)  ) {
            // isVegeterian is getter name for boolean. For boolean we use 'is' not 'get'
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("----------------NONE MATCH------------------");
        boolean isHealth2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealth2);


        System.out.println("----------------FIND ANY------------------");
        Optional<Dish> anyName = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(anyName.get());

        System.out.println("----------------FIND FIRST------------------");
        Optional<Dish> anyName2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(anyName2.get());

        /*
        difference between Find Any and Find First
Parallel mean snyc one time it can be 1, 6 ,9 different
         */
        System.out.println("----------------PARALLEL STREAMS (Async)------------------");

        System.out.println(IntStream.range(0, 100).parallel().findAny());
        System.out.println(IntStream.range(0, 100).parallel().findFirst());

        List<String> list1 = Arrays.asList("Qadir", "Gulya", "Murad", "Cahid", "John", "Clark");
        List<String> list2 = Arrays.asList("Qadir", "Johny", "Gulya", "Murad", "Jahid", "Jack","Clark");

        Optional<String> findFirst = list1.parallelStream().filter(s -> s.startsWith("G")).findFirst();
        Optional<String> findAny = list1.parallelStream().filter(s -> s.startsWith("J")).findAny();
        System.out.println(findFirst.get());
        System.out.println(findAny.get());

        Optional<String> findFirst1 = list1.stream().filter(s -> s.startsWith("G")).findFirst();
        Optional<String> findAny1 = list1.stream().filter(s -> s.startsWith("J")).findAny();
        System.out.println(findFirst1.get());
        System.out.println(findAny1.get());

        System.out.println("----------------MIN------------------");

        Optional<Dish> dmin = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dmin.get());// you can use sort, or limit(1) as well

        System.out.println("----------------MAX------------------");

        Optional<Dish> dmax = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dmax.get());// sort reversed and limit(1) can be used to



    }
}
