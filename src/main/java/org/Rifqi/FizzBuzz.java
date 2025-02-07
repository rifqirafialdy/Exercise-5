package org.Rifqi;

import java.util.ArrayList;

public class FizzBuzz {
    private static ArrayList<String> generateFB(int n) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }

    public static void printResult(String str) {
        if (!isNumeric(str)) {
            throw new IllegalArgumentException("Input Must be Valid Number");
        }
        int n = Integer.parseInt(str);
        if (n <= 0) {
            throw new IllegalArgumentException("Input Must be Positive");
        }
        ArrayList<String> result = generateFB(n);
        for (String s : result) {
            System.out.print(s + ",");
        }
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
