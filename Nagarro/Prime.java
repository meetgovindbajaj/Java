import java.util.*;

public class Prime {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number- ");
		int n = sc.nextInt();
		for (int i = 2; i <= n; i++) {
			int c = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					c++;
				}
			}
			if (c == 2) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}
