/**
@start--------------------------------------------

@param Question
You are given two numbers m and n, you are required to print all the Armstrong Numbers between m and n (both inclusive).

Armstrong Numbers are numbers those have the sum of their own digits raised to the power number of digits equals the number itself. Eg. 153 = 13 + 53 + 33, so 153 is an Armstrong number.


@param Input-Format
First line contains two integers m and n


@param Output-Format
Print all the Armstrong numbers between m and n in a single line with space in between.


@param Input
0 160


@param Output
0 1 2 3 4 5 6 7 8 9 153


@param Explained
none


@param Constraints
0 <= m <= n <= 10^5

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Armstrong_Numbers_in_Range {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Armstrong(sc.nextInt(), sc.nextInt());
    }

    public static void Armstrong(int start, int end) {
        for (int i = start; i <= end; i++) {
            int digits = digitsCounter(i, 0);
            if (i == total(i, digits, 0))
                System.out.print(i + " ");
        }
    }

    public static int digitsCounter(int number, int count) {
        if (number <= 0)
            return count;
        return digitsCounter(number / 10, count + 1);
    }

    public static int total(int num, int pow, int sum) {
        if (num <= 0)
            return sum;
        return total(num / 10, pow, sum += (int) Math.pow(num % 10, pow));
    }
}
