/**
@start--------------------------------------------

@param Question
You have given a number n1, representing the size of array arr1. You have given n1 numbers, representing elements of array arr1. You have given a number n2, representing the size of array arr2.You have given n2 numbers, representing elements of array arr2. The two arrays represent digits of two numbers.

You are required to subtract the numbers represented by two arrays and print the arrays. n1 and n2 are of different size


@param Input-Format
First line consists of an integer n1

Second line consists of n1 spaced integers, representing elements of arr1

Third line consists of an integer n2

Fourth line consists of n2 spaced integers, representing elements of arr2


@param Output-Format
Subtract the two numbers and print the array


@param Input
3
3 2 1
3
1 2 3


@param Output
1
9
8


@param Explained
321 - 123 = 198


@param Constraints
1 <= n1, n2 <= 10

0 <= a1[i], a2[i] < 10

@end--------------------------------------------
*/



import java.util.*;

public class Array_Subtracting {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++)
            arr1[i] = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();
        subtract(arr1, arr2);
    }

    static void subtract(int[] n1, int[] n2) {
        long res = calSum(n1, n2, n1.length, n2.length);
        String temp = Long.toString(res);
        for (int i = 0; i < temp.length(); i++) {
            Boolean check = false;
            char cc = temp.charAt(i);
            check = ((int) cc >= 48 && (int) cc <= 57) ? true : false;
            if (check) {
                System.out.println(cc);
            } else {
                String res1 = cc + "" + temp.charAt(i + 1);
                System.out.println(res1);
                i += 1;
            }
        }
    }

    static long calSum(int a[], int b[], int n, int m) {
        String s1 = Arrays.toString(a);
        String s2 = Arrays.toString(b);
        s1 = s1.substring(1, s1.length() - 1).replaceAll(", ", "");
        s2 = s2.substring(1, s2.length() - 1).replaceAll(", ", "");
        long i1 = Long.valueOf(s1);
        long i2 = Long.valueOf(s2);
        return i1 - i2;
    }
}
