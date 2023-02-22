import java.util.Scanner;

public class Pattern31 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the no. of rows- ");
		int n = scn.nextInt();
		int row = 1;
		while (row <= n) {
			int nst = n;
			for (int cst = 1; cst <= n; cst++) {
				if (cst + row == n + 1)
					System.out.print("* ");
				else
					System.out.print(nst + " ");
				nst--;
			}
			row++;
			System.out.println();
		}
		scn.close();
	}
}
