/**
@start--------------------------------------------

@param Question
Write a program to sort an array (arr[]) of integers in descending (decreasing) order using Bubble sort algorithm. First take input of size of the array i.e. N, followed by N numbers which represent the array elements.

Note: Use of inbuilt sort function is not permitted.

Time complexity: There are N elements in the array and for every element we make N interations , hence N*N iterations which gives us a Time complexity of O(N^2) in the worst case.

Space Complexity: Since this algorithm works without the use of any additional storage space apart from the input, we can say that the Space Complexity will be O(1)


@param Input-Format
First line contains integer N denoting the size of array arr[]

Second line contains N array integers each separated by a space denoting elements of arr[]


@param Output-Format
Output N integers of the sorted array separated by a space in a single line


@param Input
5
1 4 3 7 2


@param Output
7 4 3 2 1


@param Explained
7>4>3>2>1


@param Constraints
1 <= n <= 1000

1 <= arr[i] <= 1000

@end--------------------------------------------
*/


import java.util.*;

public class Bubble_Sort {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int size = sc.nextInt();
        int arr[] = new int[size];
        input(arr);
        sort(arr);
        bubbleSort(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }

    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        return;
    }

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr)
            max = Math.max(max, i);
        return max;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        return;
    }

    public static void print(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
    }

    public static void sort(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>(Collections.nCopies(max(arr) + 1, 0));
        for (int i : arr)
            al.set(i, al.get(i) + 1);
        int j = 0;
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) > 0) {
                arr[j++] = i;
            }
        }
        print(arr);
    }
}