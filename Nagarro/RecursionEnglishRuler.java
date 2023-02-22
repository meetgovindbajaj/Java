import java.util.*;

public class RecursionEnglishRuler {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("inches?");
		int n = sc.nextInt();
		System.out.println("major tick-length?");
		int m = sc.nextInt();
		pattern(n, m);
	}

	public static void pattern(int inch, int tick) {
		for (int i = 0; i < tick; i++)
			System.out.print("-");
		System.out.println(0);
		for (int i = 1; i <= inch; i++) {
			ruler(tick - 1);
			for (int j = 1; j <= tick; j++) {
				System.out.print("-");
			}
			System.out.println(i);
		}
	}

	public static void ruler(int tick) {
		if (tick == 0)
			return;
		ruler(tick - 1);
		for (int i = 0; i < tick; i++)
			System.out.print("-");
		System.out.println();
		ruler(tick - 1);
	}
}
