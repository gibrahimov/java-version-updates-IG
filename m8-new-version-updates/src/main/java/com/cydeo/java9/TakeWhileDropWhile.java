package com.cydeo.java9;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileDropWhile {
    public static void main(String[] args) {

        List<Stock> stocks = getStocks();
        System.out.println("Stocks sorted: \n" + stocks);

        //Using Filter
        List<String> stockBelow500Filter = getStocksBelowFiveHundredFilter(stocks);
        System.out.println("Filter output:" + stockBelow500Filter);

        //Using takeWhile
        List<String> stockBelow500 = getStocksBelowFiveHundred(stocks);
        System.out.println("Filter output:" + stockBelow500);

        //Using dropWhile
        List<String> stockAbove500 = getStocksAboveFiveHundred(stocks);
        System.out.println("Filter output:" + stockAbove500);
    }


    public static List<String> getStocksBelowFiveHundredFilter(List<Stock> stocks){
        return stocks.stream()
                .peek(stock -> System.out.println("Filter proccessing : " + stock))
// peek is used for debugging purposes to see in consul. NOT used a lot
                .filter(TakeWhileDropWhile::isStockLessThanFiveHundred)
/*
We know filter takes predicate
there is some method will give me predicate. We are not writing ourselves. They are abstracted. Always
goo to have abstracted. Because it is possible you will use that method in different places. So
no need to type lambda expression again and again. So we :: to call method isStockLessThanFiveHundred, and
this method will give me the implementation of predicate.
TakeWhileDropWhile is class name so static method.

*/
                .map(Stock::getName)
                .collect(Collectors.toList());
    }

    public static List<String> getStocksBelowFiveHundred(List<Stock> stocks){
        return stocks.stream()
                .peek(stock -> System.out.println("takeWhile proccessing : " + stock))
                .takeWhile(TakeWhileDropWhile::isStockLessThanFiveHundred)
//.takeWhile will STOP transaction after it finds below 500. It will show 800 and stop after.
//for takeWhile we MUST sort it. Compare with Limit() method we can use condition in takeWhile
                .map(Stock::getName)
                .collect(Collectors.toList());
    }

    public static List<String> getStocksAboveFiveHundred(List<Stock> stocks){
        return stocks.stream()
                .peek(stock -> System.out.println("dropWhile proccessing : " + stock))
                .dropWhile(TakeWhileDropWhile::isStockLessThanFiveHundred)
//drops anything that is against condition. So here result will be stock >=500.
//Compare with skip() method we can pass condition in dropWhile() but for skip() method we pass values
                .map(Stock::getName)
                .collect(Collectors.toList());
    }

    public static boolean isStockLessThanFiveHundred(Stock stock){
        return stock.getValue().compareTo(BigDecimal.valueOf(500))<=0;
    }

    private static List<Stock> getStocks(){ // will give us sorted List of below stocks

        List<Stock> stocks =  new ArrayList<>();
        stocks.add(new Stock("Apple", BigDecimal.valueOf(1000)));
        stocks.add(new Stock("Amazon", BigDecimal.valueOf(800)));
        stocks.add(new Stock("Tesla", BigDecimal.valueOf(400)));
        stocks.add(new Stock("Netflix", BigDecimal.valueOf(2000)));
        stocks.add(new Stock("Facebook", BigDecimal.valueOf(500)));
        stocks.add(new Stock("Instagram", BigDecimal.valueOf(100)));

        return stocks.stream()
                .sorted(Comparator.comparing(Stock::getValue))
                .collect(Collectors.toList());
    }
}
