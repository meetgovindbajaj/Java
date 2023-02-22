import java.util.*;

public class CoinChangeBackTracking {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> s = new ArrayList<>();

	public static void main(String args[]) {
		int[] arr = { 2, 3, 4 };
		Arrays.sort(arr);

		coinChange(arr, 0, 6, "");

		System.out.println();
		coinChangeCase2(arr, 0, 6, "");

		System.out.println();
		coinChangeCase3(arr, 0, 6, "");

		System.out.println();
		ArrayList<ArrayList<String>> temp = new ArrayList<>();
		ArrayList<String> temp1 = new ArrayList<>();
		s = coinChangeCase4(arr, 0, 6, "");
		temp.add(s);
		temp.add(temp1);
		temp.get(1).add("6");
		System.out.println(temp);

		System.out.println();
		List<List<Integer>> aa = new ArrayList<>();
		ArrayList<Integer> s = new ArrayList<>();
		coinChangeCase5(arr, 0, 6, new ArrayList<>(), aa);
		aa.add(s);
		aa.get(aa.size() - 1).add(6);
		System.out.println(aa);
	}

	public static void coinChange(int[] arr, int vidx, int amt, String ans)/* user respect */ {
		if (amt == 0) {
			System.out.println(ans);
			return;
		}
		if (amt < 0)
			return;
		for (int i = vidx; i < arr.length; i++)
			coinChange(arr, i, amt - arr[i], ans + arr[i]);
	}

	public static void coinChangeCase2(int[] arr, int vidx, int amt, String ans)/* coin respect */ {
		if (amt == 0) {
			System.out.println(ans);
			return;
		}
		if (vidx == arr.length || amt < 0)
			return;
		coinChangeCase2(arr, vidx + 1, amt, ans);
		coinChangeCase2(arr, vidx, amt - arr[vidx], ans + arr[vidx]);
	}

	public static void coinChangeCase3(int[] arr, int vidx, int amt, String ans)/* coin respect remove duplicates */ {
		if (amt == 0) {
			System.out.println(ans);
			return;
		}
		if (vidx == arr.length || amt < 0)
			return;
		for (int i = vidx; i < arr.length; i++) {
			if (i > vidx && arr[i] == arr[i - 1])
				continue;
			coinChangeCase3(arr, i, amt - arr[i], ans + arr[i]);
		}
	}

	public static ArrayList<String> coinChangeCase4(int[] arr, int vidx, int amt, String ans)/* ArrayList */ {
		if (amt == 0)
			s.add(ans);
		if (vidx == arr.length || amt < 0)
			return s;
		for (int i = vidx; i < arr.length; i++) {
			if (i > vidx && arr[i] == arr[i - 1])
				continue;
			coinChangeCase4(arr, i, amt - arr[i], ans + arr[i]);
		}
		return s;
	}

	public static void coinChangeCase5(int[] arr, int vidx, int amt, List<Integer> a,
			List<List<Integer>> aa)/* List of list */ {
		if (amt == 0)
			aa.add(new ArrayList<>(a));
		if (amt < 0)
			return;
		for (int i = vidx; i < arr.length; i++) {
			a.add(arr[i]);
			coinChangeCase5(arr, i, amt - arr[i], a, aa);
			a.remove(a.size() - 1);
		}
		return;
	}
}
