/**
@start--------------------------------------------

@param Question
Ankit and his friend are playing a game in which his friend selects an integer 'N'. He then picks 'N' random numbers and places them in an array/list ‘NUMARRAY’.

He asks Ankit to find all those numbers which are equal to their index values i.e. 'NUMARRAY[i]' = ‘i’ where ‘i’ ranges from 0 to N - 1.

Can you help Ankit find all such numbers?

For example:

Let ‘NUMARRAY’ = [-4, -2, 2, 5]. Here, only 'NUMARRAY[2]' = 2. So, our answer is 2.

Note: If there is no such number present in 'NUMARRAY,’ which equals its index value, then return -1.


@param Input-Format
The first line contains a single integer ‘N’.

The next line contains ‘N’ single space-separated integers denoting the numbers in ‘NUMARRAY.’.


@param Output-Format
Print all the numbers which satisfy the given condition in sorted order.


@param Input
4
-4 -2 2 5


@param Output
2


@param Explained
For ‘i’ = ‘0’, 'NUMARRAY[0]' = -4 which is not equal to index ‘i’, So we don’t include this number in our answer.

For ‘i’ = ‘1’ 'NUMARRAY[1]' = -2 which is not equal to index ‘i’, So we don’t include this number in our answer.

For ‘i’ = ‘2’ 'NUMARRAY[2]' = 2 which is equal to index ‘i’, So we include this number in our answer.

For ‘i’ = ‘3’ 'NUMARRAY[3]' = 5 which is not equal to index ‘i’, So we don’t include this number in our answer.


@param Constraints
1 <= ‘N’ <= 100000
-100000 <= ‘NUMARRAY[i]’ <= 100000

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Value_Equal_To_The_Index_Value {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int n = sc.nextInt();
            int numArray[] = new int[n];
            for (int i = 0; i < n; i++) {
                numArray[i] = sc.nextInt();
            }
            ArrayList<Integer> ans = valueEqualToIndices(numArray, n);
            int m = ans.size();
            for (int i = 0; i < m; i++) {
                if (i == m - 1) {
                    System.out.print(ans.get(i) + "\n");
                } else {
                    System.out.print(ans.get(i) + " ");
                }
            }
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }

    public static ArrayList<Integer> valueEqualToIndices(int numArray[], int n) {
        Boolean checker = false;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < numArray.length; i++) {
            if (i == numArray[i]) {
                ans.add(i);
                checker = true;
            }
        }
        if (!checker) {
            ans.add(-1);
        }
        return ans;
    }
}