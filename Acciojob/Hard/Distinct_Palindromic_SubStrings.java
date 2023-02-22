/**
@start--------------------------------------------

@param Question
Given a string s, print all the substrings of s that are palindromic. Print all the required substrings in lexicographical order.

A substring is a subset or part of another string, or it is a contiguous sequence of characters within a string.

A lexicographic order is an arrangement of characters, words, or numbers in alphabetical order, that is, the letters are sorted from A-Z.


@param Input-Format
First line contains a string s.


@param Output-Format
Print various strings according to the question, each string should be in a new line


@param Input
abccbc


@param Output
a
b
bccb
c
cbc
cc


@param Explaination
None


@param Constraints
1 <= s.size() <= 1000

@end--------------------------------------------
*/



import java.util.*;

public class Distinct_Palindromic_SubStrings {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        substrings(sc.nextLine());
    }

    public static void substrings(String s) {
        HashSet<String> hs = new HashSet<>(Arrays.asList(s.split("")));
        if (hs.size() == s.length())
            hs.forEach(str -> System.out.println(str));
        else {
            ArrayList<String> al = new ArrayList<>();
            hs.forEach(str -> {
                al.add(str);
                String x = s.substring(s.indexOf(str), s.lastIndexOf(str) + 1);
                for (int i = 0; i < x.length(); i++) {
                    for (int j = i + 2; j <= x.length() && str.equals(x.charAt(i) + ""); j++) {
                        String y = x.substring(i, j);
                        if (Collections.frequency(al, y) < 1) {
                            StringBuilder sb = new StringBuilder(y);
                            String rev = sb.reverse().toString();
                            if (rev.equals(y))
                                al.add(y);
                        }
                    }
                }
            });
            Collections.sort(al);
            al.forEach(str -> System.out.println(str));
        }
    }
}