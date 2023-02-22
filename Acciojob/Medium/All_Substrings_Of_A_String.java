/**
@start--------------------------------------------

@param Question
Given a string str, print all possible non-empty substrings of str, in order of occurrence in the string.


@param Input-Format
Input consists of a single line of string.


@param Output-Format
Print all the substrings of a string in order of occurrence in the string in different lines.


@param Input
abc


@param Output
a
ab
abc
b
bc
c


@param Explaination
These are the possible non-empty substrings.


@param Constraints
0 <= str.length() <= 280

@end--------------------------------------------
*/

package Gym.Medium;

import java.util.*;

public class All_Substrings_Of_A_String {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        SubString(sc.nextLine());
    }

    public static void SubString(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                System.out.println(s.substring(i, j));
    }
}
