package com.cydeo.functionalInterface;

import com.cydeo.appleTask.Color;
import com.cydeo.orangeTask.Orange;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class OrangeTask {
    public static void main(String[] args) {
        List<Orange> inventory = new ArrayList<Orange>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(new Orange(100,Color.RED));
        inventory.add(new Orange(200,Color.GREEN));
        inventory.add(new Orange(50,Color.RED));

    }



    


}
