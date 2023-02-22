/*
You are given an integer N. Your task is to output the sum of all natural numbers till N.

Natural numbers are a part of the number system, including all the positive numbers from 1 to infinity.

input format:
First line is an integer N

output format:
Print the sum of the first N natural numbers.

input:
5

output:
10

explained:
Here, n = 5, so 1 + 2 + 3 + 4 + 5 = 15

constraints:
1 <= N < = 10^8
*/
package Gym.Easy;

import java.util.*;

public class Sum_Of_Natural_Numbers {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number = sc.nextInt();
        result(number);
    }

    public static void result(int number) {
        long sum = 0;
        while (number > 0) {
            sum += (long) number;
            number--;
        }
        System.out.print(sum);
    }
}
