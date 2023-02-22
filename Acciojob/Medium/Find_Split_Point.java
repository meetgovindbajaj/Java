/**
@start--------------------------------------------

@param Question
Write a program to Partition an array into two subarrays with the same sum. Take input of size of array and the array elements then find if it is possible to split the array in two subarrays (without reordering the elements), such that the sum of the two subarrays is the same.


@param Input-Format
Input consists of two lines.

First line contains an integer N denoting size of array

Second line contains N integers denoting the array elements separated by single space


@param Output-Format
Print the two partitioned subarray in two lines. Print "Not Possible" if it is not possible to partition the array into subarrays of equal sum.

Note:- Print left subarray in first line and right subarray in second line.


@param Input
5
6 -4 3 2 -3


@param Output
6 -4 
3 2 -3


@param Explaination
Sum of 6+(-4) is equal to Sum of 3+2+(-3)


@param Constraints
1<= arr.size() <= 10000

@end--------------------------------------------
*/



import java.util.*;

public class Find_Split_Point {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        input(n, arr);
        splitPoint(n, arr);
    }

    public static void input(int n, int[] arr) {
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
    }

    public static void splitPoint(int n, int[] arr) {
        int i = 0, j = 0;
        while (++j <= n - 1)
            if (sum(i, j, arr) == sum(j, n, arr)) {
                printer(i, j, arr);
                printer(j, n, arr);
                break;
            }
        System.out.print(j == n ? "Not Possible" : "");
    }

    public static int sum(int s, int e, int[] arr) {
        int sum = 0;
        for (int i = s; i < e; i++)
            sum += arr[i];
        return sum;
    }

    public static void printer(int s, int e, int[] arr) {
        for (int i = s; i < e; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}