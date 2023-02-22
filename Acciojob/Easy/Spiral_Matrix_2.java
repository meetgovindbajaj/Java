/**
@start--------------------------------------------

@param Question
You are given a matrix with N rows and M columns. You have to start iterating downwards on the first column and then continue spirally. Print an array containing the spiral of the matrix in the said manner.

NOTE: You need to complete the given function. The input and printing of output will be handled by the driver code.


@param Input-Format
The first line contains the number of test cases.

For each test case: The first line contains N and M.

The next N lines contain M integers each representing the elements of the matrix.


@param Output-Format
Print an array containing the spiral of the matrix in the said manner.


@param Input
1
3 3
1 4 7
2 5 8
3 6 9


@param Output
1 2 3 6 9 8 7 4 5


@param Explained
We iterate spirally and print each element.


@param Constraints
1 <= T <= 10

1 <= N,M <= 200

0 <= A[i] <=1000000
@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Spiral_Matrix_2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int r = sc.nextInt(), c = sc.nextInt();
            int matrix[][] = new int[r][c];
            input(matrix, r, c);
            tarversingPattern(matrix, r, c);
        }
    }

    public static void input(int[][] mat, int r, int c) {
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();
    }

    public static void tarversingPattern(int[][] mat, int r, int c) {
        int row_s = 0, row_e = r - 1, col_s = 0, col_e = c - 1;
        while (row_s <= row_e && col_s <= col_e) {
            for (int i = row_s; i <= row_e; i++)
                System.out.print(mat[i][col_s] + " ");
            col_s++;
            for (int i = col_s; i <= col_e; i++)
                System.out.print(mat[row_e][i] + " ");
            row_e--;
            if (col_e >= col_s) {
                for (int i = row_e; i >= row_s; i--)
                    System.out.print(mat[i][col_e] + " ");
                col_e--;
            }
            if (row_e >= row_s) {
                for (int i = col_e; i >= col_s; i--)
                    System.out.print(mat[row_s][i] + " ");
                row_s++;
            }
        }
    }
}