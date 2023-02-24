/**
@start--------------------------------------------

@param Question
You are given an array arr and an integer k. You have to right rotate the array by k elements.


@param Input-Format
The first line of input contains two integers n and k.

The second line of input contains n space-separated integers representing the elements of the array.


@param Output-Format
The only line of output contains n space-separated integers representing the final state of the array.


@param Input
5 2
1 2 3 4 5


@param Output
4 5 1 2 3


@param Explaination
After first right rotation the array becomes [5, 1, 2, 3, 4] and after '2' rotations it becomes [4, 5, 1, 2, 3].


@param Constraints
1 <= n, k <= 10^4
1 <= arr[i] <= 10^9

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Right_Rotate {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), k = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++)
            al.add(sc.nextInt());
        Collections.rotate(al, k);
        al.forEach(i -> System.out.print(i + " "));
    }
}
