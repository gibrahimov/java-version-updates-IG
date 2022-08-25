package com.cydeo.appleTaskWithLambda;




import com.cydeo.appleTask.Color;

import java.util.ArrayList;
import java.util.List;

public class AppleTestLambda {
    public static void main(String[] args) {
        List<AppleLambda> inventory = new ArrayList<AppleLambda>();
        inventory.add(new AppleLambda(300, Color.GREEN));
        inventory.add(new AppleLambda(100, Color.RED));
        inventory.add(new AppleLambda(200,Color.GREEN));
        inventory.add(new AppleLambda(50,Color.RED));

        ApplePredicateLambda weightApple = appleLambda -> appleLambda.getWeight()>200;
        ApplePredicateLambda colorApple = appleLambda -> appleLambda.getColor().equals(Color.GREEN);

        System.out.println(filterApples(inventory, weightApple));
        System.out.println(filterApples(inventory, colorApple));

    }
    private static List<AppleLambda> filterApples(List<AppleLambda> inventory, ApplePredicateLambda applePredicateLambda){
        List<AppleLambda> result = new ArrayList<>();
        for (AppleLambda appleLambda : inventory) {
            if (applePredicateLambda.test(appleLambda)){
                result.add(appleLambda);
            }
        }
        return result;
    }
}
