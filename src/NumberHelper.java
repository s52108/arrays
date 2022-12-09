import java.util.Arrays;

public class NumberHelper {
    public static boolean isSortedArray(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1])
                return false;
        }
        return true;
    }

    public static int[] removeDuplicates(int[] numbers) {
        int[] noMoreDuplicates = new int[numbers.length];
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < 0) {
                noMoreDuplicates[i] = numbers[i];
            } else if (Arrays.asList(numbers).contains(noMoreDuplicates)) {
                noMoreDuplicates[i] = -1;

            } else noMoreDuplicates[i] = numbers[i];

        }

        return noMoreDuplicates;
    }


}



