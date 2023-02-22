import java.util.*;
public class InversePosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("number- ");
		int n = sc.nextInt();
		int pos = 1, ans = 0;
		while (n != 0) {
			int rem = n % 10;
			ans = ans + pos * (int) Math.pow(10, rem - 1);
			n /= 10;
			//System.out.println(pos+"\t"+ans+"\t"+rem);
			pos++;
		}
		System.out.print("result- "+ans);
		sc.close();
	}
}
