package Gym.Easy;

import java.util.*;

public class House_Robber_2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(totalRobbery(arr));
    }

    public static int totalRobbery(int arr[]) {
        int sum1 = 0, sum2 = 0, size = arr.length;
        for (int i = 0; i < size - (size % 2 == 0 ? 0 : 1); i += 2) {
            sum1 += arr[i];
            System.out.println("money: " + arr[i] + " total: " + sum1);
        }
        System.out.println();
        for (int i = 1; i < size; i += 2) {
            sum2 += arr[i];
            System.out.println("money: " + arr[i] + " total: " + sum2);
        }
        return sum1 > sum2 ? sum1 : sum2;
    }
}
/*
 * 15
 * 166 579 877 972 617 434 586 455 888 788 490 823 923 747 577
 */