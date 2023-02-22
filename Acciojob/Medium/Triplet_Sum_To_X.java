/**
@start--------------------------------------------

@param Question
You have been given a non-decreasing integer ArrayList(arr) and a number X. Find and return the number of distinct triplets in the ArrayList which sum to X.

Note

Given ArrayList is sorted and can contain duplicate elements.


@param Input-Format
The first line contains an Integer t which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains an integer N representing the size of the first ArrayList.

The second line contains N single space-separated integers representing the elements in the ArrayList.

The third line contains an integer X.


@param Output-Format
For each test case, print the total number of distinct triplets present in the array/list.

Output for every test case will be printed in a separate line.


@param Input
1
7
1 2 3 4 5 6 7 
12


@param Output
5


@param Explaination
Triplets are (1,4,7), (1,5,6), (2,3,7), (2,4,6), (3,4,5).


@param Constraints
1 <= t <= 50

1 <= N <= 10^3

-10^6 <= arr[i] <= 10^6

-10^9 <= X <= 10^9

@end--------------------------------------------
*/

package Gym.Medium;

import java.util.*;

public class Triplet_Sum_To_X {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t;
        t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), x;
            ArrayList<Integer> arr = new ArrayList<Integer>(n);
            input(arr, n);
            x = sc.nextInt();
            System.out.println(triplets(arr, n, x));
        }
    }

    public static void input(ArrayList<Integer> al, int n) {
        for (int i = 0; i < n; i++)
            al.add(sc.nextInt());
    }

    public static int triplets(ArrayList<Integer> al, int n, int x) {
        int count = 0, i = 0, j = 1, k = n - 1, sum = 0, a = 0, b = 1, c = n - 1;
        while (i < n - 2) {
            if (j >= k) {
                i += 1;
                j = i + 1;
                k = n - 1;
            } else {
                sum = al.get(i) + al.get(j) + al.get(k);
                if (sum < x) {
                    j++;
                } else if (sum > x) {
                    k--;
                } else {
                    if (count == 0 || al.get(i) != al.get(a) || al.get(j) != al.get(b) || al.get(k) != al.get(c)) {
                        count++;
                    }
                    a = i;
                    b = j;
                    c = k;
                    j += 1;
                    k -= 1;
                }
            }
        }
        return count;
    }
}