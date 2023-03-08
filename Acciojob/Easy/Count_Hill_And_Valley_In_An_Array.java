/**
@start--------------------------------------------

@param Question
You are given a 0-indexed integer array nums. An index i is part of a hill in nums if the closest non-equal neighbors of i are smaller than nums[i]. Similarly, an index i is part of a valley in nums if the closest non-equal neighbors of i are larger than nums[i]. Adjacent indices i and j are part of the same hill or valley if nums[i] == nums[j].

Note that for an index to be part of a hill or valley, it must have a non-equal neighbor on both the left and right of the index.

Return the number of hills and valleys in nums.


@param Input-Format
1-> length of array
2-> array elements


@param Output-Format
total no. of hills + total no. of valley


@param Input
6
2 4 1 1 6 5


@param Output
3


@param Explaination
At index 0: There is no non-equal neighbor of 2 on the left, so index 0 is neither a hill nor a valley.
At index 1: The closest non-equal neighbors of 4 are 2 and 1. Since 4 > 2 and 4 > 1, index 1 is a hill. 
At index 2: The closest non-equal neighbors of 1 are 4 and 6. Since 1 < 4 and 1 < 6, index 2 is a valley.
At index 3: The closest non-equal neighbors of 1 are 4 and 6. Since 1 < 4 and 1 < 6, index 3 is a valley, but note that it is part of the same valley as index 2.
At index 4: The closest non-equal neighbors of 6 are 1 and 5. Since 6 > 1 and 6 > 5, index 4 is a hill.
At index 5: There is no non-equal neighbor of 5 on the right, so index 5 is neither a hill nor a valley. 
There are 3 hills and valleys so we return 3.


@param Constraints
3 <= nums.length <= 100
1 <= nums[i] <= 100

@end--------------------------------------------
*/


import java.util.*;

public class Count_Hill_And_Valley_In_An_Array {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(countHillValley(arr));
    }

    public static int countHillValley(int[] a) {
        int count = 0, pv = 0, nxt = 2, i = 1, n = a.length;
        while (i < n - 1 && nxt < n) {
            if (a[i] != a[nxt]) {
                if ((a[i] > a[pv] && a[i] > a[nxt]) || (a[i] < a[pv] && a[i] < a[nxt]))
                    count++;
                pv = i;
                i = nxt;
            }
            nxt++;
        }
        return count;
    }
}