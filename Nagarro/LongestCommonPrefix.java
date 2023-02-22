import java.util.*;
public class LongestCommonPrefix {
    static Scanner sc=new Scanner(System.in);
    public static String string(String a[])
    {
    if (a.length == 0) 
        return "";
    String prefix = a[0];
    for (int i = 1; i < a.length; i++)
        while (a[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length() - 1);
            if (prefix.isEmpty()) 
                return "";
        }        
    return prefix;
    }
    public static void main (String args[]) {
        System.out.println("length of array?");
    	int n=sc.nextInt();
        String []m=new String[n];
        for(int i=0;i<n;i++)
        {
        	System.out.println("String "+(i+1)+"?");
            m[i]=sc.next();
        }
        System.out.print("Longest Common Prefix- "+string(m));
    }
}