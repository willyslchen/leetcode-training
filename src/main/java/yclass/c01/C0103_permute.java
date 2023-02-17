package yclass.c01;

import java.util.Arrays;

public class C0103_permute {

    static int count;

    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5, 6};
        permute(arrayA, 0);
        System.out.println("Count : " + count);
    }

    public static void permute(int[] intArray, int startIndex) {
        for (int i = startIndex; i < intArray.length; i++) {
            int temp = intArray[startIndex];
            intArray[startIndex] = intArray[i];
            intArray[i] = temp;

            permute(intArray, startIndex + 1);

            intArray[i] = intArray[startIndex];
            intArray[startIndex] = temp;
        }
        if (startIndex == intArray.length) {
            count++;
//            System.out.println(intArray); // Address
            System.out.println(Arrays.toString(intArray));
        }
    }
}
