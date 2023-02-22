import java.util.*;

public class Practice {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		Functions f = new Functions();
		System.out.println("no. of elements?");
		int n = sc.nextInt();
		System.out.println("no. of skips?");
		int m = sc.nextInt();
		System.out.println(f.add(n, m));
		// ArrayList<Integer> a=new ArrayList<>(n);
		// for(int i=0;i<n;i++) {
		//
		// }
	}
}
