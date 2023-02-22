/*

Given an array of integers Arr of size N and a number, K. Return the maximum sum of a subarray of size K

--------------------------------------------

input format:
The first line contains 2 integers N and K The second line contains N integers denoting elements of the array

--------------------------------------------

output format:
Print an integer denoting the maximum sum subarray of size K

--------------------------------------------

input:
4 2
100 200 300 400

--------------------------------------------

output:
700

--------------------------------------------

explained:
The sum of the last 2 elements is maximum i.e. (0-based indexing) Arr[2]+Arr[3]=700 is maximum

--------------------------------------------

constraints:
1 <= N <= 1000000

1 <= K <= N

-10000 <= Arr[i] <= 10000

*/



import java.util.*;

public class Max_Sum_Subarray_Of_Size_K {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr, k));
    }

    public static int solve(int[] arr, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (j - i == k - 1) {
                    al.add(sum);
                    break;
                }
            }
        }
        return Collections.max(al);
    }
}