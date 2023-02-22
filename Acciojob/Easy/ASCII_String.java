/**
@start--------------------------------------------

@param Question
You are given a string str that contains only lowercase alphabets.

You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.

Note Complete the given function. The input and output would be handled by the driver code.


@param Input-Format
The only line contains the string str.


@param Output-Format
Print the new string.


@param Input
abecd


@param Output
a1b3e-2c1d


@param Explaination
'b' - 'a' = 1
'e' - 'b' = 3
'c' - 'e' = -2
'd' - 'c' = 1


@param Constraints
1 <= |str| <= 1000

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class ASCII_String {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(asciiString(sc.nextLine().toCharArray()));
    }

    public static String asciiString(char[] ch) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length - 1; i++)
            sb.append("" + ch[i] + (ch[i + 1] - ch[i]));
        return sb.append(ch[ch.length - 1]).toString();
    }
}
