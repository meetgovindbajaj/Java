/**
@start--------------------------------------------

@param Question
Given an integer N, print an upside down triangle pattern, where the first row has N stars, the second row has N-1 stars, and so on. Check the sample test cases for a better understanding.


@param Input-Format
First line of input contains N, the number of rows for the pattern


@param Output-Format
You need to print the pattern.


@param Input
5


@param Output
* * * * * 
 * * * * 
  * * * 
   * * 
    * 


@param Explained
For number of rows to be 5 we get this output.


@param Constraints
1<= N <= 100

@end--------------------------------------------
*/



import java.util.*;

public class Print_Reverse_Pattern {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int n = sc.nextInt();
            revPattern(n, 0);
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }

    public static void revPattern(int rows, int spaces) {
        if (rows == 0)
            return;
        System.out.println(" ".repeat(spaces) + "* ".repeat(rows));
        revPattern(rows - 1, spaces + 1);
    }
}
