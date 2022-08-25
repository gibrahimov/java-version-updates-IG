package com.cydeo.apple;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class ThenComparing {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(50, Color.RED));
        inventory.add(new Apple(400, Color.YELLOW));
        inventory.add(new Apple(20, Color.YELLOW));
        System.out.println(inventory);


        inventory
                .sort(comparing((Apple apple) -> apple.getWeight()) // 1st sort by weight
                .reversed().thenComparing((Apple apple) -> apple.getColor()));// Then reverse and sort by color
        System.out.println(inventory);

    }
}
