/**
@start--------------------------------------------

@param Question
Using a helper stick (peg), shift all rings from peg A to peg B using peg C.

All rings are initally placed in ascending order, smallest being on top.

No bigger ring can be placed over a smaller ring.

Complete the given function.


@param Input-Format
Single line input containing a single integer N denoting the no of rings.


@param Output-Format
Print the instructions to move all the rings from peg A to B in a new line each.

Each line should follow format : Moving ring i from A/B/C to A/B/C


@param Input
3


@param Output
Moving ring 1 from A to B
Moving ring 2 from A to C
Moving ring 1 from B to C
Moving ring 3 from A to B
Moving ring 1 from C to A
Moving ring 2 from C to B
Moving ring 1 from A to B


@param Explaination
None


@param Constraints
1<=N<=10

@end--------------------------------------------
*/



import java.util.*;

public class Tower_Of_Hanoi_1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        toh(n, 'A', 'B', 'C');
    }

    public static void toh(int n, char a, char b, char c) {
        if (n == 0)
            return;
        toh(n - 1, a, c, b);
        System.out.println("Moving ring " + n + " from " + a + " to " + b);
        toh(n - 1, c, b, a);
    }
}