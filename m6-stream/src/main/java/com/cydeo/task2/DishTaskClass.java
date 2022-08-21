package com.cydeo.task2;

import java.util.Comparator;

public class DishTaskClass {
    public static void main(String[] args) {

        // print all dish name that has less than 400 calories
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .map(Dish::getName)//or .map(dish -> dish.getName())
                .forEach(System.out::println);

        // print the length of the name of each dish
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        // print 2 high caloric dish name (>300)
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300)
                .map(Dish::getName)// or .map(dish -> dish.getName())
                .limit(2)
                .forEach(System.out::println);


        // print all dish name that are below 400 calories in sorted
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(dish -> dish.getName())
                .forEach(System.out::println);
          /*
          Stream<String> anyName = DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(dish -> dish.getName());
                in this cas stream will still run Why <String> NOT <Dish> because we did getName()

      Stream<String> anyName = DishData.getAll().stream() we create instance.After creating instnace we
      can use any method by anyName.filter()  or . map ....etc

      same like

      String anyName = "Apple


           */
        // sorting Ascending
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .map(dish -> dish.getName())
                .forEach(System.out::println);


    }
}
