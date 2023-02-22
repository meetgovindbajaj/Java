/*

The median of a list of numbers is essentially its middle element after sorting. The same number of elements occur after it as before. Given a list of numbers with an odd number of elements, find the median.

--------------------------------------------

input format:
The first line inputs integer n, size of array a.
The second line inputs n space-seperated integers, i.e., a[i].

--------------------------------------------

output format:
In a new line, print the median of the array.

--------------------------------------------

input:
7
0 1 2 4 6 5 3

--------------------------------------------

output:
3

--------------------------------------------

explained:
The sorted a=[0,1,2,3,4,5,6].
Its middle element is at a[3]=3.

--------------------------------------------

constraints:
1 <= n <= 1000001
n is odd
-10000 <= a[i] <= 10000

*/



import java.util.*;

public class Find_The_Median {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int arr[] = new int[sc.nextInt()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(solve(arr));
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }

    public static int solve(int[] a) {
        Arrays.sort(a);
        return a[a.length / 2];
    }
}
