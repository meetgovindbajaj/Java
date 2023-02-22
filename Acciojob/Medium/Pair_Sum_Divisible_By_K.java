/*
Given an array of N integers and an integer K, your task is to calculate the count of pairs whose sum is divisible by K. 

input format:
-The first line of input contains two integers N and K.
-The next line contains N space-separated integers depicting values of an array.

output format:
-Print the count of required pairs.

input:  5 4 
        1 2 3 4 5

output: 2

explained: Here , 2 pairs are possible whose sum is divisible by 3 i.e (1 3) and (3 5) are the required pairs
*/
package Gym.Medium;

import java.util.*;

public class Pair_Sum_Divisible_By_K {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scn.nextInt();
        int K = scn.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scn.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.countKdivPairs(arr, N, K));
    }
}

class Solution {
    public int countKdivPairs(int arr[], int N, int K) {
        int i = 0, j = 1, count = 0;
        for (i = 0; i < N; i++) {
            for (j = i + 1; j < N; j++) {
                int sum = arr[i] + arr[j];
                if (sum % K == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}