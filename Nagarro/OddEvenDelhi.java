import java.util.*;
public class OddEvenDelhi 
{
    public static void main(String args[]) 
    {
        int nc,n,i,d;
        Scanner sc=new Scanner(System.in);
        nc=sc.nextInt();
        sc.close();
        for(i=0;i<nc;i++)
        {
        	int se=0 , so=0;
        	n=sc.nextInt();
        	while(n>0)
        	{
        		
        		d=n%10;
        		if(d%2==0)
        		{
        			se+=d;
        		}
        		else
        		{
        			so+=d;
        		}
        		n/=10;
        	}
        	if(se%4==0 || so%3==0)
        		System.out.println("Yes");
        	else
        		System.out.println("No");
        }
    }
}