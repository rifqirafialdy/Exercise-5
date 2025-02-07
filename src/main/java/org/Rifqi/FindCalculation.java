package org.Rifqi;

import java.util.Arrays;

public class FindCalculation {
    public static String findPair(int[] numbers, int target) {
        int[] pairNumber = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    pairNumber[0] = i;
                    pairNumber[1] = j;
                    return Arrays.toString(pairNumber);
                }
            }

        }
        return "no pair found";
    }
}
