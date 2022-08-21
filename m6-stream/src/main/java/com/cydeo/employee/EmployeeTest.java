package com.cydeo.employee;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

//Print All emails
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)//or .map(employee -> employee.getEmpEmail())
                .forEach(System.out::println);
//Print all phone numbers
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);
/*
This is th result. Question is how to make it without [] bracket. Answer is with flatMap()
[2022028765, 7038763425]
[4122028765, 8998763425]
[5162028765, 6198763425]
 */
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);
/*
here is the output
2022028765
7038763425
4122028765
8998763425
5162028765
6198763425
 */
        //flatMap() with ::
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
