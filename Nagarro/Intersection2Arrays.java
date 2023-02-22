import java.util.*;

public class Intersection2Arrays {
	static Scanner sc = new Scanner(System.in);

	public static ArrayList<Integer> arraylist(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		ArrayList<Integer> c = new ArrayList<>();
		int p1 = 0, p2 = 0;
		while (p1 < a.length && p2 < b.length) {
			if (a[p1] > b[p2]) {
				p2++;
			} else if (a[p1] < b[p2]) {
				p1++;
			} else {
				c.add(a[p1]);
				p1++;
				p2++;
			}
		}
		return c;
	}

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

	public static void main(String args[]) {
		int[] a = input();
		int[] b = input();
		ArrayList<Integer> s = arraylist(a, b);
		System.out.println(s);
	}
}
