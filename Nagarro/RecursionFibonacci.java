import java.util.*;

public class RecursionFibonacci {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("index?");
		int n = sc.nextInt();
		System.out.println("fibonacci number at index " + n + " - " + fibonacci(n - 1));
	}

	public static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}