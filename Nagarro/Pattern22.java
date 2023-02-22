import java.util.Scanner;

public class Pattern22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Rows- ");
		int n = sc.nextInt();
		int a = n / 2;
		int row = 1;
		while (row <= n) {
			for (int b = n; b >= row; b--) {
				System.out.print("* ");
			}
			for (int i = a - row + 1; i < a + row - 2; i++) {
				System.out.print("  ");
			}
			int c = n;
			while (c >= row) {
				c--;
				if (c == 0)
					break;
				else
					System.out.print("* ");
			}
			System.out.println();
			row++;
		}
		sc.close();
	}
}