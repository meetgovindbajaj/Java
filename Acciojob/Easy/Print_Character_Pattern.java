/**
@start--------------------------------------------

@param Question
You are given a number N. Print a pattern consisting of N rows, where the first row has 1 A, the second row has 2 Bs, and so on for N letters. Check the examples for a better understanding.


@param Input-Format
First line of input contains N, the number of rows for the pattern


@param Output-Format
You need to print the pattern.


@param Input
4


@param Output
A
BB
CCC
DDDD


@param Explained
For number of rows to be 5 we get this output.


@param Constraints
1 <= N <= 26

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Print_Character_Pattern {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int N = sc.nextInt();
            stars(1, N, 65);
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }

    public static void stars(int row, int len, int c) {
        if (row > len)
            return;
        System.out.println(("" + (char) c).repeat(row));
        stars(row + 1, len, c + 1);
    }
}