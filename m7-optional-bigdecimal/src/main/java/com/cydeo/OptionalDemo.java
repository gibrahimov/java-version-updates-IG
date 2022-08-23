package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
// Main purpose of Optional is to prevent null pointer exception we don't want to see that
        // just help to manage null pointer exception

        List<Integer> number = Arrays.asList(2, 4, 2, 10, 23);

    // empty() - isPresent()

        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent());//false nothing is present

        System.out.println(Optional.of(number).isPresent()); // true
        //System.out.println(empty.get()); you get nullPinter you get noSuchElement exception


        number.stream().filter(x -> x>100).forEach(System.out::println);
        System.out.println("--------------ifPresent()------------------------");
// ifPresent()

         Optional<Integer> bigNumber = number.stream().filter(x->x>100).findAny();
        bigNumber.ifPresent(System.out::println);
//get

      //  System.out.println(bigNumber.get());//you get nullPinter you get noSuchElement exception

//orElse

        System.out.println(bigNumber.orElse(5));// you get 5




    }
}
