package com.cydeo.functionalInterface;

import lombok.*;


//@Getter
//@Setter
//@ToString
@Data// in application, we don't use it because of NoArgsConstructor.
@AllArgsConstructor
/*
if there is no constructor defined in your application the @Date will create NoArgsConstructor for you
like if I remove @AllArgsConstructor @Data will create constructor called User() which is NoArgsConstructor

Default constructor is not the same as NoArgsConstructor, because NoArgsConstructor we create ourselves like below
public User() {
    }
 */
public class User {

    private String firstName;
    private String lastName;
    private int age;


}
