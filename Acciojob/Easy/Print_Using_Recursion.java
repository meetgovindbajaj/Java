/**
@start--------------------------------------------

@param Question
Take input of N from the user and write a program to print the following pattern (N=3) :
3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3 


@param Input-Format
Input consists of integer N.


@param Output-Format
Print the pattern for the entered value of N.


@param Input
2


@param Output
2 1 1 1 2 1 1 1 2


@param Explaination
None


@param Constraints
1<=N<=10

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Print_Using_Recursion {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        printPattern(sc.nextInt());
    }

    static void printPattern(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        printPattern(n - 1);
        System.out.print(n + " ");
        printPattern(n - 1);
        System.out.print(n + " ");
    }
}
