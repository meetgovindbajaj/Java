import java.util.*;

public class N_Queens_Permutation {
	static Scanner sc = new Scanner(System.in);

	public static void Queens(boolean[] boxes, int queens_placed, int total_queens, String ans) {
		if (queens_placed == total_queens) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < boxes.length; i++) {
			if (boxes[i] == true)
				continue;
			boxes[i] = true;// do changes
			Queens(boxes, queens_placed + 1, total_queens, ans + "q" + queens_placed + "->b" + i + " ");
			boxes[i] = false;// undo changes
		}
	}

	public static void main(String args[]) {
		System.out.println("no. of boxes?");
		int n = sc.nextInt();
		System.out.println("no. of queens?");
		int m = sc.nextInt();
		boolean[] boxes = new boolean[n];
		System.out.println("possible permutations->");
		Queens(boxes, 0, m, "");
	}
}
