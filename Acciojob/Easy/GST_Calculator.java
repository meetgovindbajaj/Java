/**
@start--------------------------------------------

@param Question
Write a Java program to calculate the GST bill for a certain purchase according to the following :- if the purchase is less than or equal to 5000/- GST is 18% if the purchase is less than or equal to 10k and greater than 5k GST is 20% if the purchase is less than or equal to 20k and greater than 10k GST is 25% if the purchase is greater than 20k GST is 28%


@param Input-Format
-line contains purchase amount (decimal value)


@param Output-Format
- print the GST for the purchase.


@param Input
10000


@param Output
2000.0


@param Explained
none


@param Constraints
None

@end--------------------------------------------
*/



import java.util.*;

public class GST_Calculator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int val = sc.nextInt();
            double gst = (val > 20000 ? 0.28 : val > 10000 ? 0.25 : val > 5000 ? 0.20 : 0.18);
            System.out.println(gst * val);
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }
}