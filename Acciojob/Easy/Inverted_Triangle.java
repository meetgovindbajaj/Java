/**
@start--------------------------------------------

@param Question
Take an input of N from the user and write a program to print an upside down triangle pattern, where the first row has N stars, the next row has N-1, and the Nth row has 1 star (Check the samples for a better understanding).

Your task is to complete the function generatePattern which receives n as its parameter and prints the mentioned pattern.


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


@param Explaination
If n = 5, this is our generated pattern.


@param Constraints
1 <= N <= 100

@end--------------------------------------------
*/


import java.util.*;

public class Inverted_Triangle {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        triangle(n, 0);
    }

    public static void triangle(int n, int sp) {
        if (n == 0)
            return;
        System.out.println(" ".repeat(sp++) + "* ".repeat(n--));
        triangle(n, sp);
    }
}