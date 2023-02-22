import java.util.*;

public class BlockedMaze {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		System.out.println("rows?");
		int n=sc.nextInt();
		System.out.println("cols?");
		int m=sc.nextInt();
		int[][] arr = Array(n, m);
//		int[][] arr1 = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		Blockedmaze(arr, new boolean[4][4], 0, 0, "");
	}

	public static int[][] Array(int rows, int cols) {
		int[][] arr = new int[rows][cols];
		int r = 0, c = 0;
		while (r < rows) {
			if (c >= cols) {
				c = 0;
				r++;
			} else {
				arr[r][c] = sc.nextInt();
				c++;
			}
		}
		return arr;
	}

	public static void Blockedmaze(int[][] maze, boolean[][] a, int row, int col, String ans) {
		if (row == maze.length - 1 && col == maze[0].length - 1)
			System.out.println(ans);
		if (row >= maze.length || col >= maze[0].length || row == -1 || col == -1 || a[row][col] == true)
			return;
		if (maze[row][col] == 1)
			return;
		a[row][col] = true;
		Blockedmaze(maze, a, row - 1, col, ans + "T");// top
		Blockedmaze(maze, a, row + 1, col, ans + "D");// down
		Blockedmaze(maze, a, row, col - 1, ans + "L");// left
		Blockedmaze(maze, a, row, col + 1, ans + "R");// right
		a[row][col] = false;
	}
}
