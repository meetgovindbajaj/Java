//Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers but he 
// loves inverting digits in them. Inverting digit t means replacing it with digit 9 - t.
//
//Help Chewbacca to transform the initial number x to the minimum possible positive number by 
//inverting some (possibly, zero) digits. The decimal representation of the final number shouldn't start with a zero.
//
//Print the minimum possible positive number that Chewbacca can obtain after inverting some digits. The number shouldn't 
//contain leading zeroes.
//
//There are many numbers form after inverting the digit. For minimum number, check if inverting digit is less than or greater 
//than the original digit. If it is less, then invert it otherwise leave it.

	import java.util.*;
	public class Chewbacca_and_Number {
	    public static void main(String[] args) {
			Scanner scn =new Scanner(System.in); 
			
			long num=scn.nextLong(); 
			long num1=0,rem=0,ans=0,t=0,c=0,f=1,num2=num,s=0,v=0 ; 
			while(num2!=0)
			{
				num2=num2/10 ;
				s++ ; 
				
			}
			 while(num!=0)
			 {
				 rem=num%10 ; 
				 if(rem>=5)
				 {
					 rem=9-rem; 
				 }
				 if(rem==0&&f==1&&v!=s-1)
				 {
				     c++ ; 
				 }
				 if(v==s-1&&rem==0)
				 {
					 rem=num%10 ; 
				 }
				 if(rem!=0)
				 {f=0; }
				 num1=num1*10+rem ; 
				 num=num/10 ; 
				 v++; 
				 
			 }
			 while(num1!=0)
			 {
				 rem=num1%10 ;
				 if(t==1||rem!=0)
				 {ans=ans*10+rem ;t=1; } 
				 num1=num1/10 ; 
			 }
			 System.out.println(ans*(int)Math.pow(10,c));
			 scn.close();
		}

	}

