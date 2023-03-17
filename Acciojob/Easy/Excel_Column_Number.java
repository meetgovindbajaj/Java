/**
@start--------------------------------------------

@param Question
Given a string A, output its corresponding column number in Excel. Check the examples for a better understanding of the question.


@param Input-Format
The first line of the input contains the string A


@param Output-Format
Output the corresponding column number of the string A


@param Input
AB


@param Output
28


@param Explaination
A = 1
B = 2
...
Z = 26
AA = 27
AB = 28


@param Constraints
1 <= |A| <= 13

@end--------------------------------------------
*/


import java.util.*;

public class Excel_Column_Number {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(excelColumnNumber(sc.nextLine()));
    }

    static long excelColumnNumber(String s) {
        int len = s.length();
        long sum = 0, i = 1;
        while (--len >= 0) {
            sum += (s.charAt(len) - 64) * i; // 64 is ascii for @ and A is 65
            i *= 26;
        }
        return sum;
    }
}