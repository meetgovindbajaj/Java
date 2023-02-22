/**
@start--------------------------------------------

@param Question
You are given a binary matrix of dimensions m*n. A mouse enters the matrix at cell (0,0) in left to right direction.

He goes in the same direction if he encounters a 0 and he takes a right turn when he encounters a 1, and changes that direction 1 to 0. Otherwise he may get stuck in a cycle!

You have to find the co-ordinates from where this mouse will exit the matrix.


@param Input-Format
First line contains the values m and n.

Next m lines contain n spaced integers.


@param Output-Format
Return the co-ordinates from where this mouse will exit the matrix separated by space.


@param Input
3 3
0 1 0
0 1 0
1 0 1


@param Output
1 0


@param Explained
We enter the matrix at (0,0) we move to (0,1) and encounter a 1 so we change it to 0 and move right to (1,1), we again encounter 1 and turn right.

Then we leave the matrix from (1,0). Thus the output is 1 0.


@param Constraints
1 <= m,n <= 100

matrix[i][j] is 0, 1

@end--------------------------------------------
*/



import java.util.*;

public class Find_The_Way {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                matrix[i][j] = sc.nextInt();
        }
        int res[] = finder(matrix, n, m);
        System.out.println(res[0] + " " + res[1]);
    }

    public static int[] finder(int[][] mat, int n, int m) {
        int i = 0, j = 0, w = 1;
        Boolean down = true, right = true, checker = false;
        int arr[] = new int[2];
        while ((i < n && j < m) && (i >= 0 && j >= 0)) {
            arr[0] = i;
            arr[1] = j;
            if (mat[i][j] == 1) {
                mat[i][j] = 0;
                checker = true;
            }
            if (checker) {
                if (down && right) {
                    w = 2;
                    right = false;
                } else if (down && !right) {
                    w = 3;
                    down = false;
                } else if (!down && !right) {
                    w = 4;
                    right = true;
                } else {
                    w = 1;
                    down = true;
                }
                checker = false;
            }
            switch (w) {
                case 1:
                    j++;
                    break;
                case 2:
                    i++;
                    break;
                case 3:
                    j--;
                    break;
                case 4:
                    i--;
                    break;
                default:
                    break;
            }
        }
        return arr;
    }
}
