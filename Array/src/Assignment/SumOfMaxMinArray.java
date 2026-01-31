package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

/*
Problem Description

Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.


Problem Constraints

1 <= N <= 105
-109 <= A[i] <= 109


Input Format

First argument A is an integer array.


Output Format

Return the sum of maximum and minimum element of the array


Example Input

Input 1:

A = [-2, 1, -4, 5, 3]
Input 2:

A = [1, 3, 4, 1]


Example Output

Output 1:

1
Output 2:

5


Example Explanation

Explanation 1:

Maximum Element is 5 and Minimum element is -4. (5 + (-4)) = 1.
Explanation 2:

Maximum Element is 4 and Minimum element is 1. (4 + 1) = 5.
 */
public class SumOfMaxMinArray {

    public static int solve(ArrayList<Integer> A) {

        int max = maxArray(A);
        int min = minArray(A);
        return max + min;
    }

    public static int maxArray(ArrayList<Integer> A) {
        int max = A.get(0);
        for (int i = 1; i < A.size ();++i) {
            if (A.get(i) > max) {
                max = A.get(i);
            }
        }
        return max;
    }

    public static int minArray(ArrayList<Integer> A) {
        int min = A.get(0);
        for (int i = 1; i < A.size ();++i) {
            if (A.get(i) < min) {
                min = A.get(i);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-2, 1, -4, 5, 3));
        System.out.println(solve(numbers));

        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1,3,4,1));
        System.out.println(solve(numbers1));
    }
}
