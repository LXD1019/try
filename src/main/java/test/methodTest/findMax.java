package test.methodTest;

import java.util.Arrays;

public class findMax {

    public static void main(String[] args) {

        int[] a = {0,6,5,9,4,55,2,99,6,111};
        System.out.println(
                Arrays.stream(a).max().getAsInt()
        );

    }
}
