package com.cydeo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {

        double amount1 = 374.56;
        double amount2 = 374.26;
        System.out.println(amount1-amount2);//0.30000000000001137 crazy output
        // not acceptable in finance world. Should have been 0.30

        //After today, we will not use double we will use BigDecimal class.

        BigDecimal b1 = new BigDecimal("374.56");
        BigDecimal b2 = new BigDecimal("374.26");
        System.out.println(b1.subtract(b2));// 0.30
        BigDecimal b3 = BigDecimal.valueOf(374.56);// other way of creating BigDecimal object
        BigDecimal b4 = BigDecimal.TEN; //10
        BigDecimal b5 = BigDecimal.ONE; // 1
        // there is other methods like add, multiply
        System.out.println(b1.multiply(new BigDecimal("15")));
        System.out.println(b1.multiply(BigDecimal.valueOf(15)));

    //Scaling

    BigDecimal n1 = new BigDecimal("23.12");
        System.out.println(n1.setScale(1, RoundingMode.CEILING));//23.2 if 3 23.120
        System.out.println(n1.setScale(1, RoundingMode.DOWN));// 23.1
        System.out.println(n1.setScale(1, RoundingMode.UP));// 23.2
//CEILING, FLOOR,

        // Do not use equals() for BigDecimal. We will use compareTo()

        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("2"))); //0 2=2
        System.out.println(new BigDecimal("5").compareTo(new BigDecimal("2"))); //1 5>2
        System.out.println(new BigDecimal("1").compareTo(new BigDecimal("2"))); //-1 1<2
        System.out.println(new BigDecimal("0").compareTo(new BigDecimal("2")));// -1 0<2

        //JAVA 8 is finished at this point

    }
}
