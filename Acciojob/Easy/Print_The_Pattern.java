/**
@start--------------------------------------------

@param Question
Using recursion, print the given pattern.


@param Input-Format
First line contains integer n, representing rows of the given pattern


@param Output-Format
Display the given pattern.


@param Input
5


@param Output
* 
* * 
* * * 
* * * * 
* * * * * 


@param Explaination
The number of rows given is 5.


@param Constraints
1 <= n <= 10^2

@end--------------------------------------------
*/



import java.util.*;

public class Print_The_Pattern {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        pattern(sc.nextInt());
    }

    public static void pattern(int n) {
        if (n == 0)
            return;
        pattern(n - 1);
        System.out.println("* ".repeat(n));
    }
}