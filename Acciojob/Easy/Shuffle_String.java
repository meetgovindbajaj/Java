/**
@start--------------------------------------------

@param Question
Given a string s and an integer array indices of the same length.

The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Print the shuffled string.


@param Input-Format
Input consists of two lines.

First line contains an integer n.

Second line contains the string.

Last line contains the indices separated by space.


@param Output-Format
Print the shuffled string.


@param Input
8
acciojob
4 5 6 7 0 2 1 3


@param Output
oojbacci


@param Explaination
As the problem states "acciojob" becomes "oojbacci" after shuffling.


@param Constraints
1 <= n <= 500

@end--------------------------------------------
*/



import java.util.*;

public class Shuffle_String {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String s = sc.next();
        int arr[] = new int[n];
        input(n, arr);
        shuffle(arr, s, n);
    }

    public static void input(int n, int[] arr) {
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
    }

    public static void shuffle(int[] arr, String s, int n) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < n; i++)
            sb.replace(arr[i], arr[i] + 1, "" + s.charAt(i));
        System.out.println(sb);
    }
}
