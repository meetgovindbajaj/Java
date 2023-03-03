/**
@start--------------------------------------------

@param Question
Given two numbers n and k, you need to rotate n, k times to the right. If k is negative, rotate n, k times to the left.

Note:

Rotating right means removing rightmost digit from n and adding it to the start.

Rotating left means removing leftmost digit from n and adding it to the end.

Assume that the number of rotations will not result in leading 0's, i.e. n=1203, k =2 such that 0312 is the answer, such test cases will not be given.

k can be bigger than n.


@param Input-Format
First line which has two integer n and k.


@param Output-Format
Print the rotated number in a single line.


@param Input
1256 1


@param Output
6125


@param Explaination
since k=1, right rotating the number one time leads to 6125.


@param Constraints
1 <= n,k <= 10^9

@end--------------------------------------------
*/


import java.util.*;

public class Number_Rotation {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder(sc.next());
        int n = s.length(), k = sc.nextInt() % n;
        k += k < 0 ? n : 0;
        s = new StringBuilder(s.substring(n - k) + s.substring(0, n - k));
        System.out.println(s);
    }
}