import java.util.Scanner;

public class N_KnightsChessBoard {
	static Scanner sc = new Scanner(System.in);

	public static void Knights(boolean[][] boxes, int Knights_placed, int rows, int total_Knights, String ans,
			int cols) {
		if (Knights_placed == total_Knights) {
			System.out.println(ans);
			return;
		}
		if (cols == boxes[0].length) {
			rows++;
			cols = 0;
		}
		if (rows == boxes.length)
			return;
		if (isitsafeplace(boxes, rows, cols)) {
			boxes[rows][cols] = true;// do changes
			Knights(boxes, Knights_placed + 1, rows, total_Knights, ans + "{" + rows + "-" + cols + "}", cols + 1);
			boxes[rows][cols] = false;// undo changes
		}
		Knights(boxes, Knights_placed, rows, total_Knights, ans, cols + 1);
	}

	public static boolean isitsafeplace(boolean[][] boxes, int rows, int cols) {
		int[] row = { -1, -2, -2, -1 };
		int[] col = { 2, 1, -1, -2 };
		for (int i = 0; i < 4; i++)
			if (rows + row[i] >= 0 && rows + row[i] < boxes.length && cols + col[i] >= 0
					&& cols + col[i] < boxes[0].length)
				if (boxes[rows + row[i]][cols + col[i]])
					return false;
		return true;
	}

	public static void main(String args[]) {
		System.out.println("no. of rows and cols?");
		int n = sc.nextInt();
		System.out.println("no. of knights?");
		int m = sc.nextInt();
		boolean[][] boxes = new boolean[n][n];
		System.out.println("possible combinations->");
		Knights(boxes, 0, 0, m, "", 0);

	}
}
