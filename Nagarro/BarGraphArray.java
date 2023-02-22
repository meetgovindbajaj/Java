import java.util.*;

public class BarGraphArray {
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

	public static int max(int[] a) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static void BarGraphDisplay(int[] a, int b) {
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i < (b - a[j])) {
					System.out.print("   ");
				} else {
					System.out.print(" | ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		int q[] = input();
		int w = max(q);
		BarGraphDisplay(q, w);
	}
}
