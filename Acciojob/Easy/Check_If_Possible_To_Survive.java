/**
@start--------------------------------------------

@param Question
You are a poor citizen of an island that has only one shop for groceries, which is open six days a week and is closed on Sundays.

The first day of the week is Monday. You can buy ‘n’ units of food from a day’s work. Now each day, you need ‘x’ units of food to survive. You are making a boat to escape the island, which will require ‘d’ days to be made. You need to survive at least ‘d’ days on the island. You are given three integers n, x, and d.

Your task is to determine if you can escape the island


@param Input-Format
The first and the only line contains three space-separated integers n, x, and d.


@param Output-Format
Print YES if it is possible to survive on the island; else, print NO.


@param Input
16 2 10


@param Output
YES


@param Explaination
One possible solution is to buy food on the first day (Monday). It’s sufficient to eat from this food up to the 8th day (Monday) inclusive. On the 9th day (Tuesday), repurchase food and use the food to survive the 9th and 10th day.


@param Constraints
1<= n, x, d<=10^8

@end--------------------------------------------
*/


import java.util.*;

public class Check_If_Possible_To_Survive {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), x = sc.nextInt();
        sc.nextInt();
        System.out.println(n >= x ? "YES" : "NO");
    }
}