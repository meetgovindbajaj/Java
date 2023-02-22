import java.util.*;

public class Random_digit_change {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long place = 1;
		long n1 = n;
		if (n == 0)
			n = 5;
		long add = 0;
		while (n1 > 0) {
			long digit = n1 % 10;
			if (digit == 0)
				add += place * 5;
			place = place * 10;
			n1 = n1 / 10;
		}
		sc.close();
		System.out.println(n + add);
	}
}