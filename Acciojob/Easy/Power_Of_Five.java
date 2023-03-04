/**
@start--------------------------------------------

@param Question
Alice is the top scorer of her class and wants to continue this streak further. She wants to score full marks in her programming exam and she is stuck on one of the problems which asked her to check if a number is a power of 5 or not. Help Alice determine the same.

Complete the recursive function powOf5 which receives n as parameters and returns 'Yes' or 'No' accordingly.


@param Input-Format
The single line of input contains the number n.


@param Output-Format
The single line of output contains 'Yes' or 'No' depending upon if the given number is a power of 5 or not.


@param Input
25


@param Output
Yes


@param Explaination
None


@param Constraints
1 <= n <= 10^9

@end--------------------------------------------
*/


import java.util.*;

public class Power_Of_Five {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(powerOf5(n, true) ? "Yes" : "No");
    }

    public static Boolean powerOf5(int n, Boolean check) {
        if (n == 1 || !check)
            return check;
        return powerOf5(n / 5, (n % 5 == 0) ? true : false);
    }
}
