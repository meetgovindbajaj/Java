/**
@start--------------------------------------------

@param Question
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.


@param Input-Format
None


@param Output-Format
None


@param Input
s = "anagram", t = "nagaram"


@param Output
true


@param Explaination
None


@param Constraints
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.

@end--------------------------------------------
*/

import java.util.*;

public class Valid_Anagram {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(isAnagram(sc.next(), sc.next()));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] arr = new int[128];
        for (char c : s.toCharArray())
            ++arr[c];
        for (char c : t.toCharArray())
            if (--arr[c] < 0)
                return false;
        return true;
    }
}