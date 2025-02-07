package org.Rifqi;

import java.util.ArrayList;

public class RemoveOdd {
    public static int[] printEvenOnly(int[] numbers) {
        ArrayList<Integer> evenNumberList = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumberList.add(number);
            }
        }
        int[] evenNumberArray = new int[evenNumberList.size()];
        for (int i = 0; i < evenNumberArray.length; i++) {
            evenNumberArray[i] = evenNumberList.get(i);
        }
        return evenNumberArray;
    }
}
