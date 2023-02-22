/**
@start--------------------------------------------

@param Question
You are given a chessboard of size N x N, where the top left square is black. Each square contains a value. Find the sum of the values of all black squares and all white squares.

Remember that in a chessboard, black and white squares are alternate.


@param Input-Format
The first line contains N, the size of a row of the square matrix.

The next N lines contain N space-separated integers each.


@param Output-Format
Print two lines, the first line containing the sum of black squares and the second line containing the sum of white squares.


@param Input
3
1 2 3
4 5 6
7 8 9


@param Output
25
20


@param Explained
Black squares contain 1, 3, 5, 7, 9: sum = 25

White squares contain 2, 4, 6, 8: sum = 20


@param Constraints
1 <= N <= 1000

1 <= matrix[i][j] <= 10^5

@end--------------------------------------------
*/



import java.util.*;

public class Alt_Matrix_Sum {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int m = sc.nextInt();
        int arr[][] = new int[m][m];
        input(arr, m);
        int i = 0, j = 0, k = 0, l = 0, sum_b = 0, sum_w = 0;
        Boolean toggle = true;
        while (true) {
            if (k >= m || l >= m) {
                if (k == 0 && j >= m) {
                    i = 1;
                    j = 0;
                    toggle = false;
                } else if (l == 0 && i >= m) {
                    break;
                } else {
                    i = toggle ? i : i + 1;
                    j = toggle ? j + 1 : j;
                }
                k = i;
                l = j;
            } else {
                if ((toggle ? j : i) % 2 == 0) {
                    sum_b += arr[k][l];
                } else {
                    sum_w += arr[k][l];
                }
                k++;
                l++;
            }
        }
        System.out.println(sum_b + "\n" + sum_w);
    }

    public static void input(int arr[][], int m) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return;
    }
}
