/**
@start--------------------------------------------

@param Question
Given a matrix of size r*c, where r is number of rows and c is number of columns. Traverse the matrix in spiral form.


@param Input-Format
Input consists of two lines

The first line contains two integers r and c which denotes number of rows and columns respectively.

The next r lines contains c spaced integers, which are the elements of the matrix.


@param Output-Format
Print the spiral matrix.


@param Input
4 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16


@param Output
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10


@param Explained
We iterate spirally and print each element.


@param Constraints
1 <= r, c <= 100

0 <= matrix[i][j] <= 100

@end--------------------------------------------
*/



import java.util.*;

public class Spirally_Traversing_A_Matrix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mat[][] = new int[m][n];
        input(mat, m, n);
        traverse(mat, m, n, m * n);
    }

    public static void input(int arr[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return;
    }

    public static void traverse(int[][] mat, int m, int n, int count) {
        int i = 0, j = 0, w = 1, de = Integer.MIN_VALUE;
        Boolean down = true, right = true, checker = false;
        while (count > 0) {
            if (i >= m || j >= n || i < 0 || j < 0 || mat[i][j] == de) {
                checker = true;
            }
            if (checker) {
                if (down && right) {
                    j--;
                    w = 2;
                    right = false;
                } else if (down && !right) {
                    i--;
                    w = 3;
                    down = false;
                } else if (!down && !right) {
                    j++;
                    w = 4;
                    right = true;
                } else {
                    i++;
                    w = 1;
                    down = true;
                }
                checker = false;
            } else {
                System.out.print(mat[i][j] + " ");
                mat[i][j] = de;
                count--;
            }
            if (w == 1)
                j++;
            else if (w == 2)
                i++;
            else if (w == 3)
                j--;
            else
                i--;
        }
    }
}
