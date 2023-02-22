import java.util.*;

public class Pattern32 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the no. of rows- ");
		int n = scn.nextInt();
		int nst = 1;
		int row = 1;
		int val = 1;
		while (row <= 2 * n - 1) {
			for (int cst = 1; cst <= nst; cst++) {
				if (cst % 2 != 0)
					System.out.print(val + " ");
				else
					System.out.print("* ");
			}
			if (row <= n - 1) {
				nst = nst + 2;
				val++;
			} else {
				nst = nst - 2;
				val--;
			}
			row++;
			System.out.println();
		}
		scn.close();
	}
}
