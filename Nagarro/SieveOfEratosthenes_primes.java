import java.util.*;

public class SieveOfEratosthenes_primes {
	static Scanner sc = new Scanner(System.in);

	public static void soe(int n) {
		boolean[] x = new boolean[n + 1];
		Arrays.fill(x, true);
		x[0] = false;
		x[1] = false;
		int t = 0;
		for (int table = 2; table * table <= n; table++) {
			if (x[table] == false)
				continue;
			for (int muliplier = 2; muliplier * table <= n; muliplier++) {
				t = table * muliplier;
				x[t] = false;
			}
		}
		for (int i = 0; i < x.length; i++) {
			if (x[i]) {
				System.out.println(i);
			}
		}
	}

	public static void main(String args[]) {
		System.out.print("n-");
		int n = sc.nextInt();
		soe(n);
	}
}
