/**
@start--------------------------------------------

@param Question
Write a program in Java to print the Floyd's Triangle.

Floyd's triangle is a right-angled triangular array of natural numbers, used in computer science education. It is named after Robert Floyd. It is defined by filling the rows of the triangle with consecutive numbers, starting with a 1 in the top left corner:


@param Input-Format
The number of row,


@param Output-Format
Return the rows of the triangle with consecutive numbers, starting with a 1 in the top left corner:


@param Input
5


@param Output
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15


@param Explained
The input number of rows is 5, so program printed 5 row triangle with consecutive numbers


@param Constraints
1 < = N < = 1000

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Floyds_Triangle {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int n = sc.nextInt();
            int pointer = 1;
            for (int i = 0; i < n; i++) {
                pointer = printer(pointer, i + 1);
            }
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }

    public static int printer(int i, int size) {
        if (size == 0) {
            System.out.println();
            return i;
        }
        System.out.print(i + " ");
        return printer(i + 1, size - 1);
    }
}
