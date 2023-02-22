/*

You are given marks of a student as input. Display a correct message based on the following rules:

for marks above 90, print "Excellent".
for marks above 80 and less than equal to 90, print "Good"
for marks above 70 and less than equal to 80, print "Fair".
for marks above 60 and less than equal to 70, print "Meets Expectations".
for marks below 60, print "Below Expectations".


You have to complete grade function which contains integer N as input and return string answer as output

--------------------------------------------

input format:
There is a single integer N.

--------------------------------------------

output format:
Print a single string in a line.

--------------------------------------------

input:
95

--------------------------------------------

output:
Excellent

--------------------------------------------

explained:
As according to given condition , for N (marks) >90 - Excellent is printed

--------------------------------------------

constraints:
1 <= |N| <= 100

*/

package Gym.Easy;

import java.util.*;

public class Grading_System {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        grade(n);
    }

    public static void grade(int n) {
        // String ans = "";
        // if (n > 90)
        // ans = "Excellent";
        // else if (n > 80)
        // ans = "Good";
        // else if (n > 70)
        // ans = "Fair";
        // else if (n > 60)
        // ans = "Meets Expectations";
        // else
        // ans = "Below Expectations";
        // System.out.println(ans);
        System.out.println(n > 90 ? "Excellent"
                : n > 80 ? "Good" : n > 70 ? "Fair" : n > 60 ? "Meets Expectations" : "Below Expectations");
    }
}
