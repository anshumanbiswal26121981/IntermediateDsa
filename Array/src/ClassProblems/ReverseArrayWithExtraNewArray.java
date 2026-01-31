package ClassProblems;

import java.util.Arrays;

public class ReverseArrayWithExtraNewArray {

    public static void reverseArray(int[] arr) {
        int len = arr.length;
        int[] newarr = new int[len];
        for (int i = len-1, j = 0; i >= 0; i--,++j) {
            newarr[j] = arr[i];
        }
        for (int k = 0; k < len; ++k) {
            arr[k] = newarr[k];
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
