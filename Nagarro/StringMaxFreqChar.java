import java.util.*;

public class StringMaxFreqChar {
	public static char freq(String n) {
		int count = 0, max = 0;
		char f;
		char[] s = n.toCharArray();
		Arrays.sort(s);
		String s2 = new String(s);
		ArrayList<Character> s1 = new ArrayList<>();
		if (s2.length() <= 2) {
			f = s2.charAt(s2.length() - 1);
			return f;
		}
		for (int i = 1; i < s2.length(); i++) {
			if (s2.charAt(i) == s2.charAt(i - 1)) {
				count++;
				if (i == s2.length() - 1) {
					if (max <= count) {
						max = count;
						s1.add(s2.charAt(i));
					}
				}
			} else {
				if (max <= count) {
					max = count;
					s1.add(s2.charAt(i - 1));
				}
				count = 0;
			}
		}
		f = s1.get(s1.size() - 1);
		return f;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("string?");
		String n = "";
		n += sc.nextLine();
		char q = freq(n);
		System.out.print("maximum frequency character -> " + q);
		sc.close();
	}
}
