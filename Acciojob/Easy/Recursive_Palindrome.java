/**
@start--------------------------------------------

@param Question
Given an array arr of length n, you have to find whether the given array is a palindrome using recursion.

Note: A palindrome is an array which reads the same both forwards and backwards.


@param Input-Format
First line consists of an integer n, the number of elements in the array

Second line consists of n spaced inetegrs, representing the array arr.


@param Output-Format
Print true if the array is a palindrome else print false.


@param Input
5
1 2 3 2 1


@param Output
true


@param Explaination
Backwards it reads 1, 2, 3, 2 1 which is the same.


@param Constraints
1 <= n <= 10^3

-10^4 <= arr[i] <= 10^4

@end--------------------------------------------
*/



import java.util.*;

public class Recursive_Palindrome {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(isPalindromic(arr, 0, n - 1));
    }

    public static Boolean isPalindromic(int[] arr, int i, int j) {
        return i > j ? true : arr[i++] == arr[j--] ? isPalindromic(arr, i, j) : false;
    }
}
