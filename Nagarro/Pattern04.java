import java.util.Scanner;

public class Pattern04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the no. of rows- ");
		int n = scn.nextInt();
		int row = 1;
		while (row <= n) {
			for (int csp = 1; csp <= n - row; csp++) {
				System.out.print("  ");
			}
			for (int cst = 1; cst <= row; cst++) {
				System.out.print("* ");
			}
			row++;
			System.out.println();
		}
		scn.close();
	}
}
