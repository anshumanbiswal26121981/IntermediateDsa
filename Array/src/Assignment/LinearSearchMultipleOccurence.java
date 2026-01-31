package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

/*
Linear Search - Multiple Occurences
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array A and an integer B, find the number of occurrences of B in A.


Problem Constraints

1 <= B, Ai <= 109
1 <= length(A) <= 105


Input Format

Given an integer array A and an integer B.


Output Format

Return an integer, number of occurrences of B in A.


Example Input

Input 1:
 A = [1, 2, 2], B = 2
Input 2:
 A = [1, 2, 1], B = 3


Example Output

Output 1:
 2
Output 2:
 0


Example Explanation

Explanation 1:
Element at index 2, 3 is equal to 2 hence count is 2.
Explanation 2:
There is no element equal to 3 in the array.
 */
public class LinearSearchMultipleOccurence {

    public static int solve(ArrayList<Integer> A, int B) {
        int count = 0;
        for (int i = 0; i < A.size(); ++i) {
            if (A.get(i) == B) {
                ++count;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 2));
        System.out.println(solve(numbers,2));

        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 1));
        System.out.println(solve(numbers1,3));
    }
}
