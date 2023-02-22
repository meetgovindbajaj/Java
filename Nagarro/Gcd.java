import java.util.*;
public class Gcd
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N1=sc.nextInt();
		System.out.println();
	    int N2=sc.nextInt();
	    System.out.println();
	    int a=0;
	    int b=0;
	    if(N1<N2)
	    	a=N2;
	    else
	    	a=N1;
	    for(int i=1;i<=a;i++)
	    {
	    	if(N1%i==0 && N2%i==0)
	    		b=i;
	    }
	    System.out.print(b);
        //System.out.println(gcd(N1,N2));
        sc.close();
	}
}