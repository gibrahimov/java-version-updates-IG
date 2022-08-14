package com.cydeo;

public enum Currency {// currency is already extending Enum class that java created

    PENNY, NICKLE, DIME, QUARTER;

    //Penny is a constant object of Currency class.
    //so compare with CurencyDemo class to see difference. So Enum is simplified version of final
// we don't use new keyword in enum when we cerate object
    // you can add variable, build constructor, add method and etc inside Enum class
    // BUT CAN'T CREATE ABSTRACT CLASS INSIDE ENUM CLASS. because it is final.


}
