/**
@start--------------------------------------------

@param Question
Consider a sample space S consisting of all perfect squares starting from 1, 4, 9 and so on. You are given a number n, you have to output the number of integers less than n in the sample space S.


@param Input-Format
First line contains an integer n


@param Output-Format
Print a single integer denoting number of integers less than n in the sample space S.


@param Input
9


@param Output
2


@param Explaination
None


@param Constraints
1 <= n <= 108

Expected Time Complexity: O(sqrt(n))

Expected Space Complexity: O(1)

@end--------------------------------------------
*/

import java.util.*;

public class Count_Squares{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println(CountSquares(sc.nextInt()));
    }

    public int CountSquares(int n) {
        return (int)Math.ceil(Math.sqrt(n))-1;
    }
}