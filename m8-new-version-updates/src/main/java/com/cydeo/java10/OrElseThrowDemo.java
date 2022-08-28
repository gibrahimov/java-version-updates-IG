package com.cydeo.java10;

import java.util.Optional;

public class OrElseThrowDemo {
    public static void main(String[] args) {
        //replacement of .get()
        // = isPresent + get()

        Optional<String> str = Optional.empty();
        //System.out.println(str.get());//NoSuchElementException

        if(str.isPresent()){
           // System.out.println(str.get());
        }else{
            //exception handling
        }

//orElseThrow replace get+isPresent
       // System.out.println(str.orElseThrow());
        System.out.println(str.orElseThrow(()-> new RuntimeException()));
        System.out.println(5+10);


    }
}
