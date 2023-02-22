/**
@start--------------------------------------------

@param Question
Write a program to calculate the sum of first N natural numbers.

Note: Natural numbers are the numbers that start from 1 and end at infinity.


@param Input-Format
First line contains an integer N

You need to complete printSum function which contains N natural number and return sum of final summation upto N.


@param Output-Format
Print the sum in first line


@param Input
10


@param Output
55


@param Explained
Here, sum is 55 i.e. 1+2+3+4+....+9+10 = 55.


@param Constraints
1 <= N <= 10^3

@end--------------------------------------------
*/



import java.util.*;

public class Natural_Sum {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int N = sc.nextInt();
            System.out.println(printSum(N));
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }

    public static int printSum(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        return sum;
    }
}