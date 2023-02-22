/**
@start--------------------------------------------

@param Question
You have given a number n1, representing the size of array arr1. You have given n1 numbers, representing elements of array arr1. You have given a number n2, representing the size of array arr2.You have given n2 numbers, representing elements of array arr2. The two arrays represent digits of two numbers.

You are required to add the numbers represented by two arrays and print the arrays. n1 and n2 are of diferent size


@param Input-Format
First line consists of an integer n1

Second line consists of n1 spaced integers, representing elements of arr1

Third line consists of an integer n2

Fourth line consists of n2 spaced integers, representing elements of arr2


@param Output-Format
Add the two numbers and print the array


@param Input
2
2 1
4
1 2 3 4


@param Output
1
2
5
5


@param Explained
1234 + 21 = 1255


@param Constraints
1 <= n1, n2 <= 10

0 <= a1[i], a2[i] < 10

@end--------------------------------------------
*/

package Gym.Medium;

import java.util.*;

public class Array_Adding {
    static Scanner sc = new Scanner(System.in);

    static long calSum(int a[], int b[], int n, int m) {
        String s1 = Arrays.toString(a);
        String s2 = Arrays.toString(b);
        s1 = s1.substring(1, s1.length() - 1).replaceAll(", ", "");
        s2 = s2.substring(1, s2.length() - 1).replaceAll(", ", "");
        long i1 = Long.valueOf(s1);
        long i2 = Long.valueOf(s2);
        return i1 + i2;
    }

    public static void main(String[] args) {
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++)
            arr1[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();

        long res = calSum(arr1, arr2, n1, n2);
        String temp = Long.toString(res);
        for (int i = 0; i < temp.length(); i++) {
            System.out.println(temp.charAt(i));
        }
    }
}
