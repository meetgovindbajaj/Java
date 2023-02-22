import java.util.*;

public class Pattern28 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the no. of rows- ");
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		int a = 1;
		while (row <= n) {
			for (int csp = 1; csp <= n - row; csp++) {
				System.out.print("\t");
			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(a + "\t");
				if (cst <= nst / 2)
					a++;
				else
					a--;
			}
			row++;
			a = a + 2;
			nst = nst + 2;
			System.out.println();
		}
		scn.close();
	}
}