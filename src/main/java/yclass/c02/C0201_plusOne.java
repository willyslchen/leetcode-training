package yclass.c02;

import java.util.Arrays;

public class C0201_plusOne {
    public static void main(String[] args) {
        int[] digits01 = {3, 4, 5, 6}; // [3, 4, 5, 7]
        int[] digits02 = {1, 9, 9}; // [2, 0, 0]
        int[] digits03 = {9, 9, 9}; // [1, 0, 0, 0]

        System.out.println(Arrays.toString(plusOne(digits01)));
        System.out.println(Arrays.toString(plusOne(digits02)));
        System.out.println(Arrays.toString(plusOne(digits03)));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            int digit = digits[i];
            if (digit < 9) {
                digits[i] = digit + 1;
                return digits;
            } else { // digit == 9
                digits[i] = 0;
            }
        }
        int[] answer = new int[digits.length + 1];
        answer[0] = 1;
        return answer;
    }
}
