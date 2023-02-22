/**
@start--------------------------------------------

@param Question
Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid.


@param Input-Format
The first line of the input contains the encoded string s.


@param Output-Format
The output should contain the decoded string.


@param Input
3[a]2[bc]


@param Output
aaabcbc


@param Explained
none


@param Constraints
1 <= s.length <= 30

All integers in s are between 1 and 300.

@end--------------------------------------------
*/



import java.util.*;

public class Decode_String {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            String str = sc.nextLine();
            System.out.println(Solution.decodeString(str));
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }
}

class Solution {
    public static String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            System.out.println("\nstack- " + String.join("", stack) + "\nfor loop- " + c);
            if (c != ']') {
                String val = String.valueOf(c);
                System.out.println("value- " + val);
                stack.push(val);
            } else {
                StringBuilder sb = new StringBuilder();
                while (!stack.isEmpty() && !stack.peek().equals("[")) {
                    String popped = stack.pop();
                    System.out.println("loop 1 popped- " + popped);
                    sb.insert(0, popped);
                }
                String str = sb.toString();
                System.out.println("string 1- " + str);
                sb.setLength(0);
                stack.pop();

                while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                    String popped = stack.pop();
                    System.out.println("loop 2 popped- " + popped);
                    sb.insert(0, popped);
                }
                System.out.println("string 2- " + sb);
                int num = Integer.parseInt(sb.toString());
                for (int i = 0; i < num; i++) {
                    System.out.println("loop 3 push-" + str);
                    stack.push(str);
                }
            }
        }
        String ans = String.join("", stack);
        return ans;
    }
    // wrong
    /*
     * public static String decoders(String decoded) {
     * List<String> str = Arrays.asList(decoded.split(""));
     * decoded = "";
     * int depth = 0;
     * ArrayList<Integer> arr = new ArrayList<>();
     * ArrayList<String> s = new ArrayList<>();
     * String temp = "";
     * for (int i = 0; i < str.size(); i++) {
     * if (str.get(i).equals("[")) {
     * if (depth != 0 && depth != arr.size()) {
     * s.add(temp);
     * temp = "";
     * }
     * depth += 1;
     * } else if (str.get(i).equals("]")) {
     * s.add(temp);
     * temp = "";
     * depth--;
     * } else {
     * int a = (int) str.get(i).charAt(0);
     * if (a >= 48 && a <= 57) {
     * arr.add(Integer.parseInt(str.get(i)));
     * } else {
     * temp += str.get(i);
     * }
     * }
     * }
     * if (depth == 0) {
     * for (int i = 0; i < arr.size(); i++) {
     * System.out.println("string- " + s.get(i) + " freq- " + arr.get(i));
     * decoded += s.get(i).repeat(arr.get(i));
     * }
     * } else {
     * System.out.println("depth- " + depth);
     * }
     * return decoded;
     * }
     */
}