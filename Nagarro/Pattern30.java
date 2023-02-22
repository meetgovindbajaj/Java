import java.util.Scanner;

public class Pattern30 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the no. of rows- ");
		int n = scn.nextInt();
		int row = 1;
		while (row <= n) {
			for (int cst = n; cst >= 1; cst--)
				System.out.print(cst + " ");
			row++;
			System.out.println();
		}
		scn.close();
	}
}
