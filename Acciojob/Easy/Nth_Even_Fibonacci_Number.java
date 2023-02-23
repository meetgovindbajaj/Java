/**
@start--------------------------------------------

@param Question
Given a positive integer N, find the Nth Even Fibonacci number.

Fibonacci Series is a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc.

Note:

Since the answer could be very large, use long datatype in JAVA to store the answer. Similarly, use long long in C++.

Return the answer in modulo 10^9 + 7


@param Input-Format
First line contains the positive integer N.


@param Output-Format
Return the required number.


@param Input
2


@param Output
8


@param Explaination
8 is the second even number in the fibonacci series. (1 1 2 3 5 "8")


@param Constraints
1 <= n <= 20

@end--------------------------------------------
*/



import java.util.*;

public class Nth_Even_Fibonacci_Number {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(NthEvenFibonacci(sc.nextLong(), 1, 2, 1));
    }

    public static long NthEvenFibonacci(long n, long prev, long curr, int count) {
        if (count >= n)
            return curr;
        return NthEvenFibonacci(n, curr, curr += prev, curr % 2 == 0 ? count + 1 : count) % 1000000007;
    }
}
