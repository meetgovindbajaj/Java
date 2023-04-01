/**
@start--------------------------------------------

@param Question
You are given a number n representing number of stairs in a staircase.

You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.

Your task is to complete the given function and return list of all paths that can be used to climb the staircase up.


@param Input-Format
The first line of input contains a single number n.


@param Output-Format
Return list of all paths that can be used to climb the staircase up.


@param Input
3


@param Output
111 12 21 3


@param Explaination
All the possible ways to climb up the stairs are

Taking all the steps of size 1.

Taking first step of size 1 and second of size 2,

Taking first step of size 2 and second of size 1.

Taking first step of size 3.


@param Constraints
1 <= n <= 10

@end--------------------------------------------
*/

import java.util.*;

public class Get_Stair_Paths {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        solve(n).forEach(s -> System.out.print(s + " "));
    }

    static ArrayList<String> solve(int n) {
        ArrayList<String> al = new ArrayList<>();
        for (int i = 1; i <= 3; i++)
            al = climb(n, al, "", i);
        return al;

    }

    static ArrayList<String> climb(int n, ArrayList<String> al, String s, int step) {
        if (n - step == 0) {
            al.add(s + step);
            return al;
        } else if (n - step < 0) {
            return al;
        }
        climb(n - step, al, s + step, 1);
        climb(n - step, al, s + step, 2);
        return climb(n - step, al, s + step, 3);
    }
}
