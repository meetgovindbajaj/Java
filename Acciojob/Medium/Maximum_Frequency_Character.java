/**
@start--------------------------------------------

@param Question
Given a string s containing lowercase alphabets, return the character with the highest occurrence in s.

If there are multiple such characters, then return the lexicographically smallest one of them.


@param Input-Format
The only line of the input contains the string s.


@param Output-Format
Print the maximal occurring character in the string s. If there are multiple, print the lexicographically minimum one.


@param Input
abbbc


@param Output
b


@param Explaination
Here, a occurs 1 time, c occurs 1 time, and b occurs 3 times. Hence our answer for this is b.


@param Constraints
1 < s.length() < 100

@end--------------------------------------------
*/



import java.util.*;

public class Maximum_Frequency_Character {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(MaximumFrequencyChar(sc.nextLine()));
    }

    static char MaximumFrequencyChar(String s) {
        ArrayList<String> al = new ArrayList<>(Arrays.asList(s.split("")));
        HashSet<String> hs = new HashSet<>(al);
        int max = 0;
        String res = "";
        for (String st : hs) {
            int freq = Collections.frequency(al, st);
            if (max < freq || (max == freq && st.charAt(0) < res.charAt(0))) {
                max = freq;
                res = st;
            }
        }
        return res.charAt(0);
    }
}