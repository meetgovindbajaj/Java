/**
@start--------------------------------------------

@param Question
Given a number N, you need to check whether the given number is Palindrome or not. A number is said to be Palindrome when it reads the same from backward as forward.


@param Input-Format
number n


@param Output-Format
true or false


@param Input
5


@param Output
true


@param Explained
none


@param Constraints
1 <= N <= 9999

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Palindrome_Number {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String num = sc.nextLine(), rev = (new StringBuilder(num)).reverse().toString();
        System.out.println(rev.equals(num));
    }
}
