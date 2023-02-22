/**
@start--------------------------------------------

@param Question
A pangram is a string that contains every letter of the alphabet. Given a sentence determine whether it is a pangram in the English alphabet. Ignore case. Return either pangram or not pangram as appropriate.


@param Input-Format
The first line inputs a string, S.


@param Output-Format
In a new line, print "pangram" if string contains every letter of the alphabet else "not pangram".


@param Input
We promptly judged antique ivory buckles for the next prize


@param Output
pangram


@param Explaination
All of the letters of the alphabet are present in the string.


@param Constraints
0 < length of s <= 1000\

Each character of s, s[i]∈{a-z,A-Z,space}

@end--------------------------------------------
*/



import java.util.*;

public class Pangrams {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        isPanagram(sc.nextLine().replaceAll(" ", "").toLowerCase(), "abcdefghijklmnopqrstuvwxyz".toCharArray(), true);
    }

    public static void isPanagram(String s, char[] ch, Boolean check) {
        for (int i = 0; i < ch.length && check; i++)
            if (!s.contains("" + ch[i]))
                check = false;
        System.out.println(check ? "pangram" : "not pangram");
    }
}
