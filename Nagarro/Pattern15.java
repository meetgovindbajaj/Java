import java.util.Scanner;

public class Pattern15 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the no. of rows- ");
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		while (row <= 2 * n - 1) {
			for (int csp = 1; csp <= nst - 1; csp++) {
				System.out.print("  ");
				System.out.print("  ");
			}
			for (int cst = 1; cst <= n - nst + 1; cst++) {
				System.out.print("* ");
			}
			row++;
			if (row <= n)
				nst++;
			else
				nst--;
			System.out.println();
		}
		scn.close();
	}
}
