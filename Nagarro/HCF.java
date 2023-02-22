import java.util.*;
public class HCF {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter 1st no.: ");
		int divident=scn.nextInt();
		System.out.print("Enter 2nd no.: ");
		int divisor=scn.nextInt();
		while(true)
		{
			int rem=divident%divisor;
			if(rem==0)
				break;
			divident=divisor;
			divisor=rem;
		}
		System.out.println("\nTHE HCF OF GIVEN NUMBERS IS "+divisor);
		scn.close();
	}
}
