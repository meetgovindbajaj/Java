import java.util.Scanner;

public class Pattern13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the no. of rows- ");
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		while (row <= 2 * n - 1) {
			for (int cst = 1; cst <= nst; cst++)
				System.out.print("* ");
			if (row < n)
				nst++;
			else
				nst--;
			row++;
			System.out.println();
		}
		scn.close();
	}
}
