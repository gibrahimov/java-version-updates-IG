package com.cydeo.calculator;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {
        //Zero argument constructor.
        // Supplier does not get any parameter and return something
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        //calling with constructor, that's why we use new keyword. We call constructor with new keyword
        // This is not used a lot
        Supplier<Car> c2 = Car:: new;
        System.out.println(c2.get().getModel());

        //one argument constructor

        Function<Integer, Car> f1 = model -> new Car(model);

        Function<Integer, Car> f2 = Car::new;

        //Two argument Constructor

        BiFunction<String, Integer, Car> a1 = Car ::new;
        Car mercedesObj = a1.apply("Mercedes", 2013);
        System.out.println(mercedesObj.getMake() + " " + mercedesObj.getModel());





    }
}
