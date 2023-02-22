import java.util.*;

public class Pattern29 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the no. of rows- ");
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		while (row <= n) {
			for (int csp = 1; csp <= n - row; csp++) {
				System.out.print("    ");
			}
			for (int cst = 1; cst <= nst; cst++) {
				if (cst == 1 || cst == nst) {
					System.out.print(row + "   ");
				} else {
					System.out.print("0   ");
				}
			}
			row++;
			nst = nst + 2;
			System.out.println();
		}
		scn.close();
	}
}
