/**
@start--------------------------------------------

@param Question
Given three integers M, N and K. Consider a grid of M * N, where mat[i][j] = i * j (1 based index). The task is to return the Kth smallest element in the M * N multiplication table.


@param Input-Format
The first line of input contains 3 space seperated integers m,n and k.


@param Output-Format
Return the Kth smallest element in the M * N multiplication table.


@param Input
3 3 5


@param Output
3


@param Explaination
1 2 3
2 4 6
3 6 9

1 2 2 3 (3) 4 6 6 9
The 5th smallest element is 3.

@param Constraints
1 <= M, N <= 3 * 10^4

1 <= K <= M * N

@end--------------------------------------------
*/

import java.util.*;

public class Kth_Smallest_Number_In_Multiplication_Table {
    static Scanner sc = new Scanner(System.in);
    static int[] arr;

    public static void main(String[] args) {
        int m = sc.nextInt(), n = sc.nextInt(), k = sc.nextInt(), lo = 0, hi = m * n;
        while (lo < hi) {
            int mid = (lo + hi) / 2, count = 0;
            for (int i = 1; i <= m && mid / i > 0; i++)
                count += n < mid / i ? n : mid / i;
            if (count >= k)
                hi = mid;
            else
                lo = mid + 1;
        }
        System.out.println(lo);
    }
}