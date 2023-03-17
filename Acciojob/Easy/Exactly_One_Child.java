/**
@start--------------------------------------------

@param Question
You are given a Preorder of a BST in form of an array. There are n nodes in the BST thus the size of array is n. Your task is to check if all the non-leaf nodes of BST have only one child or not.

If this condition is satisfied, then return true else return false.

Pre-order traversal is a way to traverse a tree that follows the Root Left Right policy.


@param Input-Format
First line contains an integer n

Second line contains n space separated integer.


@param Output-Format
Complete the function OneChild() which return true or false


@param Input
5
20 10 11 13 12


@param Output
true


@param Explaination
All the elements right to 20 are less than 20, so all of them must be in the left tree.

Similarly, all the elements next to 10 are greater than 10, so all of them must be in the right subtree, and so on.


@param Constraints
1 <= n <= 100

@end--------------------------------------------
*/


import java.util.*;

public class Exactly_One_Child {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; ++i)
            p[i] = (sc.nextInt());
        System.out.println(OneChild(p, n));
    }

    public static Boolean OneChild(int[] pre, int n) {
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 2; j < n - 1; j++)
                if ((pre[i] > pre[i + 1]) != (pre[i] > pre[j]))
                    return false;
        return true;
    }
}