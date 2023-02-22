import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the input: ");
		int n=scn.nextInt();
		int q=0;
		while(n!=0)
		{
			int rem=n%10;
			n=n/10;
			q=(q*10)+rem;
		}
		System.out.print("The reverse of input is "+q);
		scn.close();
	}
}