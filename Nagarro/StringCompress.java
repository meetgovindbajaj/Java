import java.util.*;

@SuppressWarnings("unused")
public class StringCompress {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("string?");
		String s = "";
		s += sc.nextLine();
		System.out.print(compress(s));
		sc.close();
	}

	

	public static String compress(String str) {
		int cnt = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= str.length() - 1; i++) {
			if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
				cnt++;
			} else {
				sb.append(str.charAt(i));
				if (cnt + 1 > 1) {
					sb.append(cnt + 1);
				}
				cnt = 0;
			}
		}
		return sb.toString();
	}
}