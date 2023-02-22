/**
@start--------------------------------------------

@param Question
You have given a number n, representing the size of array arr. You are given n numbers, representing elements of array arr.

You are required to print a bar chart representing value of arr.


@param Input-Format
First line consists of an integer n

Second line consists of n spaced integers, representing elements of arr


@param Output-Format
Output the Bar Graph of the array arr


@param Input
7
9 3 7 6 2 0 4


@param Output
*
*
*               *
*               *       *
*               *       *
*               *       *                       *
*       *       *       *                       *
*       *       *       *       *               *
*       *       *       *       *               *


@param Explained
Number of stars in each column represent the value of that index of array arr


@param Constraints
1 <= n <= 1000

-1000 <= arr[i] <= 1000

@end--------------------------------------------
*/



import java.util.*;

public class Buildings {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), max;
        int arr[] = new int[n];
        input(arr, n);
        max = max(arr, n);
        building(arr, n, max);
    }

    public static void input(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return;
    }

    public static int max(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
            max = arr[i] > max ? arr[i] : max;
        return max;
    }

    public static void building(int[] arr, int n, int max) {
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i < max - arr[j] ? "\t" : "*\t");
            }
            System.out.println();
        }
    }
}
