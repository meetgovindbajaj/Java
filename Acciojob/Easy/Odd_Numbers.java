/**
@start--------------------------------------------

@param Question
You have to keep taking integers as input until you get an odd number as input. Your output will be N, which represents the number of numbers you had to take as input uptill encountering an odd number.


@param Input-Format
You will be given N-1 even numbers followed by an odd number.


@param Output-Format
For each test case print the value of N in a new line.


@param Input
4
8
6
10
12
13


@param Output
6


@param Explained
The sixth integer was an odd number.


@param Constraints
1 <= N <= 100000

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Odd_Numbers {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            input();
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }

    public static void input() {
        int count = 0;
        while (true) {
            count += 1;
            if (sc.nextInt() % 2 != 0)
                break;
        }
        System.out.println(count);
    }
}