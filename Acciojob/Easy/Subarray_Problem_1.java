/**
@start--------------------------------------------

@param Question
Given an array arr[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} of size 10. Find whether there exists a sub-array of size n and sum s, where n and s both are user input values.

Print YES if there exists a subarray of size n and sum s in the array arr else print NO


@param Input-Format
The first and only line of input contains n and s


@param Output-Format
Print either “YES” or “NO”


@param Input
3 6


@param Output
YES


@param Explained
The sum of elements at indices 0, 1,2 add upto 6


@param Constraints
1<=n<=10 1<=s<=55

@end--------------------------------------------
*/



import java.util.*;

public class Subarray_Problem_1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = sc.nextInt(), s = sc.nextInt();
        solve(arr, n, s);
    }

    public static void solve(int[] arr, int n, int s) {
        Boolean check = false;
        for (int i = 0; (i < 10) && !check; i++) {
            for (int j = i; (j < 10) && !check; j++) {
                int size = j - i + 1;
                if (size == n) {
                    int sum = 0;
                    for (int k = i; k <= j; k++) {
                        sum += arr[k];
                    }
                    check = sum == s ? true : false;
                }
            }
        }
        System.out.print(check ? "YES" : "NO");
    }
}
