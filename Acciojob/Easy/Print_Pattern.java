/**
@start--------------------------------------------

@param Question
Print the given pattern (N=5):
    1
   222
  33333
 4444444
555555555


@param Input-Format
Input consists of integer N.


@param Output-Format
Print the pattern for value N.


@param Input
3


@param Output
  1
 222
33333


@param Explaination
The pattern is of pyramid with first line consisting of one 1, it goes on the same till it reaches till 2*N-1 number of Ns.


@param Constraints
1 <= N <= 100

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Print_Pattern {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int n = sc.nextInt();
        pattern(n, 1, 1);
    }

    static void pattern(int n, int i, int count) {
        if (i > n)
            return;
        printer(n - i, count, i);
        pattern(n, i + 1, count + 2);
    }

    static String printer(int count, int num) {
        return (num + "").repeat(count);
    }

    static void printer(int spaces, int count, int num) {
        System.out.println(" ".repeat(spaces) + printer(count, num));
    }
}