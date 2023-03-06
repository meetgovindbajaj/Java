/**
@start--------------------------------------------

@param Question
You are given a string str. The string str will contain numbers only, where each number stands for a key pressed on a mobile phone. The following list is the key to characters map

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

Complete the function to print the list of all words that could be pronounced by the keys in str.


@param Input-Format
First line contains a string str.


@param Output-Format
Words taht could be pronounced by the pressed keys indicated by the str in order hinted by Sample output.


@param Input
74


@param Output
tj
tk
tl
uj
uk
ul


@param Explaination
None


@param Constraints
None

@end--------------------------------------------
*/


import java.util.*;

public class Keypad_Combination {
    static Scanner sc = new Scanner(System.in);
    static String[] keys = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void main(String[] args) {
        String n = sc.next();
        combos(n, n.length()).forEach(s -> System.out.println(s));
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