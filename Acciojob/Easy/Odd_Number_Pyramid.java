/*

Take input of N from the user and write a program to print the Full Pyramid Number pattern as follows (N=4) :
   1   
  333  
 55555 
7777777

--------------------------------------------

input format:
Input consists of the integer N.

--------------------------------------------

output format:
Print the pattern for value N.

--------------------------------------------

input:
4

--------------------------------------------

output:
   1   
  333  
 55555 
7777777

--------------------------------------------

explained:
Input is 4 means we have 4 lines, and each line has odd numbers which keep on increasing with every row.

--------------------------------------------

constraints:
1 <= N <= 100

*/

package Gym.Easy;

import java.util.*;

public class Odd_Number_Pyramid {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int row_size = sc.nextInt();
        printPattern(row_size, 1);
    }

    public static void printPattern(int row_size, int number) {
        if (row_size == 0) {
            return;
        }
        printSpaces(row_size - 1);
        printNumber(number, number);
        printPattern(row_size - 1, number + 2);
    }

    public static void printSpaces(int space) {
        if (space == 0) {
            return;
        }
        System.out.print(" ");
        printSpaces(space - 1);
    }

    public static void printNumber(int length, int number) {
        if (length == 0) {
            System.out.print("\n");
            return;
        }
        System.out.print(number);
        printNumber(length - 1, number);
    }
}
