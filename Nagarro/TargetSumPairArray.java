import java.util.*;

public class TargetSumPairArray {
	static Scanner sc = new Scanner(System.in);

	public static int[] input() {
		System.out.print("Enter length- ");
		int n = sc.nextInt();
		int[] i = new int[n];
		for (int t = 0; t < i.length; t++) {
			System.out.print("arr [" + t + "] : ");
			i[t] = sc.nextInt();
		}
		return i;
	}

	public static void target(int[] a, int t) {
		Arrays.sort(a);
		int i = 0;
		int q = 0, o = 0, p = 0, h = 1;
		int j = a.length - 1;
		while (i < j) {
			q = a[i] + a[j];
			if (q < t)
				i++;
			else if (q > t)
				j--;
			else {
				System.out.println("pair " + h + "\n" + a[i] + "\t" + a[j]);
				o = i;
				p = j;
				h++;
				i++;
				j--;
			}
		}
		if (a[o] + a[p] != t)
			System.out.print("no corresponding sum present");
	}

	public static void main(String args[]) {
		int q[] = input();
		System.out.print("enter target value- ");
		int p = sc.nextInt();
		target(q, p);
	}
}
