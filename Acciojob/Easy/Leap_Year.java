/**
@start--------------------------------------------

@param Question
Given a year, find if it is a leap year.

A Leap year is the year that is multiple of 4. However, multiples of 100 except for the multiples of 400 are not leap years.

Your task is to complete the function isLeapYear which receives the year as its parameter and returns 1 or 0 depending upon if the year is a leap year or not.


@param Input-Format
An integer Y, denoting the year.


@param Output-Format
Return 1, if the given year is a leap year or 0 otherwise.


@param Input
2004


@param Output
1


@param Explained
2004 is divisible 4 by hence it's a leap year


@param Constraints
1000 <= Y <= 9999

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Leap_Year {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int y = sc.nextInt();
        System.out.println(y % 4 == 0 ? y % 100 == 0 ? y % 400 == 0 ? 1 : 0 : 1 : 0);

    }
}