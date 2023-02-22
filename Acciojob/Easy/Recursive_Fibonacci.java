/**
@start--------------------------------------------

@param Question
Given an integer N, find the Nth number in the fibonacci series. Consider 0 and 1 to be the seed values.

In a fibonacci series, each number ( Fibonacci number ) is the sum of the two preceding numbers. The series with 0 and 1 as seed values will go like -

0, 1, 1, 2, 3, 5.....


@param Input-Format
First line contains the integer N


@param Output-Format
Print the Nth fibonacci number


@param Input
5


@param Output
3


@param Explaination
None


@param Constraints
1 <= N <= 30

@end--------------------------------------------
*/



import java.util.*;

public class Recursive_Fibonacci {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws StackOverflowError {
        try {
            System.out.println(fib(sc.nextInt() - 1));
        } catch (Exception e) {
            System.err.println("Stack Overflow!");
        }
    }

    public static int fib(int n) {
        if (n == 0 || n == 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}
