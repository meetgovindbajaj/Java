/**
@start--------------------------------------------

@param Question
Given an integer array of which both the first half and second half are sorted. The task is to merge two sorted halves of the array into a single sorted array.

Note: The two halves can be of arbitrary sizes.


@param Input-Format
line 1: contains an integer n denoting the size of the array.

line 2: contains n-spaced integers denoting elements of the array.


@param Output-Format
Print an array consisting of n elements denoting the sorted array.


@param Input
6
2 3 8 -1 7 10


@param Output
-1 2 3 7 8 10


@param Explaination
The first half sorted array is 2 3 8 and the second half is -1 7 10 and if we merge them and sort them we will get -1 2 3 7 8 10


@param Constraints
1<=n<=10^5

-10^6<=arr[i]<=10^6

Expected Time Complexity: O(N)

Expected Space Complexity: O(N)

@end--------------------------------------------
*/



import java.util.*;

public class Sort_The_Half_Sorted {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        arr = sort(n, arr);
        for (int i : arr)
            System.out.print(i + " ");
    }

    public static int[] sort(int n, int[] arr) {
        int half_i = 0, i = 0, j = 0, k = 0;
        int[] temp = new int[n];
        for (int x = 0; x < n - 1; x++)
            if (arr[x] > arr[x + 1]) {
                half_i = x + 1;
                break;
            }
        if (half_i == 0)
            return arr;
        j = half_i;
        while (i < half_i && j < n)
            temp[k++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
        while (i < half_i)
            temp[k++] = arr[i++];
        while (j < n)
            temp[k++] = arr[j++];
        return temp;
    }
}
