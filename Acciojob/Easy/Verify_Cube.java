/*

Take two positive integers from the user. Verify if (a+b)^3 = a^3 + b^3 + 3a^2b + 3ab^2.

Calculate the Left hand side (LHS) and the right hand side (RHS) of the equation. Print the (LHS) and the (RHS).

Print VERIFIED in uppercase if they are equal, otherwise print NOT VERIFIED.

--------------------------------------------

input format:
The first line contains two integers A and B.

--------------------------------------------

output format:
Print two integers, the LHS and RHS in separate lines.

Then print "VERIFIED" (without quotes and in uppercase) if they are equal, else print "NOT VERIFIED".

--------------------------------------------

input:
4 5

--------------------------------------------

output:
729
729
VERIFIED

--------------------------------------------

explained:
We have A = 4 and B = 5.

Since, LHS = 729 and RHS = 729, our equation is Verified.

--------------------------------------------

constraints:
1 <= A <= 100000

1 <= B <= 100000

*/



import java.util.*;

public class Verify_Cube {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long a = sc.nextLong();
        long b = sc.nextLong();
        verifyCube(a, b);
    }

    public static void verifyCube(long a, long b) {
        long LHS = (long) Math.pow((a + b), 3);
        long RHS = (long) (Math.pow(a, 3) + Math.pow(b, 3) + (3 * b * Math.pow(a, 2)) + (3 * a * Math.pow(b, 2)));
        System.out.println(LHS + "\n" + RHS + "\n" + (LHS == RHS ? "VERIFIED" : "NOT VERIFIED"));
    }
}