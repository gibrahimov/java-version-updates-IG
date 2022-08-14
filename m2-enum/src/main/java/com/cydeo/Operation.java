package com.cydeo;

public enum Operation {
    PLUS, MINUS, MULTIPLY, DIVIDE;

    Operation() {// this is constructor of enum with shortcut, can't be public, always private
        System.out.println("Constructor");
        //execute for each constant objects (plus, minus, divide, multiple)
        // constructor helps to assign value to (plus, minus, divide, multiple)
    }

}
