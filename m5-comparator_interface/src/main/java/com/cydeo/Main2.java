package com.cydeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,0,15,5,20);
        System.out.println(list);

        System.out.println("--------------- Descending order sort ----------");

        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        System.out.println("--------------- Ascending order sort ----------");

        list.sort(Comparator.reverseOrder());
        System.out.println(list);

        List<String> listStr = Arrays.asList("Ba","Ni","Ap","Zw");
        System.out.println();

        System.out.println("--------------- Descending order sort ----------");
        listStr.sort(Comparator.naturalOrder());
        System.out.println(listStr);

        System.out.println("--------------- Ascending order sort ----------");
        listStr.sort(Comparator.reverseOrder());
        System.out.println(listStr);




    }
}
