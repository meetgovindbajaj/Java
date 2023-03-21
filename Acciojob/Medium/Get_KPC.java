/**
@start--------------------------------------------

@param Question
You are given a string s consisting of numbers, where each number corresponds to a number of alphabets like in keypad-phones. The mapping is as follows:

    0 -> .;
    1 -> abc
    2 -> def
    3 -> ghi
    4 -> jkl
    5 -> mno
    6 -> pqrs
    7 -> tu
    8 -> vwx
    9 -> yz
From this given s you need to find the numbers of words of size 4 that can be made.

Note: Try solving this question with a recursive approach.


@param Input-Format
First line contains the string s


@param Output-Format
Complete the function GetKPC() which returns the desired integer


@param Input
1234


@param Output
81


@param Explaination
None


@param Constraints
0 <= str.length <= 10

@end--------------------------------------------
*/


import java.util.*;

public class Get_KPC {
    static Scanner sc = new Scanner(System.in);
    static String[] keys = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void main(String[] args) {
        String n = sc.next();
        int count = 0;
        for (String s : combos(n, n.length()))
            if (s.length() == 4)
                count++;
        System.out.println(count);
    }

    public static ArrayList<String> combos(String s, int n) {
        if (n == 0)
            return new ArrayList<String>(Arrays.asList(""));
        ArrayList<String> al1 = combos(s.substring(1), n - 1), al2 = new ArrayList<>();
        for (char ch : keys[s.charAt(0) - '0'].toCharArray())
            // '0' ascii value = 48 , Therefore 48 - 48 = 0, 49 - 48 = 1 ...so on
            for (String s1 : al1)
                al2.add(ch + s1);
        return al2;
    }
}
