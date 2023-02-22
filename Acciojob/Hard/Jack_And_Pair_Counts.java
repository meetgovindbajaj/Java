/**
@start--------------------------------------------

@param Question
Jack and his sister Jessica were preparing for a competitive exam. They have to find the answer to a simple mathematical puzzle which is as follows: The reciprocal of the number x and the reciprocal of the number y when added together give the reciprocal of a number N. Find the number of ordered pairs of x, y which satisfy the above equation. Can you help Jack and Jessica find the answer?

You have to complete solve function which consists of integer n as input and returns the integer value that determines the number of ordered pairs


@param Input-Format
The first line consists of a single integer N.


@param Output-Format
Returns an integer that determines the number of ordered pairs that satisfy the above condition.


@param Input
5


@param Output
3


@param Explaination
1/6 + 1/30 = 1/5

1/30 + 1/6 = 1/5

1/10 + 1/10 = 1/5


@param Constraints
N < 10^3

0 < x < 10^6

0 < y < 10^6

@end--------------------------------------------
*/

package Gym.Hard;

import java.util.*;

public class Jack_And_Pair_Counts {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), c = 0;
        for (int i = (n + 1); i <= (n * (n + 1)); i++)
            c += (n * i) % (i - n) == 0 ? 1 : 0;
        System.out.println(c);
    }
}
/*
 * 1/x + 1/y = 1/n
 * x=(yn)/(y-n)
 * if we take min val of 'y' then we will get max value of 'x'
 * min val for y = (n + 1) and if we put it in above eq then x = (n * (n + 1))
 * so for loop will start from min 'y' to max 'x' i.e. (n * (n + 1))
 */