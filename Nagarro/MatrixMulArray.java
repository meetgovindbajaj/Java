import java.util.*;

public class MatrixMulArray {
	static Scanner sc = new Scanner(System.in);

	public static int[][] multiply(int[][] a, int[][] b) {
		int r1 = a.length;
		int c1 = a[0].length;
		int c2 = b[0].length;
		int[][] c = new int[r1][c2];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				int sum = 0;
				for (int k = 0; k < c1; k++)
					sum += a[i][k] * b[k][j];
				c[i][j] = sum;
			}
			System.out.println();
		}
		return c;
	}

	public static void dis(int[][] n) {
		for (int[] v : n) {
			for (int v1 : v) {
				System.out.print(v1 + "\t");
			}
			System.out.println();
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
		int[][] m = jackedArray();
		int[][] n = jackedArray();
		System.out.println("Matrix 1- ");
		dis(m);
		System.out.println("Matrix 2-");
		dis(n);
		if (m[0].length != n.length) {
			System.out.print("Matrix multiplication not possible");
		} else {
			int[][] l = multiply(m, n);
			System.out.println("Resultant matrix -");
			dis(l);
		}
	}
}
