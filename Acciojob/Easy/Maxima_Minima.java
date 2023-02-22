/**
@start--------------------------------------------

@param Question
Given an n*n matrix mat find an element such that it is the smallest in a row and largest in a column, if such an element does not exist return -1.


@param Input-Format
First line contains the values n.

Next n lines contain n spaced integers.


@param Output-Format
Return the element that is smallest in a row and largest in a column if not found return -1.


@param Input
2
1 3
6 5


@param Output
5


@param Explained
Row 2 contains minimum element 5 that is largest in the 2nd column.


@param Constraints
1 <= n <= 10^3

1 <= mat[i][j] <=10^5

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Maxima_Minima {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        input(n, mat, 0, 0);
        // System.out.println(maxmin(mat, n, 0, 0, mat[0][0], false));
        System.out.println(maxmin1(mat, n));
    }

    public static void input(int n, int[][] mat, int r, int c) {
        if (c >= n) {
            input(n, mat, r + 1, 0);
        } else if (r >= n) {
            return;
        } else {
            mat[r][c] = sc.nextInt();
            input(n, mat, r, c + 1);
        }
    }

    public static int maxmin(int[][] mat, int n, int r, int c, int e, Boolean checker) {
        if (r >= n || checker) {
            return checker ? e : -1;
        } else if (c >= n) {
            return maxmin(mat, n, r + 1, 0, e, checker);
        } else {
            return (iterator(mat, n, r, c, mat[r][c], true) == iterator(mat, n, r, c, mat[r][c], false)
                    ? maxmin(mat, n, r, c + 1, mat[r][c], true)
                    : maxmin(mat, n, r, c + 1, e, checker));
        }
    }

    public static int iterator(int[][] mat, int n, int r, int c, int e, Boolean toggle) {
        if ((toggle ? c : r) >= n) {
            return e;
        } else {
            e = toggle ? (mat[r][c] < e ? mat[r][c] : e) : (mat[r][c] > e ? mat[r][c] : e);
            return iterator(mat, n, toggle ? r : r + 1, toggle ? c + 1 : c, e, toggle);
        }
    }

    // non recursion method

    public static void input1(int mat[][], int n) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        return;
    }

    public static int maxmin1(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (iterator1(mat, n, i, mat[i][j], true) == iterator1(mat, n, j, mat[i][j], false)) {
                    return mat[i][j];
                }
            }
        }
        return -1;
    }

    public static int iterator1(int[][] mat, int n, int con, int e, Boolean toggle) {
        for (int i = 0; i < n; i++) {
            e = toggle ? (mat[con][i] < e ? mat[con][i] : e) : (mat[i][con] > e ? mat[i][con] : e);
        }
        return e;
    }
}
