import java.util.*;
public class Lcm {
  
    static int gcd(int N1, int N2)
    {
        if (N1 == 0)
            return N2; 
        return gcd(N2 % N1, N1); 
    }
     
  
    static int lcm(int N1, int N2)
    {
        return (N1 / gcd(N1, N2)) * N2;
    }
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       int N1=sc.nextInt();
       int N2=sc.nextInt();
       System.out.println(lcm(N1, N2));
       sc.close();
    }
}