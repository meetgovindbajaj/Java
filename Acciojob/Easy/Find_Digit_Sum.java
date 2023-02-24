/**
@start--------------------------------------------

@param Question
Given the number n, find out and return the sum of digits present in a number recursively.


@param Input-Format
Input consists of single line which has the integer n.


@param Output-Format
Return the sum of digits present in n.


@param Input
1256


@param Output
14


@param Explaination
Here the sum is 1+2+5+6 = 14.


@param Constraints
1 <= n <= 10^9

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Find_Digit_Sum {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(sumOfDigit(sc.nextInt()));
    }

    static int sumOfDigit(int n) {
        if (n == 0)
            return 0;
        return sumOfDigit(n / 10) + (n % 10);
    }
}