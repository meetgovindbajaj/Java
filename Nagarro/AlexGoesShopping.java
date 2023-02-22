import java.util.*;

public class AlexGoesShopping {
	static Scanner sc = new Scanner(System.in);
	static int n;

	public static int[] input() {
		System.out.print("Enter length- ");
		n = sc.nextInt();
		int[] i = new int[n];
		for (int t = 0; t < i.length; t++) {
			System.out.print("arr [" + t + "] : ");
			i[t] = sc.nextInt();
		}
		return i;
	}

	public static int IsQuery(int p[], int n, int a, int k) {
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (a % p[i] == 0) {
				cnt++;
			}
		}
		if (cnt >= k) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String args[]) {

		int p[] = input();
		System.out.println("size of checking list?");
		int q = sc.nextInt();
		while (q != 0) {
			System.out.println("cost,expected range ?");
			int a = sc.nextInt();
			int k = sc.nextInt();
			q--;
			if (IsQuery(p, n, a, k) == 1)
				System.out.println("Yes");

			else {
				System.out.println("No");

			}
		}

	}
}
