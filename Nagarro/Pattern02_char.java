import java.util.Scanner;

public class Pattern02_char {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the no. of rows- ");
		int n = scn.nextInt();
		int i = 1;
		while (i <= n) {
			int q = 97;
			int e = 98;
			if (i % 2 != 0) {
				for (int w = 1; w <= i; w++) {
					char c = (char) q;
					System.out.print(c + " ");
					q = q + 2;
				}
			} else {
				for (int w = 1; w <= i; w++) {
					char c = (char) e;
					System.out.print(c + " ");
					e = e + 2;
				}
			}
			i++;
			System.out.println();
		}
	}
}
