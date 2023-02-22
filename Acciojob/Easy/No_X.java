/**
@start--------------------------------------------

@param Question
Given a string, compute recursively a new string where all the x chars have been removed.


@param Input-Format
Only line contains the string S.


@param Output-Format
Print the string with no x.


@param Input
xaaax


@param Output
aaa 


@param Explained
Remove the x at the start and the end.


@param Constraints
1 <= s.length() <= 10 ^ 4

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class No_X {
    static Scanner sc = new Scanner(System.in);

    static String noX(String s) {
        return s.replaceAll("x", "");
    }

    public static void main(String[] args) {
        String s = sc.nextLine();
        System.out.println(noX(s));
    }
}