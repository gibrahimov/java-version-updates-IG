package com.cydeo.java9;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class FactoryMethodDemo {
    public static void main(String[] args) {

        //Creating Unmodifiable(Read only) List before Java9

        List<String> courses = Collections.unmodifiableList(Arrays.asList("Java","Spring","Agile"));
        //courses.add("C++"); can't do it
        System.out.println(courses);// Exception can't add to the list

        //Creating Unmodifiable(Read only) List, Set and Map after Java9

        List<String> myCourses = List.of("Java","Spring","Agile");
        Set<String> myProduct = Set.of("Milk","Bread","Meat");
        Map<String, Integer> myCart = Map.ofEntries(
                Map.entry("Samsung TV", 1),
                Map.entry("Xbox", 1),
                Map.entry("Chair", 5)
        );
        System.out.println(myCourses);
        System.out.println(myProduct);
        System.out.println(myCart);



    }
}
