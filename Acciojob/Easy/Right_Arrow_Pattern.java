/**
@start--------------------------------------------

@param Question
Given an integer n, print a right arrow of height and length n.


@param Input-Format
The first line of input contains the integer n.


@param Output-Format
The output should contain a right arrow of height and length n.


@param Input
5


@param Output
    *
    * *
* * * * *
    * *
    *   


@param Explaination
None


@param Constraints
1 <= n <= 200

n is odd

@end--------------------------------------------
*/


import java.util.*;

public class Right_Arrow_Pattern {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        pattern(n, true, 1, 1, n / 2 + 1);
    }

    public static void pattern(int n, Boolean toggle, int i, int stars, int halfWay) {
        if (i > n)
            return;
        printer(i == halfWay ? 0 : n / 2, i == halfWay ? n : stars);
        pattern(n, toggle = i >= halfWay ? false : true, i + 1, toggle ? stars + 1 : stars - 1, halfWay);
    }

    public static void printer(int space, int star) {
        System.out.println("  ".repeat(space) + "* ".repeat(star));
    }
}