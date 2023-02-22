/**
@start--------------------------------------------

@param Question
Bob is given 2 numbers a and b, each of them contains only 0 and 1. Your task is to find a number c, such that if the ith digit of number a and b differ then the ith digit of c is 1, 0 in rest of the cases.


@param Input-Format
The first line of input contains a number a.

The second line of input contains a number b.


@param Output-Format
You need to find such a number c, such that if the ith character of a and b are different then the ith position of string c is 1, else 0 in any other case.


@param Input
01110
01100


@param Output
00010


@param Explaination
only the number at 4th position differs, so the number c has 4th digit as 1.


@param Constraints
1 <= a,b <= 10^100

a,b - {0,1}

@end--------------------------------------------
*/



import java.util.*;

public class Ultra_Fast_Mathematician {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuilder a = new StringBuilder(sc.nextLine());
        StringBuilder b = new StringBuilder(sc.nextLine());
        System.out.println(solve(a, b));
    }

    public static StringBuilder solve(StringBuilder a, StringBuilder b) {
        for (int i = 0; i < a.length(); i++)
            a.replace(i, i + 1, (a.charAt(i) == b.charAt(i) ? "0" : "1"));
        return a;
    }
}
