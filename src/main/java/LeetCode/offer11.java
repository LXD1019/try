package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class offer11 {

    public static void main(String[] args) {

        int[] numbers = {3,4,5,1,2};
        System.out.println(minArray1(numbers));

    }

    public static int minArray(int[] numbers) {

        int length = numbers.length;
        int min = numbers[length-1];
        for (int i = 0; i < length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int minArray1(int[] numbers) {

        Arrays.sort(numbers);
        return numbers[0];
    }
}
