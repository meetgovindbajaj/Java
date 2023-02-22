import java.util.Scanner;

public class Pattern16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("rows- ");
		int n = sc.nextInt();
		int row = 1;
		int nsp = 1;
		while (row <= 2 * n - 1) {
			for (int csp = 1; csp <= n - nsp; csp++) {
				System.out.print("  ");
			}
			for (int cst = 1; cst <= n - nsp + 1; cst++) {
				System.out.print("* ");
			}
			if (row < n)
				nsp++;
			else
				nsp--;
			row++;
			System.out.println();
		}
		sc.close();
	}
}