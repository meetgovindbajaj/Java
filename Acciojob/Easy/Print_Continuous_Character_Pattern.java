/**
@start--------------------------------------------

@param Question
Given an integer n that denotes the number of rows to be printed, print the pattern in which each row starts with its corresponding alphabet and has a length equal to the row number. (See the examples for a better understanding).

Note: You can take the alphabet to be cyclic. On reaching Z, you will cycle back to A, then B, and so on.


@param Input-Format
First line contains the value n representing the number of rows.


@param Output-Format
Print the pattern.


@param Input
5


@param Output
A
BC
CDE
DEFG
EFGHI


@param Explained
none


@param Constraints
1 <= n <= 26

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Print_Continuous_Character_Pattern {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        charPattern(1, 65, sc.nextInt());
    }

    public static void charPattern(int rows, int c, int len) {
        if (rows > len)
            return;
        System.out.println(printer(c, rows, ""));
        charPattern(rows + 1, c + 1, len);
    }

    public static String printer(int c, int cols, String str) {
        if (cols == 0)
            return str;
        return printer((c > 90 ? 66 : c + 1), cols - 1, str += (char) (c > 90 ? 65 : c));
    }
}
