package yclass.c01;

public class C0102_binarySearch {
    public static void main(String[] args) {
        int[] array01 = {7, 15, 19, 26, 32, 45, 57, 77, 95};
        System.out.println(binarySearch(array01, 77));
    }

    public static int binarySearch(int[] sortedArray, int target) {
        int low = 0;
        int high = sortedArray.length - 1;
        int middle;

        while (high >= low) {
            middle = (low + high) / 2;
            if (sortedArray[middle] == target) {
                return middle;
            }
            if (sortedArray[middle] > target) {
                high = middle - 1;
            }
            if (sortedArray[middle] < target) {
                low = middle + 1;
            }
        }
        return -1;
    }
}
