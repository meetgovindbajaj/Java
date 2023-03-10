import java.util.*;

public class Print_Series {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N1 = s.nextInt();
		int N2 = s.nextInt();
		s.close();
		if (N1 < 0 || N1 >= 100 || N2 < 0 || N2 >= 100) {
			System.out.println("Invalid input.");
			return;
		}
		for (int n = 1; N1 > 0; n++) {
			int value = 3 * n + 2;
			if (value % N2 != 0) {
				System.out.println(value);
				N1--;
			}
		}
		s.close();
	}
}