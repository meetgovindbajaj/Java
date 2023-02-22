/**
@start--------------------------------------------

@param Question
You are given an array A of size N with possibly duplicate elements. Your task is to find the index of first occurence of an element T in the given array. Also, return -1 if the element is not present.

You have to complete firstIndex function which contains array A , integers T (target) and startIndex as inputs and returns the first index of occurence as integer output


@param Input-Format
First line represents size of the array i.e. N

Second line represents n-spaced array elements of the array.

Third line represents element T for which we have to find the first index of occurence.


@param Output-Format
Print the integer value i.e. first index of occurence of the element.


@param Input
6
5 6 4 6 1 2
6


@param Output
1


@param Explained
6 is present twice in the input array and the first time it appears is at index 1.


@param Constraints
0 <= N <= 10^5

-10^9 <= A[i] <= 10^9

-10^9 <= T <= 10^9

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class First_Occurence_Index {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[sc.nextInt()];
        input(arr, 0);
        System.out.println(firstIndex(arr, sc.nextInt(), 0, false));
    }

    public static int firstIndex(int[] arr, int target, int i, Boolean found) {
        if (i > arr.length - 1 || found)
            return found ? i - 1 : -1;
        return firstIndex(arr, target, i + 1, arr[i] == target);
    }

    public static void input(int[] arr, int i) {
        if (i > arr.length - 1)
            return;
        arr[i] = sc.nextInt();
        input(arr, i + 1);
    }
}
