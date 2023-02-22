import java.util.Scanner;

public class Pattern01 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the no. of rows- ");
		int n = scn.nextInt();
		System.out.print("Enter the character- ");
		char ch = scn.next().charAt(0);
		int i = 0;
		while (i < n) {
			i++;
			int j = 0;
			while (j < n) {
				j++;
				System.out.print(ch + "   ");
			}
			System.out.println("\n");
		}
	}
}