/**
@start--------------------------------------------

@param Question
There are contestants standing in a row. Each contestant is assigned a rating, which is an integer. A contestant supports all those whose rating is greater than their rating.

Now for each contestant standing in the row, you need to tell the rating of its closest supporter on the left.

If no supporter is there, store -1 in that place.


@param Input-Format
The first line an integer n which denotes the size of the row array.

Next line contains n space separated integers which are the elements of the row array.


@param Output-Format
Return an integer array in which each element denotes the rating of the closest supporter on the left.


@param Input
5
3 1 5 12 10


@param Output
-1 -1 1 5 5


@param Explaination
There is no contestant on the left of 1st contestant
No contestant’s rating is less than this player, hence -1.
Both ratings 3 and 1 are smaller than the current rating, but ‘1’ is closest.
All ratings are small, but the nearest one is ‘5’.
For ‘10’, the nearest rating is ‘5’, as contestant 4 is not a supporter.


@param Constraints
1 <= n <= 10^5

1 <= row[i] <= 10^3

@end--------------------------------------------
*/

import java.util.*;

public class Find_The_Nearest_Supporter {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        arr = prevSmall(arr, n);
        for (int i : arr)
            System.out.print(i + " ");
    }

    public static int[] prevSmall(int[] arr, int n) {
        int[] ans = new int[n];
        for (int i = 0; i < n; i++)
            ans[i] = findNearest(arr, i - 1, arr[i]);
        return ans;
    }

    public static int findNearest(int[] row, int s, int num) {
        int ans = -1;
        while (s >= 0 && ans == -1)
            if (row[s--] < num)
                ans = row[s + 1];
        return ans;
    }
}