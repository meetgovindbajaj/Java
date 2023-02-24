/**
@start--------------------------------------------

@param Question
Given two strings s1 and s2 as input, the task is to merge them alternatively i.e. the first character of s1 then the first character of s2 and so on till the strings end.

NOTE

Add the whole string if other string is empty.


@param Input-Format
line 1: contains string s1.

line 2: contains string s2.


@param Output-Format
Print a resulting string obtained by merging s1 and s2 alternatively starting with s1.


@param Input
abc
def


@param Output
adbecf


@param Explaination
None


@param Constraints
1<= s1.length(),s2.length() <=10^3

@end--------------------------------------------
*/

import java.util.*;

public class Merge_Two_Strings {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(mergeStrings(sc.next(), sc.next()));
    }

    public static String mergeStrings(String s1, String s2) {
        int i = 0, n = s1.length(), m = s2.length();
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < Math.min(n, m); i++)
            sb.append(s1.charAt(i) + "" + s2.charAt(i));
        if (n != m)
            sb.append(n > m ? s1.substring(i) : s2.substring(i));
        return sb.toString();
    }
}