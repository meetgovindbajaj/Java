/**
@start--------------------------------------------

@param Question
Given a string str, determine if it is a palindrome, considering only alphabetic characters and ignoring the upper or lower case. Return 0 if it is not a palindrome, else return 1.


@param Input-Format
Input consists of one line

The first line given is a string str.


@param Output-Format
Returns 0 if it is not a palindrome, else return 1 if it is a palindrome


@param Input
a man, a plan, a canal Panama


@param Output
1


@param Explaination
It is a palindrome.


@param Constraints
1 <= str.length <= 10000

@end--------------------------------------------
*/



import java.util.*;

public class Palindrome_String {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(isPalindrome(sc.nextLine()));
    }

    public static int isPalindrome(String s) {
        s = s.replaceAll("[ ,.'?;:]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        String n = sb.reverse().toString();
        return s.equals(n) ? 1 : 0;
    }
}
