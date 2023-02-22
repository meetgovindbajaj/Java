import java.util.*;

public class Sum2ArrayList {
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

//my formula
	public static ArrayList<Integer> sum(int[] a, int[] b) {
		ArrayList<Integer> s = new ArrayList<>();
		int p1 = a.length - 1, p2 = b.length - 1;
		int rem = 0, carry = 0;
		while (p1 >= 0 || p2 >= 0) {
			int sum = carry;
			if (p1 < 0) {
				sum += b[p2];
			} else if (p2 < 0) {
				sum += a[p1];
			} else {
				sum += a[p1] + b[p2];
			}
			rem = sum % 10;
			carry = sum / 10;
			s.add(0, rem);
			p1--;
			p2--;
		}
		if (carry > 0)
			s.add(0, carry);
		return s;
	}

//teacher formula
	public static ArrayList<Integer> sum1(int[] a, int[] b) {
		ArrayList<Integer> s = new ArrayList<>();
		int p1 = a.length - 1;
		int p2 = b.length - 1;
		int carry = 0;
		while (p1 >= 0 || p2 >= 0) {
			int sum = carry;
			if (p2 >= 0)
				sum += b[p2];
			if (p1 >= 0)
				sum += a[p1];
			int rem = sum % 10;
			carry = sum / 10;
			s.add(0, rem);
			p1--;
			p2--;
		}
		if (carry > 0)
			s.add(0, carry);
		return s;
	}

	public static void main(String args[]) {
		int[] a = input();
		int[] b = input();
		ArrayList<Integer> s = sum1(a, b);
		System.out.println(s);
	}
}
