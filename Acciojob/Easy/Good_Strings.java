/**
@start--------------------------------------------

@param Question
You are given a set 'S' of distinct characters. You are also given an array 'A' of 'N' strings.

A String in array 'A' is called good if all the characters of the string is present in the set 'S'.

You have to find how many strings in the array 'A' are good.


@param Input-Format
The first line contains the number of test cases.

For each test case: The first line contains a string denoting the characters of the set 'S'.

The next line contains 'N', the number of strings in 'A'.

The next 'N' lines contains a string each, which are the elements of the array 'A'.


@param Output-Format
For each test case print the count of good strings in a new line.


@param Input
1
abc
4
ab
abd
cacb
cabef


@param Output
2


@param Explained
Only 'ab' and 'cacb' are good strings. Rest of the strings contain characters apart from 'abc'.


@param Constraints
1 <= T <= 10

1 <= |S| <= 26

1 <= N <= 1000

1 <= |A[i]| <= 1000

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;
import java.util.regex.Pattern;

public class Good_Strings {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = sc.nextInt();
            String[] A = new String[n];
            for (int i = 0; i < n; i++) {
                A[i] = sc.next();
            }
            System.out.println(goodStrings(s, A, n));
        }
    }

    static int goodStrings(String s, String[] arr, int n) {
        final String regex = "[" + s + "]+";
        int count = 0;
        for (String str : arr)
            count += Pattern.matches(regex, str) ? 1 : 0;
        return count;
    }
}
