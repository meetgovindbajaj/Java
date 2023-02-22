/**
@start--------------------------------------------

@param Question
Implement Odd-Even sort /Brick sort.


@param Input-Format
The first line  contains one integer 'N' denoting the number of elements.

The Second line  contains 'N' space separated integers denoting the elements of the array.


@param Output-Format
Print the array in sorted fashion.


@param Input
6
7 6 8 5 4 9


@param Output
4 5 6 7 8 9


@param Explaination
Printed sorted array.


@param Constraints
0 <= nums.length <= 10^4

-10^9 <= nums[i] <= 10^9

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Even_Odd_Sorting {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        input(n, arr);
        evenOddSorting(n, arr);
        printer(n, arr);
    }

    public static void input(int n, int[] arr) {
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
    }

    public static void printer(int n, int[] arr) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void evenOddSorting(int n, int[] arr) {
        Boolean toggle = true, isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = toggle ? 0 : 1; i < n - 1; i += 2) {
                int a = arr[i], b = arr[i + 1];
                if (a > b) {
                    arr[i] = b;
                    arr[i + 1] = a;
                    isSorted = false;
                }
            }
            toggle = !toggle;
        }
    }
}
