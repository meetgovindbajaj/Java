import java.util.*;

public class Angstrom {
	static Scanner sc = new Scanner(System.in);
	static long n, m;

	public static void input() {
		System.out.print("start limit- ");
		n = sc.nextLong();
		System.out.print("end limit- ");
		m = sc.nextLong();
	}

	public static void Ans() {
		for (long i = n; i <= m; i++) {
			long l = (long) (Math.log10(i) + 1);
			long a = i, b = 0;
			while (a != 0) {
				long rem = a % 10;
				b = b + ((long) Math.pow(rem, l));
				a /= 10;
			}
			if (b == i) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		input();
		Ans();
		sc.close();
	}
}
