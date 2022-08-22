package com.cydeo.tasks.demo;

import java.util.List;

public class GenericDemoCreateMethod {

    //Print each element of Array Object different type
    public static <T> void printEach(T [] array) {
        for (T each : array) {
            System.out.println(each);
        }
    }
    //Print each element of Collection  type e.g List<Integer>, List<String>, List<Shape> etc...

        public static <T> void printEach( List<T> list){
            for(T each : list){
                System.out.println(each);
            }
    }


    // STATIC because we want to be able to access method with Class name without creating an object.
/*
<T> is parameterized the type. or could be any name. T is preferred. So when you pass Integer T becomes
Integer, if you pass String T becomes String etc.
 */
}
/*
  if I want to print each element of mentioned arrays I will have to write method and overloead method
  for each type like for example

public static void printEach(Integer[] array){
for(Integer each : array){
System.out.println(each);
 }
}
public static void printEach(Double[] array){
for(Double each : array){
System.out.println(each);
 }
}
public static void printEach(String[] array){
for(String each : array){
System.out.println(each);
 }
}
 ..... etc. So this was NOT an efficient way. So with Generic we can write one method instead.

public static <T> void printEach(T [] array){
        for(T each : array){
            System.out.println(each);
        }
    }

    STATIC because we want to be able to access method with Class name without creating an object.

         */