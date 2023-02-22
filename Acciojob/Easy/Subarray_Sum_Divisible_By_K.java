/**
@start--------------------------------------------

@param Question
Given an integer array nums and an integer k, print the number of non-empty subarrays that have a sum divisible by k.

A subarray is a contiguous part of an array.


@param Input-Format
Input consists of two lines.

The first line contains two integers n (size of the array) and k.

The second line contains n spaced integers.


@param Output-Format
Print count of subarrays divisible by k


@param Input
6 5 
4 5 0 -2 -3 1


@param Output
7


@param Explained
There are 7 subarrays with a sum divisible by k = 5:

[4, 5, 0, -2, -3, 1]

[5]

[5, 0]

[5, 0, -2, -3]

[0]

[0, -2, -3]

[-2, -3]


@param Constraints
1 <= nums.length <= 5 * 10^3

-10^4 <= nums[i] <= 10^4

2 <= k <= 10^4

@end--------------------------------------------
*/



import java.util.*;

public class Subarray_Sum_Divisible_By_K {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        System.out.print(subarrayDivisbleByK(arr, k));
    }

    public static int subarrayDivisbleByK(int A[], int k) {
        int[] map = new int[k];
        map[0] = 1;
        int count = 0, sum = 0;
        for (int num : A) {
            sum = (sum + num) % k;
            if (sum < 0) {
                sum += k;
            }
            count += map[sum];
            map[sum] += 1;
        }
        return count;
    }
}