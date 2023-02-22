import java.util.*;

public class Combination {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		System.out.println("no.?");
		int n = sc.nextInt();
		System.out.println("size?");
		int k = sc.nextInt();
		System.out.println(combination(n, k));
	}

	public static List<List<Integer>> combination(int n, int k) {
		List<List<Integer>> list = new ArrayList<>();
//		userRespect(1, n, k, new ArrayList<>(), list);
		coinRespect(1, n, k, new ArrayList<>(), list);
		return list;
	}

	public static void userRespect(int start, int n, int k, List<Integer> temp, List<List<Integer>> list) {
		if (k == 0) {
			list.add(new ArrayList<>(temp));
			return;
		}
		if (start > n)
			return;
		for (int i = start; i <= n; i++) {
			temp.add(i);
			userRespect(i + 1, n, k - 1, temp, list);
			temp.remove(temp.size() - 1);
		}
	}

	public static void coinRespect(int start, int n, int k, List<Integer> temp, List<List<Integer>> list) {
		if (k == 0) {
			list.add(new ArrayList<>(temp));
			return;
		}
		if (start > n)
			return;
		temp.add(start);
		coinRespect(start + 1, n, k - 1, temp, list);
		temp.remove(temp.size() - 1);
		coinRespect(start + 1, n, k, temp, list);
	}
}
