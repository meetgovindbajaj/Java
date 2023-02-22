/**
@start--------------------------------------------

@param Question
You are given an array arr of length n. You have to print the reversed array.

Note: You have to use Recursion.


@param Input-Format
The first line of input contains an integer n, size of the array.

The next line contains n space separated integers denoting the elements of the array.

You need to complete reverseArray function which returns the reverse array recursively and it contains arr array of size N and start & end pointer.


@param Output-Format
Print n space separated integers denoting the reverse of the input array.


@param Input
4
1 3 5 7


@param Output
7 5 3 1


@param Explained
After reversing 1 3 5 7, we will get 7 5 3 1


@param Constraints
0 <= nums.length <= 100

0 <= nums[i] <= 100000

@end--------------------------------------------
*/



import java.util.*;

public class Reverse_Array_Recursively {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] nums = new int[n];
        input(nums, 0);
        reverseArray(nums, 0, n - 1);
        printer(nums, 0);
    }

    public static void reverseArray(int arr[], int start, int end) {
        if (start >= end)
            return;
        arr[start] = arr[start] + arr[end];
        arr[end] = arr[start] - arr[end];
        arr[start] = arr[start] - arr[end];
        reverseArray(arr, start + 1, end - 1);
    }

    public static void input(int[] arr, int i) {
        if (i > arr.length - 1)
            return;
        arr[i] = sc.nextInt();
        input(arr, i + 1);
    }

    public static void printer(int[] arr, int i) {
        if (i > arr.length - 1)
            return;
        System.out.print(arr[i] + " ");
        printer(arr, i + 1);
    }
}
