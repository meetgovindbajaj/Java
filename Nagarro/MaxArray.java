import java.util.*;

public class MaxArray {
	static Scanner sc = new Scanner(System.in);

	public static int[] input() {
		System.out.print("Enter length- ");
		int n = sc.nextInt();
		int[] i = new int[n];
		for (int t = 0; t < i.length; t++) {
			System.out.print("arr " + t + "-");
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

	public static void display(int a) {
		System.out.print("Maximum value in array is- " + a);
	}

	public static void main(String args[]) {
		int[] q = input();
		int w = max(q);
		display(w);
	}
}
