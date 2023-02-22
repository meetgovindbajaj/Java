/**
@start--------------------------------------------

@param Question
Given a set of N distinct points lying on the X-axis and an integer L, the task is to find the number of ways of selecting three points such that the distance between the most distant points is less than or equal to L


@param Input-Format
The first line contains integer N denoting the number of points

The second line contains N integers denoting the points

The third line contains L denoting the maximum distance possible


@param Output-Format
Print the count of the total ways of selecting three points


@param Input
4
2 1 3 4
3


@param Output
4


@param Explaination
{1, 2, 3} Here distance between farthest points = 3 – 1 = 2 <= L

{1, 2, 4} Here distance between farthest points = 4 – 1 = 3 <= L

{1, 3, 4} Here distance between farthest points = 4 – 1 = 3 <= L

{2, 3, 4} Here distance between farthest points = 4 – 2 = 2 <= L


@param Constraints
1 <= N <= 100

0 <= points <= 1000

1 <= L <= 500

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class AS_Sorting_4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int arr[] = new int[n];
        input(n, arr);
        int l = sc.nextInt();
        sol(n, arr, l);
    }

    public static void input(int n, int[] arr) {
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
    }

    public static void sol(int n, int[] arr, int l) {
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[k] - arr[i] <= l)
                        count++;
                }
            }
        }
        System.out.println(count);
    }
}
