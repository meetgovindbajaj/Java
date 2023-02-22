import java.util.*;

public class RecursionPower {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("number?");
		int n = sc.nextInt();
		System.out.println("power?");
		int m = sc.nextInt();
		System.out.println(n + " power " + m + " is " + power(n, m));
	}

	public static int power(int b, int e) {
		if (e == 0)
			return 1;
		return power(b, e - 1) * b;
	}
}
