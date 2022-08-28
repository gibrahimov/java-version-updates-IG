package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 4);
        list.forEach(System.out::println); // or list.forEach(x -> System.out.println(x));
        //forEach can be used one terminal operator to close Stream

        System.out.println("--------------Filter--------------------");
        //Now learning Intermediate operators
   // All Intermediate operators return STREAM
        //Filter = for loop + if statement

        list.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);// this part close stream. Stream is done at this point
        //if you need to start stream you should from List again

//Distinct like unique element

        System.out.println("--------------DISTINCT--------------------");

        Stream<Integer> str = list.stream()
                .filter(i -> i % 2 == 0)
                .distinct();

        str.forEach(System.out::println);// this part close stream. Stream is done at this point

        System.out.println("--------------Truncating limit(n)--------------------");

        list.stream()
                .filter(i ->  i % 2 == 0)
                .limit(2) // 2. if 2 result 2 and 2
                .forEach(System.out::println);


        System.out.println("--------------Skip Element--------------------");

        list.stream()
                .filter(i ->  i % 2 == 0)
                .skip(1)
                .forEach(System.out::println);

        System.out.println("--------------Mapping--------------------");

        // mapping apply to each element and mapping it to a new element.
        List<Integer> list2 = Arrays.asList(1, 2, 3, 3, 4, 4);
        list2.stream()
                .map(number -> number * 2)
                .forEach(System.out::println);
        System.out.println("------------------------------");

        list2.stream()
                .map(number -> number * 2)
                .filter(i ->  i % 3 == 0)
                .forEach(System.out::println);


    }
}
