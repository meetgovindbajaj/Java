
/*
 *       *
   *   * 
     * 
   *   *
 *       *
 */
import java.util.*;

public class Pattern08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("row- ");
		int n = sc.nextInt();
		int j = n / 2;
		int row = 0;
		int i = j;
		while (row < j) {
			int cst = 1;
			while (cst <= n) {
				if (cst == row + 1 || cst == n - row) {
					System.out.print("* ");
					cst++;
				} else {
					System.out.print("  ");
					cst++;
				}
			}
			row++;
			System.out.print("\n");
		}
		while (j < n) {
			int cst = 1;
			while (cst <= n) {
				if (cst == i + 1 || cst == n - i) {
					System.out.print("* ");
					cst++;
				} else {
					System.out.print("  ");
					cst++;
				}
			}
			i++;
			j++;
			System.out.print("\n");
		}
		sc.close();
	}
}