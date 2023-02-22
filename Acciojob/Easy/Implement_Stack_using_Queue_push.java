/**
@start--------------------------------------------

@param Question
Implement stack using two queues. You need to complete the push and pop function of stack class. You are given 2 types of queries-

'1' which represents that we need to push an integer into the stack.

'2' which represents that we need to pop the top element from the stack. If there is no top element simply return -1.

Note: Make the push operation O(1).


@param Input-Format
First line contains q of queries.

Followed by q lines.

Query of type 1 is followed by an integer x to push element in the stack.

Query of type 2 is for pop the top value from the stack and print it.


@param Output-Format
Print the value for pop operations in the query given.


@param Input
5
1 2
1 3
2
1 4
2


@param Output
3 4


@param Explained
First we push 2 , then for second query we push 3, for third query we pop 3 and print, for 4th query we push 4 and for 5th query we pop 4.


@param Constraints
1 <= Total number of queries <= 100

1 <= value in each query <= 100

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Implement_Stack_using_Queue_push {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Stacks g = new Stacks();
            int q = sc.nextInt();
            while (q > 0) {
                int QueryType = sc.nextInt();
                if (QueryType == 1) {
                    int a = sc.nextInt();
                    g.push(a);
                } else if (QueryType == 2) {
                    System.out.println(g.pop());
                }
                q--;
            }
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }
}

class Stacks {
    static Stack<Integer> stack = new Stack<>();

    void push(int a) {
        stack.push(a);
    }

    int pop() {
        int popped;
        try {
            popped = stack.pop();
        } catch (Exception e) {
            popped = -1;
        }
        return popped;
    }
}