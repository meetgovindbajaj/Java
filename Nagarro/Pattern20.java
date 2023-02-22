import java.util.Scanner;

public class Pattern20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Rows- ");
		int n = sc.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = 1;
		if (n % 2 == 0)
			n++;
		while (row <= n) {
			for (int csp = 1; csp <= n / 2 - nsp + 1; csp++)
				System.out.print("  ");
			for (int cst = 1; cst <= nst; cst++) {
				if (cst == 1 || cst == nst)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			if (row <= n / 2) {
				nst = nst + 2;
				nsp++;
			} else {
				nst = nst - 2;
				nsp--;
			}
			row++;
			System.out.println();
		}
		sc.close();
	}
}