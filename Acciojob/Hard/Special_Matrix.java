/**
@start--------------------------------------------

@param Question
A square matrix is called special matrix if all the non-diagonal elements of the matrix are zero and the diagonal elements are non-zero.

You are given a square matrix with N rows and columns. You have to check whether the given matrix is special or not.

NOTE: You need to complete the given function. The input and printing of output will be handled by the driver code.


@param Input-Format
The first line contains the number of test cases.

For each test case: The first line contains N.

The next N lines contain N integers each representing the elements of the matrix.


@param Output-Format
For each test case in t, output t lines true if the matrix is special else false


@param Input
1
3
1 0 2
0 2 0
3 0 1


@param Output
true


@param Explained
The diagonal elements are non-zero and non-diagonal elements are zero.


@param Constraints
1 <= T <= 10

1 <= N <= 200

0 <= A[i] <=1000000

@end--------------------------------------------
*/

package Gym.Hard;

import java.util.*;

public class Special_Matrix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int x, n = sc.nextInt();
            Boolean check = true, c;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    x = sc.nextInt();
                    c = (i == j || (n - 1 - i) == j);
                    if (check && x == 0 && c) {
                        check = false;
                    } else if (check && x != 0 && !c) {
                        check = false;
                    }
                }
            }
            System.out.println(check);
        }
    }
}
