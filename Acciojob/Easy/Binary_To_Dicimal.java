/**
@start--------------------------------------------

@param Question
Given binary representation of number in the form of string, convert it to decimal representation.

Note : String will be given such that output will fit in int


@param Input-Format
First line contains t number of test cases

Next t lines contain string s denoting binary representation

You need to complete binToDec function which contains binary string input s (binary representation) and print/return its decimal representation


@param Output-Format
Print decimal representation of each string in different line


@param Input
2
10
111


@param Output
2
7


@param Explained
10 is the binary representation of 2

111 is the binary representation of 7


@param Constraints
1 <= t <= 10^3

@end--------------------------------------------
*/



import java.util.*;

public class Binary_To_Dicimal {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            int ans = binToDec(s);
            System.out.println(ans);
            t -= 1;
        }
    }

    public static int binToDec(String s) {
        int sum = 0;
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            sum += (Character.getNumericValue(s.charAt(i))) > 0 ? (int) Math.pow(2, j) : 0;
            j++;
        }
        return sum;
    }
}
