package com.hybris.internship.streamAPI.practical;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        IntStream
                .range(1, 10)
                .forEach(i -> System.out.print(i));
        System.out.println();

        //Integer stream with skip operation
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(i -> System.out.print(i));
        System.out.println();

        //Integer stream with sum operation
        int sum = IntStream
                .range(1, 5)
                .sum();
        System.out.println(sum);

        //Stream of, sorted and findFirst
        Stream.of("Hello", "bottle", "Africa")
                .sorted()
                .findFirst()
                .ifPresent(s -> System.out.print(s));
        System.out.println();

        //Stream from Array, sort, filter and print
        String[] items = {"car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy"};
        Stream.of(items)
                .filter(s -> s.startsWith("t"))
                .sorted()
                .forEach(s -> System.out.print(s + ", "));
        System.out.println();

        //Average of squares of an int array
        Arrays.stream(new int[] {2, 4, 6, 8, 10})
                .map(i -> i * i)
                .average()
                .ifPresent(v -> System.out.print(v));
        System.out.println();

        //Stream from a list, filter and print
        List<String> listOfItems =
                Arrays.asList("Computer", "Toothpaste", "Box", "Pencil", "Car", "Tent", "Door", "Toy");
        listOfItems.stream()
                .map(s -> s.toLowerCase())
                .filter(s -> s.startsWith("c"))
                .sorted()
                .forEach(s -> System.out.print(s + ", "));
        System.out.println();
    }
}
