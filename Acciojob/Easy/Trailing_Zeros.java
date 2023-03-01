/**
@start--------------------------------------------

@param Question
For an integer n find the number of trailing zeroes in n!.


@param Input-Format
line 1: contains an integer n.


@param Output-Format
Return a single integer denoting number of trailing zeroes in n!


@param Input
20


@param Output
4


@param Explaination
Factorial of 20 is 2432902008176640000 which has 4 trailing zeroes.


@param Constraints
1<=n<=10^9

@end--------------------------------------------
*/


import java.util.*;

public class Trailing_Zeros {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(zeros(sc.nextInt()));
    }

    public static int zeros(int n) {
        int zero = 0, sum = -1, i = 1;
        while (sum != 0) {
            sum = n / (int) Math.pow(5, i++);
            zero += sum;
        }
        return zero;
    }
}
