package com.cydeo.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("Murad", "Jahid", 17));
        users.add(new User("Qadir", "Ibo", 35));
        users.add(new User("Gulya", "Iba", 34));

        //Print all elements in the list
        printName(users,user -> true);
        System.out.println("--------------------------------------");
        //Print all people that last name starts with I
        printName(users, user -> user.getLastName().startsWith("I"));

    }



    //Write a method

    private static void printName(List<User> users, Predicate<User> p) {
        for (User user : users) {
            if (p.test(user)) {
                System.out.println(user.toString());
            }
        }
    }


}

// Convert Orange task, to ready functional interface