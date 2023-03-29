/**
@start--------------------------------------------

@param Question
Harsh has an array A of length N, he needs to count the number of Accio Subarrays of A.
An Accio subarray is one that has more than two elements with the same difference between them. For example, the length of [2, 4, 6] is 3, and the difference between any two successive items is 2.

Note: A subarray is a part of a contiguous array (i.e., occupying consecutive locations) that keeps the order of the elements intact.


@param Input-Format
The first line contains an integer 'N' denoting the number of elements. The second line contains 'N' space seprated integers denoting the elements of the array.


@param Output-Format
Print a single integer denoting the number of Accio Subarrays for each test case in a new line.


@param Input
4
1 3 5 7


@param Output
3


@param Explaination
We have A = [1 3 5 7]
Diff of consecutive elements: 
A[1]- A[0] = 3-1 = 2
A[2]- A[1] = 5-3 = 2
A[3]- A[2] = 7-5 = 2
[1 3 5], [3 5 7], and [1 3 5 7] are the three Accio subarray.
Thus the answer is 3.


@param Constraints
1 <= N <= 3000
0 <= A[i] <= 5000

@end--------------------------------------------
*/

import java.util.*;

public class Accio_Subarrays {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("sol 1: " + subarrays(arr, n));
    }

    public static int subarrays(int[] arr, int n) {
        int count = 0;
        loop: for (int i = 0; i < arr.length - 2; i++)
            for (int j = i + 2; j < arr.length; j++) {
                if (arr[j] - arr[j - 1] != arr[i + 1] - arr[i])
                    continue loop;
                count++;
            }
        return count;
    }
}