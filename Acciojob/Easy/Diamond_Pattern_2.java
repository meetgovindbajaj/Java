/**
@start--------------------------------------------

@param Question
Given an integer N, print a diamond full of stars * with height equal to N.

Note It is given that N is odd.


@param Input-Format
The first line contains the number of test cases.

For each test case: The first line contains an integer N denoting the height of the pyramid.


@param Output-Format
For each test case print the required pattern.


@param Input
1
5


@param Output
    *
  * * *
* * * * *
  * * *
    *


@param Explained
The required diamond of height 5 has been returned.


@param Constraints
1 <= T <= 10

1 <= N <= 100

N is odd.

@end--------------------------------------------
*/



import java.util.*;

public class Diamond_Pattern_2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int n = sc.nextInt();
            int j = 1, spaces = n - 1;
            for (int i = 1; i <= n; i++) {
                System.out.println(" ".repeat(spaces > -1 ? spaces : 0) + "* ".repeat(j));
                j += i < (n + 1) / 2 ? 2 : -2;
                spaces += i < (n + 1) / 2 ? -2 : 2;
            }
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }
}
