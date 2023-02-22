import java.util.Scanner;

public class N_Queens2Chessboard {
	static Scanner sc = new Scanner(System.in);
	static int count=0;
	public static void Queens(boolean[][] boxes, int queens_placed, int rows, int total_queens, String ans,
			int lastBoxUsed) {
		if (queens_placed == total_queens) {
			++count;
			System.out.println(count+" "+ans);
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
			Queens(boxes, queens_placed + 1, rows + 1, total_queens, ans + "{" + rows + "-" + lastBoxUsed + "}", 0);
			boxes[rows][lastBoxUsed] = false;// undo changes
		}
		Queens(boxes, queens_placed, rows, total_queens, ans, lastBoxUsed + 1);
	}

	public static boolean isitsafeplace(boolean[][] boxes, int rows, int cols) {
		// horizontally left
		int r = rows;
		int c = cols - 1;
		while (c >= 0) {
			if (boxes[r][c])
				return false;
			c--;
		}
		return true;
	}

	public static void main(String args[]) {
		System.out.println("no. of rows and cols?");
		int n = sc.nextInt();
		System.out.println("no. of queens?");
		int m = sc.nextInt();
		boolean[][] boxes = new boolean[n][n];
		System.out.println("possible combinations->");
		Queens(boxes, 0, 0, m, "", 0);

	}
}
