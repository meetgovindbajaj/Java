/**
@start--------------------------------------------

@param Question
Given a square matrix of size N, calculate the absolute difference between the sums of its diagonals.


@param Input-Format
The first line contains a single integer N, the number of rows and columns in the square matrix .

Each of the next N lines describes a row, and consists of N space-separated integers .


@param Output-Format
Print the absolute difference between the sums of the two diagonals of the matrix as a single integer.


@param Input
3
11 2 4
4 5 6
10 8 -12


@param Output
15


@param Explained
Sum across the primary diagonal: 11 + 5 + (- 12) = 4

Sum across the secondary diagonal: 4 + 5 + 10 = 19

Difference: |4 - 19| = 15


@param Constraints
1 <= n <= 10^3

-10^3 <= mat[i][j] <=10^3

Note: |x| is the absolute value of x (|x| is always non negative for all x)

@end--------------------------------------------
*/



import java.util.*;

public class Diagonal_Difference {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int s1 = 0, s2 = 0, x, n = sc.nextInt();
        Boolean d1, d2;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                d1 = i == j;
                d2 = (n - 1 - i) == j;
                x = sc.nextInt();
                if (d1 && !d2) {
                    s1 += x;
                } else if (d2 && !d1) {
                    s2 += x;
                }
            }
        System.out.println((int) Math.abs(s1 - s2));
    }
}
