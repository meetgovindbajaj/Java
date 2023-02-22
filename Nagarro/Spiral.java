import java.util.*;

public class Spiral {
	static int n;
	static Scanner sc = new Scanner(System.in);

	public static void input() {
		n = sc.nextInt();
		if (n == 1 || n == 2 || n > 9) {
			System.out.print("Enter more than 2 and less than 10 number of rows\nEnter rows- ");
			input();
		}
	}

	public static void Spirall(int n) {
		int a = 2 * n - 1;
		int row = 1;
		int row1 = n - 1;
		while (row <= n) {
			int b = n;
			int q = n + 1;
			for (int i = 1; i <= row; i++) {
				q--;
				if (q == 1) {
					break;
				}
				System.out.print(q);
			}
			for (int i = row + 1; i <= a - row; i++) {
				System.out.print(b - row + 1);
			}
			q--;
			for (int i = a - row + 1; i <= a; i++) {
				q++;
				System.out.print(q);
			}
			row++;
			b--;
			System.out.print("\n");
		}
		int b = 2;
		while (row <= a) {
			int q = n + 1;
			for (int i = 1; i <= row1; i++) {
				q--;
				if (q == 1) {
					break;
				}
				System.out.print(q);
			}
			for (int i = row1 + 1; i <= a - row1; i++) {
				System.out.print(b);
			}
			for (int i = a - row1 + 1; i <= a; i++) {

				System.out.print(q);
				q++;
			}
			row++;
			row1--;
			b++;
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		System.out.print("Enter 0 to exit loop!\nEnter rows- ");
		input();
		Spirall(n);
		while (n != 0 || n != 0) {
			System.out.print("\nEnter 0 to exit loop!\nEnter rows- ");
			input();
			Spirall(n);
		}
	}
}
