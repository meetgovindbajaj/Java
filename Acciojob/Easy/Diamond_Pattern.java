/**
@start--------------------------------------------

@param Question
Write a program to print the pattern based on the number of rows inputted by the user. Input Format


@param Input-Format
-line contains ''N'' 


@param Output-Format
- Print the pattern.


@param Input
4


@param Output
   *
  ***
 *****
*******
 *****
  ***
   *


@param Explained
none


@param Constraints
None

@end--------------------------------------------
*/



import java.util.*;

public class Diamond_Pattern {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int n = sc.nextInt();
            int j = 1, spaces = n - 1;
            for (int i = 1; i <= n * 2 - 1; i++) {
                System.out.println(" ".repeat(spaces) + "*".repeat(j));
                j += i < n ? 2 : -2;
                spaces += i < n ? -1 : 1;
            }
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }
}