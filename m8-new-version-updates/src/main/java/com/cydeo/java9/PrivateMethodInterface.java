package com.cydeo.java9;

import java.time.LocalDate;

public interface PrivateMethodInterface {

/*
In Java 7 and earlier versions an Interface can have only 2 things:

1. Constant variables
2. Abstract methods
And these interface methods MUST be implemented by class which choose to implement the interface

In Java 8 default methods and static methods features were added. So in Java 8 Interface can have 4 things:
1. Constant variables
2. Abstract methods
3. Default methods
4. Static methods

In Java 9 private methods and private static method features were added. So Java 9 and new versions can
have 6 things:
1. Constant variables
2. Abstract methods
3. Default methods
4. Static methods
5. Private methods
6. Private Static methods

 */


    boolean isHoliday(LocalDate date);

    default boolean isBusinessDay(LocalDate date){
      validate(date);
        return !isHoliday(date);
    }


    default LocalDate nextDay(LocalDate date){
       validate(date);
        LocalDate nextDate = date.plusDays(1);
        return isHoliday(nextDate) ? nextDay(nextDate): nextDate;
    }


    private void validate(LocalDate date){
        if(date.isBefore(LocalDate.of(2001,1,1))){
            throw new IllegalArgumentException();
        }
    }


}
