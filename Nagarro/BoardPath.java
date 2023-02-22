import java.util.*;

public class BoardPath {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		System.out.println("current?");
		int n = sc.nextInt();
		System.out.println("end?");
		int m = sc.nextInt();
		System.out.println("no of ways :\t" + BPBUSE(n, m));
	}

	public static int BPTD(int curr, int end, int[] strg) {
		if (curr == end)
			return 1;
		if (curr > end)
			return 0;
		if (strg[curr] != 0)
			return strg[curr];
		int count = 0;
		for (int i = 1; i <= 6; i++)
			count += BPTD(curr + i, end, strg);
		strg[curr] = count;
		return count;
	}

	public static int BPBU(int curr, int end) {
		int[] strg = new int[end + 6];
		strg[end] = 1;
		int i = end - 1, j = 1;
		while (i >= curr) {
			if (j > 6) {
				j = 1;
				--i;
				continue;
			}
			strg[i] += strg[i + j];
			++j;
		}
		return strg[curr];
	}

	public static int BPBUSE(int curr, int end) {
		int[] strg = new int[6];
		strg[0] = 1;
		for (int slide = curr; slide <= end - 1; slide++) {
			int sum = strg[0] + strg[1] + strg[2] + strg[3] + strg[4] + strg[5];
			strg[5] = strg[4];
			strg[4] = strg[3];
			strg[3] = strg[2];
			strg[2] = strg[1];
			strg[1] = strg[0];
			strg[0] = sum;
		}
		return strg[0];
	}
}
