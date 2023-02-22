import java.util.Scanner;

public class Cb_number {
	static int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Integer string?");
		String str = sc.next();
		int count = 0;
		boolean[] visited = new boolean[str.length()];
		for (int len = 1; len <= str.length(); len++) {
			for (int si = 0; si <= str.length() - len; si++) {
				int ei = si + len;
				String ans = str.substring(si, ei);
				if (is_cb_number(Long.parseLong(ans)) && is_visited(visited, si, ei)) {

					count++;

					for (int i = si; i < ei; i++) {
						visited[i] = true;
					}
				}
			}
		}
		System.out.print("maximum no. of cb number-> ");
		System.out.println(count);

	}

	public static boolean is_visited(boolean[] visited, int si, int ei) {
		for (int i = si; i < ei; i++) {
			if (visited[i]) {
				return false;
			}
		}
		return true;
	}

	public static boolean is_cb_number(long n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (n % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}

}
