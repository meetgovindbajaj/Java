/**
@start--------------------------------------------

@param Question
Bob wants to build a star pattern for a given odd number.

The pattern for ‘N’ = 5 will look like this:

*
**
***
**
*

Your task is that for a given odd integer 'N', print the pattern.


@param Input-Format
The first line contains an integer ‘N’, denoting the number of rows.


@param Output-Format
Print 'N' strings denoting the pattern.


@param Input
3


@param Output
*
**
*


@param Explained
We need to print a triangle-like pattern wherein each line, the number of stars will be increasing till the central row and then it starts decreasing. So for n=5, till 3rd-row stars increase and then start decreasing.


@param Constraints
1 <= N <= 99

N is odd.

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Galaxy_Of_Stars {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.println("*".repeat((i <= (n + 1) / 2) ? i : n - i + 1));
            }
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }
}
