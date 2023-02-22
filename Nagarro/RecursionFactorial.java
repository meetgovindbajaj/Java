import java.util.*;

public class RecursionFactorial {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("number?");
		int n = sc.nextInt();
		System.out.println("power?");
		int m = sc.nextInt();
		System.out.println(n + " power " + m + " is " + power(n, m));
		System.out.println("factorial of " + n + " is " + factorial(n));
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return factorial(n - 1) * n;
	}

	public static int power(int b, int e) {
		if (e == 0)
			return 1;
		return power(b, e - 1) * b;
	}
}
