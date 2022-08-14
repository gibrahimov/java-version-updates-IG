package com.cydeo;

public class Main {
    public static void main(String[] args) {

        System.out.println("How to access to a constant");

        Currency c = Currency.DIME;
        System.out.println(c);// toString method is overriden here
        System.out.println(Currency.PENNY);

        System.out.println("How to access to all constant in one time");

        Currency[] currencies = Currency.values();

        for (Currency currency:currencies){
            System.out.println(currency);// print each object stored in array
        }

        System.out.println("How to enum in switch case");

        switch ((Currency.PENNY)){
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cent");
                break;
            case DIME:
                System.out.println("It is 10 cent");
                break;
            case QUARTER:
                System.out.println("It is 25 cent");
                break;
        }

        System.out.println("Operation Task");

        calculate(3,5, Operation.MULTIPLY);

        System.out.println("how top retrieve the constant value");

        System.out.println(CurrencyAssignedValue.PENNY.getValue());
        System.out.println(CurrencyAssignedValue.QUARTER.getValue());
        System.out.println("-------------- Ordinal is for index ------------");
        System.out.println(CurrencyAssignedValue.QUARTER.ordinal());
        // QUARTER is index number of Enum


    }

    private static void calculate(double x, double y, Operation operation){
        switch (operation){
            case PLUS:
                System.out.println(x+y);
                break;
            case MINUS:
                System.out.println(x-y);
                break;
            case MULTIPLY:
                System.out.println(x*y);
                break;
            case DIVIDE:
                System.out.println(x/y);
                break;
        }

    }
}
