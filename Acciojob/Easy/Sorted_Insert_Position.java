/**
@start--------------------------------------------

@param Question
Given a sorted array A and a target value B, return the index if the target is found. If not, print the index where it would be if it were inserted in order.

You may assume no duplicates in the array.


@param Input-Format
Input consists of three lines.

The first line contains integer n

The second line contains n space-separated integers, each a value of arr[i].

The third line contains integer k


@param Output-Format
Print the index where the element is present. If it's not present, print the index it would be inserted into the sorted array.


@param Input
4
1 3 5 6
2


@param Output
1


@param Explained
2 will be inserted at index 1.


@param Constraints
1 <= N <= 100000

1 <= A[i] <= 10^9

1 <= B <= 10^9

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Sorted_Insert_Position {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++)
            A.add(sc.nextInt());
        int B = sc.nextInt();
        System.out.println(searchInsert(A, B));
    }

    public static int searchInsert(ArrayList<Integer> a, int b) {
        int index = a.indexOf(b);
        if (index != -1)
            return index;
        int i = 0;
        for (; i < a.size(); i++)
            if (a.get(i) > b)
                break;
        return i;
    }
}
