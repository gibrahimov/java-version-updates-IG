package com.cydeo.apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));
// if you want to compare any object property(like for example weight)
        Comparator<Apple> sortApple = comparing((Apple apple) -> apple.getWeight());
        // giving each apple and getting apple weight
        inventory.sort(sortApple);
        System.out.println(inventory);

        Comparator<Apple> sortApple1 = comparing(Apple::getWeight);
        inventory.sort(sortApple1);
        System.out.println(inventory);

        //Ascending- reverse

        inventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(inventory);

        //Chaining replace a bunch of nested loop
        inventory
                .sort(comparing(Apple::getWeight)
                .reversed().thenComparing(Apple::getColor));
        System.out.println(inventory);


    }
}
