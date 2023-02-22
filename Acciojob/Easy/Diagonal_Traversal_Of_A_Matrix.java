/**
@start--------------------------------------------

@param Question
Give a N * N square matrix, return all the elements of its anti-diagonals from top to bottom.


@param Input-Format
First line contains N, representing the order of the 2D matrix.

Next N lines contains N spaced elements each representing matrix elements.


@param Output-Format
Output in a sigle line, the Diagonal traversal of the matrix.

The traversal should start from the top right of the matrix in bottom right direction and should continue upto bottom left.


@param Input
3
1 2 3
4 5 6
7 8 9


@param Output
3 2 6 1 5 9 4 8 7


@param Explained
Topmost anti-diagonal is [[3]]

Next anti-diagonal is [[2, 6]]

Next anti-diagonal is [[1, 5, 9]]

Next anti-diagonal is [[4, 8]]

and the last-diagonal is [[7]]


@param Constraints
1 <= N <= 500

-10000 <= Mat[i][j] <= 10000

@end--------------------------------------------
*/



import java.util.*;

public class Diagonal_Traversal_Of_A_Matrix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int m = sc.nextInt(), i = 0, j = m - 1, k = 0, l = m - 1, count = m * m;
        int arr[][] = new int[m][m];
        input(arr, m);
        Boolean toggle = true;
        while (count > 0) {
            if (k >= m || l >= m) {
                if (k >= m && j == 0 && toggle) {
                    i = 1;
                    j = 0;
                    toggle = false;
                } else {
                    i = toggle ? i : i + 1;
                    j = toggle ? j - 1 : j;
                }
                k = i;
                l = j;
            } else {
                System.out.print(arr[k][l] + " ");
                k++;
                l++;
                count--;
            }
        }
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
