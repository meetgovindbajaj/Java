import java.util.*;

public class Pattern07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n = scn.nextInt();
		int row = 1;
		while (row <= n) {
			if (row == 1 || row == n) {
				for (int cst = 1; cst <= n; cst++) {
					System.out.print("* ");
				}
			} else {
				for (int cst = 1; cst <= n; cst++) {
					if (cst == 1 || cst == n)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
			}
			row++;
			System.out.println();
		}
		scn.close();
	}
}
