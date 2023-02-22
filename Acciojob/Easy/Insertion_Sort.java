/**
@start--------------------------------------------

@param Question
Implement insertion sort.


@param Input-Format
The first line  contains one space separated integer N denoting the number of elements.

The Second line  contains N space separated integers denoting the elements of the array.

You need to complete insertionSort function which contains a array of size n and print the final sorted array in this function only.


@param Output-Format
Print the array in sorted fashion in sorted fashion.


@param Input
6
7 6 8 5 4 9


@param Output
4 5 6 7 8 9


@param Explaination
Printed sorted array.


@param Constraints
0 <= nums.length <= 10^4

-10^9 <= nums[i] <= 10^9

@end--------------------------------------------
*/



import java.util.*;

public class Insertion_Sort {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        input(n, arr);
        insertionSort(n, arr);
        printer(n, arr);
    }

    public static void input(int n, int[] arr) {
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
    }

    public static void printer(int n, int[] arr) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void insertionSort(int n, int[] arr) {
        int i = 0, prev = arr[0];
        while (++i < n) {
            if (arr[i] < prev)
                shift(n, arr, i);
            prev = arr[i];
        }
    }

    public static void shift(int n, int[] arr, int i) {
        int j = i, ele = arr[i];
        while (--j >= 0 && arr[j] > ele)
            arr[j + 1] = arr[j];
        arr[j + 1] = ele;
    }
}
