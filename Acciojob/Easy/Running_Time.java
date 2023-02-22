/*

The running time of an algorithm for a specific input depends on the number of operations executed. The greater the number of operations, the longer the running time of an algorithm. We usually want to know how many operations an algorithm will execute in proportion to the size of its input, which we will call N.

In case of Insertion Sort, For each element V in an array of N numbers, Insertion Sort compares the number to those to its left until it reaches a lower value element or the start. At that point, it shifts everything to the right-up one and inserts V into the array.

How long does all that shifting take? In the best case, where the array was already sorted, no element will need to be moved, so the algorithm will just run through the array once and return the sorted array. The running time would be directly proportional to the size of the input, so we can say it will take N time. However, we usually focus on the worst-case running time (computer scientists are pretty pessimistic). The worst case for Insertion Sort occurs when the array is in reverse order. To insert each number, the algorithm will have to shift over that number to the beginning of the array. Sorting the entire array of N numbers will therefore take 1+2+3+....+(N-1) operations, which is N(N-1)/2 (almost (N^2)/2 ). Computer scientists just round that up (pick the dominant term) to (N^2) and say that Insertion Sort is an "(N^2) time" algorithm.

The only thing we should print is the number of shifts made by the algorithm to completely sort the array. A shift occurs when an element's position changes in the array. Do not shift an element if it is not necessary.

--------------------------------------------

input format:
The first line inputs N, the size of the integer array.
The second line inputs N space-separated integers, i.e., A[i].

--------------------------------------------

output format:
Print the number of shifts it will take to sort the array

--------------------------------------------

input:
5
2 1 3 1 2

--------------------------------------------

output:
4

--------------------------------------------

explained:
Iteration   Array      Shifts
0           2 1 3 1 2     0
1           1 2 3 1 2     1
2           1 2 3 1 2     0
3           1 1 2 3 2     2
4           1 1 2 2 3     1

Total                     4

--------------------------------------------

constraints:
1 <= N <= 1001
-10000 <= A[i] <= 10000

*/

package Gym.Easy;

import java.util.*;

public class Running_Time {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(countNumberOfInsertionSortInversions(arr));
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }

    public static int countNumberOfInsertionSortInversions(int[] arr) {
        Map<String, Object> map = new HashMap<>();
        map.put("shifts", 0);
        map.put("array", arr);
        for (int i = 0; i < arr.length; i++) {
            int shifts = (int) map.get("shifts");
            map = shiftsCounter(arr, i, shifts, map);
        }
        return (int) map.get("shifts");
    }

    public static Map<String, Object> shiftsCounter(int[] arr, int index, int shifts, Map<String, Object> map) {
        if (index - 1 < 0 || arr[index - 1] <= arr[index]) {
            map.put("shifts", shifts);
            map.put("array", arr);
            return map;
        }
        int temp = arr[index - 1];
        arr[index - 1] = arr[index];
        arr[index] = temp;
        return shiftsCounter(arr, index - 1, shifts + 1, map);
    }
}
