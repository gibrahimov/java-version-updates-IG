package com.cydeo.appleTaskWithLambda;


import com.cydeo.appleTask.Apple;
import com.cydeo.appleTask.ApplePredicate;


@FunctionalInterface
public interface ApplePredicateLambda {
    boolean test(AppleLambda appleLambda);
}