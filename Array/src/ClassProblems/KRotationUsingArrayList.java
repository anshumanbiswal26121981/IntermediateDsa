package ClassProblems;

import java.util.ArrayList;
import java.util.Arrays;

/*
. Array Rotation
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.


Problem Constraints

1 <= N <= 105
1 <= A[i] <=109
1 <= B <= 109


Input Format

The first argument given is the integer array A.
The second argument given is the integer B.


Output Format

Return the array A after rotating it B times to the right


Example Input

Input 1:

A = [1, 2, 3, 4]
B = 2
Input 2:

A = [2, 5, 6]
B = 1


Example Output

Output 1:

[3, 4, 1, 2]
Output 2:

[6, 2, 5]


Example Explanation

Explanation 1:

Rotate towards the right 2 times - [1, 2, 3, 4] => [4, 1, 2, 3] => [3, 4, 1, 2]
Explanation 2:

Rotate towards the right 1 time - [2, 5, 6] => [6, 2, 5]
 */
public class KRotationUsingArrayList {

    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        B = B % n;
        if (B < 0) { // if k is negative add arr.length i.e n to k
            B = B + n;
        }
        reversePartArray(A, 0, n-1);
        reversePartArray(A, 0, B-1);
        reversePartArray(A, B, n-1);
        return A;
    }

    public static void reversePartArray(ArrayList<Integer> A, int left, int right) {
        while (left < right) {
            swap(A, left, right);
            left++;
            right--;
        }
    }

    public static void swap(ArrayList<Integer> A, int i, int j) {
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(solve(numbers, 2));

        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(2,5,6));
        System.out.println(solve(numbers1, 1));
    }
}
