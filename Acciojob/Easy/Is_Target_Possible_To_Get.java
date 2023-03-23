/**
@start--------------------------------------------

@param Question
Given an array of integers nums of size n, is it possible to choose a group of some of the integers, such that the group sums to the given target.


@param Input-Format
The first line contains two integers representing n and target.

Next line contains n spaced integers representing the nums array.


@param Output-Format
Return boolean true if the condition is holds else return false.


@param Input
3 10
2 4 8


@param Output
true


@param Explaination
Here 2+8 == 10.


@param Constraints
1 <= n <= 7

1 <= nums[i], target <= 20

@end--------------------------------------------
*/


import java.util.*;

public class Is_Target_Possible_To_Get {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        System.out.println(groupSum(nums, target, 0));
    }

    private static boolean groupSum(int[] nums, int target, int start) {
        if (target == 0)
            return true;
        else if (start >= nums.length)
            return false;
        else if (nums[start] > target)
            return groupSum(nums, target, start + 1);
        else
            return groupSum(nums, target - nums[start], start + 1) || groupSum(nums, target, start + 1);
    }
}