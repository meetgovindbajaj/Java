/*

You are given an array A of length N consisting only of positive integers and an integer K. You have to update every element of the array by increasing or decreasing its value by K only once. Your task is to minimize the difference between maximum and minimum elements of the array after performing the increment or decrement on every element of the array.

Note: After the operation, every value of the array should remain non-negative.

For example:

Let’s say the array A = [1, 2, 3, 4, 5] and K = 2, then after increasing each element by K. The array A will become [3, 4, 5, 6, 7]. So the maximum - minimum will be 7 - 3 = 4.

--------------------------------------------

input format:
The first line contains two space-separated integers, ‘N’ and ‘K’, denoting the length of the array ‘A’ and the amount you must increase or decrease, respectively.

The following line contains ‘N’ space-separated positive integers, representing the array’s values.

--------------------------------------------

output format:
You have to print an integer denoting the minimum difference between maximum and minimum elements of the array after performing the increment or decrement on every element of the array.

--------------------------------------------

input:
4 2
1 5 8 10

--------------------------------------------

output:
5

--------------------------------------------

explained:
The final array will look like [3, 3, 6, 8]. So the difference between maximum and minimum is 8 - 3 = 5.

--------------------------------------------

constraints:
1 <=N<= 10^5
1 <= K <= 10^9
1 <= A[i] <= 10^9, for 1 <= i <= N

*/

package Gym.Easy;

import java.util.*;

public class Minimize_The_Difference {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
            Arrays.sort(A);
            System.out.println(minimizeDiff(A, A.length, k));
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }

    public static int minimizeIt(int[] arr, int k) {
        int n = arr.length;
        int max = arr[n - 1];
        int min = arr[0];
        if ((max - min) <= k) {
            return (max - min);
        }
        int avg = (max + min) / 2;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] > avg ? arr[i] - k : arr[i] + k;
        }
        Arrays.sort(arr);
        return arr[n - 1] - arr[0];
    }

    public static int minimizeDiff(int[] arr, int n, int k) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        if ((max - min) <= k) {
            return (max - min);
        }
        int avg = (max + min) / 2;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] > avg ? arr[i] - k : arr[i] + k;
        }
        max = Arrays.stream(arr).max().getAsInt();
        min = Arrays.stream(arr).min().getAsInt();
        return (max - min);
    }
}