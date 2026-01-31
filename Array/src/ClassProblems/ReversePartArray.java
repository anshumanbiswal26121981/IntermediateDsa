package ClassProblems;

import java.util.Arrays;

public class ReversePartArray {

    public static void reversePartArray(int[] arr, int left, int right) {
        while (left < right) {
            ReverseArrayBySwapping.swap(arr, left, right);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reversePartArray(arr, 2,7);
        System.out.println(Arrays.toString(arr));
    }
}
