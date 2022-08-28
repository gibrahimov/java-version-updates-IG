package com.cydeo.java10;

import java.util.Arrays;
import java.util.List;

public class LocalVariableTypeDemo {
    public static void main(String[] args) {

//Type inference just use var.
// var will always understander byte as int
        var str = "Cydeo";
        var number = 5;

// this can be used only for local variables. We can't use for instance variable(class object)
// no method variable and no return value

        var numbers = Arrays.asList(3,4,5,6);
        // List<Integer> numbers = Arrays.asList(3,4,5,6);

        var sum = 0;
        for(var eachNumber : numbers){
            sum = sum + eachNumber;
        }



    }
}
