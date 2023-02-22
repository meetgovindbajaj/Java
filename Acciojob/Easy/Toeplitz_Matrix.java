/**
@start--------------------------------------------

@param Question
Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.

A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.


@param Input-Format
First line contains two integers, m and n which define the row and column size of the matrix respectively.

Next each of 'm' lines contain 'n' space separated integers that denote the matrix elements.


@param Output-Format
Return true if a matrix is Toeplitz Matrix, else return false.


@param Input
3 4
1 2 3 4
5 1 2 3
9 5 1 4


@param Output
false


@param Explained
Every diagonal from top-left to bottom-right doesn't have the same value. (2,2,4) diagonal is where it becomes false.


@param Constraints
m == matrix.length

n == matrix[i].length

1 <= m, n <= 20

0 <= matrix[i][j] <= 99

@end--------------------------------------------
*/



import java.util.*;

public class Toeplitz_Matrix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        input(arr, m, n);
        int i = 0, j = 0, k = 0, l = 0, p = arr[0][0];
        Boolean check = true;
        Boolean toggle = true;
        while (check) {
            if (k >= m || l >= n) {
                if (k == 0 && j >= n) {
                    i = 1;
                    j = 0;
                    toggle = false;
                } else if (l == 0 && i >= m) {
                    break;
                } else {
                    i += toggle ? 0 : 1;
                    j += toggle ? 1 : 0;
                }
                k = i;
                l = j;
            } else {
                p = arr[i][j];
                if (p != arr[k][l]) {
                    check = false;
                }
                k++;
                l++;
            }
        }
        System.out.println(check);
    }

    public static void input(int arr[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return;
    }
}
