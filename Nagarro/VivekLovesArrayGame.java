import java.util.*;
/*Vivek loves to play with array . One day Vivek just came up with a new array game which was introduced to him by his friend Ujjwal. The rules of the game are as follows:

Initially, there is an array, A , containing 'N' integers.

In each move, Vivek must divide the array into  two non-empty contiguous parts such that the sum of the elements in the left part is equal  to the sum of the elements in the right part. If Vivek can make such a move, he gets '1' point; otherwise, the game ends.

After each successful move, Vivek have to discards either the left part or the right part and continues playing by using 
the remaining partition as array 'A'.

Vivek loves this game and wants your help getting the best score possible. Given 'A', can you find and print the maximum number of points he can score?

*/
public class VivekLovesArrayGame {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("test cases?");
		int test = sc.nextInt();
		int maxCount = 0, q = 0;
		while (test-- > 0) {
			System.out.println("\ntest case " + (++q) + " ->");
			System.out.println("array size?");
			int size = sc.nextInt();
			int arr[] = new int[size];
			System.out.println("input array-> ");
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			maxCount = maxcount(arr, 0, size - 1);
			System.out.println("max rounds played - " + maxCount);
		}
	}

	private static int maxcount(int[] arr, int start, int end) {
		if (start > end)
			return 0;
		int leftcount = 0, rightcount = 0;
		for (int i = start; i < end; i++) {
			int sum1 = sum(arr, start, i);
			int sum2 = sum(arr, i + 1, end);
			if (sum1 == sum2) {
				leftcount = maxcount(arr, start, i);
				rightcount = maxcount(arr, i + 1, end);
				return 1 + Math.max(leftcount, rightcount);
			}
		}
		return 0;
	}

	private static int sum(int[] arr, int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++)
			sum += arr[i];
		return sum;
	}
}
