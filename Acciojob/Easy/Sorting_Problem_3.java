/*
Given an integer array arr[] in unsorted order. Using Bubble Sort Technique, return an array of the squares of each number sorted in non-decreasing order.

input format:
-n (size of the array) arr[0] arr[1] arr[2] … arr[n-1]

output format:
-arr[0] arr[1] arr[2] … arr[n-1]

input: 5 -4 -1 0 3 10

output: 0 1 9 16 100

explained: After squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes [0,1,9,16,100].
*/
package Gym.Easy;

import java.util.*;

public class Sorting_Problem_3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();
            arr[i] = val * val;
        }
        Arrays.sort(arr);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + (i == (size - 1) ? "" : " "));
        }
    }
}
