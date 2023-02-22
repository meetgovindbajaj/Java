/**
@start--------------------------------------------

@param Question
Write a recursive program to find the product of all the Natural numbers till N. Take input of N from the user and write a recursive function that returns the product of all the Natural numbers until N.


@param Input-Format
Enter an integer N (N>0)


@param Output-Format
Print the product of all the Natural numbers between N and 1 (both included).


@param Input
5


@param Output
120


@param Explaination
5 * 4 * 3 * 2 * 1 = 120.


@param Constraints
1 <= N <= 14

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Product_Of_Natural_Numbers {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(product(sc.nextInt()));
    }

    public static long product(int n) {
        if (n == 1)
            return 1;
        return n * product(n - 1);
    }
}
