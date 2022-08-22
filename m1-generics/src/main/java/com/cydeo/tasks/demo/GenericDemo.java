package com.cydeo.tasks.demo;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {

        ArrayList items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add("apple");
        items.add(4);
        items.add(5);

        printDoubled(items);

    }
    private static void printDoubled(ArrayList n) {
        for (Object i : n) { // We used object because not all elements are Integer, there is "apple"
            System.out.println(i);// Prints all elements
          //System.out.println(i * 2);
// This will compile error. Operator '*' cannot be applied to 'java.lang.Object', 'int'
            //we need to cast each object to Integer so can use * operator
            System.out.println((Integer)i*2);// no compiler error however it will fail when reach
            //"apple" because it is wrong type.
 /*
 Before generics, you had to cast every object you read from a collection.
 If someone accidentally inserted an object of the wrong type, cast could fail at runtime.

 With generics, you tell the compiler what types of objects are permitted in each collection.
 The compiler inserts casts for you automatically and tells you at compile time if you try to insert an object of wrong type.
  */
            ArrayList<Integer> items = new ArrayList<>();
  //<Integer> is generic type so this ArrayList only accept Integer.


        }
    }
}
/*
Generic is Parametrized type
Allows us to reuse the same code with different types
Generic types can be applied to methods, class and interface.
When creating your own generic types it is best practice to use pneumonics for the formal type parameter rather
than multiple letters.
• E pneumonic for element
• K pneumonic for key
• T pneumonic for type
• V pneumonic for value
• ? pneumonic Wild Card Types - NOT USED A LOT
If you want to use a generic type but you do not know or care what the actual type parameter is,
you can use a question mark instead.
ArrayList with raw type is not type-safe. ArrayList<?> with unbounded wildcard is type-safe.
You can add objects of any type into raw ArrayList but you can not do that with a generic
ArrayList with unbounded wildcard ArrayList, it will give a compile-time error.


 */