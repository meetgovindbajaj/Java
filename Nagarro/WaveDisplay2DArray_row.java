import java.util.Scanner;

public class WaveDisplay2DArray_row {
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

	public static void waveDisplay(int[][] n) {
		int r = 0;
		while (r != n.length) {
			if (r % 2 == 0) {
				int c = 0;
				while (c != n[0].length) {
					System.out.print(n[r][c] + " ");
					c++;
				}
			} else {
				int c1 = n[0].length - 1;
				while (c1 >= 0) {
					System.out.print(n[r][c1] + " ");
					c1--;
				}
			}
			r++;
		}
	}

	public static void main(String args[]) {
		//int[][] n = jackedArray();
		 int[][] m = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 100, 110, 120 },{ 130, 140, 150, 160 } };
		waveDisplay(m);

	}
}
