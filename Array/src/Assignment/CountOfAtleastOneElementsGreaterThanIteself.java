package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

/*
Count of elements
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array A of N integers.
Count the number of elements that have at least 1 elements greater than itself.


Problem Constraints

1 <= N <= 103
1 <= A[i] <= 109


Input Format

First and only argument is an array of integers A.


Output Format

Return the count of elements.


Example Input

Input 1:
A = [3, 1, 2]
Input 2:
A = [5, 5, 3]


Example Output

Output 1:
2
Output 2:
1


Example Explanation

Explanation 1:
The elements that have at least 1 element greater than itself are 1 and 2
Explanation 2:
The elements that have at least 1 element greater than itself is 3
 */
public class CountOfAtleastOneElementsGreaterThanIteself {
    public static int solve(ArrayList<Integer> A) {

        int count = 0;
        int max = maxArray(A);
        for (int i = 0; i < A.size(); ++i) {
            if (A.get(i) != max) {
                ++ count;
            }
        }
        return count;
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

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3,1,2));
        System.out.println(solve(numbers));

        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(5,5,3));
        System.out.println(solve(numbers1));
    }
}
