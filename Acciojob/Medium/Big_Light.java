/**
@start--------------------------------------------

@param Question
Gian and Suneo want their heights to be equal so they asked Doraemon for help. Doraemon gave a big light to both of them but both big lights have different speeds of magnifying. Let us assume the big light given to Gian can increase the height of a person by v1 m/s and that of Suneos big light is v2 m/s. At the end of each second Doraemon check if their heights are equal or not.

Given the initial height of Gian and Suneo, your task is to check whether the height of Gian and Suneo will become equal at some point or not, assuming they both started at the same time.


@param Input-Format
The only line of the input contains 4 spaced integers, h1(height of Gian), h2(height of Suneo), v1(speed of Gian's big light), and v2(speed of Suneo's big light).

You need to complete bigLight function which contains above 4 integer inputs and print/return boolean true or false.


@param Output-Format
Print true if height will become equal at some time else print false.

@param Input
4 2 2 4


@param Output
true


@param Explained
The height of Gian goes as- 4 6 8 10. . height of Suneo goes as:- 2 6 10.. at the end of 1 second their height will become equal.


@param Constraints
1 <= h2 < h1 <= 10000

1 <= v1 <= 10000

1 <= v2 <= 10000

@end--------------------------------------------
*/

package Gym.Medium;

import java.util.*;

public class Big_Light {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            bigLight(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }

    public static void bigLight(int h1, int h2, int v1, int v2) {
        System.out.println((v1 < v2 && (h1 - h2) % (v2 - v1) == 0) ? true : false);
    }
}
