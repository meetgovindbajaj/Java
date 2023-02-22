/**
@start--------------------------------------------

@param Question
Given the 3 sides of a triangle, find out whether it is acute-angled, right-angled, or obtuse-angled.

You need to output 1 for acute, 2 for right-angled, and 3 for an obtuse-angled triangle. You can assume that the input values always form a triangle and are valid integers.

Note

A triangle is acute-angled, if twice the square of the largest side is less than the sum of squares of all the sides.

A triangle is obtuse-angled, if twice the square of its largest side is greater than the sum of squares of all the sides.

A triangle is right-angled, if twice the square of its largest side is exactly equal to the sum of squares of all the sides.


@param Input-Format
input1 -side1, input2 -side2, input3 -side3


@param Output-Format
integer representing type of triangle output


@param Input
3 4 5


@param Output
2


@param Explained
Since 2x5x5 is equal to 5x5 + 3x3 + 4x4, So this is a right-angled triangle and hence, the answer is 2.


@param Constraints
1 < a,b,c <= 10^5

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Which_Angled_Triangle {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            findTriangle(sc.nextInt(), sc.nextInt(), sc.nextInt());
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }

    public static void findTriangle(int a, int b, int c) {
        int max = a > b ? a > c ? a : b > c ? b : c : b > c ? b : c;
        int sideSq = 2 * max * max;
        int total = (a * a) + (b * b) + (c * c);
        System.out.println(sideSq < total ? 1 : sideSq > total ? 3 : 2);
    }
}
