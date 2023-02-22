/*

Given a 2D matrix mat of M rows and N columns , the task is to print the 2D matrix in an alternate manner.

Alternate manner denotes that the elements of the odd rows (first row, third row, etc) will be printed from left to right, and the elements of the even rows(second row, fourth row, etc.) will be printed from right to left.

For example, if M=3, then the first line will contain all the elements of the first row of the matrix from left to right. The second line will contain all the elements of the second row from right to left. The third line will contain all the elements of the third row from left to right.

--------------------------------------------

input format:
The first line contains two integers, M and N, representing the number of rows and columns, respectively.

The next M lines contain N space-separated integers, denoting the matrix.

--------------------------------------------

output format:
There will be 1 line with all the elements of the matrix after performing the alternate traversal. The elements will be separated by space.

--------------------------------------------

input:
2 2
1 2
2 3

--------------------------------------------

output:
1 2 3 2

--------------------------------------------

explained:
There are 2 rows in the matrix. In the first row from left to right the elements are :- 1 2. As this is an odd row, they will be printed from left to right. In the second row, from left to right the elements are :- 2 3. As this is an even row, elements will be printed from right to left.

--------------------------------------------

constraints:
1<=M<=300

1<=N<=300

*/



import java.util.*;

public class Alternate_Manner_Matrix_Traversal {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        printElementsAlternately(mat, m, n);
    }

    public static void printElementsAlternately(int[][] mat, int m, int n) {
        for (int i = 0; i < mat.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < mat[i].length; j++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for (int j = mat[i].length - 1; j >= 0; j--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }
}
