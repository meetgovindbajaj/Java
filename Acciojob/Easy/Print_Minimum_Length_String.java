/**
@start--------------------------------------------

@param Question
You are given an array of string. Print the string which has minimum length. If there are two strings of minimum length, print the one that comes first.


@param Input-Format
First line contains an integer n.

Next n line contains string.


@param Output-Format
Print string with smallest length in a single line.


@param Input
3 
Accio Jobs
Jobs
Accio


@param Output
Jobs


@param Explaination
Jobs has the smallest length out of all the given strings.


@param Constraints
1 <= |string| <= 1000
1 <= N <= 1000

@end--------------------------------------------
*/


import java.util.*;
import java.io.*;

public class Print_Minimum_Length_String {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.valueOf(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++)
            arr[i] = br.readLine();
        sort(arr);
        System.out.print(arr[0]);
    }

    public static void sort(String[] arr) {
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
    }
}
