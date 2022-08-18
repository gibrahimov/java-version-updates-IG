package com.cydeo.appleTaskWithLambda;

import com.cydeo.appleTask.Color;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class AppleLambda {

    private int weight;
    private Color color;

}
/*
Example : Imagine an application to help a farmer understand his inventory.
- Find all green apples in the inventory
- Find all apples heavier than 200 g
 */