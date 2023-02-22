/**
@start--------------------------------------------

@param Question
Take input of N and write a program to print the pattern as follows (N=5) :
*****
****
***
**
*

@param Input-Format
The only line of input contains a single integer ‘N’ denoting the size of the pattern.


@param Output-Format
Print the pattern for value N.


@param Input
5


@param Output
*****
****
***
**
*


@param Explained
Number of stars are reduced from 5 in each line.


@param Constraints
1 <= N <= 500

@end--------------------------------------------
*/



import java.util.*;

public class Patternify {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int n = sc.nextInt();
            for (int i = n; i >= 1; i--) {
                printer(i);
            }
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }

    public static void printer(int n) {
        System.out.println("*".repeat(n));
    }
}
