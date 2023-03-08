/**
@start--------------------------------------------

@param Question
You are given an array ‘ARR’ consisting of ‘N’ strings. Your task is to find the longest common prefix among all these strings.

A prefix of a string can be defined as a substring obtained after removing some or all characters from the end of the string.

For Example: Consider ARR = [“coding”, ”codezen”, ”codingninja”, ”coders”]

The longest common prefix among all the given strings is “cod” as it is present as a prefix in all strings. Hence, the answer is “cod”.


@param Input-Format
The first line contains a single integer N denoting the number of strings in the array.

The next line contains N space-separated strings denoting the elements of the array ‘ARR’.


@param Output-Format
Print a single string corresponding to the longest common prefix.


@param Input
4
coding codezen codingni coder


@param Output
cod


@param Explaination
The longest common prefix among all the given strings is “cod” as it is present as a prefix in all strings. Hence, the answer is “cod”.


@param Constraints
1 <= N <= 3000

1 <= |ARR[i]| <=1000

Each string consists of only lowercase Latin letters.

It is guaranteed that the longest common prefix is not an empty string

@end--------------------------------------------
*/


import java.util.*;

public class Longest_Common_Prefix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.next();
        System.out.println();
    }

    public static String longestCommonPrefix(String[] arr) {
        if (arr == null || arr.length == 0)
            return "";
        String prefix = arr[0];
        for (int i = 1; i < arr.length; i++)
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        return prefix;
    }
}