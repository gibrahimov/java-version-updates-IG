package com.cydeo.calculator;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Calculate sum = (x,y)-> System.out.println(x+y);
        sum.calculate(20,30);

        Calculate s1 = (x,y)-> Calculator.findSum(x,y);
        s1.calculate(10,40);
 /*
 so since I have ready report inside other class I can use that method as well. Static method is called with
 class name which is Calculator.
  */
        // Referencing to Static Method
        Calculate s2 = Calculator::findSum;// no parameter wit double colon
        s2.calculate(10,20);

        // Referencing to Instance Method
        Calculator obj = new Calculator();
        Calculate s3 = obj::findMultiply;
        s3.calculate(15,15);

        //short way
        Calculate s4 = new Calculator() :: findMultiply;
        s4.calculate(25,25);

        //Other example

        BiFunction<String, Integer, String> func = (str, i) -> str.substring(i);
        BiFunction<String, Integer, String> func2 = String::substring;


        Function<Integer, Double> anyName = new MyClass()::method;

        BiFunction<MyClass, Integer, Double> b1 = MyClass::method;
        //since I already defined <MyClass> I don't need to write new MyClass()
        // like make it the same as Static method running


        Consumer<Integer> display = i-> System.out.println(i);

        Consumer<Integer> display1 = System.out::println; // out is static calling println method



    }
}
