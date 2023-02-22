/**
@start--------------------------------------------

@param Question
Given an array arr[] of size N. The user will take the elements of the array as input. Count the total number of subarrays of size 4 where all the elements are strictly increasing in order. Print 0 if there exist no such subarrays.


@param Input-Format
First line consists of N which is the size of the array. Next line consists of N space separated integers.


@param Output-Format
An integer that counts the number of subarrays with size 4, and strictly increasing elements


@param Input
12
8 6 3 4 5 9 12 7 20 22 31 38


@param Output
4


@param Explained
The subarray {3 4 5 9}, {4 5 9 12}, {7 20 22 31} and {20 22 31 38} are of size 4 and has all the elements in strictly increasing order. Hence there are 4 such subarrays.


@param Constraints
1<=N<=10^7

-10^5<=arr[i]<=10^5

@end--------------------------------------------
*/



import java.util.*;

public class Subarray_Problem_2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solve(arr, n);
    }

    public static void solve(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int size = j - i + 1;
                if (size == 4) {
                    Boolean inc = true;
                    int prev = arr[i];
                    for (int k = i + 1; (k <= j) && inc; k++) {
                        inc = prev >= arr[k] ? false : true;
                        prev = arr[k];
                    }
                    count += inc ? 1 : 0;
                }
            }
        }
        System.out.println(count);
    }
}
