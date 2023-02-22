/**
@start--------------------------------------------

@param Question
In this question, you need to write a program that prints a staircase of size N.

This is a staircase of size n=4:

   #
  ##
 ###
####

Its base and height are both equal to n. It is drawn using # symbols and spaces. The last line is not preceded by any spaces.


@param Input-Format
A single integer, n, denotes the size of the staircase.


@param Output-Format
Print a staircase of size n using # symbols and spaces.

Note: The last line must not have spaces in it.


@param Input
6


@param Output
     #
    ##
   ###
  ####
 #####
######


@param Explained
The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of n=6.

You might notice, first line has 5 spaces (n-1) followed by 1 # and the last line has 0 spaces (n-n) and 6 # (n)


@param Constraints
1<=n<100

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Staircase {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int size = sc.nextInt();
            staircase(size, size - 1, 1);
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }

    public static void staircase(int size, int space, int hash) {
        if (hash > size)
            return;
        System.out.println(" ".repeat(space) + "#".repeat(hash));
        staircase(size, space - 1, hash + 1);
    }
}