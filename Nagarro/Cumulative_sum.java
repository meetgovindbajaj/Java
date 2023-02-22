import java.util.Scanner;

public class Cumulative_sum 
{  
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int sum=0,x,i=0;
        int[] arr=new int[9];
        while(i<5)
        {
         x=sc.nextInt();
         arr[i]=x;
//         if(sum+arr[i]<0)
//                break;
         i++;
        }
        int a=0;
        while(a<10)
        {
            if(sum+arr[a]<0)
                   break;
            a++;
        }
       	System.out.println();
        for(int j=0;j<a;j++)
        {
            System.out.println(arr[j]);
        }
        sc.close();
    }
}