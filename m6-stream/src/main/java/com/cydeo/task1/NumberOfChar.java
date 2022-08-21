package com.cydeo.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NumberOfChar {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER");
        //   Stream<String> wordsStream = words.stream();

        words.stream()
                .map(str -> str.length())
                .forEach(System.out::println);
    }


}
/*
Given a list of words, print the number of characters for each word.
 */