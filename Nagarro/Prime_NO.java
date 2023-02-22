import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Prime_NO {
	public static void main(String[] args) {
		int sum = 0;
		int count = 1;
		int a = 0;
		int b = 2;
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println("you entered- " + n);
		while (count <= n) {
			sum += count;
			count++;
		}
		System.out.println("total sum is yo- " + sum);
		while (b <= sqrt(n)) {
			if (n % b == 0) {
				a++;
				break;
			}
			b++;
		}
		if (a == 0) {
			System.out.println("This is prime no.");
		} else {
			System.out.println("This is not an prime no.");
		}
		scn.close();
	}
}