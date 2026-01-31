package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

/*
Second Largest
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.


Problem Constraints

1 <= |A| <= 105


0 <= A[i] <= 109





Input Format

The first argument is an integer array A.





Output Format

Return the second largest element. If no such element exist then return -1.



Example Input

Input 1:

 A = [2, 1, 2]
Input 2:

 A = [2]


Example Output

Output 1:

 1
Output 2:

 -1


Example Explanation

Explanation 1:

 First largest element = 2
 Second largest element = 1
Explanation 2:

 There is no second largest element in the array.
 */
public class SecondLargest {
    public static int secondMax(ArrayList<Integer> A) {

        int max = maxArray(A);
        int max2 = -1;
        for (int i = 0; i < A.size ();++i) {
            if (A.get(i) != max) {
                if (A.get(i) > max2) {
                    max2 = A.get(i);
                }
            }
        }
        return max2;

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
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2,1,2));
        System.out.println(secondMax(numbers));

        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(2));
        System.out.println(secondMax(numbers1));
    }
}
