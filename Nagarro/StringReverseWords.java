import java.util.*;

public class StringReverseWords {
	static Scanner sc = new Scanner(System.in);

	public static String reverse(String a) {
		int j = a.length();
		String s = "";
		for (int i = a.length() - 1; i >= 0; --i) {
			if (i == 0) {
				for (int k = 0; k < j; k++) {
					s += a.charAt(k);
				}
				break;
			} else if (a.charAt(i) == ' ') {
				for (int k = i + 1; k < j; k++) {
					s += a.charAt(k);
				}
				j = i;
				s += " ";
			}
		}
		return s;
	}
	public static void main(String args[]) {
		System.out.println("no of inputs?");
		int q = sc.nextInt();
		sc.nextLine();
		while (q > 0) {
			String a = "";
			System.out.println("string?");
			a = a + sc.nextLine();
			String s = reverse(a);
			System.out.println(s);
			q--;
		}
	}
}
