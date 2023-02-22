import java.util.*;

public class SpiralDisplayArrayClock {
	static Scanner sc = new Scanner(System.in);

	public static void spiralDisplay(int[][] n) {
		int minrow = 0;
		int maxrow = n.length - 1;
		int mincol = 0;
		int maxcol = n[0].length - 1;
		int nel = n.length * n[0].length;
		int count = 0;
		while (count < nel) {
			for (int c = mincol; c <= maxcol; c++) {
				if (count < nel)
					System.out.print(n[minrow][c] + " ");
				else
					break;
				count++;
			}
			minrow++;
			for (int r = minrow; r <= maxrow; r++) {
				if (count < nel)
					System.out.print(n[r][maxcol] + " ");
				else
					break;
				count++;
			}
			maxcol--;
			for (int c = maxcol; c >= mincol; c--) {
				if (count < nel)
					System.out.print(n[maxrow][c] + " ");
				else
					break;
				count++;
			}
			maxrow--;
			for (int r = maxrow; r >= minrow; r--) {
				if (count < nel)
					System.out.print(n[r][mincol] + " ");
				else
					break;
				count++;
			}
			mincol++;
		}
	}

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

	public static void main(String args[]) {

		int[][] n = jackedArray();
		spiralDisplay(n);

	}
}
