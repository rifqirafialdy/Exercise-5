package org.Rifqi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FizzBuzz.printResult("10");
        System.out.print(Arrays.toString(RemoveOdd.printEvenOnly(new int[]{1, 2, 3, 4, 5})));
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();
        System.out.println(FindCalculation.findPair(new int[]{10, 22, 35, 49, 51}, 32));
    }
}