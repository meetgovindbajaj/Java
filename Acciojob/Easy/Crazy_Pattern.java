/**
@start--------------------------------------------

@param Question
Ninja loves playing with numbers. So one day, he wants to arrange a few numbers in the ‘N’ number of rows. The first row contains 1 number, the second row has two numbers, the third row has 3 digits, and so on.

Ninja starts placing numbers in increasing order, with absolute difference 1, starting from 1 and continuing till he encounters 9, and then he again restarts from 1.

You are given an integer ‘N’ denoting the given number of rows. Can you print the pattern that Ninja wants to create?

Pattern for N = 4:  
   1
  23
 456
7891


@param Input-Format
The first line contains a single integer ‘N’, denoting the number of rows.


@param Output-Format
Print the integers denoting the required pattern in the following ‘N’ lines.


@param Input
3


@param Output
  1
 23
456


@param Explaination
We are required to create a pattern consisting of 3 lines. First-line contains ‘1’. From the second line, we have to place a number one more than the previous value. So we place 2.Then we put 3 and move to the following line because this line will contain only 2 elements. In the following line, we have to place 3 numbers, so we put 4, 5, and 6.


@param Constraints
1 <= N <= 500

@end--------------------------------------------
*/



import java.util.*;

public class Crazy_Pattern {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        pattern(sc.nextInt(), 1, 1);
    }

    public static void pattern(int n, int r, int num) {
        if (r > n)
            return;
        System.out.print(" ".repeat(n - r));
        printer(r, 1, num);
        pattern(n, r + 1, (num + r) % 9 == 0 ? 9 : (num + r) % 9);
    }

    public static void printer(int c, int i, int num) {
        if (i > c)
            return;
        System.out.print(num + (i + 1 > c ? "\n" : ""));
        printer(c, i + 1, (num + 1) % 9 == 0 ? 9 : (num + 1) % 9);
    }
}
