import java.util.*;

public class InverseArray {
	static Scanner sc = new Scanner(System.in);

	public static int[] inverse(int[] a) {
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[a[i]] = i;
		}
		return b;
	}

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

	public static void display(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print("\narr-2 [" + i + "] : " + a[i]);
	}

	public static void main(String args[]) {
		int q[] = input();
		int w[] = inverse(q);
		display(w);
	}
}
