import java.util.*;

public class PalindromicSubstring {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		String s = new String(sc.next());
		palindromicSubstring(s);
	}

	public static void palindromicSubstring(String str) {
		// odd length palindromic substring
		int count = 0;
		for (int axis = 0; axis < str.length(); axis++) {
			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
				if (str.charAt(axis - orbit) == str.charAt(axis + orbit)) {
					count++;
				} else {
					break;
				}
			}
		}
		// even length palindromic substring
		for (double axis = 0.5; axis < str.length(); axis++) {
			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
				if (str.charAt((int) (axis - orbit)) == str.charAt((int) (axis + orbit))) {
					count++;
				} else {
					break;
				}
			}
		}
		System.out.println("count of the palindromic substring - " + count);
	}
}
