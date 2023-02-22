import java.util.Scanner;

public class RotateImage90 {
	static Scanner sc = new Scanner(System.in);

	public static int[][] jackedArray() {
		System.out.print("no of rows-");
		int n = sc.nextInt();
		System.out.print("no of cols-");
		int m = sc.nextInt();
		int[][] i = new int[n][m];
		for (int a = 0; a < i.length; a++) {
			for (int j = 0; j < i[a].length; j++) {
				System.out.print("input for i[" + a + "][" + j + "]- ");
				int f = sc.nextInt();
				i[a][j] = f;
			}
			System.out.println();
		}
		return i;
	}

	public static void Rotate(int[][] n) {
		int c = n[0].length - 1;
		while (c >= 0) {
			int r = 0;
			while (r != n.length) {
				System.out.print(n[r][c] + " ");
				r++;
			}
			System.out.println();
			c--;
		}
	}

	public static void main(String args[]) {
		// int[][] n = jackedArray();
		int[][] m = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		Rotate(m);
	}
}
