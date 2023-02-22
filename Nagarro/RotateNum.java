import java.util.*;
public class RotateNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("number- ");
		int v = sc.nextInt();
		System.out.print("rotation- ");
		int m = sc.nextInt();
		int length = (int) (Math.log10(v) + 1);
		m=m%length;
		System.out.println(m);
		int rem=(int)(v%Math.pow(10, m));
		int que=(int)(v/(int)Math.pow(10,m));
		int s=rem*(int)(Math.pow(10, (length-m)))+que;
		System.out.print(s+"\n");
		sc.close();
	}
}
