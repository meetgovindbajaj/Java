/**
@start--------------------------------------------

@param Question
You are given two integers, N and X. You have to find X raised to the power N in O(N) time complexity using recursion.

Note Complete the given function and use recursion to solve this problem.

It is guaranteed that the test cases are made such that the answer does not overflow a 64-bit integer datatype.


@param Input-Format
The first line contains two integers, X, and N.


@param Output-Format
Print the answer.


@param Input
2 3


@param Output
8


@param Explaination
2 raised to the power 3 is 8.


@param Constraints
1 <= X <= 10^8

1 <= N <= 64

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Power_Calculation {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(power(sc.nextInt(), sc.nextInt()));
    }

    public static long power(int x, int n) {
        return n == 0 ? 1 : x * power(x, n - 1);
    }
}
