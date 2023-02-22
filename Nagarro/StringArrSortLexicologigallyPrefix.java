import java.util.*;

public class StringArrSortLexicologigallyPrefix {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("length?");
		int a = sc.nextInt();
		String[] n = new String[a];
		for (int i = 0; i < a; i++) {
			System.out.println("string " + (i + 1) + " ?");
			n[i] = sc.next();
		}
		sortfunc(n, a);
		System.out.println("sorted array- ");
		for (String v : n) {
			System.out.println(v);
		}
		sc.close();
	}

	public static int compareTo(String s1, String s2) {
		int i = 0;
		while (i < s1.length() && i < s2.length()) {
			if (s1.charAt(i) > s2.charAt(i)) {
				return 1;
			} else if (s1.charAt(i) < s2.charAt(i)) {
				return -1;
			}
			i++;
		}
		if (s1.length() > s2.length()) {
			return -1;
		} else {
			return 1;
		}
	}

	public static void sortfunc(String arr[], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (compareTo(arr[j], arr[j + 1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
