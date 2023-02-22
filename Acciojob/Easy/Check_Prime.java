/**
@start--------------------------------------------

@param Question
Write a program that inputs a positive integer N. It should then output a message indicating whether the number is a prime number or not.


@param Input-Format
A single line containing the integer N


@param Output-Format
Print a string, either "N is a prime number" or "N is not a prime number" (without quotes), depending on whether N is prime or not.


@param Input
5


@param Output
5 is a prime number


@param Explained
5 is only divisible by itself and 1, hence it's a prime number.


@param Constraints
1 <= |n| <= 10^9

@end--------------------------------------------
*/



import java.io.*;
import java.util.*;

public class Check_Prime {
    static Scanner sc = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        try {
            int n = Integer.parseInt(br.readLine());
            System.out.println(n + " is " + (isPrime(n) ? "a " : "not a ") + "prime number");
            rangeprime(0, n);
        } catch (Exception e) {
            System.out.println(
                    "Input Error!" + "\nError: " + e.getLocalizedMessage() + "\nLocation: "
                            + e.getStackTrace()[0]);
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void rangeprime(int start, int end) {
        for (int i = start; i <= end; i++)
            System.out.print(isPrime(i) ? i + " " : "");
    }
}