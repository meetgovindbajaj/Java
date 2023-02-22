import java.util.*;

public class StringToggleCase {
	public static void main(String args[]) {
		System.out.println("string?");
		Scanner sc = new Scanner(System.in);
		String s = "";
		s += sc.nextLine();// to take space as input
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ((int) s.charAt(i) <= 64 || ((int) s.charAt(i) >= 91 && (int) s.charAt(i) <= 96)) {
				System.out.print(c);
			}
			if (Character.isLowerCase(c)) {
				String s1 = s.replace(s.charAt(i), Character.toUpperCase(c));
				System.out.print(s1.charAt(i));
			} else if (Character.isUpperCase(c)) {
				String s1 = s.replace(s.charAt(i), Character.toLowerCase(c));
				System.out.print(s1.charAt(i));
			} else {
				System.out.print(c);
			}
		}
		sc.close();
	}
}
