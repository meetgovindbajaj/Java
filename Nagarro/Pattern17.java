import java.util.Scanner;

public class Pattern17 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the no. of rows- ");
		int n = scn.nextInt();
		if (n % 2 == 0)
			n++;
		int row = 1;
		int nst = 1;
		int nsp = 1;
		while (row <= n) {
			for (int csp = 1; csp <= n / 2 + 1 - nst; csp++) {
				System.out.print("* ");
			}
			for (int cst = 1; cst <= nsp; cst++) {
				System.out.print("  ");
			}
			for (int csp = 1; csp <= n / 2 + 1 - nst; csp++)
				System.out.print("* ");
			if (row <= n / 2) {
				nst++;
				nsp = nsp + 2;
			} else {
				nst--;
				nsp = nsp - 2;
			}
			row++;
			System.out.println();
		}
		scn.close();
	}
}