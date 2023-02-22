/**
@start--------------------------------------------

@param Question
Given a list of non negative integers, arrange them such that they form the largest number.


@param Input-Format
First line contains integer N

Second line contains N integers arr[i]


@param Output-Format
Print the largest number that can be formed


@param Input
5
3 30 4 53 9


@param Output
9534330


@param Explaination
This is the largest number possible


@param Constraints
1 <= N <= 10^5

0 <= arr[i] <= 10^5

@end--------------------------------------------
*/



import java.util.*;

public class Largest_Number {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        ArrayList<String> al = new ArrayList<>();
        input(n, al);
        System.out.println(largestNumber(n, al));
    }

    public static void input(int n, ArrayList<String> al) {
        while (--n >= 0)
            al.add(sc.next());
    }

    public static String largestNumber(int n, ArrayList<String> al) {
        Collections.sort(al, (a, b) -> (b + a).compareTo(a + b));
        String s = al.toString();
        return s.replaceAll("[ ,\\[\\]]", "");
    }
}
