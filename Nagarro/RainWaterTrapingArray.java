import java.util.*;

public class RainWaterTrapingArray {
	static Scanner sc = new Scanner(System.in);

	public static int[] input() {
		System.out.print("Enter length- ");
		int n = sc.nextInt();
		int[] i = new int[n];
		for (int t = 0; t < i.length; t++) {
			System.out.print("arr-1 [" + t + "] : ");
			i[t] = sc.nextInt();
		}
		return i;
	}

	public static int sum(int[] a) {
		int s = 0;
		int p1 = 0;
		int[] q = new int[a.length];
		for (int i = 0; i < a.length; i++) {

			if (a[i] > 0) {
				p1 = i;
				int p2 = i + 1;
				for (int j = i + 1; j < a.length; j++) {
					if (a[j] >= a[i] && a[i] > a[p2]) {
						p2 = j;
					} else if (a[j] > 0 && a[j] > a[p2] && a[i] >= a[p2]) {
						p2 = j;
					}
				}
				i = p2 - 1;
				for (int k = p1 + 1; k < p2; k++) {

					if (a[p1] > a[p2]) {
						q[k] = (a[p2] - a[k]);

					} else {
						q[k] = (a[p1] - a[k]);
					}
				}

			}
		}
		for (int i = 0; i < a.length; i++) {
			if (q[i] > 0)
				s += q[i];
		}
		return s;
	}

	public static void main(String args[]) {
		System.out.print("test cases- ");
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			int q[] = input();
			int w = sum(q);
			System.out.println(w);
		}
	}
}
