/*

Write a java program to print the Greatest Common Divisor (GCD) and Lowest Common Multiple (LCM) of two numbers

You are required to print the Greatest Common Divisor (GCD) of two numbers.
You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
Take input "num1" and "num2" as the two numbers.
Print their GCD and LCM.

--------------------------------------------

input format:
Any two integer, the numbers whose GCD and LCM we have to find

num1 
num2

--------------------------------------------

output format:
a
b
.. where 'a' and 'b' are the GCD and LCM respectively.

--------------------------------------------

input:
8
12

--------------------------------------------

output:
4
24

--------------------------------------------

explained:
None

--------------------------------------------

constraints:
2 < = N < = 10^9

*/

package Gym.Easy;

import java.util.*;

public class GCD_And_LCM {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int GCD = GCD(a, b);
            int LCM = LCM(a, b, GCD);
            System.out.println(GCD + "\n" + LCM);
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }

    public static int GCD(int a, int b) {
        if (a == b)
            return a;
        return a > b ? GCD(a - b, b) : GCD(a, b - a);
    }

    public static int LCM(int a, int b, int GCD) {
        return (int) (a * b) / GCD;
    }
}