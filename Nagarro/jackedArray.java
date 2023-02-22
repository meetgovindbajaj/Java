import java.util.*;

public class jackedArray {
	static Scanner sc = new Scanner(System.in);

	public static int[][] jackeddArray() {
		System.out.print("no of rows-");
		int n = sc.nextInt();
		int[][] i = new int[n][];
		for (int a = 0; a < i.length; a++) {
			System.out.print("no of cols of i[" + a + "]- ");
			int e = sc.nextInt();
			i[a] = new int[e];
			for (int j = 0; j < i[a].length; j++) {
				System.out.print("input for i[" + a + "][" + j + "]- ");
				int f = sc.nextInt();
				i[a][j] = f;
			}
			System.out.println();
		}
		return i;
	}

	public static void dis(int[][] n) {
//		for (int i = 0; i < n.length; i++) {
//			for (int j = 0; j < n[i].length; j++) {
//				System.out.print("i[" + i + "][" + j + "]- " + n[i][j]);
//				System.out.print("  ");
//			}
//			System.out.println();
//		}
		for (int[] v : n) {
			for (int v1 : v) {
				System.out.print(v1 + " ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		int[][] n = jackeddArray();
		dis(n);

	}
}
