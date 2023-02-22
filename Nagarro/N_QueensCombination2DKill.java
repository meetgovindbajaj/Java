import java.util.Scanner;

public class N_QueensCombination2DKill {
	static Scanner sc = new Scanner(System.in);

	public static void Queens(boolean[][] boxes, int queens_placed, int rows, int total_queens, String ans,
			int lastBoxUsed) {
		if (queens_placed == total_queens) {
			System.out.println(ans);
			return;
		}
		if (lastBoxUsed == boxes[0].length) {
			rows++;
			lastBoxUsed = 0;
		}
		if (rows == boxes.length)
			return;
		if (isitsafeplace(boxes, rows, lastBoxUsed)) {
			boxes[rows][lastBoxUsed] = true;// do changes
			Queens(boxes, queens_placed + 1, rows, total_queens, ans + "{" + rows + "-" + lastBoxUsed + "}",
					lastBoxUsed + 1);
			boxes[rows][lastBoxUsed] = false;// undo changes
		}
		Queens(boxes, queens_placed, rows, total_queens, ans, lastBoxUsed + 1);
	}

	public static boolean isitsafeplace(boolean[][] boxes, int rows, int cols) {
		int r = rows - 1;
		int c = cols;
		// vertically upward
		while (r >= 0) {
			if (boxes[r][c])
				return false;
			r--;
		}
		// horizontally left
		r = rows;
		c = cols - 1;
		while (c >= 0) {
			if (boxes[r][c])
				return false;
			c--;
		}
		// diagonally left
		r = rows - 1;
		c = cols - 1;
		while (r >= 0 && c >= 0) {
			if (boxes[r][c])
				return false;
			r--;
			c--;
		}
		// diagonally right
		r = rows - 1;
		c = cols + 1;
		while (r >= 0 && c < boxes[0].length) {
			if (boxes[r][c])
				return false;
			r--;
			c++;
		}
		return true;
	}

	public static void main(String args[]) {
		System.out.println("no. of rows?");
		int n = sc.nextInt();
		System.out.println("no. of cols?");
		int l = sc.nextInt();
		System.out.println("no. of queens?");
		int m = sc.nextInt();
		boolean[][] boxes = new boolean[n][l];
		System.out.println("possible combinations->");
		Queens(boxes, 0, 0, m, "", 0);

	}
}
