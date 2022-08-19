package com.cydeo.orangeTask;

import com.cydeo.appleTask.Apple;
import com.cydeo.appleTask.Color;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<Orange>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(new Orange(100,Color.RED));
        inventory.add(new Orange(200,Color.GREEN));
        inventory.add(new Orange(50,Color.RED));

        OrangeFormatter orangeLambda = orange -> "An Orange of " + orange.getWeight() + "g";
        prettyPrintOrange(inventory,orangeLambda);
        System.out.println("------------------- or this way is short way ------------");
        prettyPrintOrange(inventory,orange -> "An Orange of " + orange.getWeight() + "g");
        System.out.println("------------------------------");

        OrangeFormatter fancyLambda = orange -> {
            String ch = orange.getWeight() > 200 ? "Heavy": "Light";
            return "A "+ ch+ " "+orange.getColor()+ " orange";
        };
        prettyPrintOrange(inventory,fancyLambda);
    }

private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter formatter){

        for (Orange orange : inventory){
            String output = formatter.accept(orange);
            System.out.println(output);
        }


}


}
