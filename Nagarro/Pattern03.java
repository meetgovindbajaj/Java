import java.util.Scanner;

public class Pattern03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the no. of rows- ");
		int n = scn.nextInt();
		int i = 0;
		while (i < n) {
			i++;
			int j = n;
			while (j >= i) {
				j--;
				System.out.print("*   ");
			}
			System.out.println("\n");
		}
		scn.close();
	}
}
