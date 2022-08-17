package com.cydeo.tasks;

import java.util.Arrays;

public class SwapValues {
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4};
        swap(a,0,2);
        System.out.println(Arrays.toString(a));

    }
   /*
    private static void swap(Integer[] a, int i, int j){
    this is not generic, if I change Integer to String this method will not work
    Integer temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    */

    private static <T> void swap(T[] a, int i, int j){// Now T can be Integer, String any variable type
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}
/*
Integer[] a = {1,2,3,4};
swap(a,0,2); System.out.println(Arrays.toString(a)); //[3,2,1,4]
 */