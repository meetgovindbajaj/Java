/**
@start--------------------------------------------

@param Question
Given an integer n, print a right angled triangle full of stars with height and base equal to n.


@param Input-Format
The first line of input contains the integer n.


@param Output-Format
The output should contain a right angled triangle filled with stars with height and base equal to n.


@param Input
3


@param Output
*
**
***


@param Explained
Since n = 3, 3 lines with increasing number of stars are printed.


@param Constraints
1 <= n <= 200

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Right_Angle_Triangle_Stars {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int N = sc.nextInt();
            stars(1, N);
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }

    public static void stars(int row, int len) {
        if (row > len)
            return;
        System.out.println("*".repeat(row));
        stars(row + 1, len);
    }
}
