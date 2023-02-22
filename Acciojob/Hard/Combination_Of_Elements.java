/**
@start--------------------------------------------

@param Question
Given an array arr of size N. Your task is to print all the possible combinations of r elements, i.e all the combinations of size r.


@param Input-Format
The first line of input contains a single integer N.

The second line of input contains N space seperated integers.

The third line of input contains r, the size of combinations.


@param Output-Format
Print all the unique combinations in sorted order.


@param Input
4 
1 2 3 4
2


@param Output
1 2
1 3
1 4
2 3
2 4
3 4


@param Explaination
All the unique combinations of size 2 are given.


@param Constraints
1 <= N <= 10

1 <= arr[i] <= 10^6

1<=r<=N

@end--------------------------------------------
*/

package Gym.Hard;

import java.util.*;

public class Combination_Of_Elements {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int l = sc.nextInt();
        Arrays.sort(arr);
        combo(arr, new int[l], 0, n - 1, 0, l);
    }

    static void combo(int arr[], int data[], int start, int end, int index, int size) {
        if (index == size) {
            for (int e : data)
                System.out.print(e + " ");
            System.out.println();
            return;
        }
        for (int i = start; i <= end; i++) {
            data[index] = arr[i];
            combo(arr, data, i + 1, end, index + 1, size);
        }
    }
}
