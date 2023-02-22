/**
@start--------------------------------------------

@param Question
Given an array arr of size N. Your task is to determine that if by reversing any one subarray can the given array be sorted or not.

You have to complete solve function which consists of arr array of size N as inputs and you have to return boolean answer as output.


@param Input-Format
The first line of input contains a single integer N.

The second line of input contains N space seperated integers.


@param Output-Format
Return true, if by reversing any one subarray sorted array can be formed as else false , "Yes" or "No" will be taken care by driver code.


@param Input
5
1 2 5 4 3


@param Output
Yes


@param Explaination
By reversing the subarray {5, 4, 3}, the array will be sorted.


@param Constraints
1 <= N <= 10^5

1 <= arr[i] <= 10^6

@end--------------------------------------------
*/



import java.util.*;

public class Reverse_A_Subarray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        input(n, arr);
        System.out.println(checkRev(n, arr) ? "Yes" : "No");
    }

    public static void input(int n, int[] arr) {
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
    }

    public static Boolean checkRev(int n, int[] arr) {
        Boolean toggle = true;
        int p1 = 0, p2 = 0;
        for (int i = 0; i < n - 1; i++)
            if (toggle && arr[i] > arr[i + 1]) {
                p1 = i;
                toggle = false;
            } else if (!toggle) {
                p2 = arr[i] < arr[i + 1] ? i : arr[i] > arr[i + 1] ? i + 1 : p2;
                break;
            }
        insertionSort(arr, p1, p2);
        return isSorted(n, arr);
    }

    public static void insertionSort(int[] arr, int start, int end) {
        int i = start + 1, prev = arr[start];
        while (i <= end) {
            if (arr[i] < prev)
                shift(arr, i, start);
            prev = arr[i];
            i++;
        }
    }

    public static void shift(int[] arr, int i, int start) {
        int j = i, ele = arr[i];
        while (--j >= start && arr[j] > ele)
            arr[j + 1] = arr[j];
        arr[j + 1] = ele;
    }

    public static boolean isSorted(int n, int arr[]) {
        for (int i = 1; i < n; i++)
            if (arr[i] < arr[i - 1])
                return false;
        return true;
    }
}
