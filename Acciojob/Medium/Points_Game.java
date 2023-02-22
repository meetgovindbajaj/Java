/**
@start--------------------------------------------

@param Question
You are in a toy shop. There are N toys arranged on a shelf. Each toy has some points assigned to 
it. The points can be negative as well. Since it is your birthday, you can choose a continuous 
segment of toys from the shelf.

If the sum of the points of all the toys in the chosen segment is the maximum possible, you can keep 
all the toys for free. Can you choose the continuous segment with the maximum possible sum of points?

Note In case multiple segments have the maximum possible sum, then print the last one.


@param Input-Format
The first line contains the value of n.

The following line contains n space-separated integers representing the point of each toy.


@param Output-Format
Return the last continuous segment with the maximum possible sum of points.


@param Input
5
-19 2 -5 1 1


@param Output
1 1


@param Explained
Since, two continuous segments 2 and 1 1 have a sum of 2, which is the maximum possible, we choose 
the last one.


@param Constraints
1 <= n <= 1000

-10000 <= Points <= 10000

@end--------------------------------------------
*/

package Gym.Medium;

import java.util.*;

public class Points_Game {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        input(arr, n);
        ArrayList<Integer> a = subarr(arr, n);
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
    }

    public static void input(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return;
    }

    public static ArrayList<Integer> subarr(int arr[], int n) {
        ArrayList<Integer> b = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                ArrayList<Integer> a = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    a.add(arr[k]);
                }
                int sum = sums(a);
                if (max <= sum) {
                    max = sum;
                    b = a;
                }
            }
        }
        return b;
    }

    public static int sums(ArrayList<Integer> a) {
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
        }
        return sum;
    }
}
