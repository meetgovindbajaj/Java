/**
@start--------------------------------------------

@param Question
Find the factorial of a given number where n! = n * n-1 * n-2 .....* 1.


@param Input-Format
The first line consists of a single integer denoting n.


@param Output-Format
Output is a single line containing factorial(n).


@param Input
5


@param Output
120


@param Explained
5! = 5*4*3*2*1 = 120.


@param Constraints
0 <= n <= 10

@end--------------------------------------------
*/



import java.math.BigInteger;
import java.util.*;

public class Factorial_With_Loop {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = sc.nextInt();
        System.out.println(factorial(new BigInteger(Integer.toString(num))));
        System.out.println(fact(num));
    }

    public static BigInteger factorial(BigInteger n) {
        if (n.compareTo(BigInteger.ZERO) == 0)
            return BigInteger.ONE;
        return n.multiply(factorial(n.subtract(new BigInteger("1"))));
    }

    public static int fact(int n) {
        if (n == 0)
            return 1;
        return n * fact(n - 1);
    }
}