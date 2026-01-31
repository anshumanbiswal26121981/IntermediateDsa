package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

/*
Time to equality
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an integer array A of size N. In one second, you can increase the value of one element by 1.

Find the minimum time in seconds to make all elements of the array equal.


Problem Constraints

1 <= N <= 1000000
1 <= A[i] <= 1000


Input Format

First argument is an integer array A.


Output Format

Return an integer denoting the minimum time to make all elements equal.


Example Input

A = [2, 4, 1, 3, 2]


Example Output

8


Example Explanation

We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.
 */
public class TimeToEquality {

    public static int solve(ArrayList<Integer> A) {
        int max = maxArray(A);
        int time = 0;
        for (int i = 0; i < A.size(); ++i) {
            int elem = A.get(i);
            time = time + (max - elem);
        }
        return time;
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
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2,4,1,3,2));
        System.out.println(solve(numbers));

    }
}
