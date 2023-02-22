/**
@start--------------------------------------------

@param Question
Write a program to sort a given matrix mat[][] of dimensions N*M (row and column) in column wise order.

Your task is to sort each column of a matrix in ascending order and finally print the updated matrix/2D Array.


@param Input-Format
First line contains integer N and M denoting the rows and columns of matrix mat[][]

Each of the next N lines contains M integers denoting the matrix elements


@param Output-Format
Print the matrix after sorting column wise


@param Input
3 5
9 7 8 11 21
1 4 3 7 2
4 3 14 9 12


@param Output
1 3 3 7 2  
4 4 8 9 12 
9 7 14 11 21


@param Explaination
The matrix is sorted column wise


@param Constraints
1 <= N <= 20
1 <= M <= 20
-10^6<=mat[i][j]<=10^6

@end--------------------------------------------
*/



import java.util.*;

public class AS_Sorting_1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        input(n, m, arr);
        for (int i = 0; i < m; i++) {
            int[] arr1 = new int[n];
            for (int j = 0; j < n; j++)
                arr1[j] = arr[j][i];
            insertionSort(n, arr1);
            for (int j = 0; j < n; j++)
                arr[j][i] = arr1[j];
        }
        printer(n, m, arr);
    }

    public static void input(int n, int m, int[][] arr) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();
    }

    public static void printer(int n, int m, int[][] arr) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void insertionSort(int n, int[] arr) {
        int i = 0, prev = arr[0];
        while (++i < n) {
            if (arr[i] < prev)
                shift(n, arr, i);
            prev = arr[i];
        }
    }

    public static void shift(int n, int[] arr, int i) {
        int j = i, ele = arr[i];
        while (--j >= 0 && arr[j] > ele)
            arr[j + 1] = arr[j];
        arr[j + 1] = ele;
    }
}