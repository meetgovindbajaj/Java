/**
@start--------------------------------------------

@param Question
Write a program to print the number of days in a month.


@param Input-Format
- line contains the number of month from 1 to 12 
- line contains the year


@param Output-Format
print the number of days in the particular month in the particular year


@param Input
2
2016


@param Output
29


@param Explaination
None


@param Constraints
None

@end--------------------------------------------
*/



import java.util.*;

public class Days_In_A_Month {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), y = sc.nextInt();
        System.out.print(
                n <= 7 ? (n % 2 != 0 ? (31) : (n == 2 ? (isLeapYear(y) ? (29) : (28)) : (30)))
                        : (n % 2 == 0 ? (31) : (30)));
    }

    public static Boolean isLeapYear(int n) {
        return n % 4 == 0 ? (n % 100 == 0 ? (n % 400 == 0 ? (true) : (false)) : (true)) : (false);
    }
}
