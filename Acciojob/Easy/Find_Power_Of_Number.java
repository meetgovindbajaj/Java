/**
@start--------------------------------------------

@param Question
Ninja is sitting in an examination hall. He is encountered with a problem statement, "Find ‘X’ to the power ‘N’ (i.e. ‘X’ ^ ‘N’). Where ‘X’ and ‘N’ are two integers." Ninja was not prepared for this question at all, as this question was unexpected in the exam. He is asking for your help to solve this problem. Help Ninja to find the answer to the problem.

Note

For this question, you can assume that 0 raised to the power of 0 is 1.


@param Input-Format
The first line of input contains two integers ‘X’ and ‘N’ (separated by space).


@param Output-Format
The only line of output will contain a single integer which will be equal to X ^ N (i.e. X raise to the power N).


@param Input
9 3


@param Output
729


@param Explaination
Given X = 9 and N = 3. So, 9 ^ 3 = 729. As 9 * 9 * 9 = 729.


@param Constraints
0 <= X <= 10

0 <= N <= 10

@end--------------------------------------------
*/



import java.util.*;

public class Find_Power_Of_Number {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt();
        int n = sc.nextInt();
        pow(x, n);
    }

    public static void pow(long x, int n) {
        long y = 1;
        x = n == 0 ? 1 : x;
        while (n >= 2) {
            y *= n % 2 == 1 ? x : 1;
            x *= x;
            n /= 2;
        }
        System.out.println(x * y);
    }
}
