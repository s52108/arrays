package arrays;

import java.util.Arrays;
import java.util.List;

public class NumberHelper {
    public static boolean isSortedArray(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1])
                return false;
        }
        return true;
    }

    public static int[] removeDuplicates(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > 0) {
                int tempNumber = numbers[i];
                for (int j = 0; j < i; j++) {
                    if (tempNumber == numbers[j]) {
                        numbers[i] = -1;
                    }
                }

            }

        }
        return numbers;
    }



}



