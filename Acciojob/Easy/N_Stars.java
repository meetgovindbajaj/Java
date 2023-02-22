/**
@start--------------------------------------------

@param Question
In this task, you have to print n stars * vertically and n horizontally.


@param Input-Format
The first line of input contains n.


@param Output-Format
print the stars in horizontal and vertical direction.


@param Input
3


@param Output
***
*
*
*


@param Explained
We print the 3 stars in horizontal and 3 stars vertical direction.


@param Constraints
1<= n <= 100

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class N_Stars {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int len = sc.nextInt();
            stars(0, len);
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }

    public static void stars(int row, int len) {
        if (row > len) {
            return;
        }
        System.out.println(row == 0 ? "* ".repeat(len) : "*");
        stars(row + 1, len);
    }
}