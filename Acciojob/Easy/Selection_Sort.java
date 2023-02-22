/**
@start--------------------------------------------

@param Question
Given an array arr of size n, containing positive integers. You need to sort the elements of array using the Selection Sort algorithm.


@param Input-Format
First line contains an integer n which is the size of array arr

Second line contains n space separated integers of arr


@param Output-Format
Return the sorted array


@param Input
5
4 1 3 9 7


@param Output
1 3 4 7 9


@param Explaination
The array after performing Selection sort: 1 3 4 7 9.


@param Constraints
1 <= n <= 10^4

-10^6 <= A[i] <= 10^6

@end--------------------------------------------
*/



import java.util.*;

public class Selection_Sort {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        input(n, arr);
        selectionSort(n, arr);
        printer(n, arr);
    }

    public static void input(int n, int[] arr) {
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
    }

    public static void selectionSort(int n, int[] arr) {
        int i = 0, j = 0, x = 0;
        Boolean check = false;
        while (j < n && !check) {
            if (i >= n) {
                int a = arr[j], b = arr[x];
                if (a > b) {
                    arr[j] = b;
                    arr[x] = a;
                }
                j += 1;
                i = j + 1;
                x = j;
            } else {
                if (arr[x] > arr[i])
                    x = i;
                i++;
            }
        }
    }

    public static void printer(int n, int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
    }
}