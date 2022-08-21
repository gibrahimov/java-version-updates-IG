package com.cydeo.employee;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Employee {

    private int empId;
    private String empName;
    private String empEmail;
    private List<String> empPhoneNumbers;// every employee has a phone and one employee can have
    //more than one phone number




}
