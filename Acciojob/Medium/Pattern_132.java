/**
@start--------------------------------------------

@param Question
Given an array of n integers nums, a 132 pattern is a subsequence of three integers nums[i], nums[j] and nums[k] such that i < j < k and nums[i] < nums[k] < nums[j].

Return true if there is a 132 pattern in nums, otherwise, return false.


@param Input-Format
Input consists of two lines.

First line contains an integer n which is the number of elements in nums.

Next line contains n spaced integers which represents the elements of nums.


@param Output-Format
Return true if a 132 pattern is found otherwise return false.


@param Input
4
3 1 4 2


@param Output
true


@param Explaination
There is a 132 pattern in the sequence: [1, 4, 2]


@param Constraints
1 <= n <= 2*10^5

-10^9 <= nums[i] <= 10^9

@end--------------------------------------------
*/


import java.util.*;

public class Pattern_132 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(find132pattern(arr));
    }

    public static boolean find132pattern(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++)
            if (nums[i] <= nums[i + 2] && nums[i + 2] <= nums[i + 1])
                return true;
        return false;
    }
}