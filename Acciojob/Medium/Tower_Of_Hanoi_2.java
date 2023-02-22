/**
@start--------------------------------------------

@param Question
You are given the number of discs N and three rods 1,2, and 3. Initially, these discs are in rod 1.

You need to print all the steps of the movement of the discs so that all the discs reach the 3rd rod. Use of rod 2 is allowed.

Note

The discs are arranged such that the top disc is numbered 1 and the bottom-most disc is numbered N. Also, all the discs have different sizes and a bigger disc cannot be put on top of a smaller disc at any time.

Only 1 disc can be moved at a time.

You need to find the most optimal solution, i.e., the solution with the minimum number of moves.

You need to print output in the following format:

move disk i from rod x to rod y


@param Input-Format
The first line contains the number N.


@param Output-Format
For each test case, print all the steps of movement of the disk.


@param Input
3


@param Output
move disk 1 from rod 1 to rod 3
move disk 2 from rod 1 to rod 2
move disk 1 from rod 3 to rod 2
move disk 3 from rod 1 to rod 3
move disk 1 from rod 2 to rod 1
move disk 2 from rod 2 to rod 3
move disk 1 from rod 1 to rod 3


@param Explaination
To move three disks from rod 1 to rod 3, the steps mentioned in the output are required.


@param Constraints
1 <= N <= 15

@end--------------------------------------------
*/

package Gym.Medium;

import java.util.*;

public class Tower_Of_Hanoi_2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        toh(n, '1', '3', '2');
    }

    public static void toh(int n, char a, char b, char c) {
        if (n == 0)
            return;
        toh(n - 1, a, c, b);
        System.out.println("move disk " + n + " from rod " + a + " to rod " + b);
        toh(n - 1, c, b, a);
    }
}