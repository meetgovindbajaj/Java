import java.util.*;

public class Fibonacci {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt(), a = 0, b = 1, i = 0;
		int sum = 0;
		while (i < n) {
			System.out.print(a + "  ");
			sum = a + b;
			a = b;
			b = sum;
			i++;
		}
	}
}
