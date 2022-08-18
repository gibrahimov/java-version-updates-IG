package com.cydeo.appleTask;

public interface ApplePredicate {
    boolean test(Apple apple);
    // this is abstract method. I will create implementation like
    // get one apple and tell me it is green or not, get one apple tell me if it is >200 gram or not
    //Like True or False
    // So one method will work for both action
    // So designe patter is 1st create interface with abstract method, then we create implementation.
}
