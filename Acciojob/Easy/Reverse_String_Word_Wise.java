/**
@start--------------------------------------------

@param Question
You are given a string S containing several space-separated words. You need to reverse the order of appearence of the words.

NOTE

You need to complete the given function. The input and printing of output will be handled by the driver code.


@param Input-Format
The first line contains the number of test cases.

For each test case: The first line has the string S.


@param Output-Format
For each test case return the new reversed string.


@param Input
1
how are you


@param Output
you are how


@param Explained
We reverse the order of appearence.


@param Constraints
1 <= T <= 10

1 <= |S| <= 10000

@end--------------------------------------------
*/

package Gym.Easy;

import java.io.*;

public class Reverse_String_Word_Wise {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            System.out.println(reverseWords(s));
        }
    }

    public static String reverseWords(String s) {
        String[] str = s.split(" ");
        s = "";
        for (int i = str.length - 1; i >= 0; i--)
            s += str[i] + " ";
        return s.trim();
    }
}
