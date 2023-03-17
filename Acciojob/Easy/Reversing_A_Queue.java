/**
@start--------------------------------------------

@param Question
You are given a queue of integers, reverse the given queue.


@param Input-Format
The first line of input contains n representing size of queue.

The second line of input contains n space-separated integers representing the contents of the queue.


@param Output-Format
The only line of output contains n space-separated integers representing the contents of the reversed queue.


@param Input
5
1 2 3 4 5


@param Output
5 4 3 2 1 


@param Explaination
None


@param Constraints
1 <= n <= 10^4
1 <= queue_elements <= 10^5

@end--------------------------------------------
*/


import java.util.*;

public class Reversing_A_Queue {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        int n = sc.nextInt();
        while (n-- > 0)
            q.add(sc.nextInt());
        while (!q.isEmpty())
            s.add(q.remove());
        while (!s.isEmpty())
            q.add(s.pop());
        while (!q.isEmpty())
            System.out.print(q.remove() + " ");
    }
}
