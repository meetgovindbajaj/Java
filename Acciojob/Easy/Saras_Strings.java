/**
@start--------------------------------------------

@param Question
Sara does not like strings that have both the uppercase and the lowercase characters. She thinks only those strings are good which have only lowercase characters( wherever possible) or only uppercase characters( wherever possible).

Given a string s consisting of the English alphabets. Your task is to find the minimum number of operations required to make it good. In one operation you can choose any character of the string and change it into uppercase or lowercase.

You have to complete minOperation function which consists of single string s as input and you have to return integer answer as output.


@param Input-Format
The input contains a single line containing the string s.


@param Output-Format
Print the minimum number of operations required to make the string good.


@param Input
aBASDF


@param Output
1


@param Explaination
As there is only one letter which is lowercase and all other uppercase , so we need only 1 operation due to which whole string is in uppercase.


@param Constraints
1<=|s|<=100

@end--------------------------------------------
*/


import java.util.*;

public class Saras_Strings {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        System.out.println(Math.min(s.replaceAll("[A-Z]", "").length(), s.replaceAll("[a-z]", "").length()));
    }
}