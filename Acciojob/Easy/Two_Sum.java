/**
@start--------------------------------------------

@param Question
You are given a non-decreasing array A of N integers. You are given another integer target.

You have to find two unique indices of the array such that the values at those indices have a sum equal to target.

Return the indices as a sorted integer array of size 2.

It is guaranteed that the test cases are made such that only one solution exists.

The array is 1-indexed.

Note Complete the given function. The input and output would be handled by the driver code.

Your solution must use only constant extra space.


@param Input-Format
The first line contains a single integer N.

The second line contains N space-separated integers of array A.

The third line contains a single integer target.


@param Output-Format
Print the answer in a new line.


@param Input
4
1 2 3 4
6


@param Output
2 4


@param Explained
A[2] = 2. A[4] = 4. 2 + 4 = 6.


@param Constraints
1 <= N <= 10000

-100000 <= A[i] <= 100000

-200000 <= target <= 200000

@end--------------------------------------------
*/

package Gym.Easy;

import java.io.*;
import java.util.*;

public class Two_Sum {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        int[] arr = new int[(int) n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(inputLine[i]);
        int m = Integer.parseInt(br.readLine().trim());
        Arrays.sort(arr);
        int[] ans = (twoSum(arr, m));
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] twoSum(int[] A, int target) {
        int i = 0, j = A.length - 1;
        int[] arr = new int[2];
        Arrays.fill(arr, 0);
        while (i < j) {
            // System.out.println("i: " + i + " ,j: " + j + " ,sum: " + (A[i] + A[j]));
            if (target > (A[i] + A[j])) {
                i++;
            } else if (target < (A[i] + A[j])) {
                j--;
            } else {
                arr[0] = i + 1;
                arr[1] = j + 1;
                break;
            }
        }
        return arr;
    }
}
