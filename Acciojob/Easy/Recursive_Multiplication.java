/**
@start--------------------------------------------

@param Question
You are given two integers N and M. Calculate and return their multiplication using recursion.

You can only use subtraction and addition for your calculation. No other operators are allowed.

Note

Complete the given function. The input would be handled by the driver code. You only have to print the answer.


@param Input-Format
The first line contains N.

The second line contains M.


@param Output-Format
Print the product.


@param Input
10
13


@param Output
130


@param Explained
10 * 13 = 130


@param Constraints
1 <= N, M <= 10000

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Recursive_Multiplication {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(multiplyRecursively(sc.nextInt(), sc.nextInt(), 0));
    }

    public static int multiplyRecursively(int n, int m, int sum) {
        if (m == 0)
            return sum;
        return multiplyRecursively(n, m - 1, sum + n);
    }
}