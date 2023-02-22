import java.util.Scanner;

public class Pattern21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Rows- ");
		int n = sc.nextInt();
		int row = 1;
		int nst = 2 * n - 1;
		while (row <= n) {
			for (int cst = 1; cst <= row; cst++) {
				System.out.print("* ");
			}
			for (int cst = 1; cst < nst - 1; cst++) {
				System.out.print("  ");
			}
			for (int cst = 1; cst <= row; cst++) {
				if (cst == n)
					break;
				else
					System.out.print("* ");
			}
			nst = nst - 2;
			row++;
			System.out.println("");
		}
		sc.close();
	}
}