import java.util.*;

public class Fibonacci1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		System.out.println("number?");
		int n = sc.nextInt();
//		long m = FibTD(n, new long[n + 1]);
		System.out.println(FibBUSE(n));
	}

	public static long FibTD(int n, long[] strg) {
		if (n == 0 || n == 1)
			return n;
		if (strg[n] != 0)
			return strg[n];
		long fn1 = FibTD(n - 1, strg);
		long fn2 = FibTD(n - 2, strg);
		long fn = fn1 + fn2;
		strg[n] = fn;
		return fn;
	}

	public static int FibBU(int n) {
		int[] strg = new int[n + 1];
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 2; i <= n; i++)
			strg[i] = strg[i - 1] + strg[i - 2];
		return strg[n];
	}

	public static int FibBUSE(int n) {
		int[] strg = new int[2];
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 1; i <= n-1; i++) {
			int sum = strg[0] + strg[1];
			strg[0] = strg[1];
			strg[1] = sum;
		}
		return strg[1];
	}
}
