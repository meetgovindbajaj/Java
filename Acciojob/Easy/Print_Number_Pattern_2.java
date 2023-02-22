/**
@start--------------------------------------------

@param Question
Given an integer n, print a pattern of n lines, where the ith line has the numbers i to 1 printed in descending order. Check the sample cases for a better understanding.


@param Input-Format
Input consists of an integer N.


@param Output-Format
Print the pattern as described above.


@param Input
5


@param Output
1
21
321
4321
54321



@param Explained
none


@param Constraints
1 <= n <= 9

@end--------------------------------------------
*/



import java.util.*;

public class Print_Number_Pattern_2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int n = sc.nextInt();
            printNumberPattern2(1, n);
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }

    public static void printNumberPattern2(int row, int n) {
        if (row > n)
            return;
        printer(row);
        System.out.println();
        printNumberPattern2(row + 1, n);
    }

    public static void printer(int num) {
        if (num == 0)
            return;
        System.out.print(num);
        printer(num - 1);
    }
}
