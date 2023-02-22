/**
@start--------------------------------------------

@param Question
You are given a string consisting of different words separated by underscores _. You have to convert the string to camel case. The first letter of the entire case should be lowercase.

eg: app_dsd_sdda to appDsdSdda

Note:

StringBuilder in Java represents a mutable sequence of characters.


@param Input-Format
The first line contains the number of test cases.

For each test case: The first line contains the string S.


@param Output-Format
For each test case print the final formed string in a new line.


@param Input
1
how_are_you


@param Output
howAreYou


@param Explaination
We remove the underscores and convert the next character to uppercase.


@param Constraints
1 <= T <= 10

1 <= |S| <= 100000

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Camel_Case {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0)
            System.out.println(camelCaseString(sc.next()));
    }

    public static StringBuilder camelCaseString(String s) {
        StringBuilder res = new StringBuilder();
        Boolean toggle = false;
        for (char c : s.toCharArray()) {
            if (toggle) {
                res.append(Character.toUpperCase(c));
                toggle = false;
            } else if (c == '_') {
                toggle = true;
            } else {
                res.append(c);
            }
        }
        return res;
    }
}