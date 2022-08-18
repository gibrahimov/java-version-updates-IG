package com.cydeo.demoWithLambda;

import com.cydeo.demo.BubbleSort;
import com.cydeo.demo.QuickSort;
import com.cydeo.demo.Sorting;

public class ArraySortingLambda {
    public static void main(String[] args) {

        ArraySortingLambda as = new ArraySortingLambda();

        SortingLambda quickSort = () -> System.out.println("Quick Sorting");

        as.sort(quickSort);
        //------------ or ----------------
        as.sort( () -> System.out.println("Quick Sorting"));
// We skipped implementation class QuickSort class and BubbleSort class

    }
    private void sort(SortingLambda sortingLambda){
        sortingLambda.sort();
    }

}
