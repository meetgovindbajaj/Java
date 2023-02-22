import java.util.*;

public class RotationArray {
	public static void main(String[] args) {
//		Collections.rotate(s, 1);//rotate array list
		Scanner sc = new Scanner(System.in);
		System.out.print("n- ");
		int n = sc.nextInt();
		System.out.print("m- ");
		int m = sc.nextInt();
		int[] a = new int[n];
		m = m % n;
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]- ");
			a[i] = sc.nextInt();
		}
		System.out.print("\n");
		int j = 0;
		for (int i = n - m; i < n; i++) {
			System.out.println("a[" + j + "]- " + a[i]);
			j++;
		}
		for (int i = 0; i < n - m; i++) {
			System.out.println("a[" + j + "]- " + a[i]);
			j++;
		}
		sc.close();
	}
}
