import java.util.*;

public class TargetSumTripletsArray {
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

	public static void target3(int[] a, int t) {
		Arrays.sort(a);
		int h = 1;
		int q = 0, o = 0, p = 0, l = 0;
		for (int k = 0; k < a.length; k++) {
			int i = k + 1;
			int j = a.length - 1;
			while (i < j) {
				q = a[i] + a[j] + a[k];
				if (q < t)
					i++;
				else if (q > t)
					j--;
				else {
					System.out.println("triplet " + h + "\n" + a[k] + "\t" + a[i] + "\t" + a[j]);
					o = i;
					h++;
					p = j;
					l = k;
					i++;
					j--;
				}
			}
		}
		if (a[o] + a[p] + a[l] != t)
			System.out.print("no corresponding sum present");
	}

	public static void main(String args[]) {
		int q[] = input();
		System.out.print("enter target value- ");
		int p = sc.nextInt();
		target3(q, p);
	}
}
