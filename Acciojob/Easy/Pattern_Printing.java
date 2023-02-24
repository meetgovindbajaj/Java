/**
@start--------------------------------------------

@param Question
You are given an input n. You need to print the pattern as shown in the example.


@param Input-Format
The first line contains an integer n.


@param Output-Format
Print the required pattern.


@param Input
5


@param Output
*   *
 * * 
  *  
 * * 
*   *


@param Explaination
The required pattern is printed.


@param Input
6


@param Output
*    *
 *  * 
  **  
  **  
 *  * 
*    *


@param Explaination
The required pattern is printed.


@param Constraints
1 ≤ N ≤ 1000

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Pattern_Printing {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        pattern(n, 1, n - 2, true);
    }

    static void pattern(int n, int i, int midSpaces, Boolean toggle) {
        if (i > n)
            return;
        if ((n % 2 == 0 && i == n / 2) || (n % 2 != 0 && i == (n + 1) / 2)) {
            System.out.println(" ".repeat(i - 1) + "*".repeat(n % 2 == 0 ? 2 : 1));
            toggle = false;
            midSpaces -= n % 2 == 0 ? 2 : 0;
        } else {
            System.out.println(" ".repeat(toggle ? i - 1 : n - i) + "*" + " ".repeat(midSpaces) + "*");
        }
        midSpaces += toggle ? -2 : 2;
        pattern(n, i + 1, midSpaces, toggle);
    }
}
