package com.cydeo;

import com.cydeo.task2.Dish;
import com.cydeo.task2.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,5,6,9);
        int sum = 0;
        for (Integer number : numbers) {
            sum = sum + number;
        }
        System.out.println(sum);
        // the same as above
        int result = numbers.stream().reduce(0,(a,b)-> a+b);// Stream is over
        //So it is terminal operator as well

        System.out.println(result);

        System.out.println("----------------REDUCE------------------");
        int calTotal = DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce((a,b)-> a+b)
                .get();
//OR we can write this way as well

        Optional<Integer> calTotal1 = DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce(Integer::sum);// or reduce((a,b)-> a+b); the same thing. Integer is Class here

        System.out.println(calTotal1.get());

        System.out.println("----------------Integer Class usefull------------------");

        Optional<Integer> nMin = numbers.stream().reduce(Integer::min); // Integer is class
        Optional<Integer> nMax = numbers.stream().reduce(Integer::max); // Integer is class
        Optional<Integer> nSum = numbers.stream().reduce(Integer::sum); // Integer is class

        System.out.println("Min:" + nMin.get());
        System.out.println("Min:" + nMax.get());
        System.out.println("Min:" + nSum.get());

        System.out.println("----------------COUNT------------------");

       long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);






    }
}
