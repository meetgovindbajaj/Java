/**
@start--------------------------------------------

@param Question
Given a string s, compute recursively a new string where all the adjacent chars are now separated by a "*".


@param Input-Format
The first line contains the string s.


@param Output-Format
Return the modified string.


@param Input
hello


@param Output
h*e*l*l*o


@param Explaination
The modified string is h*e*l*l*o.


@param Constraints
1 <= s.length <= 10^3

@end--------------------------------------------
*/


import java.util.*;

public class Star_It_Up {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.nextLine(), t = "";
        String[] sarr = s.split("");
        for (int i = 0; i < sarr.length - 1; i++)
            t += sarr[i] + "*";
        t += sarr[sarr.length - 1];
        System.out.println(t);
    }
}