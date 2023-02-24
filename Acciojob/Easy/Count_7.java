/**
@start--------------------------------------------

@param Question
Given a number N, your task is to find the number of occurrences of the digit 7 in the number.


@param Input-Format
The first line contains an integer N denoting the number.


@param Output-Format
For each test case return a number, denoting the number of occurrences of the digit 7 in the given number.


@param Input
27727


@param Output
3


@param Explaination
There are 3 occurrences of the digit 7 in the number.


@param Constraints
1 <= N <= 10^9

@end--------------------------------------------
*/



import java.util.*;

public class Count_7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(count7(sc.nextInt()));
    }

    public static int count7(int n) {
        if (n == 0)
            return 0;
        return count7(n / 10) + (n % 10 == 7 ? 1 : 0);
    }
}