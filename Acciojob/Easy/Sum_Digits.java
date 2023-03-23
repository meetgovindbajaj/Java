/**
@start--------------------------------------------

@param Question
Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

Example: sumDigits(126) → 9

sumDigits(49) → 13

sumDigits(12) → 3


@param Input-Format
First line contains n representing the integer whose sum of digits we have to calculate.


@param Output-Format
Return the sum of digits of the input number.


@param Input
126


@param Output
9


@param Explaination
Sum of digits 1 + 2 + 6 = 9


@param Constraints
1 <= n <= 10^4

@end--------------------------------------------
*/

import java.util.*;

public class Sum_Digits {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(sum(sc.nextInt()));
    }

    public static int sum(int n) {
        if (n == 0)
            return 0;
        return n % 10 + sum(n / 10);
    }
}
