package com.cydeo.orangeTask;

import com.cydeo.appleTask.Color;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@Getter
@Setter // if you want condition on setter you need to write setter method
@ToString

public class Orange {
    private int weight;
    private Color color;

}


/*

Imagine apple is orange

Write a prettyPrintApple method that takes aList of Apples and that can be parameterized with multiple ways to generate a String output from an apple
public static void prettyPrintApple(List<Apple> inventory, ???){
    for(Apple apple : inventory){
        String output = ???.???(apple);
System.out.println(output); }
}
Sample Output :
A Light GREEN apple A Heavy RED apple A Light GREEN apple
Sample Output :
An apple of 80g An apple of 155g An apple of 120g
 */