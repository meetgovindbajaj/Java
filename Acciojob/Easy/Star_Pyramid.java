/**
@start--------------------------------------------

@param Question
Given an integer n, print a pyramid full of stars with height equal to n.


@param Input-Format
The first line of input contains the integer n.


@param Output-Format
The output should contain a pyramid filled with stars with height equal to n.


@param Input
3


@param Output
  *
 * *
* * *

@param Explained
none


@param Constraints
1 <= n <= 200

@end--------------------------------------------
*/



import java.util.*;

public class Star_Pyramid {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        printPattern(1, n);
    }

    public static void printPattern(int i, int len) {
        if (i > len)
            return;
        System.out.println(" ".repeat(len - i) + "* ".repeat(i));
        printPattern(i + 1, len);
    }
}
