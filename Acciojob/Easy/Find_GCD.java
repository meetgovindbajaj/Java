/*

You are given two non-negative integers.

Your task is to calculate their GCD using the euclidian theorem.

--------------------------------------------

input format:
The first line of input contains two space-separated integers A and B.

--------------------------------------------

output format:
The only line of the output should contain the GCD of A and B.

--------------------------------------------

input:
12 8

--------------------------------------------

output:
4

--------------------------------------------

explained:
GCD of 12 and 8 is 4.

--------------------------------------------

constraints:
0 <= A <= 10^9

0 <= B <= 10^9

*/



import java.util.*;

public class Find_GCD {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println(GCD(sc.nextInt(), sc.nextInt()));
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }

    public static int GCD(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
}
