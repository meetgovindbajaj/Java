import java.util.*;
public class Shopping 
{
	public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        scn.close();
        for(int i=1; i<=T; i++)
        {
            int M = scn.nextInt();
            int N = scn.nextInt();
            int ayushPhone = 0;
            int harshitPhone = 0;

            //int a=0,h=0;
            
            for(int j=1; ayushPhone<=M; j+=2) 
            	ayushPhone +=j;
            for(int j=2; harshitPhone<=N; j+=2) 
            	harshitPhone+=j;

            if(ayushPhone>harshitPhone) 
            	System.out.println("Aayush");
            else 
            	System.out.println("Harshit");
        }
        
    }
}