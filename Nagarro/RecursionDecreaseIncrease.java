import java.util.*;

public class RecursionDecreaseIncrease {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("number?");
		int n = sc.nextInt();
		System.out.println("decrease->");
		pd(n);
		System.out.println("\nincrease->");
		pi(n);
		System.out.println("\ndecrease and increase->");
		pdi(n);
		System.out.println("\nincrease and decrease->");
		pid(1, n);
	}

	public static void pd(int a) {
		if (a > 0) {
			System.out.print(a + " ");
			pd(--a);
		}
	}

	public static void pdi(int a) {
		if (a > 0) {
			System.out.print(a + " ");
			pdi(a - 1);
			System.out.print(a + " ");
		}
	}

	public static void pid(int a, int b) {
		if (a <= b) {
			System.out.print(a + " ");
			pid(a + 1, b);
			System.out.print(a + " ");
		}
	}

	public static void pi(int a) {
		if (a > 0) {
			pi(a - 1);
			System.out.print(a + " ");
		}
	}
}
