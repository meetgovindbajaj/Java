/**
@start--------------------------------------------

@param Question
Given the number n, find out and return the number of digits present in a number recursively.


@param Input-Format
Input consists of single line which has the integer n.


@param Output-Format
Return the number of digits present in n.


@param Input
1256


@param Output
4


@param Explained
none


@param Constraints
1 <= n <= 10^9

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Find_Number_Of_Digits {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(digitCounter(sc.nextInt(), 0));
    }

    public static int digitCounter(int n, int count) {
        if (n <= 0)
            return count;
        return digitCounter(n / 10, count + 1);
    }
}
