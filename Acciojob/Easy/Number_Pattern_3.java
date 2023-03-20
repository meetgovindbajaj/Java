/**
@start--------------------------------------------

@param Question
A high-security meeting has been arranged. Tables for the delegates and security personnel have been arranged. A total of ‘N’ rows of tables have been set up. The first row has one table, the second row has two, and so on. To ensure maximum security, each row has assigned the tables on either end of each row for security personnel. If there is only one table in a row, it will be assigned to one security personnel. The tables assigned for security personnel will host exactly one security personnel each. All the other tables will host two guests each. You are given an integer ‘N’, which denotes the number of rows., You are supposed to print the table pattern indicating the number of guests or security personnel at each table. In other words, print the number of people at each table.

For Example, If The Number Of Rows Are 4, The Table Pattern Is As Follows:
1
11
121
1221


@param Input-Format
The only line of input contains a single integer ‘N’, denoting the number of rows.


@param Output-Format
Output contains 'N' strings denoting the pattern.


@param Input
3 


@param Output
1
11
121


@param Explaination
We are required to print three rows of tables. The first row has a single table. It will host security personnel. The second table has two tables. As mentioned in the plan, the end tables should have security personnel, so both tables will have security personnel. The third row hosts security personnel on table 1 and table 3. Table 2 will host guests.


@param Constraints
1 <= N <= 10^3

@end--------------------------------------------
*/


import java.util.*;

public class Number_Pattern_3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> ans = numberPattern(n);
        for (int i = 0; i < n; i++) {
            for (int x : ans.get(i))
                System.out.print(x);
            System.out.println();
        }
    }

    static ArrayList<ArrayList<Integer>> numberPattern(int n) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++)
                row.add((j == 0 || j == i) ? 1 : 2);
            al.add(row);
        }
        return al;
    }
}
