import java.util.*;

public class LinearSearchArray {
	static Scanner sc = new Scanner(System.in);
	static int a1;
	public static int search(int[] a, int p) {
		for (int i = 0; i < a.length; i++) {
			if (p == a[i]) {
				p = i;
				return p;
			}
		}
		return -1;
	}
	public static int[] input() {
		System.out.print("Enter length- ");
		int n = sc.nextInt();
		int[] i = new int[n];
		for (int t = 0; t < i.length; t++) {
			System.out.print("arr " + t + "-");
			i[t] = sc.nextInt();
		}
		System.out.print("Search- ");
		a1 = sc.nextInt();
		return i;
	}
	public static void display(int a) {
		System.out.println("Item is present in index-"+a);
	}
	public static void main(String args[]) {
		int[] q=input();
		int w=search(q,a1);
		display(w);
	}
}
