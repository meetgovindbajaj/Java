import java.util.*;

public class Pattern33 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the no. of rows- ");
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		int a = n;
		while (row <= n) {
			for (int csp = 1; csp <= n - row; csp++) {
				System.out.print("  ");
			}
			for (int cst = 1; cst <= nst; cst++) {
				if (cst <= nst / 2) {
					System.out.print(a + " ");
					a++;
				} else if (cst > nst / 2 + 1) {
					System.out.print(a + " ");
					a--;
				} else {
					a--;
					System.out.print("0 ");
				}
			}
			row++;
			nst = nst + 2;
			System.out.println();
		}
		scn.close();
	}
}
