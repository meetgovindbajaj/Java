import java.util.*;

public class Pattern10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the no. of rows- ");
		int n = scn.nextInt();
		int row = 1;
		int nst = 2 * n - 1;
		while (row <= n) {
			for (int csp = 1; csp <= row - 1; csp++) {
				System.out.print("  ");
			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("* ");
			}
			row++;
			nst = nst - 2;
			System.out.println();
		}
		scn.close();
	}
}
