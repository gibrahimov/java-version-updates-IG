package com.cydeo.tasks.demo;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class GenericDemoPrintAllType {
    public static void main(String[] args) {
        // We have object types of Arrays

        Integer [] n1 = {1,2,3,4,5,6};
        Double [] d1 = {1.2, 2.4, 3.5, 4.8};
        String[] str1 = {"Java", "C++", "C#"};
        Shape[] shapes = {null, null};

        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(10,20,40));
        ArrayList<String> programLang = new ArrayList<>(Arrays.asList("Java", "C++", "C#"));

        GenericDemoCreateMethod.printEach(n1);
        GenericDemoCreateMethod.printEach(str1);
        GenericDemoCreateMethod.printEach(scores);
        GenericDemoCreateMethod.printEach(programLang);

    }

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


         */