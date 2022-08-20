package com.cydeo.functionalInterface;

import com.cydeo.appleTask.Apple;
import com.cydeo.appleTask.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestApple {
    public static void main(String[] args) {

        // Convert Apple task, to ready functional interface

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));

        System.out.println(selectedApple(inventory,apple -> apple.getWeight()>200));
        System.out.println(selectedApple(inventory, apple -> apple.getColor().equals(Color.GREEN)));

    }

    private static List<Apple> selectedApple (List<Apple> inventory, Predicate<Apple> a){
        List<Apple> resultArray = new ArrayList<>();
        for (Apple apple : inventory) {
            if (a.test(apple)){
                resultArray.add(apple);
            }
        }
        return resultArray;
    }


}
