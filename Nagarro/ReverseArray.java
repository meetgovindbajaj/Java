import java.util.*;

public class ReverseArray {
	static Scanner sc = new Scanner(System.in);

	public static int[] reverse(int[] a) {
		int start = 0;
		int end = a.length - 1;
		while (start <= end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		return a;
	}

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

	public static void display(int[] a) {
		for (int o : a)
			System.out.println(o);
	}

	public static void main(String args[]) {
		// Collections.reverse(s);//reverse array list
		int[] q = input();
		int[] o = reverse(q);
		display(o);
	}
}
