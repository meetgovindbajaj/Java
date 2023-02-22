package Gym.Easy;

import java.util.*;

public class AS_Sorting_Problem_5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int arr[] = new int[n];
        input(n, arr);
        System.out.println(sorting5(n, arr));
    }

    public static void input(int n, int[] arr) {
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
    }

    public static int sorting5(int n, int[] arr) {
        Arrays.sort(arr);
        return arr[n - 1] * arr[n - 2] - arr[1] * arr[0];
    }
}
