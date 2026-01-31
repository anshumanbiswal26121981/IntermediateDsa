public class KRotation {

    public static void rotateArrayKtimes(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        if (k < 0) {
            k = k + n;
        }
        ReversePartArray.reversePartArray(arr, 0, n-1);
        ReversePartArray.reversePartArray(arr, 0, k-1);
        ReversePartArray.reversePartArray(arr, k, n-1);

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        rotateArrayKtimes(arr, 3);
    }
}
