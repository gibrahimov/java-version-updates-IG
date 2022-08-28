package com.cydeo.java9;

import java.util.List;
import java.util.Scanner;

public class ModuleDemo {
    public static void main(String[] args) {

    // Modules is the main reason why companies are switching to Java 11 from Java 8
/*
There are so much efficiency in this. When you download java 11 all jar files come in module folder.
So before all > 4000 class used to come in one file, with modules they come in different 98 folders.
Advantage is to maintain is easy. So 1 file with 4000 class or folder split out.
Other advantage is most of the time in java any class can have dependency on other classes. For example
String class has dependency on Object class. So question is if anything happens with the jar that object class
belongs to , what will happen to String class? We will not be able to use it. And we will see it only
in runtime which is not good.

So with module if anything happen in one module and your other module depends on  affected module you will
have an error during COMPILE time NOT RUNTIME. Which is good thing.


This module helps us with encapsulation of packages. Let's say we have two packages.
1. Product package
2. Buy package

Let's say I Buy team need input from Product team. So in order to get data from Product I will use jar bring jar
and put dependency into Buy project now Buy team will have any classes and subpackages of Product team.
This is how was in old Java. What if Product team does not Buy team to have access to some package or
subpackages? This is not possible in old Java 8. This is possible only with modularity which is
encapsulation of packages. => with module-info.java

For example if you did not create module-info.java in m7, it means that m7 is not module., so m8 can't use
that m7.

m7 module-info.java inside

module module7 {

    requires module8; // saying module 7 needs to have access some packages in m8

}

m8 module-info.java inside

module module8 {
    exports com.cydeo.java9; // giving access only to java9 Not java 10. I have java10 as well but
    I am sharing  only java9 with m7

}
so it means m7 can have access only to java9 inside m8

 */
        System.out.println(String.class.getModule());
        System.out.println(List.class.getModule());
        System.out.println(Scanner.class.getModule());




    }
}
