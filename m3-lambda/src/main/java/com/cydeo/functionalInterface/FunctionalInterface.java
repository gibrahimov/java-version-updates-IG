package com.cydeo.functionalInterface;

import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {
// We will learn Java ready Functional Interfaces
        System.out.println("---------------------PREDICATE---------------------");
//Predicate accept object return boolean
        Predicate<Integer> lesserThan = i -> i < 18; // i is object so i is Integer object
        System.out.println(lesserThan.test(20));// test is inside of Predicate

        System.out.println("---------------------CONSUMER---------------------");

        Consumer<Integer> display = i -> System.out.println(i); // accept object but return nothing
        display.accept(10); // return 10

        System.out.println("---------------------BI CONSUMER-------------------");
        // accept two objects and returns nothing
        BiConsumer<Integer,Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(5,8);// return 13

        System.out.println("---------------------FUNCTION---------------------");
        //accept object and returns object
        Function<String, String> fun = s -> "Hello " + s;
        System.out.println(fun.apply("Cydeo"));

        System.out.println("-------------------BI FUNCTION---------------------");
        //it takes 2 parameter, method parameter as an object, and then it returns object as well.
        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
        System.out.println(func.apply(7,8));

        System.out.println("-------------------SUPPLIER---------------------");
        // does not get any parameter and return something
        Supplier<Double> randomValue = () -> Math.random();// instead of Math.random() I can write anything, ex Qadir
        System.out.println(randomValue.get());







    }
}
