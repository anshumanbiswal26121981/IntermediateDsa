import java.util.Arrays;

public class ReverseArrayBySwapping {

    public static void reverseArrayBySwapping(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swap(arr, i , j);
            i++;
            j--;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverseArrayBySwapping(arr);
        System.out.println(Arrays.toString(arr));
    }
}
