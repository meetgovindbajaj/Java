import java.util.*;

public class NoOfTriangleArray {
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

	public static int triangle(int[] a) {
		Arrays.sort(a);
		int count = 0;
		for (int large = a.length - 1; large >= 0; large--) {
			int l = 0;
			int r = large - 1;
			while (l < r) {
				if (a[l] + a[r] > a[large]) {
					count += r - l;
					r--;
				} else {
					l++;
				}
			}
		}
		return count;
	}

	public static void main(String args[]) {
		int q[] = input();
		int p = triangle(q);
		System.out.print("max no of triangles-" + p);
	}
}
