import java.util.*;

public class SonuTituStrings {
	static Scanner sc = new Scanner(System.in);

	public static void Intersection(String a, String b) {
		ArrayList<Character> al1 = new ArrayList<>();
		int i = 0;
		int j = 0;
		while (i < a.length() && j < b.length()) {
			if (a.charAt(i) < b.charAt(j))
				i++;
			else if (b.charAt(j) < a.charAt(i))
				j++;
			else {
				al1.add(b.charAt(j));
				i++;
				j++;
			}
		}
		int count = a.length() + b.length() - (al1.size() * 2);
		System.out.println(count);
	}

//solution by recursion->
	static ArrayList<Character> al1 = new ArrayList<>();
	static int x = 0, y = 0;

	public static int Intersection1(String a, String b) {
		if (a.charAt(x) < b.charAt(y))
			x++;
		else if (b.charAt(y) < a.charAt(x))
			y++;
		else {
			al1.add(b.charAt(y));
			x++;
			y++;
		}
		if (x < a.length() && y < b.length()) {
			Intersection1(a, b);
		}
		int count = a.length() + b.length() - (al1.size() * 2);
		return count;
	}

	public static String sort1(String a) {
		char[] s = a.toCharArray();
		Arrays.sort(s);
		String s1 = "";
		for (int i = 0; i < s.length; i++) {
			s1 += s[i];
		}
		return s1;
		
	}

	public static void main(String[] args) {
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String a = sc.next();
			String b = sc.next();
			String a1 = sort1(a);
			String b1 = sort1(b);

//			Intersection(a1, b1);
			int count = Intersection1(a1, b1);
			System.out.println(count);
			al1.clear();
			x = 0;
			y = 0;
		}
	}
}