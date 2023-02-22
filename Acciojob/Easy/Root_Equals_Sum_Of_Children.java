/**
@start--------------------------------------------

@param Question
You are given the root of a binary tree that consists of exactly 3 nodes: the root, its left child, and its right child.

Return true if the value of the root is equal to the sum of the values of its two children, or false otherwise.


@param Input-Format
Given the root of the tree.


@param Output-Format
Return true or false.


@param Input
10 4 6 N N N N
  10
 /  \
4    6


@param Output
true


@param Explained
The values of the root, its left child, and its right child are 10, 4, and 6, respectively.

10 is equal to 4 + 6, so we return true.


@param Constraints
The tree consists only of the root, its left child, and its right child.

-100 <= Node.val <= 100

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Root_Equals_Sum_Of_Children {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            String s = sc.nextLine();
            Node root = buildTree(s);
            boolean result = checkTree(root);
            System.out.print(result);
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }

    public static Node buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (queue.size() > 0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if (i >= ip.length)
                break;
            currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }

    public static boolean checkTree(Node root) {
        return root.data == (root.left.data + root.right.data);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}